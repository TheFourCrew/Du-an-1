<%-- 
    Document   : header
    Created on : Oct 18, 2016, 9:35:38 PM
    Author     : MinhNguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<header class="container-fluid">
    <div class="container banner-logo">
        <div class="row">
            <div class="col-md-4">
                <a href="index.jsp">
                    <img class="img-responsive" src="#" alt="Logo"/>
                </a>
            </div>
            <div class="col-md-8">
                <center>
                    <a href="#">
                        <img class="img-responsive" src="https://cdn.adf.ly/images/banners/adfly.728x90.2.gif" alt="Advertisement"/>
                    </a>
                </center>
            </div>
        </div>
    </div>
    <div class="row">
        <nav class="navbar navbar-inverse menu-bar" id="nav">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span> 
                    </button>
                    <a class="navbar-brand active menu" href="index.jsp">
                        <span class="glyphicon glyphicon-home"></span>
                    </a>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav ">
                        <li><a href="#" class="menu">Introduce</a></li>
                        <li><a href="addproduct.jsp" class="menu">Thêm sản phẩm</a></li>
                            <%
                                if (session.getAttribute("tenHo") != null) {

                            %>
                        <li><a href="managementproduct.jsp" class="menu">Quản lý sản phẩm</a></li>
                        <li><a href="managementuser.jsp" class="menu">Quản lý người dùng</a></li>
                            <%                                }
                            %>
                        <li class="dropdown-submenu menu">
                            <a class="dropdown-toggle menu" data-toggle="dropdown" href="#">
                                <span class="glyphicon glyphicon-usd"></span> Áo
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu menu"  role="menu" aria-labelledby="dropdownMenu">
                                <li><a href="#" class="menu">Áo sơ mi</a></li>
                                <li><a href="#" class="menu">Áo hoodie</a></li>
                                <li><a href="#" class="menu">Áo thun</a></li> 
                            </ul>
                        </li>
                        <li><a href="contact.jsp" class="menu">Liên hệ</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li> <hr></li>
                            <%
                                if (session.getAttribute("email") == null) {
                            %>
                        <li><a href="Regsister.jsp">
                                <span class="glyphicon glyphicon-user"></span> Đăng ký
                            </a>
                        </li>
                        <li class="dropdown">
                            <button type="button" 
                                    <span class="glyphicon glyphicon-log-in" data-toggle="modal" data-target="#myModal" style="padding-bottom: 5px;
                                  margin-top: 13px;    margin-right: 10px;"></span> Đăng nhập

                            </button>
                            <div id="myModal" style="margin-top: 130px;" class="modal fade" role="dialog">
                                <div class="modal-dialog">

                                    <!-- Modal content-->
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                                            <h4 class="modal-title" style="    margin-left: 246px;">Đăng nhập</h4>
                                        </div>
                                        <form class="form-horizontal"action="LoginServlet" method="post">

                                            <div class="form-group">
                                                <label class="control-label col-sm-2" for="email"> Email:</label>
                                                <div class="col-sm-10">
                                                    <input type="text" name="email" class="form-control" id="email" placeholder="Enter email">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label col-sm-2" for="pwd">Mật khẩu:</label>
                                                <div class="col-sm-10"> 
                                                    <input type="password" name="pw" class="form-control" id="pwd" placeholder="Enter password">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group"> 
                                                <div class="col-sm-offset-2 col-sm-10">
                                                    <button type="submit" class="btn btn-default" style="margin-left: 150px;">Đăng nhập</button>
                                                   
                                                </div>
                                                
                                            </div>
                                        </form>
                                    </div>

                                </div>
                            </div>
                            <ul id="login-dp" class="dropdown-menu">
                                <%--<%@include file="../login.jsp" %>--%>
                                <%
                                } else {
                                %>
                                <li>
                                    <a href="index.jsp"><span class="glyphicon glyphicon-user">
                                            <strong style="color: white"><%=session.getAttribute("email")%> </strong>
                                        </span>
                                    </a>
                                </li>

                                <li><a href="logout.jsp"><span class="glyphicon glyphicon-log-out"></span>Thoát</a></li>
                                    <%
                                        }
                                    %>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <script type="text/javascript">
//            $(function () {
//                var pgurl = window.location.href.substr(window.location.href
//                        .lastIndexOf("/") + 1);
//                $("#nav ul li a").each(function () {
//                    if ($(this).attr("href") == pgurl || $(this).attr("href") == '')
//                        $(this).addClass("active");
//                })
//            });
//            $(document).ready(function () {
//                $('.menu').click(function () {
//                    $('.menu').removeClass("active");
//                    $(this).addClass("active");
//                });
//            });
        </script>
    </div>
</header>
