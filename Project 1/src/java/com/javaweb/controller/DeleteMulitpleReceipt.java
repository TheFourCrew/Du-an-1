package com.javaweb.controller;

import com.javaweb.model.Receipt;
import com.javaweb.model.ReceiptDetail;
import com.javaweb.service.ReceiptServices;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MinhNguyen
 */
public class DeleteMulitpleReceipt extends HttpServlet {

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
        String[] ChkHD = request.getParameterValues("id-receipt");
        String tacVu = request.getParameter("tacvu");
        ReceiptServices rs = new ReceiptServices();
        String cmd = request.getParameter("action");

//        if () {
        if (cmd.equals("single")) {
            String idPT = request.getParameter("idpt");
            Receipt rt = null;
            rt = rs.getReceiptById(idPT);
            rs.DeleteReceipt(rt);

            ArrayList<ReceiptDetail> aRDl = null;
            aRDl = rs.getReceiptDetailByIdReceipt(idPT);
            for (int i = 0; i < aRDl.size(); i++) {

                ReceiptDetail rdl = aRDl.get(i);

                rs.DeleteReceiptDetail(rdl);
            }

        } else if (cmd.equals("multiple")) {
            if (tacVu.equals("xoa")) {
                if (ChkHD != null) {
                    for (int i = 0; i < ChkHD.length; i++) {
                        String maSP = ChkHD[i];
                        Receipt rt = null;
                        rt = rs.getReceiptById(maSP);
                        rs.DeleteReceipt(rt);

                        ArrayList<ReceiptDetail> aRDL = null;

                        aRDL = rs.getReceiptDetailByIdReceipt(maSP);

                        for (int j = 0; j < aRDL.size(); j++) {
                            ReceiptDetail rdl = aRDL.get(j);

                            rs.DeleteReceiptDetail(rdl);
                        }

                    }
                }
            }
        }
        response.sendRedirect("receiptmanager.jsp");
//        }
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet DeleteMulitpleReceipt</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet DeleteMulitpleReceipt at " + request.getContextPath() + "</h1>");
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
