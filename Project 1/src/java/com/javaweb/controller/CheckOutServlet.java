package com.javaweb.controller;

import com.javaweb.model.Product;
import com.javaweb.model.Receipt;
import com.javaweb.model.ReceiptDetail;
import com.javaweb.service.GioHang;
import com.javaweb.service.ProductServices;
import com.javaweb.service.ReceiptServices;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MinhNguyen
 */
public class CheckOutServlet extends HttpServlet {

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

        HttpSession session = request.getSession();
        String hoTen, email, sdt, diaChi, thanhPho, tinhHuyen, ghiChu, receiptNumber, address = "", idPT = "";
        double sumtotal = 0, donGia = 0, total = 0;
        int soLuong = 0;
        
        hoTen = request.getParameter("username");
        email = request.getParameter("email");
        sdt = request.getParameter("phonenumber");
        diaChi = request.getParameter("address");
        thanhPho = request.getParameter("city");
        tinhHuyen = request.getParameter("province");
        ghiChu = request.getParameter("note");

        SimpleDateFormat sdf = new SimpleDateFormat("yyddMMhhssmm");
        Date date = new Date();
        receiptNumber = sdf.format(date);

        address = diaChi + ", " + thanhPho + ", " + tinhHuyen;

        ReceiptServices rs = new ReceiptServices();
        Receipt rt = new Receipt(receiptNumber, email, address, sdt, 1, hoTen, 0, date, "Đang chờ xử lý", ghiChu);
        rs.InsertOrUpdateReceipt(rt);
        ProductServices ps = new ProductServices();
        Product pt = null;
//        
        if (session.getAttribute("dshang") != null) {
            ArrayList<GioHang> listGioHang = (ArrayList) session.getAttribute("dshang");
            for (int i = 0; i < listGioHang.size(); i++) {
                GioHang cart = listGioHang.get(i);
                idPT=cart.getMaSP();
                soLuong = Integer.parseInt(cart.getSoLuong());
                pt = ps.GetById(idPT);
                rt = rs.getReceiptByNumber(receiptNumber);
                
                pt.setProductQuantity(pt.getProductQuantity() - soLuong);
                
                ReceiptDetail rdl = new  ReceiptDetail(rt.getIdreceipt(), pt.getIdproduct(), soLuong, pt.getPricePerUnit(), "");
                rs.InsertOrUpdateReceiptDetail(rdl);
                
                ps.InsertOrUpdateProduct(pt);
                
                donGia = pt.getPricePerUnit();
                
                total = GioHang.TinhTongTien(soLuong, donGia);
                
                sumtotal += total;
                
            }
        }
        rt.setTotalPrice(sumtotal);
        rs.InsertOrUpdateReceipt(rt);
        session.setAttribute("thanhcong", "OK");
        
        response.sendRedirect("checkout.jsp");

//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet CheckOutServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet CheckOutServlet at " + request.getContextPath() + "</h1>");
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
