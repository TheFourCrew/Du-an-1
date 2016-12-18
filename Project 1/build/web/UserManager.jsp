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


                    <section class="container-fluid">
                        <div class="panel panel-default">

                            <div class="panel-heading">Danh mục người dùng
                                <!--                                <form action="SearchServlet" method="post">
                                                                    <div class="searchus">
                                                                        <input type="text" style="float: right;    width: 300px;" name="username" class="form-control input-sm" maxlength="64" placeholder="Search" />
                                                                        <button type="submit" style="    margin-left: 645px;" class="btn btn-primary btn-sm searchbtn">Search</button>
                                                                    </div>-->



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
                                <%
                                    int pageSize = 10;
                                    int pageNumber = 1;
                                    String url = "UserManager.jsp";
                                    UserService ps = new UserService();
                                    ArrayList<User> listUser = null;

                                    if (request.getParameter("pagenumber") != null) {
                                        session.setAttribute("pagenumber", request.getParameter("pagenumber"));
                                        pageNumber = Integer.parseInt(request.getParameter("pagenumber"));
                                    } else {
                                        session.setAttribute("pagenumber", "1");
                                    }

                                    listUser = ps.getAllUser(pageSize, pageNumber);

                                    int pageCount = (ps.usertcount) / pageSize + (ps.usertcount % pageSize > 0 ? 1 : 0);

                                    String nextPage = (pageCount > pageNumber ? (pageNumber + 1) : pageNumber) + "";
                                    String prevPage = (pageNumber <= 1 ? 1 : pageNumber - 1) + "";


                                %>
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th><input type="checkbox" onclick="check(this)" /></th> 
                                            <th>TT</th>                        
                                            <th>Tên đăng nhập</th>                        

                                            <th>Họ tên</th>                        





                                            <th>Hình đại diện</th>
                                            <th>Trạng thái</th>

                                        </tr>

                                    </thead>
                                    <tbody>
                                        <%                                    for (int i = 0; i < listUser.size(); i++) {
                                                User user = listUser.get(i);
                                                int dem =i+1;
                                                if(pageNumber>1){
                                                    dem=i+pageSize * (pageNumber -1)+1;
                                                }
                                        %>
                                        <tr>
                                            <th><input type="checkbox" name="iduser" value="<%=user.getIduser()%>" /></th>
                                            <td><%=dem %></td>                        
                                            <td><%=user.getUsername()%></td>   

                                            <td><%=user.getFullname()%></td>





                                            <td><img src="uploads/<%=user.getImage()%>" alt="<%=user.getImage()%>"width="50px"height="50px"/></td> 
                                            <td><%=user.getStatus()%></td>                       




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

                            <%
                                if (pageCount != 1) {
                            %>
                            <div class="panel-footer">
                                <nav aria-label="Page navigation">
                                    <ul class="pagination">
                                        <%
                                            if (pageNumber != 1) {
                                        %>
                                        <li><a aria-label="Previous" href="<%=url%>?pagenumber=<%=prevPage%>"><span aria-hidden="true">&laquo;</span></a></li>
                                            <%
                                                }
                                                for (int j = 1; j <= pageCount; j++) {
                                                    if (pageNumber == j) {
                                            %>
                                        <li class="active"><a href="<%=url%>?pagenumber=<%=j%>"><%=j%></a></li>
                                            <%
                                            } else {
                                            %>
                                        <li><a href="<%=url%>?pagenumber=<%=j%>"><%=j%></a></li>
                                            <%
                                                    }
                                                }
                                                if (pageNumber != pageCount) {
                                            %>
                                        <li><a aria-label="Next" href="<%=url%>?pagenumber=<%=nextPage%>"><span aria-hidden="true">&raquo;</span></a></li>
                                            <%
                                                }
                                            %>
                                    </ul>
                                </nav>
                            </div>
                            <%
                                }
                            %>
                        </div>
                    </section>
                </div>
            </div>
        </div>
    </body>
</html>
