<%-- 
    Document   : UserManager
    Created on : Dec 1, 2016, 3:01:01 PM
    Author     : Admin
--%>

<%@page import="com.javaweb.model.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.javaweb.service.UserService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UserManager</title>
        <%@include file="includes/headtag.jsp" %>
    </head>
    <body>
        <%@include file="includes/header.jsp" %>
        <section class="container">
            <div class="row">
                <%
                    UserService us = new UserService();
                    ArrayList<User> listUsers = null;

                    listUsers = us.GetAllUsers();


                %>
                <section class="container-fluid">
                    <div class="panel panel-default">

                        <div class="panel-heading">Panel heading</div>


                        <table class="table">
                            <thead>
                                <tr>
                                    <th>TT</th>                        
                                    <th>Username</th>                        
                                                           
                                    <th>Fullname</th>                        
                                                          
                                                          
                                    <th>Address</th>
                                   
                                    
                                    <th>Image</th>
                                    <th>Status</th>
                                    <th>Note</th>
                                </tr>

                            </thead>
                            <tbody>
                                <%                                    for (int i = 0; i < listUsers.size(); i++) {
                                       User user = listUsers.get(i);
                                %>
                                <tr>
                                    <td><%=i + 1%></td>                        
                                    <td><%=user.getUsername()%></td>   
                                    
                                    <td><%=user.getFullname()%></td>
                                    
                                    
                                    <td><%=user.getAddress()%></td>
                                                          
                                    
                                    <td><img src="uploads/<%=user.getImage()%>" alt="<%=user.getImage()%>"width="50px"height="50px"/></td> 
                                    <td><%=user.getStatus()%></td>                       
                                    
                                    
                                    
                                    <td><%=user.getNote()%>=</td>
                                    <td>
                                        <a href="edituser.jsp?iduser=<%=user.getIduser()%>">Edit</a>
                                    </td>

                                    <td>
                                        
                                        <a href="DeleteUserServlet?iduser=<%=user.getIduser()%>" onclick="return confirm('Bạn có muốn xóa người dùng này?')">Delete</a>
                                    </td>

                                </tr>
                                <%

                                    }
                                %>



                            </tbody>

                        </table>
                        <ul class="pagination pager">
                            <li><a href="">Previous</a></li>

                            <li><a href="">Next</a></li>
                        </ul>
                    </div>
                </section>
        
        <%@include file="includes/footer.jsp" %>
    </body>
</html>
