<%-- 
    Document   : logout
    Created on : Nov 30, 2016, 4:48:19 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
        
    </head>
    <body>
        <%@include file="includes/header.jsp" %>
        <% if(session!=null){
                session.removeAttribute("email");
                response.sendRedirect("index.jsp");
                session.removeAttribute("idrole_user");
                
            }
            %> 
        
    </body>
</html>