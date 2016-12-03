/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.service;

import com.javaweb.model.User;
import static com.mchange.v2.c3p0.impl.C3P0Defaults.password;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Computer
 */
public class RegsisterSeverlet extends HttpServlet {

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
        String uname=request.getParameter("username");
        String upassword = request.getParameter("password");
        String urepassword = request.getParameter("repassword");
        String fname = request.getParameter("fullname");
        String dthoai = request.getParameter("dienthoai");
        String dchi = request.getParameter("diachi");
        String uemail = request.getParameter("email");
        String nsinh = request.getParameter("ngaysinh");
        String gt = request.getParameter("gioitinh");

        boolean gioitinh = false;
        if(gt.equals("Nam")) {
            gioitinh = true;
        }
        
        HttpSession session = request.getSession();
        
        if(! password.equals(repassword)){
            session.setAttribute("lo","nahp lai");
            
            String url = "/Regsister.jsp";
            getServletContext().getRequestDispatcher(url).forward(request, response);
        }else{
            String mkmh = md5.md5Encryption(pwd);
            User user;
            user = new User(username, email, mkmh, "askdj");
            
            UserService userServices = new UserService();
            userServices.InserUser(user);
            
            String url = "/index.jsp";
            getServletContext().getRequestDispatcher(url).forward(request, response);
        }
        
        //
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Regsister</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet Regsister at " + request.getContextPath() + "</h1>");
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
//