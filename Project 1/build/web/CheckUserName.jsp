<%-- 
    Document   : CheckUserName
    Created on : Dec 3, 2016, 3:14:39 PM
    Author     : Computer
--%>

<%@page import="com.javaweb.service.UserService"%>
<%@page import="com.javaweb.service.ProductServices"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    request.setCharacterEncoding("UTF-8");
    String Username = request.getParameter("username");

    if (!Username.equals("")) {
         UserService us = new UserService();
        boolean ketQua = ketQua = us.isUserExists(Username);

        if (ketQua) {
%>
<font color=red>Tên người dùng đã tồn tại </font>
<input type="hidden" id="actual" name="actual" value="taken">
<%
} else {
%>
<font color=green>Tên người dùng có thể dùng</font>
<input type="hidden" id="actual" name="actual" value="available">
<%
            }
        }
%>