<%-- 
    Document   : CheckProductName
    Created on : Dec 7, 2016, 6:22:51 PM
    Author     : MinhNguyen
--%>

<%@page import="com.javaweb.service.ProductServices"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    request.setCharacterEncoding("UTF-8");
    String prodName = request.getParameter("tsp");
    String oldName = request.getParameter("old");
    
    if(!prodName.equals(oldName)){
    
    if (!prodName.equals("")) {
        ProductServices ps = new ProductServices();
        boolean ketQua = ketQua = ps.isProductExists(prodName);
        
        if (ketQua) {
%>
<font color=red>Tên sản phẩm đã tồn tại </font>
<input type="hidden" id="actual" name="actual" value="taken">
<%
} else {
%>
<font color=green>Tên sản phẩm có thể dùng</font>
<input type="hidden" id="actual" name="actual" value="available">
<%
        }
    }
}
%>
