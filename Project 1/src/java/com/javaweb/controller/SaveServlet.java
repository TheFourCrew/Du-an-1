/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.controller;

import com.javaweb.service.GioHang;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class SaveServlet extends HttpServlet {

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
        HttpSession session = request.getSession();
        String idSP = "", value = "";
        if (request.getParameter("idsanpham") != null) {
            idSP = request.getParameter("idsanpham");
        }
        ArrayList<GioHang> listGioHang = new ArrayList();
        if (session.getAttribute("dshang") != null) {
            listGioHang = (ArrayList) session.getAttribute("dshang");
        }
        if (!idSP.equals("")) {
            value = request.getParameter("sl" + idSP);
            GioHang.ThemVaoGioHang(listGioHang, idSP, Integer.parseInt(value));
            session.setAttribute("dshang", listGioHang);
        }

        if (session.getAttribute("dshang") != null) {
            listGioHang = (ArrayList) session.getAttribute("dshang");
            String name = "";

            if (idSP.equals("")) {

                for (int i = 0; i < listGioHang.size(); i++) {
                    GioHang item = listGioHang.get(i);
                    if (item.getMaSP() != null) {

                        value = request.getParameter("sl" + item.getMaSP());
                        GioHang.ThemVaoGioHang(listGioHang, item.getMaSP(), Integer.parseInt(value));
                    }
                }
            }
            session.setAttribute("dshang", listGioHang);
            response.sendRedirect(session.getAttribute("urlcur") + "");
        }
        session.setAttribute("soluongthem", value);
        session.setAttribute("themgio", "done");
        session.setAttribute("tenSP", request.getParameter("tenSP"));
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet SaveServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet SaveServlet at " + request.getContextPath() + "</h1>");
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
