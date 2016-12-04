package com.javaweb.controller;

import com.javaweb.service.Email;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MinhNguyen
 */
public class LienLac extends HttpServlet {

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
        
//        String receiver = "minhncpk00629@fpt.edu.vn";
        String host;
        String port;
        String user;
        String pass;
        //reads SMTP server setting from web.xml file
        ServletContext context = getServletContext();
        host = context.getInitParameter("host");
        port = context.getInitParameter("port");
        user = context.getInitParameter("user");
        pass = context.getInitParameter("pass");

        String sender = request.getParameter("cEmail");

        String cname = request.getParameter("cName");
        String csubject = request.getParameter("cSubject");
        String cMessage = request.getParameter("cMessage");
        HttpSession session = request.getSession();
        String resultMessage = "";

        try {
            Email.sendEmail(host, port, user, pass, sender,  csubject, cMessage, cname);
            resultMessage += "The e-mail was sent successfully";
            response.sendRedirect("index.jsp");
//            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        } catch (Exception e) {
            resultMessage += "There was an error: " + e.getMessage();
            getServletContext().getRequestDispatcher("/lienlac.jsp").forward(request, response);
        } finally {
            session.setAttribute("Message", resultMessage);
        }
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet LienLac</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet LienLac at " + request.getContextPath() + "</h1>");
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
