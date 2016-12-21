<%-- 
    Document   : addtocart
    Created on : Dec 12, 2016, 4:45:16 PM
    Author     : Admin
--%>

<%@page import="com.javaweb.service.GioHang"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            request.setCharacterEncoding("UTF-8");
            String idSP = "";
            boolean ketQua = true;
            int kho = Integer.parseInt(request.getParameter("kho"));
            if (request.getParameter("idsanpham") != null) {
                idSP = request.getParameter("idsanpham");
            }

            ArrayList<GioHang> listGioHang = new ArrayList();
            if (session.getAttribute("dshang") != null) {
                listGioHang = (ArrayList) session.getAttribute("dshang");
            }
            if (listGioHang.size() > 0) {
                for (int i = 0; i < listGioHang.size(); i++) {
                    GioHang item = listGioHang.get(i);
                    if (item.getMaSP().equals(idSP)) {
                        int tongSL = Integer.parseInt(item.getSoLuong()) + 1;
                        if (item.getMaSP() != null) {
                            if (tongSL > kho) {
                                session.setAttribute("themgio", "failed");
                                session.setAttribute("tenSP", request.getParameter("tenSP"));
                                session.setAttribute("kho", kho);
                                ketQua = false;
                            } else {
                                GioHang.ThemVaoGioHang(listGioHang, idSP, -1);
                                session.setAttribute("themgio", "done");
                                session.setAttribute("tenSP", request.getParameter("tenSP"));
                                session.setAttribute("dshang", listGioHang);
                                ketQua = false;
                            }
                        }
                    }
                }
            } 
            if(ketQua){
                GioHang.ThemVaoGioHang(listGioHang, idSP, -1);
                session.setAttribute("themgio", "done");
                session.setAttribute("tenSP", request.getParameter("tenSP"));
                session.setAttribute("dshang", listGioHang);
            }

            response.sendRedirect(session.getAttribute("urlcur") + "");
        %>
    </body>
</html>
