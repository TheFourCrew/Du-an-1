package com.javaweb.controller;

import com.javaweb.model.Product;
import com.javaweb.model.ProductCategory;
import com.javaweb.model.ProductTags;
import com.javaweb.model.Tags;
import com.javaweb.service.FileService;
import com.javaweb.service.ProductServices;
import com.javaweb.service.TagServices;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author MinhNguyen
 */
public class AddProduct extends HttpServlet {

    private File file;
    private String filePath;
    private int maxFileSize = 1000 * 1024;
    private int maxMemSize = 1000 * 1024;

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

        ProductServices ps = new ProductServices();
        Product product = null;
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

                String tenSP = "", ghiChu = "", thumbnail = "Unknown.jpg", moTa = "",
                        donVi = "", maSP = "", strGiamGia = "", hinhNho = "", fileName = "", the = "";
                int loaiSP = 0, soLuong = 0;
                double gia = 0, giamGia = 0;
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
                        if (fieldName.equals("prod-name")) {
                            tenSP = fi.getString("UTF-8");
                        } else if (fieldName.equals("prod-describe")) {
                            moTa = fi.getString("UTF-8");
                        } else if (fieldName.equals("prod-price")) {
                            gia = Double.parseDouble(fi.getString("UTF-8"));
                        } else if (fieldName.equals("prod-discount")) {
                            strGiamGia = fi.getString("UTF-8");
                        } else if (fieldName.equals("prod-quantity")) {
                            soLuong = Integer.parseInt(fi.getString("UTF-8"));
                        } else if (fieldName.equals("prod-unit")) {
                            donVi = fi.getString("UTF-8");
                        } else if (fieldName.equals("loaiSP")) {
                            loaiSP = Integer.parseInt(fi.getString("UTF-8"));
                        } else if (fieldName.equals("prod-tags")) {
                            the = fi.getString("UTF-8");
                        }
//                        else if (fieldName.equals("nP-note")) {
//                            ghiChu = value;
//                        }
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
                        if (fi.getFieldName().equals("prod-thumbnail")) {
                            if (!fi.getName().equals("")) {
                                thumbnail = fileName;

                            }
                        } else if (fi.getFieldName().equals("prod-images")) {
                            if (!fi.getName().equals("")) {
                                hinhNho += fileName + "< ";
                            }
                        }
                        if (!strGiamGia.equals("")) {
                            giamGia = Double.parseDouble(strGiamGia);
                        }
                    }
                }
                product = new Product(maSP, tenSP, gia, 0, soLuong, giamGia, donVi, moTa, loaiSP, date, 1, dateModified, thumbnail, ghiChu, hinhNho);
                ps.InsertOrUpdateProduct(product);

                
                
                product = ps.GetProductByName(tenSP);
                String idpt = String.valueOf(product.getIdproduct());
                
                TagServices ts = new TagServices();
                
                Tags tag = null;
                ProductTags prodTags = null;
                
                String chuoi = the + ", ";
                String[] words = chuoi.split(", ");
                for (int i = 0; i < words.length; i++) {
                    tag = ts.GetByTagName(words[i]);

                    if (tag == null) {
                        tag = new Tags(words[i]);
                        ts.InsertOrUpdateTags(tag);
                    }

                    prodTags = ts.GetProductTagByIdProdnTag(idpt, String.valueOf(tag.getIdtags()));

                    if (prodTags == null) {
                        prodTags = new ProductTags(Integer.parseInt(idpt), tag.getIdtags());
                        ts.InsertOrUpdateProductTags(prodTags);
                    }
                }

                response.sendRedirect("managerproduct.jsp");

            } catch (Exception fue) {
                System.out.println(fue.toString());
            }
        }

//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet AddProduct</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet AddProduct at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
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
