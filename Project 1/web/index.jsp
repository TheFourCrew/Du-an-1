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
        <title>JSP Page</title>
        <%@include file="includes/headtag.jsp" %>

    </head>
    <body>
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
                <h3>Sản phẩm mới</h3>
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
        </div>
    </section>

    <%@include file="includes/footer.jsp" %>
</body>
</html>
