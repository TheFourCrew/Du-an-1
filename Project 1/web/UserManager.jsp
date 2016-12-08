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
        <%@include file="include-dashboard/headtag.jsp" %>
    </head>
    <body>
        <div id="wrapper">

            <%@include file="include-dashboard/sidebar.jsp" %>
            <!--Ghi nội dung -->
            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Quản lý người dùng</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <div class="row">

                    <%                    UserService us = new UserService();
                        ArrayList<User> listUsers = null;
                        
                        listUsers = us.GetAllUsers();
                        
                        ArrayList<User>listUser=null;
                         
//                        listUser=us.GetUserByEmailOrUserName();

                    %>
                    <section class="container-fluid">
                        <div class="panel panel-default">

                            <div class="panel-heading">Danh mục người dùng
                                <form action="SearchServlet" method="post">
                                    <div class="searchus">
                                        <input type="text" style="float: right;    width: 300px;" name="username" class="form-control input-sm" maxlength="64" placeholder="Search" />
                                        <button type="submit" style="    margin-left: 645px;" class="btn btn-primary btn-sm searchbtn">Search</button>
                                    </div>
 
<!--                                    <table class="table">
                                        <%
                                            if(session.getAttribute("username")!=null){
                                        %>
                                    <thead>
                                        <tr>
                                            
                                            <th>TT</th>                        
                                            <th>Tên đăng nhập</th>                        

                                            <th>Họ tên</th>                        


                                            <th>Địa chỉ</th>


                                            <th>Hình đại diện</th>
                                            <th>Trạng thái</th>
                                            <th>Ghi chú</th>
                                        </tr>

                                    </thead>
                                    <tbody>
                                        <%                                   
                                                User user = listUser.get(i);
                                        %>
                                        <tr>
                                            
                                            <td><%=1%></td>                        
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

                                </table>-->
                                </form>
                            </div>

                            <form action="DeleteMultipleUser" method="post">

                                <div class="form-group">
                                    <label>
                                        <select name="tacvu" class="form-control-static">
                                            <option value="">Tác vụ</option>
                                            <option value="xoa">Xóa</option>
                                        </select>
                                        <input class="btn btn-danger" type="submit" value="Thực hiện" />
                                    </label>
                                </div>
                                <!-- Table -->
                                <script type="text/javascript">
                                    function check(source) {
                                        checkboxes = document.getElementsByName('iduser');
                                        for (var i = 0; i < checkboxes.length; i++) {
                                            checkboxes[i].checked = source.checked;
                                        }
                                    }
                                </script>

                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th><input type="checkbox" onclick="check(this)" /></th> 
                                            <th>TT</th>                        
                                            <th>Tên đăng nhập</th>                        

                                            <th>Họ tên</th>                        


                                            <th>Địa chỉ</th>


                                            <th>Hình đại diện</th>
                                            <th>Trạng thái</th>
                                            <th>Ghi chú</th>
                                        </tr>

                                    </thead>
                                    <tbody>
                                        <%                                    for (int i = 0; i < listUsers.size(); i++) {
                                                User user = listUsers.get(i);
                                        %>
                                        <tr>
                                            <th><input type="checkbox" name="iduser" value="<%=user.getIduser()%>" /></th>
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
                            </form>

                            <ul class="pagination pager">
                                <li><a href="">Previous</a></li>

                                <li><a href="">Next</a></li>
                            </ul>
                        </div>
                    </section>
                </div>
            </div>
        </div>
    </body>
</html>
