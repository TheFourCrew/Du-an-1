/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.controller;

import com.javaweb.model.User;
import com.javaweb.service.EnDeCryption;
import com.javaweb.service.UserService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class LoginServlet extends HttpServlet {

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
        String email = request.getParameter("email");
        String password = request.getParameter("pw");
        String remem = request.getParameter("remember");

        boolean remember = "R".equals(remem);
        UserService userservice = new UserService();
//        EnDeCryption mh=new EnDeCryption("asdasdasda");
//        String mk=mh.encoding(password);

        EnDeCryption mh = new EnDeCryption("zxczxsdfsdfgsdjklh");
        String mk = mh.encoding(password);
        
        boolean login = userservice.CheckLogin(email, mk);
        HttpSession session = request.getSession();
        session.removeAttribute("errormsg");
        if (login) {
            session.removeAttribute("idrole_user");
            session.removeAttribute("email");
            session.removeAttribute("fullname");
            session.removeAttribute("iduser");
            session.removeAttribute("avatar");
            session.removeAttribute("cmtname");

            if (session.getAttribute("email") != null) {
                String em = (String) session.getAttribute("email");
                if (em.equals(email)) {
                    response.sendRedirect("eroorsession.jsp");
                }
            }
            User user = userservice.GetUserByEmailOrUserName(email);
            session.setAttribute("email", user.getEmail());
            session.setAttribute("iduser", user.getIduser());
            session.setAttribute("idroleuser", user.getIdroleUser());
            session.setAttribute("fullname", user.getFullname());
            session.setAttribute("avatar", user.getImage());

            session.setAttribute("tendn", user.getUsername());
            
//            String url = "/index.jsp";
//            getServletContext().getRequestDispatcher(url).forward(request, response);
            response.sendRedirect(session.getAttribute("urlcur") + "");
        } else {
            session.setAttribute("errormsg", "Tài khoản hoặc mật khẩu sai");
            String url = "/login.jsp";
            getServletContext().getRequestDispatcher(url).forward(request, response);

            try (PrintWriter out = response.getWriter()) {

                out.println("<script>\n"
                        + "$( document ).ready(function() {\n"
                        + "$(\"#myModal\").modal('show');\n"
                        + "});\n"
                        + "</script>");

            }
        }
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet LoginServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
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
