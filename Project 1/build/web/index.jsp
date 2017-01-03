<%-- 
    Document   : index
    Created on : Nov 28, 2016, 3:45:16 PM
    Author     : tn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang chủ</title>
        <%@include file="includes/headtag.jsp" %>

    </head>
    <body>
        <%
            session.setAttribute("urlcur", request.getServletPath().substring(1));
            session.removeAttribute("urlctsp");
        %>
        <%@include file="includes/header.jsp" %>
        <!--///////////////////HomePage///////////////////////-->
        <!--//////////////////////////////////////////////////-->
        <div id="page-content" class="home-page">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <!-- Carousel -->
                        <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                            <!-- Indicators -->
                            <ol class="carousel-indicators hidden-xs">
                                <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                                <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                                <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                            </ol>
                            <!-- Wrapper for slides -->
                            <div class="carousel-inner">
                                <div class="item active">
                                    <img src="images/main-banner1-1903x600.jpg" alt="First slide">
                                    <!-- Static Header -->
                                    <div class="header-text hidden-xs">
                                        <div class="col-md-12 text-center">
                                        </div>
                                    </div><!-- /header-text -->
                                </div>
                                <div class="item">
                                    <img src="images/main-banner2-1903x600.jpg" alt="Second slide">
                                    <!-- Static Header -->
                                    <div class="header-text hidden-xs">
                                        <div class="col-md-12 text-center">
                                        </div>
                                    </div><!-- /header-text -->
                                </div>
                                <div class="item">
                                    <img src="images/main-banner3-1903x600.jpg" alt="Third slide">
                                    <!-- Static Header -->
                                    <div class="header-text hidden-xs">
                                        <div class="col-md-12 text-center">
                                        </div>
                                    </div><!-- /header-text -->
                                </div>
                            </div>
                            <!-- Controls -->
                            <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
                                <span class="glyphicon glyphicon-chevron-left"></span>
                            </a>
                            <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
                                <span class="glyphicon glyphicon-chevron-right"></span>
                            </a>
                        </div><!-- /carousel -->
                    </div>
                </div>
                <div class="row">
                    <div class="banner">
                        <div class="col-sm-4">
                            <img src="images/sub-banner1.png" />
                        </div>
                        <div class="col-sm-4">
                            <img src="images/sub-banner2.png" />
                        </div>
                        <div class="col-sm-4">
                            <img src="images/sub-banner3.png" />
                        </div>
                    </div>
                </div>
                <div class="row">
                    <%                        if (session.getAttribute("themgio") != null) {
                            if (session.getAttribute("themgio").equals("done")) {
                    %>
                    <div class="alert alert-info alert-dismissible">
                        <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                        <strong>Thành công!</strong> Bạn đã thêm 1 sản phẩm <%=session.getAttribute("tenSP")%>.
                    </div>
                    <%
                    } else {
                    %>
                    <div class="alert alert-danger alert-dismissible">
                        <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                        <strong>Thất bại!</strong> <%=session.getAttribute("tenSP")%> chỉ còn <strong>${kho}</strong> sản phẩm trong kho.
                    </div>
                    <%
                            }
                        }
                        session.removeAttribute("themgio");
                    %>
                    <div class="col-lg-12">
                        <div class="heading-row"><h3>Sản phẩm mới</h3></div>
                        <div class="products">
                            <%                                ProductServices ps = new ProductServices();
                                DecimalFormat formatter = new DecimalFormat("###,###,###");
                                ArrayList<Product> aPT = null;
                                aPT = ps.getAll();
                                for (int i = 0; i < 4; i++) {
                                    Product pt = aPT.get(i);
                                    double giaBan = pt.getPricePerUnit();
                                    double giaGiam = pt.getDiscountPrice();
                                    String strPoint = pt.getNote();
                                    double point = 0;
                                    if (!strPoint.equals("")) {
                                        point = Double.parseDouble(pt.getNote());
                                    }
                            %>
                            <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                                <div class="product">
                                    <div class="image"><a href="ChiTietSanPham.jsp?id=<%=pt.getIdproduct()%>"><img src="uploads/<%=pt.getProductImage()%>" /></a></div>
                                    <div class="buttons">
                                        <a class="btn cart" href="addtocart.jsp?idsanpham=<%=pt.getIdproduct()%>&tenSP=<%=pt.getProductName()%>&kho=<%=pt.getProductQuantity()%>">
                                            <span class="glyphicon glyphicon-shopping-cart"></span>
                                        </a>
                                        <a class="btn wishlist" href="#"><span class="glyphicon glyphicon-heart"></span></a>
                                        <a class="btn compare" href="#"><span class="glyphicon glyphicon-transfer"></span></a>
                                    </div>
                                    <div class="caption">
                                        <div class="name"><h3><a href="ChiTietSanPham.jsp?id=<%=pt.getIdproduct()%>"><%=pt.getProductName()%></a></h3></div>
                                        <fieldset class="rating-result">
                                            <label title="<%=point%>/5 điểm">
                                                <%
                                                    if (point == 5) {
                                                %>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <%
                                                } else if (point > 4 && point <= 4.9) {
                                                %>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-half"></label>
                                                <%
                                                } else if (point == 4) {
                                                %>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon"></label>
                                                <%
                                                } else if (point > 3 && point <= 3.9) {
                                                %>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-half"></label>
                                                <label class = "icon"></label>
                                                <%
                                                } else if (point == 3) {
                                                %>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <%
                                                } else if (point > 2 && point <= 2.9) {
                                                %>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-half"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <%
                                                } else if (point == 2) {
                                                %>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <%
                                                } else if (point > 1 && point <= 1.9) {
                                                %>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-half"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <%
                                                } else if (point == 1) {
                                                %>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <%
                                                } else if (point > 0 && point <= 0.9) {
                                                %>
                                                <label class = "icon star-half"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <%
                                                } else {
                                                %>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <%
                                                    }
                                                %>
                                            </label>
                                        </fieldset>
                                        <div class="price">
                                            <%
                                                if (giaGiam > 0) {
                                            %>
                                            <p>
                                                <span style="text-decoration: line-through; color: grey; font-size: 16px;"><%=formatter.format(giaBan) + " VNĐ"%></span> <i class="glyphicon glyphicon-arrow-right"></i>
                                                <span><%=formatter.format(giaGiam) + " VNĐ"%></span>
                                            </p>
                                            <%
                                            } else {
                                            %>
                                            <p><%=formatter.format(giaBan) + " VNĐ"%></p>
                                            <%
                                                }
                                            %>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <%
                                }
                            %>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="banner">
                        <div class="col-sm-6">
                            <img src="images/sub-banner4.jpg" />
                        </div>
                        <div class="col-sm-6">
                            <img src="images/sub-banner5.png" />
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="heading-row"><h3>Đánh giá cao</h3></div>
                        <div class="products">
                            <%
                                aPT = ps.getTopRatingProducts();
                                for (int i = 0; i < aPT.size(); i++) {
                                    Product pt = aPT.get(i);
                                    String strPoint = pt.getNote();
                                    double point = 0;
                                    if (!strPoint.equals("")) {
                                        point = Double.parseDouble(pt.getNote());
                                    }
                                    double giaGiam = pt.getDiscountPrice();
                                    double giaBan = pt.getPricePerUnit();
                            %>
                            <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                                <div class="product">
                                    <div class="image"><a href="ChiTietSanPham.jsp?id=<%=pt.getIdproduct()%>"><img src="uploads/<%=pt.getProductImage()%>"  /></a></div>
                                    <div class="buttons">
                                        <a class="btn cart" href="addtocart.jsp?idsanpham=<%=pt.getIdproduct()%>&tenSP=<%=pt.getProductName()%>&kho=<%=pt.getProductQuantity()%>">
                                            <span class="glyphicon glyphicon-shopping-cart"></span>
                                        </a>
                                        <a class="btn wishlist" href="#"><span class="glyphicon glyphicon-heart"></span></a>
                                        <a class="btn compare" href="#"><span class="glyphicon glyphicon-transfer"></span></a>
                                    </div>
                                    <div class="caption">
                                        <div class="name"><h3><a href="ChiTietSanPham.jsp?id=<%=pt.getIdproduct()%>"><%=pt.getProductName()%></a></h3></div>
                                        <fieldset class="rating-result">
                                            <label title="<%=point%>/5 điểm">
                                                <%
                                                    if (point == 5) {
                                                %>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <%
                                                } else if (point > 4 && point <= 4.9) {
                                                %>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-half"></label>
                                                <%
                                                } else if (point == 4) {
                                                %>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon"></label>
                                                <%
                                                } else if (point > 3 && point <= 3.9) {
                                                %>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-half"></label>
                                                <label class = "icon"></label>
                                                <%
                                                } else if (point == 3) {
                                                %>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <%
                                                } else if (point > 2 && point <= 2.9) {
                                                %>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-half"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <%
                                                } else if (point == 2) {
                                                %>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <%
                                                } else if (point > 1 && point <= 1.9) {
                                                %>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon star-half"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <%
                                                } else if (point == 1) {
                                                %>
                                                <label class = "icon star-full"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <%
                                                } else if (point > 0 && point <= 0.9) {
                                                %>
                                                <label class = "icon star-half"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <%
                                                } else {
                                                %>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <label class = "icon"></label>
                                                <%
                                                    }
                                                %>
                                            </label>
                                        </fieldset>
                                        <div class="price">
                                            <%
                                                if (giaGiam > 0) {
                                            %>
                                            <p>
                                                <span style="text-decoration: line-through; color: grey; font-size: 16px;"><%=formatter.format(giaBan) + " VNĐ"%></span> <i class="glyphicon glyphicon-arrow-right"></i>
                                            <p><%=formatter.format(giaGiam) + " VNĐ"%></p>
                                            </p>
                                            <%
                                            } else {
                                            %>
                                            <p><%=formatter.format(giaBan) + " VNĐ"%></p>
                                            <%
                                                }
                                            %>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <%
                                }
                            %>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="includes/footer.jsp" %>
    </body>
</html>
