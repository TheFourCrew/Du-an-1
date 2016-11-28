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
                                if (session.getAttribute("tenHo") == null) {
                            %>
                        <li><a href="signup.jsp">
                                <span class="glyphicon glyphicon-user"></span> Đăng ký
                            </a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <span class="glyphicon glyphicon-log-in"></span> Đăng nhập
                                <span class="caret"></span>
                            </a>
                            <ul id="login-dp" class="dropdown-menu">
                                <%--<%@include file="../login.jsp" %>--%>
                                <%                                } else {
                                %>
                                <li>
                                    <a href="profile.jsp"><span class="glyphicon glyphicon-user">Xin chào, 
                                            <strong style="color: white"><%=session.getAttribute("tenHo")%> </strong>
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
