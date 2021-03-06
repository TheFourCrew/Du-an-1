package com.javaweb.controller;

import com.javaweb.model.User;
import com.javaweb.service.EnDeCryption;
import com.javaweb.service.UserService;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class RegsisterServlet extends HttpServlet {

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

        String username, id, fullname, email, password, repassword, note = "", gender, idrole, phone, address, fileName, strBirthday;
        username = request.getParameter("username");
        password = request.getParameter("mk");
        repassword = request.getParameter("repassword");
        fullname = request.getParameter("fullname");
        phone = request.getParameter("dienthoai");
        address = request.getParameter("address");
        email = request.getParameter("email");
        strBirthday = request.getParameter("birthday");
        gender = request.getParameter("gender");

        Date datez = new Date();
        Date birthday = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            birthday = sdf.parse(strBirthday);
        } catch (ParseException ex) {
            System.out.println(ex.toString());
        }
        
        boolean gt = false;

        if (gender.equals("Nam")) {
            gt = true;
        }
        HttpSession session = request.getSession();

        EnDeCryption mh = new EnDeCryption("zxczxsdfsdfgsdjklh");
        String mk = mh.encoding(password);
        
        session.setAttribute("email", username);
        session.setAttribute("fullname", fullname);
        session.setAttribute("idroleuser", 3);

        User user = new User(username, mk, 3, fullname, gt, phone, address, email, birthday, "Photo-Unavailable.jpg", false, note, datez) ;
        UserService userservice = new UserService();
        userservice.InserUser(user);
        session.setAttribute("tendn", username);

        response.sendRedirect(session.getAttribute("urlcur")+"");

//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet EditUserServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet EditUserServlet at " + request.getContextPath() + "</h1>");
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
