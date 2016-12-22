<%-- 
    Document   : NewPassword
    Created on : Dec 22, 2016, 5:40:24 PM
    Author     : Computer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    request.setCharacterEncoding("UTF-8");
    String mk1 = request.getParameter("cu");
     String mk2 = request.getParameter("nhap");

    if (!mk2.equals("")) {
//        boolean ketQua = ketQua = us.isUserExists(Username);

        if (!mk1.equals(mk2)) {
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