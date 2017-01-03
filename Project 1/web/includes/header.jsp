<%-- 
    Document   : header
    Created on : Oct 18, 2016, 9:35:38 PM
    Author     : MinhNguyen
--%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.javaweb.service.ProductServices"%>
<%@page import="com.javaweb.model.Product"%>
<%@page import="com.javaweb.service.GioHang"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<<<<<<< HEAD
<header class="container-fluid">
    <div class="container banner-logo">
        <div class="row">
            <div class="col-md-4">
                <a href="index.jsp">
                    <img class="img-responsive" src="images/logo.png" alt="Logo"/>
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
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav ">
                        <li><a href="index.jsp" class="menu active"><span class="glyphicon glyphicon-home"></span></a></li>
                        <!--<li><a href="addproduct.jsp" class="menu">Thêm sản phẩm</a></li>-->
                        <%
                            if (session.getAttribute("tenHo") != null) {
                        %>
                        <li><a href="managementproduct.jsp" class="menu">Quản lý sản phẩm</a></li>
                        <li><a href="managementuser.jsp" class="menu">Quản lý người dùng</a></li>
                            <%                                }
                            %>
                        <li class="dropdown-submenu menu dropdown">
                            <a class="dropdown-toggle menu dropbtn" href="Product.jsp">
                                <span class="glyphicon glyphicon-usd"></span> Sản phẩm
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu menu dropdown-content">
                                <li><a href="#" class="menu">Áo sơ mi</a></li>
                                <li><a href="#" class="menu">Áo hoodie</a></li>
                                <li><a href="#" class="menu">Áo thun</a></li> 
                            </ul>
                        </li>
                        <li><a href="#" class="menu">Giới thiệu</a></li>
                        <li><a href="#" class="menu">Bài viết</a></li>
                        <li><a href="contact.jsp" class="menu">Liên hệ</a></li>
                    </ul>
=======
<header>
<style>
  /* Note: Try to remove the following lines to see the effect of CSS positioning */
  .affix {
      top: 0;
      width: 100%;
  }
>>>>>>> origin/master

  .affix + .container {
      padding-top: 70px;
  }
  </style>
    <!--start of header-->
    <nav class="navbar navbar-inverse">
        <div class="container-fluid menu">
            <nav class="navbar navbar-inverse navbar-fixed-top menubar">
                <div class=" top">
                    <div class="topbar">
                        <div class="container "  data-spy="affix" data-offset-top="197">
                            <ul class="nav navbar-nav">
                                <li> <hr></li>
                                    <%
                                        if (session.getAttribute("email") == null) {
                                    %>
                                <li><a href="Regsister.jsp">
                                        Đăng ký
                                    </a>
                                </li>
                                <li>
                                    <a href="#myModal" style="outline: none;" data-toggle="modal">Đăng nhập</a>

                                    <div id="myModal" style="margin-top: 130px;" class="modal fade" role="dialog">
                                        <div class="modal-dialog">

                                            <!-- Modal content-->
                                            <div class="modal-content">
                                                <div class="modal-header">
                                                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                    <h4 class="modal-title">Đăng nhập</h4>
                                                </div>

                                                <form class="form-horizontal"action="LoginServlet" method="post">

                                                    <div class="form-group">
                                                        <label class="control-label col-sm-3" for="email"> Tên đăng nhập</label>
                                                        <div class="col-sm-8">
                                                            <input type="text" name="email" class="form-control" id="email" placeholder="Nhập tên đăng nhập">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="control-label col-sm-3" for="pwd">Mật khẩu</label>
                                                        <div class="col-sm-8"> 
                                                            <input type="password" name="pw" class="form-control" id="pwd" placeholder="Nhập mật khẩu">
                                                        </div>
                                                    </div>

                                                    <div class="form-group"> 
                                                        <div class="col-sm-offset-2 col-sm-10">
                                                            <button type="submit" class="btn btn-info" style="margin-left: 150px;">Đăng nhập</button>

                                                        </div>

                                                    </div>
                                                </form>
                                            </div>

                                        </div>
                                    </div>
                                </li>
                                <!--<ul id="login-dp" class="dropdown-menu">-->
                                <%
                                } else {
                                %>
                                <li class="dropdown-submenu menu dropdown">
                                    <a href="index.jsp" class="dropdown-toggle menu dropbtn">
                                        <i class="glyphicon glyphicon-user"> <strong style="color: white"><%=session.getAttribute("fullname")%> </strong></i>
                                    </a>
                                    <ul class="dropdown-menu menu dropdown-content">
                                        <li><a href="infouser.jsp" class="menu">Điều chỉnh hồ sơ</a></li>
                                        <li><a href="dashboard.jsp" class="menu">Về trang quản trị</a></li>
                                        <li>
                                            <a href="logout.jsp"><span class="glyphicon glyphicon-log-out"></span>Thoát</a>
                                        </li>
                                    </ul>
                                </li>
                                <%
                                    }
                                %>
                                <!--</ul>-->
                            </ul>
                            <ul class="col-md-6 text-right navbar-right topphai col-xs-12" style="
    padding-top: 15px;
">
                                <li class="dropdown-submenu menu dropdown">
                                    <ul class="dropdown-menu menu gioHang col-md-12 dropdown-content">
                                        <li>
                                            <form action="SaveServlet" method="post">
                                                <%
                                                    ArrayList<GioHang> sizeGH = (ArrayList) session.getAttribute("dshang");
                                                    ArrayList<GioHang> listGioHang = null;
                                                    if (session.getAttribute("dshang") != null) {
                                                        listGioHang = (ArrayList) session.getAttribute("dshang");
                                                    }
                                                    if (request.getParameter("removeidsp") != null) {
                                                        session.removeAttribute("urlctsp");
                                                        String removeidsp = request.getParameter("removeidsp");
                                                        GioHang.XoaTuGioHang(listGioHang, removeidsp);
                                                        session.setAttribute("dshang", listGioHang);
                                                    }
                                                    if (session.getAttribute("dshang") != null && sizeGH.size() > 0) {
                                                        listGioHang = (ArrayList) session.getAttribute("dshang");
                                                        double tongTien = 0;
                                                        DecimalFormat dcf = new DecimalFormat("###,###,###");
                                                %>
                                                <table class="table">
                                                    <tbody>
                                                        <%
                                                            for (int i = 0; i < listGioHang.size(); i++) {
                                                                ProductServices pssh = new ProductServices();
                                                                Product pth = null;
                                                                GioHang item = listGioHang.get(i);
                                                                pth = pssh.GetById(item.getMaSP());
                                                                int soLuong = Integer.parseInt(item.getSoLuong());
                                                                double donGia = pth.getPricePerUnit();
                                                                double ketQua = GioHang.TinhTongTien(soLuong, donGia);
                                                                tongTien += ketQua;
                                                        %>
                                                        <tr>
                                                            <td>
                                                                <div class="x-btn">
                                                                    <center>
                                                                        <%
                                                                            if (session.getAttribute("urlctsp") == null) {
                                                                        %>
                                                                        <a href="<%=session.getAttribute("urlcur")%>?removeidsp=<%=item.getMaSP()%>">X</a>
                                                                        <%
                                                                        } else {
                                                                        %>
                                                                        <a href="<%=session.getAttribute("urlcur")%>&removeidsp=<%=item.getMaSP()%>">X</a>
                                                                        <%
                                                                            }
                                                                        %>
                                                                    </center>
                                                                </div>
                                                            </td>
                                                            <td>
                                                                <a href="ChiTietSanPham.jsp?id=<%=pth.getIdproduct()%>" title="Xem chi tiết sản phẩm">
                                                                    <img class="img-responsive" src="uploads/<%=pth.getProductImage()%>" width="100px" height="100px"/> 
                                                                </a>
                                                            </td>
                                                            <td>
                                                                <a href="ChiTietSanPham.jsp?id=<%=pth.getIdproduct()%>" title="Xem chi tiết sản phẩm" style="color: white;">
                                                                    <%=pth.getProductName()%><br/>
                                                                </a>
                                                                <%=soLuong%> x <%=dcf.format(donGia) + " VNĐ"%> 
                                                            </td>
                                                        </tr>
                                                        <%
                                                            }
                                                        %>
                                                        <tr>
                                                            <td></td>
                                                            <td><b>Tổng tiền</b></td>
                                                            <td><b><%=dcf.format(tongTien) + " VNĐ"%></b></td>
                                                        </tr>
                                                    </tbody>
                                                </table>

                                                <center> 
                                                    <a href="checkout.jsp" class="btn btn-info">
                                                        Thanh toán
                                                    </a>
                                                    <a href="viewcart.jsp" class="btn btn-info">
                                                        Xem giỏ hàng
                                                    </a>
                                                </center>
                                                <%
                                                } else {
                                                %>
                                                <center><span style="color:#00ffffff;">Chưa có nào sản phẩm nào trong giỏ.
                                                        <br/>Click vào <a href="Product.jsp">đây</a> để mua hàng</span></center>
                                                        <%
                                                            }
                                                        %>

<<<<<<< HEAD
                                </div>
                            </div>
                        </li>
                        <!--<ul id="login-dp" class="dropdown-menu">-->
                        <%
                        } else {
                        %>
                        <li class="dropdown-submenu menu dropdown">
                            <a href="index.jsp" class="dropdown-toggle menu dropbtn">
                                <i class="glyphicon glyphicon-user"> <strong style="color: white"><%=session.getAttribute("fullname")%> </strong></i>
                            </a>
                            <ul class="dropdown-menu menu dropdown-content">
                                <li><a href="infouser.jsp" class="menu">Điều chỉnh hồ sơ</a></li>
                                    <%
                                        if (session.getAttribute("idroleuser") != null) {
                                            if (session.getAttribute("idroleuser").equals(1) || session.getAttribute("idroleuser").equals(2)) {
                                    %>
                                <li><a href="dashboard.jsp" class="menu">Về trang quản trị</a></li>
                                    <%
                                            }
                                        }
                                    %>
                                <li>
                                    <a href="logout.jsp"><span class="glyphicon glyphicon-log-out"></span>Thoát</a>
=======
                                            </form>
                                        </li>
                                    </ul>
                                    <a href="#" style="outline: none;border: none;background: transparent;" class="dropdown-toggle menu dropbtn" >
                                        <%
                                            ArrayList<GioHang> gioHang = null;
                                        %>
                                        <img src="img/shop-cart-icon.png" alt=""/>
                                        <%
                                            if (session.getAttribute("dshang") != null) {
                                                gioHang = (ArrayList) session.getAttribute("dshang");
                                        %>
                                        <span class="badge" style="background-color: #fff;color:red;"><%=gioHang.size()%></span>
                                        <%
                                        } else {
                                        %>
                                        <span class="badge" style="background-color: #fff;color:red;">0</span>
                                        <%
                                            }
                                        %>
                                    </a>
>>>>>>> origin/master
                                </li>
                                <li><a>TW</a></li>
                                <li><a>G+/</a></li>
                                <li><a>FB/</a></li>
                                <li><a href="contact.jsp">Hỗ trợ |</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="container-fluid bgmenutop " style="
    border-bottom: black solid 3px;
">
                        <div class="container">
                            <div class="navbar-header logophone">
                                <a class="navbar-brand col-md-1" href="index.jsp"><img src="css/images/logo.png"></a>
                                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span> 
                                </button>

                            </div>
                            <div class="collapse navbar-collapse" id="myNavbar">
                                <ul class="nav navbar-nav navbar menubtn">
                                    <li><a href="#">Điện thoại</a></li>
                                    <li><a href="#">Máy tính bảng</a></li>
                                    <li><a href="#">Máy tính</a></li>
                                    <li><a href="#">Phụ kiện</a></li>
                                    <li><a href="#">Sản phẩm khác</a></li>
                                    <li><a href="News.jsp">Tin tức</a></li>
                                </ul>
                                <form class="navbar-form navbar-right otk">
                                    <div class="form-group ">
                                        <input type="text" placeholder="Sản phẩm nào bạn quan tâm?">
                                        <button type="submit"><span class="glyphicon glyphicon-search"></span></button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </nav>

        </div>
    </nav>
    <!--end of header-->

</header>
