<%-- 
    Document   : edituser
    Created on : Dec 2, 2016, 4:03:45 PM
    Author     : Admin
--%>

<%@page import="com.javaweb.model.RoleUser"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.javaweb.model.User"%>
<%@page import="com.javaweb.service.UserService"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User</title>
        <%@include file="includes//headtag.jsp" %>
    </head>
    <body>
        <%@include file="includes//header.jsp" %>
        <%            UserService us = new UserService();
            User user = null;
            String userId = request.getParameter("iduser");
            user = us.getUserByID(userId);
        %>
        <section class="container">
            <div class="row">
                <form action="EditUserServlet" method="post"enctype="multipart/form-data" >
                    <input style="display: none;" name="iduser" value="<%=user.getIduser()%>" />
                    <div class="form-group">
                        <label for="username">Tên Đăng Nhập: </label>
                        <input type="text" name="username" value="<%=user.getUsername()%>" class="form-control" required id="username">
                    </div>
                    <div class="form-group">
                        <label for="password">Mật Khẩu:</label>
                        <input type="password" name="password" value="<%=user.getPassword()%>" class="form-control" required id="password">
                    </div>
                    <div class="form-group">
                        <label for="idrole_user">Nhập lại mật khẩu:</label>
                        <input type="t" name="idrole" value="<%=user.getPassword()%>" class="form-control" required id="repassword">
                    </div>
                    <div class="form-group">
                        <label for="idrole_user">Quyền:</label>
                        <select name="role" class="form-control">

                            <option value ="">Chọn quyền</option>
                            <%
                                UserService role = new UserService();
                                ArrayList<RoleUser> listRole = null;

                                listRole = role.GetAllRole();
                                for (int i = 0; i < listRole.size(); i++) {
                            %>
                            <option value="<%=listRole.get(i).getIdroleUser()%>"><%=listRole.get(i).getRoleName()%></option>
                            <%
                                }
                            %>
                        </select>
                    </div>

                    <div class="form-group">
                        <label for="fullname">Họ tên: </label>
                        <input type="text" name="fullname" value="<%=user.getFullname()%>" class="form-control" required id="fullname">
                    </div>
                    <div class="form-group">
                        <% if (user.isGender()) {

                        %>
                        <input type="radio" name="gioitinh" value="Nam" checked="checked" />Nam
                        <input type="radio" name="gioitinh" value="Nữ" />Nữ
                        <%                            } else {
                        %>
                        <input type="radio" name="gioitinh" value="Nam"  />Nam
                        <input type="radio" name="gioitinh" value="Nữ"checked="checked" />Nữ
                        <%
                            }
                        %>

                    </div>
                    <div class="form-group">
                        <label for="dienthoai">Điện thoại: </label>
                        <input type="text" name="dienthoai" value="<%=user.getUserPhone()%>" class="form-control" required id="dienthoai">
                    </div>



                    <div class="form-group">
                        <label for="address">Địa chỉ:</label>
                        <input type="text" name="address" value="<%=user.getAddress()%>" class="form-control" required id="address">
                    </div>
                    <div class="form-group">
                        <label for="email">Emal: </label>
                        <input type="email" name="email" value="<%=user.getEmail()%>" class="form-control" required id="email">
                    </div>
                    <%
                        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
                    %>
                    <div class="form-group">
                        <label for="birthday">Ngày sinh:</label>
                        <input type="date" name="birthday" value="<%=dt.format(user.getBirthday())%>" class="form-control" required id="birthday">
                    </div>

                    <div class="form-group">
                        <label for="note">Ghi chú:</label>
                        <textarea row="4" cols="20" class="form-control" name="note"> <%=user.getNote()%></textarea>
                    </div>
                    <div class="form-group avatar-gr">

                        <%
                            if (user.getImage() != null) {
                                String folderupload = getServletContext().getInitParameter("file-upload");
                        %>
                        <img class="img-thumbnail" src="<%=folderupload%><%=user.getImage()%>" />
                        <%
                            }
                        %>
                        <input type="file" name="file" size="50" onchange="loadFile(event)"/>
                        <img id="output" src="">
                        <script type="text/javascript">
                            var loadFile = function (event) {
                                var ouput = document.getElementById('ouput');
                                output.src = URL.createObjectURL(event.target.files[0]);
                            }

                        </script>

                    </div>


                    <div class="checkbox">
                        <label><input required="" type="checkbox" name="rememberMe" value="Y">Agree condition! </label>
                    </div>
                    <button type="submit" class="btn btn-default">Update</button>

                </form>
            </div>
        </section>
        <%@include file="includes//footer.jsp" %>
    </body>
</html>