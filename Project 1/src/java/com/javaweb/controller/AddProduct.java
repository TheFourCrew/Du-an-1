package com.javaweb.controller;

import com.javaweb.model.Product;
import com.javaweb.model.ProductCategory;
import com.javaweb.service.ProductServices;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author MinhNguyen
 */
public class AddProduct extends HttpServlet {

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

//        String urlError = "/managementproduct.jsp";
        boolean isMultiPart = ServletFileUpload.isMultipartContent(request);
        if (isMultiPart) {
            ServletFileUpload upload = new ServletFileUpload();
            try {
                String tenSP = "", gia = "",  ghiChu = "", thumbnail = "Unknown.jpg", moTa = "", donVi = "";
                int loaiSP = 0, soLuong = 0;
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date date = new Date();
                FileItemStream item = null;
                FileItemIterator itr = upload.getItemIterator(request);
                while (itr.hasNext()) {
                    item = itr.next();
                    if (item.isFormField()) {
                        //do field specific process
                        String fieldName = item.getFieldName();
                        InputStream is = item.openStream();
                        byte[] b = new byte[is.available()];
                        is.read(b);
                        String value = new String(b);

                        if (fieldName.equals("nP-price")) {
                            gia = value;
                        } else if (fieldName.equals("nP-name")) {
                            tenSP = value;
                        } else if (fieldName.equals("nP-quantity")) {
                            soLuong = Integer.parseInt(value);
                        } else if (fieldName.equals("nP-note")) {
                            ghiChu = value;
                        } else if (fieldName.equals("nP-category")) {
                            loaiSP = Integer.parseInt(value);
                        }
                        response.getWriter().println("<h2>" + item.getFieldName() + " " + item.getName() + "</h2>");
                    } else {
                        //do file upload specific process
                        response.getWriter().println("<h2>" + item.getFieldName() + " " + item.getName() + "</h2>");
                        String path = getServletContext().getRealPath("/");
                        //call a method to upload file.
                        if (!item.getName().equals("")) {
                            thumbnail = item.getName();
                            ProductServices.processFile(path, item);
//                            request.setAttribute("hinhne", item.getName() + " item.getName()");
                            sdf.format(date.getDate());
                        } else {
                            
                        }
                        
                        ProductCategory loaiSp = null;
//                        loaiSp = (ProductCategory) loaiSP;
                        
//                        Product product = new Product(loaiSP, 0, 1, "BK-01", tenSP, gia, 0, soLuong, donVi, moTa, thumbnail);
                        ProductServices productServices = new ProductServices();
//                        productServices.InsertOrUpdateProduct(product);
                        String url = "/managementproduct.jsp";
                        getServletContext().getRequestDispatcher(url).forward(request, response);
                    }
                }

            } catch (FileUploadException fue) {
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
