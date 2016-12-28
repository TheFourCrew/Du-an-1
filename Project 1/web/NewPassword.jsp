<%-- 
    Document   : NewPassword
    Created on : Dec 22, 2016, 5:40:24 PM
    Author     : Computer
--%>

<%@page import="com.javaweb.service.EnDeCryption"%>
<%@page import="com.javaweb.model.User"%>
<%@page import="com.javaweb.service.UserService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    request.setCharacterEncoding("UTF-8");
    String id = request.getParameter("id");
    String mknhap = request.getParameter("nhap");
    UserService us = new UserService();
    User user = us.getUserByID(id);
    EnDeCryption mh = new EnDeCryption("zxczxsdfsdfgsdjklh");
    String mk = mh.decoding(user.getPassword());
    if (!mknhap.equals("")) {
//        boolean ketQua = ketQua = us.isUserExists(Username);

        if (!mknhap.equals(mk)) {
%>
<font color=red>Mật khẩu cũ không chính xác </font>
<input type="hidden" id="actual" name="actual" value="taken">
<%
} else {
%>
<!--<font color=green>Tên người dùng có thể dùng</font>-->
<input type="hidden" id="actual" name="actual" value="available">
<%
        }
    }
%>