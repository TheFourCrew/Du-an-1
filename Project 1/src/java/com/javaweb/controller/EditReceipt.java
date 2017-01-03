package com.javaweb.controller;

import com.javaweb.model.Product;
import com.javaweb.model.Receipt;
import com.javaweb.model.ReceiptDetail;
import com.javaweb.service.ProductServices;
import com.javaweb.service.ReceiptServices;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MinhNguyen
 */
public class EditReceipt extends HttpServlet {

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
        String hoTen, email, address, phone, status, idRT, note;
        hoTen = request.getParameter("rtbuyer");
        email = request.getParameter("rtemail");
        address = request.getParameter("rtaddress");
        phone = request.getParameter("rtphone");
        status = request.getParameter("rtstatus");
        idRT = request.getParameter("idrt");
        note = request.getParameter("rtnote");
        double priceAdd = 0;
        int soLuongThem = 0;

        String[] idDel, idAdd;
        idDel = request.getParameterValues("idDel");
        idAdd = request.getParameterValues("idAdd");

        ReceiptServices rts = new ReceiptServices();
        Receipt rt = rts.getReceiptById(idRT);
        HttpSession session = request.getSession();

//        session.getAttribute("tendn");
        rt.setBuyer(hoTen);
        rt.setEmail(email);
        rt.setAddress(address);
        rt.setPhoneNumber(phone);

        ProductServices ps = new ProductServices();
        Product pt = null;

        if (status.equals("Hủy hóa đơn")) {
            ArrayList<ReceiptDetail> aRtdl = rts.getReceiptDetailByIdReceipt(idRT);
            if (aRtdl != null) {
                if (!rt.getStatus().equals("Hủy hóa đơn")) {
                    for (int i = 0; i < aRtdl.size(); i++) {
                        ReceiptDetail rtdl = aRtdl.get(i);

                        pt = ps.GetById(rtdl.getIdProduct() + "");

                        pt.setProductQuantity(pt.getProductQuantity() + rtdl.getQuantity());
                        ps.InsertOrUpdateProduct(pt);
                    }
                }
            }
        } else {
            ArrayList<ReceiptDetail> aRtdl = rts.getReceiptDetailByIdReceipt(idRT);
            if (aRtdl != null) {
                if (rt.getStatus().equals("Hủy hóa đơn")) {
                    for (int i = 0; i < aRtdl.size(); i++) {
                        ReceiptDetail rtdl = aRtdl.get(i);

                        pt = ps.GetById(rtdl.getIdProduct() + "");

                        pt.setProductQuantity(pt.getProductQuantity() - rtdl.getQuantity());
                        ps.InsertOrUpdateProduct(pt);
                    }
                }
            }
        }
        rt.setStatus(status);
        //Sửa hóa đơn
        rts.InsertOrUpdateReceipt(rt);
        if (idAdd != null) {
            for (int i = 0; i < idAdd.length; i++) {
                String idPT = idAdd[i];
                ReceiptDetail rtdl = rts.getByIdPtAndIdRt(idPT, idRT);
                priceAdd = Double.parseDouble(request.getParameter("priceAdd" + idPT));
                int soLuong = 0;
                if (rtdl == null) {
                    rtdl = new ReceiptDetail(Integer.parseInt(idRT), Integer.parseInt(idPT), 1, priceAdd);

                    rts.InsertOrUpdateReceiptDetail(rtdl);

                } else {
                    soLuong = rtdl.getQuantity() + 1;
                    rtdl.setQuantity(soLuong);

                }

                pt = ps.GetById(idPT);
                int kho = pt.getProductQuantity();
                if (soLuong <= kho) {
                    pt.setProductQuantity(pt.getProductQuantity() - 1);
                    rts.InsertOrUpdateReceiptDetail(rtdl);
                } else {
                    session.setAttribute("trukho", "failed");
                    session.setAttribute("inst", kho);
                    session.setAttribute("tenpt", pt.getProductName());
                }

                ps.InsertOrUpdateProduct(pt);

                double tongTien = rt.getTotalPrice() + priceAdd;

                rt.setTotalPrice(tongTien);

                rts.InsertOrUpdateReceipt(rt);
            }
        }

        if (idDel != null) {
            for (int i = 0; i < idDel.length; i++) {
                String idPT = idDel[i];

                ArrayList<ReceiptDetail> aRDL = null;

                aRDL = rts.getReceiptDetailByIdReceipt(idRT);
                for (int j = 0; j < aRDL.size(); j++) {
                    String idPt2 = aRDL.get(j).getIdProduct() + "";
                    if ((idPT).equals(idPt2)) {
                        ReceiptDetail rtdl = aRDL.get(j);

                        pt = ps.GetById(rtdl.getIdProduct() + "");
                        int soLuong = rtdl.getQuantity() + pt.getProductQuantity();

                        pt.setProductQuantity(soLuong);

                        ps.InsertOrUpdateProduct(pt);

                        rts.DeleteReceiptDetail(rtdl);

                        double tongTien = rt.getTotalPrice() - (rtdl.getQuantity() * rtdl.getUnitPrice());

                        rt.setTotalPrice(tongTien);

                        rts.InsertOrUpdateReceipt(rt);
                        break;
                    }
                }
            }
        }
        String[] idSLAdd = request.getParameterValues("SlAdd");
        if (idSLAdd != null) {
            for (int i = 0; i < idSLAdd.length; i++) {
                String id = idSLAdd[i];
                soLuongThem = Integer.parseInt(request.getParameter("slDel" + id));
                pt = ps.GetById(id);
                ReceiptDetail rtdl = rts.getByIdPtAndIdRt(id, idRT);
                double tongTien = 0;
                boolean result = false;

                if (rtdl.getQuantity() > soLuongThem) {
                    pt.setProductQuantity(pt.getProductQuantity() + soLuongThem);
                    tongTien = rt.getTotalPrice() - (soLuongThem * rtdl.getUnitPrice());
                    result = true;
                } else if (rtdl.getQuantity() < soLuongThem) {
//                    if (pt.getProductQuantity() < soLuongThem) {
                        pt.setProductQuantity(pt.getProductQuantity() - soLuongThem);
//                    } else {
//                        session.setAttribute("trukho", "failed");
//                        session.setAttribute("inst", pt.getProductQuantity());
//                        session.setAttribute("tenpt", pt.getProductName());
//                    }
                    tongTien = rt.getTotalPrice() + (soLuongThem * rtdl.getUnitPrice());
                    result = true;
                }
                rtdl.setQuantity(soLuongThem);

                ps.InsertOrUpdateProduct(pt);

                rts.InsertOrUpdateReceiptDetail(rtdl);
                if (result == true) {
                    rt.setTotalPrice(tongTien);
                }
                rts.InsertOrUpdateReceipt(rt);

            }
        }

        response.sendRedirect("editreceipt.jsp?idRT=" + idRT);
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet EditReceipt</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet EditReceipt at " + request.getContextPath() + "</h1>");
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
