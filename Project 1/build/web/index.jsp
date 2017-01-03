<%-- 
    Document   : index
    Created on : Nov 28, 2016, 3:45:16 PM
    Author     : tn
--%>

<%@page import="com.javaweb.model.Article"%>
<%@page import="com.javaweb.service.ArticleServices"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang chủ</title>
        <%@include file="includes/headtag.jsp" %>

    </head>
    <body>
<<<<<<< HEAD
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
=======
        <%@include file="includes/header.jsp" %>

        <div class="container slideNews">
            <div class="slide col-md-8 col-sm-12">
                <!-- Start WOWSlider.com BODY section -->
                <div id="wowslider-container1" style="height: 670px;padding-top: 20px;font-size: 10px;">
                    <div class="ws_images"><ul>
                            <li><img src="data1/images/works_03.jpg" alt="works_03" title="works_03" id="wows1_0"/></li>
                            <li><img src="data1/images/works_04.jpg" alt="works_04" title="works_04" id="wows1_1"/></li>
                            <li><img src="data1/images/works_05.jpg" alt="works_05" title="works_05" id="wows1_2"/></li>
                            <li><img src="data1/images/works_07.jpg" alt="works_07" title="works_07" id="wows1_3"/></li>
                            <li><img src="data1/img/works_03.jpg" alt="works_10" title="works_10" id="wows1_4"/></li>
                            <li><a href="http://wowslider.com"><img src="data1/images/works_11.jpg" alt="bootstrap slider" title="works_11" id="wows1_5"/></a></li>
                            <li><img src="data1/images/works_12.jpg" alt="works_12" title="works_12" id="wows1_6"/></li>
                        </ul></div>
                    <div class="ws_bullets"><div>
                            <a href="#" title="works_03"><span><img src="data1/tooltips/works_03.jpg" alt="works_03"/>1</span></a>
                            <a href="#" title="works_04"><span><img src="data1/tooltips/works_04.jpg" alt="works_04"/>2</span></a>
                            <a href="#" title="works_05"><span><img src="data1/tooltips/works_05.jpg" alt="works_05"/>3</span></a>
                            <a href="#" title="works_07"><span><img src="data1/tooltips/works_07.jpg" alt="works_07"/>4</span></a>
                            <a href="#" title="works_10"><span><img src="data1/tooltips/works_10.jpg" alt="works_10"/>5</span></a>
                            <a href="#" title="works_11"><span><img src="data1/tooltips/works_11.jpg" alt="works_11"/>6</span></a>
                            <a href="#" title="works_12"><span><img src="data1/tooltips/works_12.jpg" alt="works_12"/>7</span></a>
                        </div></div><div class="ws_script" style="position:absolute;left:-99%"><a href="http://wowslider.com/vi">bootstrap carousel</a> by WOWSlider.com v8.7</div>
                    <div class="ws_shadow"></div>
                </div>	
                <script type="text/javascript" src="engine1/wowslider.js"></script>
                <script type="text/javascript" src="engine1/script.js"></script>
                <!-- End WOWSlider.com BODY section -->
            </div>
            <div class= "news col-md-4 col-sm-12">
                <%  int pageSize = 8;
                    int pageNumber = 1;
                    String url = "News.jsp";
                    ArticleServices as = new ArticleServices();
                    ArrayList<Article> listArticle = null;

                    if (request.getParameter("pagenumber") != null) {
                        session.setAttribute("pagenumber", request.getParameter("pagenumber"));
                        pageNumber = Integer.parseInt(request.getParameter("pagenumber"));
                    } else {
                        session.setAttribute("pagenumber", "1");
                    }

                    listArticle = as.getAllNews(pageSize, pageNumber);

                    int pageCount = (as.newscount) / pageSize + (as.newscount % pageSize > 0 ? 1 : 0);

                    String nextPage = (pageCount > pageNumber ? (pageNumber + 1) : pageNumber) + "";
                    String prevPage = (pageNumber <= 1 ? 1 : pageNumber - 1) + "";


                %>
                <h3><a href="News.jsp">Tin công nghệ <span>Xem thêm</span></a></h3>
                <div class="tab-content">
                    <div class="tab-pane active" style="overflow-y: auto;
                         height: 350px;
                         ">
                        <%                        for (int i = 0; i < listArticle.size(); i++) {
                                Article art = listArticle.get(i);
                                int dem = i + 1;
                                if (pageNumber > 1) {
                                    dem = i + pageSize * (pageNumber - 1) + 1;
                                }
                        %>
                        <ul class="newsbox">
                            <li>
                                <a href="baiviet.jsp?idbv=<%=art.getIdarticle()%>">
                                    <figure>
                                        <img src="uploads/<%=art.getThumbnail()%>">
                                    </figure>
                                    <h4><%=art.getTitleArticle()%></h4><br>
                                    <p><%=art.getHeadline()%></p>
                                </a>

                            </li>
                        </ul>
                        <%

                            }
                        %>
                    </div>
                </div>



            </div>
        </div>

        <!--end of body sp-->
        <div class="container banner">
            <img class="col-md-6 col-xs-12 lbanner" src="img/baner.jpg">
            <img class="col-md-6 col-xs-12 rbanner" src="img/baner.jpg">
        </div>

        <section class="container">
            <div class="container-fluid sanpham">
                <h3>Sản phẩm nổi bật</h3>
                <div class="row">
                    <div class="col-md-3 dmsp text-center">
                        <div class="in">
                            <a href="#">
                                <img src="img/works_03.jpg" /><br>
                                <p>Điện thoại</p><br>
                                <div class="txtdes"><p>Thông số:</p>
                                    <br>
                                    <a>User Interface Design</a>
                                    <button href="#" type="button" class="button"><span>Đặt hàng</span></button>
                                </div>
                            </a>
                        </div>
                    </div>
                    <div class="col-md-3 dmsp text-center">
                        <div class="in">
                            <a href="#">
                                <img src="img/works_03.jpg" /><br>
                                <p>Điện thoại</p><br>
                                <div class="txtdes"><p>Thông số:</p>
                                    <br>
                                    <a>User Interface Design</a>
                                    <button href="#" type="button" class="button"><span>Đặt hàng</span></button>
                                </div>
                            </a>
                        </div>
                    </div>
                    <div class="col-md-3 dmsp text-center">
                        <div class="in">
                            <a href="#">
                                <img src="img/works_03.jpg" /><br>
                                <p>Điện thoại</p><br>
                                <div class="txtdes"><p>Thông số:</p>
                                    <br>
                                    <a>User Interface Design</a>
                                    <button href="#" type="button" class="button"><span>Đặt hàng</span></button>
>>>>>>> origin/master
                                </div>
                            </div>
                            <!-- Controls -->
                            <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
                                <span class="glyphicon glyphicon-chevron-left"></span>
                            </a>
<<<<<<< HEAD
                            <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
                                <span class="glyphicon glyphicon-chevron-right"></span>
=======
                        </div>
                    </div>
                    <div class="col-md-3 dmsp text-center">
                        <div class="in">
                            <a href="#">
                                <img src="img/works_03.jpg" /><br>
                                <p>Điện thoại</p><br>
                                <div class="txtdes"><p>Thông số:</p>
                                    <br>
                                    <a>User Interface Design</a>
                                    <button href="#" type="button" class="button"><span>Đặt hàng</span></button>
                                </div>
>>>>>>> origin/master
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
<<<<<<< HEAD
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
=======
                    <div class="col-md-3 dmsp text-center">
                        <div class="in">
                            <a href="#">
                                <img src="img/works_03.jpg" /><br>
                                <p>Điện thoại</p><br>
                                <div class="txtdes"><p>Thông số:</p>
                                    <br>
                                    <a>User Interface Design</a>
                                    <button href="#" type="button" class="button"><span>Đặt hàng</span></button>
                                </div>
                            </a>
                        </div>
                    </div>
                    <div class="col-md-3 dmsp text-center">
                        <div class="in">
                            <a href="#">
                                <img src="img/works_03.jpg" /><br>
                                <p>Điện thoại</p><br>
                                <div class="txtdes"><p>Thông số:</p>
                                    <br>
                                    <a>User Interface Design</a>
                                    <button href="#" type="button" class="button"><span>Đặt hàng</span></button>
                                </div>
                            </a>
                        </div>
                    </div>
                    <div class="col-md-3 dmsp text-center">
                        <div class="in">
                            <a href="#">
                                <img src="img/works_03.jpg" /><br>
                                <p>Điện thoại</p><br>
                                <div class="txtdes"><p>Thông số:</p>
                                    <br>
                                    <a>User Interface Design</a>
                                    <button href="#" type="button" class="button"><span>Đặt hàng</span></button>
                                </div>
                            </a>
                        </div>
                    </div>
                    <div class="col-md-3 dmsp text-center">
                        <div class="in">
                            <a href="#">
                                <img src="img/works_03.jpg" /><br>
                                <p>Điện thoại</p><br>
                                <div class="txtdes"><p>Thông số:</p>
                                    <br>
                                    <a>User Interface Design</a>
                                    <button href="#" type="button" class="button"><span>Đặt hàng</span></button>
                                </div>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container-fluid sanpham">
                <h3>Điện thoại hạ giá</h3>
                <div class="row">
                    <div class="col-md-3 dmsp text-center">
                        <div class="in">
                            <a href="#">
                                <img src="img/works_03.jpg" /><br>
                                <p>Điện thoại</p><br>
                                <div class="txtdes"><p>Thông số:</p>
                                    <br>
                                    <a>User Interface Design</a>
                                    <button href="#" type="button" class="button"><span>Đặt hàng</span></button>
>>>>>>> origin/master
                                </div>
                            </div>
                            <%
                                }
                            %>
                        </div>
                    </div>
<<<<<<< HEAD
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
=======
                    <div class="col-md-3 dmsp text-center">
                        <div class="in">
                            <a href="#">
                                <img src="img/works_03.jpg" /><br>
                                <p>Điện thoại</p><br>
                                <div class="txtdes"><p>Thông số:</p>
                                    <br>
                                    <a>User Interface Design</a>
                                    <button href="#" type="button" class="button"><span>Đặt hàng</span></button>
                                </div>
                            </a>
                        </div>
                    </div>
                    <div class="col-md-3 dmsp text-center">
                        <div class="in">
                            <a href="#">
                                <img src="img/works_03.jpg" /><br>
                                <p>Điện thoại</p><br>
                                <div class="txtdes"><p>Thông số:</p>
                                    <br>
                                    <a>User Interface Design</a>
                                    <button href="#" type="button" class="button"><span>Đặt hàng</span></button>
                                </div>
                            </a>
                        </div>
                    </div>
                    <div class="col-md-3 dmsp text-center">
                        <div class="in">
                            <a href="#">
                                <img src="img/works_03.jpg" /><br>
                                <p>Điện thoại</p><br>
                                <div class="txtdes"><p>Thông số:</p>
                                    <br>
                                    <a>User Interface Design</a>
                                    <button href="#" type="button" class="button"><span>Đặt hàng</span></button>
>>>>>>> origin/master
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
<<<<<<< HEAD
        <%@include file="includes/footer.jsp" %>
    </body>
=======
    </section>

    <%@include file="includes/footer.jsp" %>
</body>
>>>>>>> origin/master
</html>
