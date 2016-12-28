/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.controller;

import com.javaweb.model.User;
import com.javaweb.service.EnDeCryption;
import com.javaweb.service.FileService;
import com.javaweb.service.UserService;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Computer
 */
public class EditInfo extends HttpServlet {

    private boolean isMultipart;
    private String filePath;
    private int maxFileSize = 1000 * 1024;
    private int maxMemSize = 1000 * 1024;
    private File file;

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
        request.setCharacterEncoding("UTF-8");
        String username = "", id = "", fullname = "", email = "", password = "",
                nhaplaimk = "", note = "", gender = "", idroles = "", dienthoai = "", address = "", fileName = "";
        Date birthday = new Date();

        boolean gt = false;

        HttpSession session = request.getSession();

        UserService ad = new UserService();

        String folderupload = getServletContext().getInitParameter("file-upload");
        String rootPath = getServletContext().getRealPath("/");
        filePath = rootPath + folderupload;
        isMultipart = ServletFileUpload.isMultipartContent(request);
        response.setContentType("text/html");
        java.io.PrintWriter out = response.getWriter();

        DiskFileItemFactory factory = new DiskFileItemFactory();

        factory.setSizeThreshold(maxMemSize);

        factory.setRepository(new File("D:\\TAM"));

        ServletFileUpload upload = new ServletFileUpload(factory);

        upload.setSizeMax(maxFileSize);
        try {

            List fileItems = upload.parseRequest(request);

            Iterator i = fileItems.iterator();

            while (i.hasNext()) {
                FileItem fi = (FileItem) i.next();
                if (!fi.isFormField()) {

                    String fieldName = fi.getFieldName();
                    if (!fi.getName().equals("")) {
                        fileName = fi.getName();
                        String contentType = fi.getContentType();
                        boolean isInMemory = fi.isInMemory();
                        long sizeInBytes = fi.getSize();

                        fileName = FileService.ChangeFileName(fileName);

                        if (fileName.lastIndexOf("\\") >= 0) {
                            file = new File(filePath
                                    + fileName.substring(fileName.lastIndexOf("\\")));
                        } else {
                            file = new File(filePath + "/"
                                    + fileName.substring(fileName.lastIndexOf("\\") + 1));
                        }
                        fi.write(file);
                        out.println("Uploaded Filename: " + fileName + "<br>");
                    }
                }
                if (fi.isFormField()) {
                    if (fi.getFieldName().equalsIgnoreCase("fullname")) {
                        fullname = fi.getString("UTF-8");
//                    } 
//                    else if (fi.getFieldName().equalsIgnoreCase("email")) {
//                        email = fi.getString("UTF-8");
                    } else if (fi.getFieldName().equalsIgnoreCase("mkmoi")) {
                        password = fi.getString("UTF-8");
//                    } else if (fi.getFieldName().equalsIgnoreCase("idrole")) {
//                        idroles = fi.getString("UTF-8");
                    } else if (fi.getFieldName().equalsIgnoreCase("dienthoai")) {
                        dienthoai = fi.getString("UTF-8");
                    } else if (fi.getFieldName().equalsIgnoreCase("address")) {
                        address = fi.getString("UTF-8");
//                    } else if (fi.getFieldName().equalsIgnoreCase("note")) {
//                        note = fi.getString("UTF-8");
                    } else if (fi.getFieldName().equalsIgnoreCase("gender")) {
                        String gtt = fi.getString("UTF-8");
                        if (gtt.equals("Nam")) {
                            gt = true;

                        }
                    } else if (fi.getFieldName().equalsIgnoreCase("birthday")) {
                        String dtt = fi.getString("UTF-8");

                        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");

                        try {
                            birthday = dt.parse(dtt);
                        } catch (Exception e) {
                        }
                    } else if (fi.getFieldName().equalsIgnoreCase("iduser")) {
                        id = fi.getString("UTF-8");
                    }
                }

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
//        Date birthday = new Date(request.getParameter("birthday"));

        User user = ad.getUserByID(id);
//        user.setUsername(username);
        user.setFullname(fullname);
//        user.setEmail(email);
//        user.setIdroleUser(Integer.parseInt(idroles));
        user.setBirthday(birthday);
        user.setGender(gt);
        user.setUserPhone(dienthoai);
        user.setAddress(address);
//        user.setNote(note);
        String newpassword = password;
        if (!newpassword.equals("")) {
            EnDeCryption mh = new EnDeCryption("zxczxsdfsdfgsdjklh");
            String mk = mh.encoding(password);
            user.setPassword(mk);
        }

        if (!fileName.equals("")) {
            if (user.getImage() != null) {
                if (!user.getImage().equals(fileName)) {
                    user.setImage(fileName);
                }
            } else {
                user.setImage(fileName);
            }
        }

        boolean rs = ad.InserUser(user);
        if (rs) {
            response.sendRedirect("infouser.jsp");
        }

        /* TODO output your page here. You may use following sample code. */
        //  out.println("<!DOCTYPE html>");
        // out.println("<html>");
        // out.println("<head>");
        //    out.println("<title>Servlet EditInfo</title>");
        //   out.println("</head>");
        //  out.println("<body>");
        //  out.println("<h1>Servlet EditInfo at " + request.getContextPath() + "</h1>");
        // out.println("</body>");
        //   out.println("</html>");
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
