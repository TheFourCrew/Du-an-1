<%-- 
    Document   : ChiTietSanPham
    Created on : Nov 15, 2016, 8:35:40 AM
    Author     : Computer
--%>

<%@page import="com.javaweb.model.Rating"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.javaweb.service.CommentServices"%>
<%@page import="com.javaweb.model.Comment"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.javaweb.model.Product"%>
<%@page import="com.javaweb.service.ProductServices"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chi Tiet San Pham</title>
        <%@include file="includes/headtag.jsp" %>

        <style>
            .mySlides {display:none}
            .demo {cursor:pointer}
        </style>
    </head>
    <body>
        <%@include file="includes/header.jsp" %>
        <section class="container">
            <%                String id = request.getParameter("id");
                ProductServices ps = new ProductServices();
                Product pt = null;
                pt = ps.GetById(id);
                DecimalFormat formatter = new DecimalFormat("###,###,###");
                double giaBan = pt.getPricePerUnit();
                double giaGiam = pt.getDiscountPrice();
                ArrayList<Rating> ratings = null;
                Rating rg = null;
            %>
            <div class="row hinhvathongso" style="margin:auto 0px;">
                <div class="col-md-12 col-sm-6 ctsp">
                    <div class="col-md-6 col-sm-6 hinhctsp text-center">
                        <div class="w3-content">
                            <!-- Start WOWSlider.com BODY section -->
                            <div id="wowslider-container1">
                                <div class="ws_images">
                                    <ul>
                                        <li><img src="uploads/<%=pt.getProductImage()%>" alt="<%=pt.getProductImage()%>" title="<%=pt.getProductImage()%>" id="wows1_0"/></li>
                                            <%
                                                String chuoi = pt.getDetailImages();
                                                String[] word = chuoi.split("<\\s", 0);
                                                for (int h = 0; h < word.length; h++) {
                                            %>
                                        <li><img src="uploads/<%=word[h]%>" alt="<%=word[h]%>" title="<%=word[h]%>" id="wows1_<%=h + 1%>" /></li>
                                            <%
                                                }
                                            %>
                                    </ul>
                                </div>
                                <div class="ws_thumbs">
                                    <div>
                                        <a href="#wows1_0" title="<%=pt.getProductImage()%>"><img src="uploads/<%=pt.getProductImage()%>" alt="<%=pt.getProductImage()%>" /></a>
                                            <%
                                                for (int h = 0; h < word.length; h++) {

                                            %>
                                        <a href="#wows1_<%=h + 1%>" title="<%=word[h]%>"><img src="uploads/<%=word[h]%>" alt="<%=word[h]%>" /></a>
                                            <%
                                                }
                                            %>
                                    </div>
                                </div>
                                <!--                                <div class="ws_script" style="position:absolute;left:-99%"><a href="http://wowslider.net">jquery carousel</a> by WOWSlider.com v8.7</div>
                                                                <div class="ws_shadow"></div>-->
                            </div>	
                            <script src="engine1/wowslider.js" type="text/javascript"></script>
                            <script src="engine1/script.js" type="text/javascript"></script>
                        </div>
                    </div>
                    <div class="col-md-6 col-sm-6 thongsoctsp">
                        <h4 style="color:black;font-size: 25px;font-weight: normal"><%=pt.getProductName()%></h4>
                        <%
                            DecimalFormat formatPoint = new DecimalFormat("#.#");
                            ratings = ps.GetDataByIdSP(id);
                            double point = 0;
                            double sumPoint = 0;
                            for (int i = 0; i < ratings.size(); i++) {
                                rg = ratings.get(i);
                                sumPoint += rg.getRatingPoint();
                            }
                            point = Double.parseDouble(formatPoint.format(sumPoint/ratings.size()));
                        %>
                        <fieldset class="rating-result">
                            <label title="<%=point %>/5 điểm">
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
                                <label class="sum-rater">(<%=ratings.size()%> người đánh giá)</label>
                            </label>
                        </fieldset>
                        <p><span style="font-size: 15px; word-wrap: break-word;">MÁY TÍNH XÁCH TAY LENO <span>(<%=ratings.size()%>)</span>VO IDEAPAD 310-14ISK,I3-6100U(2.3GHZ/3MB),4GB DDR4,1TB HDD,14" FHD,2CELL,FREE-DOS,SILVER (BẠC),1YWTY_80SL0069VNasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa</span></p>

                        <p >
                            <%
                                if (giaGiam > 0) {
                            %>
                            <b><span style="color:grey; text-decoration: line-through;">Giá bán: <%=formatter.format(giaBan) + " VNĐ"%></span></b>
                            <br/><b><span style="color:red;">Giá giảm: <%=formatter.format(giaGiam) + " VNĐ"%>
                                    (Đã bao gồm thuế VAT)</span></b>
                                    <%
                                    } else {
                                    %>
                            <b><span style="color:red;">Giá bán: <%=formatter.format(giaBan) + " VNĐ"%>
                                    (Đã bao gồm thuế VAT)</b>
                                    <%
                                        }
                                    %>
                        </p>

                        <div class="thongsokythuat">
                            <div class="thongsokythuattrai">
                                <p>MoDel: <span>Dell core i5</span></p>
                                <p style="padding-top: 15px">CPU: <span>Intel Core i3 SkyLake</span></p>
                                <p style="padding-top: 15px">Ram: <span>4G</span></p>
                                <p style="padding-top: 15px">Resolution: <span>1366x768</span></p>
                            </div>
                            <div class="thongsokythuatphai">

                                <p>Size: <span>40x40</span></p>
                                <p style="padding-top: 15px">Weight: <span>1kg</span></p>
                                <p style="padding-top: 15px">System: <span>Windows 10</span></p>
                            </div>
                        </div>
                        <button style="margin-top: 20px;margin-bottom: 10px;" type="button" class="btn btn-success active center-block">Thêm Vào Giỏ</button>
                    </div>
                </div>
            </div>
            <div class="row" style="background-color: #fff; margin: 10px 0px; border: 1px solid  #e7e7e7;">
                <div class="col-md-6">
                    <ul class="nav nav-tabs">
                        <%
                            CommentServices cms = new CommentServices();
                            long countCmt = 0;
                            countCmt = cms.getCountComment(id);

//                            ratings = ps.GetDataByIdSP(id);

                        %>
                        <li class="active"><a data-toggle="tab" href="#description">Mô Tả</a></li>
                        <li><a data-toggle="tab" href="#cmment">Bình Luận <span class="badge"><%=countCmt%></span></a></li>
                        <li><a data-toggle="tab" href="#rating">Đánh giá <span class="badge"><%=ratings.size()%></span></a></li>

                    </ul>

                    <div class="tab-content">
                        <div id="description" class="tab-pane fade in active">
                            <h3>Mô Tả</h3>
                            <!--                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>-->
                            <%=pt.getDescription()%>
                        </div>
                        <div id="cmment" class="tab-pane fade">

                            <h3>Bình Luận</h3>
                            <div class="row">
                                <form action="CommentServlet" method="post">
                                    <input type="hidden" name="spID" value="<%=id%>" />
                                    <%
                                        if (session.getAttribute("cmtname") == null) {

                                    %>
                                    <div class="form-group">
                                        <div class="col-sm-3 col-md-7">
                                            <label class="control-label" for="c-Name">Họ tên<em>*</em>:</label>
                                            <input type="text" name="cName" placeholder="Nhập tên người gửi" class="form-control" id="c-Name">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-sm-3 col-md-7">
                                            <label class="control-label" for="c-Email">Email<em>*</em>:</label>
                                            <input type="email" name="cEmail" placeholder="Nhập thư điện tử" class="form-control" id="c-Email">
                                        </div>
                                    </div>

                                    <%                } else {
                                    %>
                                    <div class="form-group">
                                        <div class="col-sm-3 col-md-7">
                                            <label class="control-label" for="c-Name">Họ tên<em>*</em>: <%= session.getAttribute("cmtname")%> </label>
                                            <a href="logout.jsp"> Logout </a>
                                            <input type="hidden" name="cName" value="${cmtname}" class="form-control" id="c-Name">
                                        </div>
                                    </div>
                                    <%
                                        }
                                    %>

                                    <div class="form-group ">
                                        <div class="col-sm-3 col-md-12 dia-chi">
                                            <label class="control-label" for="c-Message">Nội dung<em>*</em>:</label>
                                            <textarea rows="4" id="c-Message" cols="20" class="form-control" placeholder="Nhập nội dung" name="cMessage"></textarea>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-sm-3 col-md-7" style="margin-top: 10px;">
                                            <button  type="submit" class="btn btn-info">Bình luận</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <hr>
                            <div class="row">
                                <%
                                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:s");
                                    String gioCMT = "";
                                    ArrayList<Comment> cmt = null;
                                    cmt = cms.getAll(id);
                                    for (int i = 0; i < cmt.size(); i++) {
                                        Comment cmtc = cmt.get(i);
                                        gioCMT = sdf.format(cmtc.getDateComment());
                                %>
                                <div class="col-md-12" style="word-break: break-word;">
                                    <div class="media">
                                        <a href="#collapse<%=cmtc.getIdcomment()%>" data-toggle="collapse">Reply <%=cmtc.getIdcomment()%></a>
                                        <div class="media-left">
                                            <img class="media-object" src="uploads/Photo-Unavailable.jpg" style="width:80px" />
                                        </div>
                                        <div class="media-body">
                                            <h4 class="media-heading"><%=cmtc.getNameUser()%> <small><i> <%=gioCMT%></i></small></h4>
                                            <p><%=cmtc.getContent()%></p>

                                            <%
                                                ArrayList<Comment> cmtRep = null;
                                                cmtRep = cms.getByIdspAndReply(String.valueOf(cmtc.getIdcomment()), id);
                                                Comment cmtReps = null;
                                                for (int j = 0; j < cmtRep.size(); j++) {
                                                    cmtReps = cmtRep.get(j);
                                                    gioCMT = sdf.format(cmtReps.getDateComment());
                                            %>
                                            <div class="media">
                                                <!--<a href="#collapse1" data-toggle="collapse">Reply <%=cmtc.getIdcomment()%></a>-->
                                                <div class="media-left">
                                                    <img class="media-object" src="uploads/Photo-Unavailable.jpg" style="width:80px" />
                                                </div>
                                                <div class="media-body">
                                                    <h4 class="media-heading"><%=cmtReps.getNameUser()%> <small><i> <%=gioCMT%></i></small></h4>
                                                    <p><%=cmtReps.getContent()%></p>
                                                </div>
                                            </div>
                                            <%
                                                }
                                            %>


                                            <form action="CommentServlet" method="post">
                                                <input type="hidden" name="idCMT" value="<%=cmtc.getIdcomment()%>" />
                                                <input type="hidden" name="spID" value="<%=id%>" />
                                                <div id="collapse<%=cmtc.getIdcomment()%>" class="panel-collapse collapse">
                                                    <%
                                                        if (session.getAttribute("cmtname") == null) {

                                                    %>
                                                    <div class="form-group">
                                                        <div class="col-sm-3 col-md-7">
                                                            <label class="control-label" for="c-Name">Họ tên<em>*</em>:</label>
                                                            <input type="text" name="cName" placeholder="Nhập tên người gửi" class="form-control" id="c-Name">
                                                        </div>
                                                    </div>

                                                    <div class="form-group">
                                                        <div class="col-sm-3 col-md-7">
                                                            <label class="control-label" for="c-Email">Email<em>*</em>:</label>
                                                            <input type="email" name="cEmail" placeholder="Nhập thư điện tử" class="form-control" id="c-Email">
                                                        </div>
                                                    </div>

                                                    <%                } else {
                                                    %>
                                                    <div class="form-group">
                                                        <div class="col-sm-3 col-md-7">
                                                            <label class="control-label" for="c-Name">Họ tên<em>*</em>: <%= session.getAttribute("cmtname")%> </label>
                                                            <a href="logout.jsp"> Logout </a>
                                                            <input type="hidden" name="cName" value="${cmtname}" class="form-control" id="c-Name">
                                                        </div>
                                                    </div>
                                                    <%
                                                        }
                                                    %>

                                                    <div class="form-group ">
                                                        <div class="col-sm-3 col-md-12 dia-chi">
                                                            <label class="control-label" for="c-Message">Nội dung<em>*</em>:</label>
                                                            <textarea rows="4" id="c-Message" cols="20" class="form-control" placeholder="Nhập nội dung" name="cMessage"></textarea>
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <div class="col-sm-3 col-md-7" style="margin-top: 10px;">
                                                            <button  type="submit" class="btn btn-info">Bình luận</button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                    <hr>
                                </div>

                                <%
                                    }
                                %>
                            </div>
                        </div>

                        <div id="rating" class="tab-pane fade">
                            <h3>Đánh giá<span class="badge"></span></h3>
                            <div class="row">
                                <form method="post" action="RatingServlet">
                                    <input type="hidden" name="spID" value="<%=id%>" />
                                    <fieldset class="rating">
                                        <input type="radio" id="star5" name="rating" value="5" /><label class = "star full" for="star5" title="Awesome - 5 stars"></label>
                                        <input type="radio" id="star4" name="rating" value="4" /><label class = "star full" for="star4" title="Pretty good - 4 stars"></label>
                                        <input type="radio" id="star3" name="rating" value="3" /><label class = "star full" for="star3" title="Meh - 3 stars"></label>
                                        <input type="radio" id="star2" name="rating" value="2" /><label class = "star full" for="star2" title="Kinda bad - 2 stars"></label>
                                        <input type="radio" id="star1" name="rating" value="1" /><label class = "star full" for="star1" title="Sucks big time - 1 star"></label>
                                    </fieldset><br/><br/>
                                    <%
                                        if (session.getAttribute("cmtname") == null) {

                                    %>
                                    <div class="form-group">
                                        <div class="col-sm-3 col-md-7">
                                            <label class="control-label" for="c-Name">Họ tên<em>*</em>:</label>
                                            <input type="text" name="cName" placeholder="Nhập tên người gửi" class="form-control" id="c-Name">
                                        </div>
                                    </div>
                                    <%                            } else {
                                    %>
                                    <div class="form-group">
                                        <div class="col-sm-3 col-md-7">
                                            <label class="control-label" for="c-Name">Họ tên<em>*</em>: <%= session.getAttribute("cmtname")%> </label>
                                            <a href="logout.jsp"> Logout </a>
                                            <input type="hidden" name="cName" value="${cmtname}" class="form-control" id="c-Name">
                                        </div>
                                    </div>
                                    <%
                                        }
                                    %>
                                    <div class="form-group ">
                                        <div class="col-sm-3 col-md-12 dia-chi">
                                            <label class="control-label" for="c-Message">Nội dung<em>*</em>:</label>
                                            <textarea rows="4" id="c-Message" cols="20" class="form-control" placeholder="Nhập nội dung" name="cMessage"></textarea>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-sm-3 col-md-7" style="margin-top: 10px;">
                                            <button  type="submit" class="btn btn-info">Đánh giá</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <hr>
                            <div class="row">
                                <%
                                    ratings = ps.GetDataByIdSP(id);
                                    String gioDG = "";
                                    for (int i = 0; i < ratings.size(); i++) {
                                        rg = ratings.get(i);
                                        gioDG = sdf.format(rg.getRatingDate());
                                %>
                                <div class="col-md-12" style="word-break: break-word;">
                                    <div class="media">
                                        <div class="media-left">
                                            <img class="media-object" src="uploads/Photo-Unavailable.jpg" style="width:80px" />
                                        </div>
                                        <div class="media-body">
                                            <fieldset style="float: right;">
                                                <!--<span class="glyphicon glyphicon-star" style="color: red; font-size: 50px;">&#9734;</span>-->
                                                <!--<span style="font-size:300%;color:yellow;">&starf;</span>-->
                                                <!--<span style="font-size:500%;color:red;">&star;</span>-->
                                                <%
                                                    switch (rg.getRatingPoint()) {
                                                        case 1:
                                                %>
                                                <span class="sao-check">&bigstar;<span class="sao-uncheck">&bigstar;&bigstar;&bigstar;&bigstar;</span></span>
                                                <%      break;
                                                    case 2:
                                                %>
                                                <span class="sao-check">&bigstar;&bigstar;<span class="sao-uncheck">&bigstar;&bigstar;&bigstar;</span></span>
                                                <%      break;
                                                    case 3:
                                                %>
                                                <span class="sao-check">&bigstar;&bigstar;&bigstar;<span class="sao-uncheck">&bigstar;&bigstar;</span></span>
                                                <%
                                                        break;
                                                    case 4:
                                                %>
                                                <span class="sao-check">&bigstar;&bigstar;&bigstar;&bigstar;<span class="sao-uncheck">&bigstar;</span></span>
                                                <%
                                                        break;
                                                    default:
                                                %>
                                                <span class="sao-check">&bigstar;&bigstar;&bigstar;&bigstar;&bigstar;</span>
                                                <%
                                                    }
                                                %>
                                            </fieldset>
                                            <h4 class="media-heading"><%=rg.getNameUser()%> <small><i> <%=gioDG%></i></small></h4>
                                            <p><%=rg.getReview()%></p>
                                        </div>
                                    </div>
                                    <hr>
                                </div>

                                <%
                                    }
                                %>
                            </div>
                        </div>

                    </div>
                </div>
                <div class="col-md-6">
                    <div class="baivietlienquanctsp">
                        <div class="baivietlienquan col-md-12 col-sm-6">
                            <center><span class="tenbaivietctsp" style="color:#008ac2;font-size: 30px">Bài viết liên quan</span></center>
                            <a href="#">
                                <span style="font-size: 15px;padding-top: 36px;" class="glyphicon glyphicon-list-alt  "> Mẹo "cấpcứu" bàn phím máy tính bị vô nước</span>
                            </a>
                            <a href="#">
                                <span style="font-size: 15px;padding-top: 10px;" class="glyphicon glyphicon-list-alt  "> Laptop màn hình cong đầu tiên trên thế giới giá 4.000 USD</span>
                            </a>
                            <a href="#">
                                <span style="font-size: 15px;padding-top: 10px;" class="glyphicon glyphicon-list-alt  "> Máy tính siêu nhỏ chạy trên Windows 10 sắp "đổ bộ" </span>
                            </a>
                            <a href="#">
                                <span style="font-size: 15px;padding-top: 10px;" class="glyphicon glyphicon-list-alt  "> Đánh giá laptop ThinkPad X1 Yoga đa năng 14 inch siêu mỏng</span>
                            </a>
                            <a href="#">
                                <span style="font-size: 15px;padding-top: 10px;" class="glyphicon glyphicon-list-alt  "> So sánh ASUS Zenbook và Macbook 12 inch </span>
                            </a>
                            <a href="#">
                                <span style="font-size: 15px;padding-top: 10px;" class="glyphicon glyphicon-list-alt  "> Bật mí về chiếc laptop Eve V - đối thủ của Surface Pro</span>
                            </a>
                            <a href="#">
                                <span style="font-size: 15px;padding-top: 10px;" class="glyphicon glyphicon-list-alt  "> "Dì ghẻ" Ngô Thanh Vân bật mí bộ sưu tập công nghệ </span>
                            </a>
                            <a href="#">
                                <span style="font-size: 15px;padding-top: 10px;" class="glyphicon glyphicon-list-alt  "> Macbook Pro 2016 - siêu phẩm đột phá của Apple</span>
                            </a>
                        </div>
                    </div>
                    <!--</-->
                </div>
            </div>
            <div class="row rowsplienquan ">
                <center><span class="tenbaivietctsp" style="color:#008ac2;font-size: 25px">Sản phẩm liên quan</span></center>
                <div class="col-md-12 col-sm-6 splienquan">

                    <div class="col-md-3 splienquan1 ">

                        <a href="#"><img  class="img-responsive" src="img/dell.png" alt=""/><br/>
                            <span style="font-size: 20px;color: #008ae2;">Intel core i5</span>
                        </a>

                    </div>
                    <div class="col-md-3 splienquan1 ">
                        <center>
                            <a href="#"><img  class="img-responsive" src="img/dell.png" alt=""/><br/>
                                <span style="font-size: 20px;color: #008ae2;">Intel core i5</span>
                            </a>
                        </center>
                    </div>
                    <div class="col-md-3 splienquan1 ">
                        <center>
                            <a href="#"><img  class="img-responsive" src="img/dell.png" alt=""/><br/>
                                <span style="font-size: 20px;color: #008ae2;">Intel core i5</span>
                            </a>
                        </center>
                    </div>
                    <div class="col-md-3 splienquan1 ">
                        <center>
                            <a href="#"><img  class="img-responsive" src="img/dell.png" alt=""/><br/>
                                <span style="font-size: 20px;color: #008ae2;">Intel core i5</span>
                            </a>
                        </center>
                    </div>
                </div>
            </div>
        </section>
        <%@include file="includes/footer.jsp" %>
    </body>
</html>
