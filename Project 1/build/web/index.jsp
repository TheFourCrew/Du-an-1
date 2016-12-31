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
        <title>JSP Page</title>
        <%@include file="includes/headtag.jsp" %>

    </head>
    <body>
<<<<<<< HEAD
        <%
            session.setAttribute("urlcur", request.getServletPath().substring(1));
            session.removeAttribute("urlctsp");
            session.removeAttribute("themgio");
        %>
=======
>>>>>>> origin/master
        <%@include file="includes/header.jsp" %>

        <div class="container slideNews">
            <div class="slide col-md-8 col-sm-12">
                <!-- Start WOWSlider.com BODY section -->
                <div id="wowslider-container1">
                    <div class="ws_images"><ul>
                            <li><img src="data1/images/works_03.jpg" alt="works_03" title="works_03" id="wows1_0"/></li>
                            <li><img src="data1/images/works_04.jpg" alt="works_04" title="works_04" id="wows1_1"/></li>
                            <li><img src="data1/images/works_05.jpg" alt="works_05" title="works_05" id="wows1_2"/></li>
                            <li><img src="data1/images/works_07.jpg" alt="works_07" title="works_07" id="wows1_3"/></li>
                            <li><img src="data1/images/works_10.jpg" alt="works_10" title="works_10" id="wows1_4"/></li>
                            <li><a href="http://wowslider.com"><img src="data1/images/works_11.jpg" alt="wowslideshow" title="works_11" id="wows1_5"/></a></li>
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
                        </div></div><div class="ws_script" style="position:absolute;left:-99%"><a href="http://wowslider.com">bootstrap slider</a> by WOWSlider.com v8.7</div>
                    <div class="ws_shadow"></div>
                </div>	
                <script type="text/javascript" src="engine1/wowslider.js"></script>
                <script type="text/javascript" src="engine1/script.js"></script>
                <!-- End WOWSlider.com BODY section -->
            </div>
            <div class= "news col-md-4 col-sm-12">
                <h3><a href="#">Tin công nghệ <span>Xem thêm</span></a></h3>
                <ul class="newsbox">
                    <li>
                        <a href="">
                            <figure>
                                <img src="images/works_03.jpg">
                            </figure>
                            <h4>Tin mới nhất về</h4><br>
                            <p>Tổng hợp tin về biển</p>
                        </a>

                    </li>
                </ul>
                <ul class="newsbox">
                    <li>
                        <a href="">
                            <figure>
                                <img src="images/works_03.jpg">
                            </figure>
                            <h4>Tin mới nhất về</h4><br>
                            <p>Tổng hợp tin về biển</p>
                        </a>

                    </li>
                </ul>
                <ul class="newsbox">
                    <li>
                        <a href="">
                            <figure>
                                <img src="images/works_03.jpg">
                            </figure>
                            <h4>Tin mới nhất về</h4><br>
                            <p>Tổng hợp tin về biển</p>
                        </a>

                    </li>
                </ul>

            </div>
        </div>

        <!--end of body sp-->
        <div class="container banner">
            <img class="col-md-6 col-xs-12 lbanner" src="images/baner.jpg">
            <img class="col-md-6 col-xs-12 rbanner" src="images/baner.jpg">
        </div>

        <section class="container">
            <div class="container-fluid sanpham">
                <h3>Sản phẩm nồi bật</h3>
                <div class="row">
                    <div class="col-md-3 dmsp text-center">
                        <div class="in">
                            <a href="#">
                                <img src="images/works_10.jpg" /><br>
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
                                <img src="images/works_10.jpg" /><br>
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
                                <img src="images/works_10.jpg" /><br>
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
                                <img src="images/works_10.jpg" /><br>
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
                <h3>Sản phẩm mới</h3>
                <div class="row">
<<<<<<< HEAD
                    <%
                    ProductServices ps = new ProductServices();
                    ArrayList<Product> aPT = null;
                    aPT = ps.getAll();
                    for(int i=0; i < 4;i++){
                        Product pt = aPT.get(i);
                    %>
                    <div class="col-md-3 dmsp text-center">
                        <div class="in">
                            <a href="ChiTietSanPham.jsp?id=<%=pt.getIdproduct() %>">
                                <img src="uploads/<%=pt.getProductImage()%>" />
                                <p><%=pt.getProductName() %></p><br>
                                <div class="txtdes">
                                    <p>Thông số:</p>
                                    <br>
                                    User Interface Design
=======
                    <div class="col-md-3 dmsp text-center">
                        <div class="in">
                            <a href="#">
                                <img src="images/works_10.jpg" /><br>
                                <p>Điện thoại</p><br>
                                <div class="txtdes"><p>Thông số:</p>
                                    <br>
                                    <a>User Interface Design</a>
>>>>>>> origin/master
                                    <button href="#" type="button" class="button"><span>Đặt hàng</span></button>
                                </div>
                            </a>
                        </div>
                    </div>
<<<<<<< HEAD
                    <%
                    }
                    %>
<!--                    <div class="col-md-3 dmsp text-center">
=======
                    <div class="col-md-3 dmsp text-center">
>>>>>>> origin/master
                        <div class="in">
                            <a href="#">
                                <img src="images/works_10.jpg" /><br>
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
                                <img src="images/works_10.jpg" /><br>
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
                                <img src="images/works_10.jpg" /><br>
                                <p>Điện thoại</p><br>
                                <div class="txtdes"><p>Thông số:</p>
                                    <br>
                                    <a>User Interface Design</a>
                                    <button href="#" type="button" class="button"><span>Đặt hàng</span></button>
                                </div>
                            </a>
                        </div>
<<<<<<< HEAD
                    </div>-->
=======
                    </div>
>>>>>>> origin/master
                </div>
            </div>
            <div class="container-fluid sanpham">
                <h3>Điện thoại hạ giá</h3>
                <div class="row">
                    <div class="col-md-3 dmsp text-center">
                        <div class="in">
                            <a href="#">
                                <img src="images/works_10.jpg" /><br>
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
                                <img src="images/works_10.jpg" /><br>
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
                                <img src="images/works_10.jpg" /><br>
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
                                <img src="images/works_10.jpg" /><br>
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
        </div>
    </section>
        <%@include file="includes/floatbox.jsp" %>
    <%@include file="includes/footer.jsp" %>
</body>
</html>
