<%-- 
    Document   : infouser
    Created on : Dec 14, 2016, 5:05:11 PM
    Author     : Computer
--%>

<%@page import="com.javaweb.model.User"%>
<%@page import="com.javaweb.service.UserService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INFO USER</title>
        <%@include file="includes/headtag.jsp" %>
    </head>
    <body>
        <%@include file="includes/header.jsp" %>
        <div class="container">
            <h2>THÔNG TIN THÀNH VIÊN</h2>

            <ul class="nav nav-tabs">
                <li class="active"><a data-toggle="tab" href="#hoso">Hồ Sơ Thành Viên</a></li>
                <li><a data-toggle="tab" href="#edituser">Chỉnh Sửa Thành Viên</a></li>
            </ul>
            <div class="tab-content">
                <div id="hoso" class="tab-pane fade in active">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-5  toppad  pull-right col-md-offset-3 ">
                                <a href="edit.html" >Edit Profile</a>

                                <a href="edit.html" >Logout</a>
                                <br>
                                <p class=" text-info">May 05,2014,03:00 pm </p>
                            </div>
                            <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad" >

                                <% UserService us = new UserService();
                                    User user = null;
                                    String tendn = session.getAttribute("tendn") + "";
                                    user = us.GetUserByEmailOrUserName(tendn);

                                %>
                                <div class="panel panel-info">
                                    <div class="panel-heading">
                                        <h3 class="panel-title" ><%=user.getUsername()%></h3>
                                    </div>
                                    <div class="panel-body">
                                        <div class="row">
                                            <div class="col-md-3 col-lg-3 " align="center"> <img alt="<%=user.getFullname()%>" src="uploads/<%=user.getImage()%>" class="img-circle img-responsive"> </div>

                                            <!--<div class="col-xs-10 col-sm-10 hidden-md hidden-lg"> <br>
                                              <dl>
                                                <dt>DEPARTMENT:</dt>
                                                <dd>Administrator</dd>
                                                <dt>HIRE DATE</dt>
                                                <dd>11/12/2013</dd>
                                                <dt>DATE OF BIRTH</dt>
                                                   <dd>11/12/2013</dd>
                                                <dt>GENDER</dt>
                                                <dd>Male</dd>
                                              </dl>
                                            </div>-->
                                            <div class=" col-md-9 col-lg-9 "> 
                                                <table class="table table-user-information">
                                                    <tbody>

                                                        <tr>
                                                            <td>Quyền :</td>

                                                        </tr>
                                                        <tr>
                                                            <td>Ngày Tạo :</td>
                                                            <td><%=user.getUsername()%></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Họ và Tên :</td>
                                                            <td><%=user.getUsername()%></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Ngày Sinh :</td>
                                                            <td><%=user.getBirthday()%></td>
                                                        </tr>

                                                        <tr>
                                                        <tr>
                                                            <td>Giới Tính :</td>
                                                            <td>
                                                                <%
                                                                    String gioiTinh = "Nữ";
                                                                    if (user.isGender()) {
                                                                        gioiTinh = "Nam";
                                                                    }
                                                                %>
                                                                <%=gioiTinh%>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>Địa Chỉ :</td>
                                                            <td><%=user.getAddress()%></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Email :</td>
                                                            <td><%=user.getEmail()%></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Số Điện Thoại :</td>
                                                            <td><%=user.getUserPhone()%></td>

                                                        </tr>

                                                    </tbody>
                                                </table>

                                                <a href="#" class="btn btn-primary">My Sales Performance</a>
                                                <a href="#" class="btn btn-primary">Team Sales Performance</a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="panel-footer">
                                        <a data-original-title="Broadcast Message" data-toggle="tooltip" type="button" class="btn btn-sm btn-primary"><i class="glyphicon glyphicon-envelope"></i></a>
                                        <span class="pull-right">
                                            <a href="edit.html" data-original-title="Edit this user" data-toggle="tooltip" type="button" class="btn btn-sm btn-warning"><i class="glyphicon glyphicon-edit"></i></a>
                                            <a data-original-title="Remove this user" data-toggle="tooltip" type="button" class="btn btn-sm btn-danger"><i class="glyphicon glyphicon-remove"></i></a>
                                        </span>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>


                <!-- CHỈNH SỬA HỒ SƠ -->

                <div id="edituser" class="tab-pane fade">

                    <h3>Chỉnh Sửa Hồ Sơ</h3>
                    <div class="container">
                        <hr>
                        <div class="row">
                            <!-- left column -->
                            <div class="col-md-3">
                                <div class="text-center">
                                   
                                    <h5>Tải lên ảnh khác </h5>
                                    <%
                                        if (user.getImage() != null) {
                                            String folderupload = getServletContext().getInitParameter("file-upload");
                                    %>
                                    <img class="img-thumbnail" src="<%=folderupload%><%=user.getImage()%>" />
                                    <%
                                        }
                                    %>       
                                    <input type="file"  name="file" size="50" onchange="loadFile(event)" class="form-control">
                                    <img id="output" src="">
                                    <script type="text/javascript">
                                        var loadFile = function (event) {
                                            var ouput = document.getElementById('ouput');
                                            output.src = URL.createObjectURL(event.target.files[0]);
                                        }

                                    </script>
                                </div>
                            </div>
                            <div class="col-md-9 personal-info">

                                <h3 style="text-align: center;color: #007bb6;">Thông Tin Cá Nhân</h3>
                                </br>
                                <form action="E" method="post" id="editinfo" >
                                    <div class="form-group">
                                        <label class="col-lg-3 control-label">Họ và Tên:</label>
                                        <div class="col-lg-8">
                                            <input class="form-control" value="<%=user.getFullname()%>" name="username" type="text" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-3 control-label">Ngày Sinh:</label>
                                        <div class="col-lg-8">
                                            <input class="form-control" value="<%=user.getBirthday()%>"  name="birthday" type="date" >
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-lg-3 control-label">Địa chỉ:</label>
                                        <div class="col-lg-8">
                                            <input class="form-control" value="<%=user.getAddress()%>" name="address" type="text" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-3 control-label">Số điên thoại :</label>
                                        <div class="col-lg-8">
                                            <input class="form-control" value="<%=user.getUserPhone()%>" name="dienthoai" type="number" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">Mật khẩu :</label>
                                        <div class="col-md-8">
                                            <input class="form-control" value="<%=user.getPassword()%>" name="password" type="password" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">Nhập Lại Mật khẩu :</label>
                                        <div class="col-md-8">
                                            <input class="form-control" value="<%=user.getPassword()%>" name="repassword" type="password" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-3 control-label"></label>
                                        <div class="col-md-8">
                                            <input type="submit" class="btn btn-primary" value="Cập Nhập">
                                            <span></span>
                                            <input type="reset" class="btn btn-default" value="Hủy Bỏ">
                                        </div>
                                    </div>
                                </form>

                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
        <div id="menu1" class="tab-pane fade">


        </div>
        <%@include file="includes//footer.jsp" %>
    </body>
</html>
