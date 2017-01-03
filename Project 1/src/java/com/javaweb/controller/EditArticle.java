/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.controller;

import com.javaweb.model.Article;
import com.javaweb.service.ArticleServices;
import com.javaweb.service.FileService;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author ilove
 */
public class EditArticle extends HttpServlet {

    private File file;
    private String filePath;
    private int maxFileSize = 10000 * 1024;
    private int maxMemSize = 10000 * 1024;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        ArticleServices as = new ArticleServices();
        boolean isMultiPart = ServletFileUpload.isMultipartContent(request);
        if (isMultiPart) {

            try {
                //File Upload
                String folderUpload = getServletContext().getInitParameter("file-upload");
                String rootPath = getServletContext().getRealPath("/");
                filePath = rootPath + folderUpload;
                response.setContentType("text/html;charset=UTF-8");
                java.io.PrintWriter out = response.getWriter();

                DiskFileItemFactory factory = new DiskFileItemFactory();

                //maximum size that will be stored in memory
                factory.setSizeThreshold(maxMemSize);
                //Location to save data that is larger than maxMemSize.
                factory.setRepository(new File("D:\\TAM"));

                //create a new file upload handler
                ServletFileUpload upload = new ServletFileUpload(factory);
                //maximun file size to be uploaded.
                upload.setSizeMax(maxMemSize);

                String tieude = "", ghiChu = "", thumbnail = "Unknown.jpg", tinvan = "",
                        fileName = "", noidung = "",id="";
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date date = new Date();
                Date dateModified = null;

                //Parse the request to get file items.
                List fileItems = upload.parseRequest(request);

                //Process the uploaded file items
                Iterator itr = fileItems.iterator();

                while (itr.hasNext()) {
                    FileItem fi = (FileItem) itr.next();
                    if (fi.isFormField()) {
                        //do field specific process
                        String fieldName = fi.getFieldName();

//                        if (fieldName.equals("idPT")) {
//                            idpt = fi.getString("UTF-8");
//                        } else 
                        if (fi.getFieldName().equalsIgnoreCase("ntd")) {
                            tieude = fi.getString("UTF-8");
                        } else if (fi.getFieldName().equalsIgnoreCase("ntv")) {
                            tinvan = fi.getString("UTF-8");
                        } else if (fi.getFieldName().equalsIgnoreCase("contents")) {
                            noidung = fi.getString("UTF-8");
                        } else if (fi.getFieldName().equalsIgnoreCase("note")) {
                            ghiChu = fi.getString("UTF-8");
                        } else if (fi.getFieldName().equalsIgnoreCase("idbv")) {
                            id = fi.getString("UTF-8");
                        }
//                        out.println(fi.getString("UTF-8")+ " "+fieldName);
//                        response.getWriter().println("<h2> sadsasadsad" + fi.getString("UTF-8") + " " + fieldName + "</h2>");
//                        response.getWriter().println("<h3>" + tenSP + " "+ moTa+ " "+" "+loaiSP + " " + date + "</h3>");
//                        response.getWriter().println("<h2>" + item.getFieldName() + " item.getname " + item.getName() + " item " + item + "</h2>");
                    } else {
//                        response.getWriter().println("<h2>" + fi.getString("UTF-8") + " " + fi.getFieldName() + "</h2>");
                        //do file upload specific process
                        fileName = fi.getName();
                        String contentType = fi.getContentType();
                        boolean isInMemory = fi.isInMemory();
                        long sizeInBytes = fi.getSize();

                        if (!fileName.equals("")) {
                            //change file name
                            fileName = FileService.ChangeFileName(fileName);
                            //Write the file
                            if (fileName.lastIndexOf("\\") >= 0) {
                                file = new File(filePath + fileName.substring(fileName.lastIndexOf("\\")));
                            } else {
                                file = new File(filePath + "/" + fileName.substring(fileName.lastIndexOf("\\") + 1));
                            }
                            fi.write(file);
                        }

                        //call a method to upload file.
                        if (fi.getFieldName().equals("nthumbnail")) {
                            if (!fi.getName().equals("")) {
                                thumbnail = fileName;

                            }
                        }

                    }
                }
                Article news = as.GetNewsByID(id);
                news.setTitleArticle(tieude);
                news.setModifiedDate(date);
                news.setThumbnail(thumbnail);
                news.setNote(ghiChu);
                news.setContent(noidung);

                boolean rs = as.InsertNews(news);
                if (rs) {
                    response.sendRedirect("ArticlesManager.jsp");
                }
            } catch (Exception fue) {
                System.out.println(fue.toString());
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
