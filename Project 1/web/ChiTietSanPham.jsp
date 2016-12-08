<%-- 
    Document   : ChiTietSanPham
    Created on : Nov 15, 2016, 8:35:40 AM
    Author     : Computer
--%>

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
            %>
            <div class="row">
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
                                <div class="ws_script" style="position:absolute;left:-99%"><a href="http://wowslider.net">jquery carousel</a> by WOWSlider.com v8.7</div>
                                <div class="ws_shadow"></div>
                            </div>	
                            <script src="engine1/wowslider.js" type="text/javascript"></script>
                            <script src="engine1/script.js" type="text/javascript"></script>
                        </div>
                    </div>
                    <div class="col-md-6 col-sm-6 thongsoctsp">
                        <h4 style="color:black;font-size: 25px;font-weight: normal"><%=pt.getProductName()%></h4>
                        <fieldset class="rating">
                            <input type="radio" id="star5" name="rating" value="5" /><label class = "full" for="star5" title="Awesome - 5 stars"></label>
                            <input type="radio" id="star4half" name="rating" value="4 and a half" /><label class="half" for="star4half" title="Pretty good - 4.5 stars"></label>
                            <input type="radio" id="star4" name="rating" value="4" /><label class = "full" for="star4" title="Pretty good - 4 stars"></label>
                            <input type="radio" id="star3half" name="rating" value="3 and a half" /><label class="half" for="star3half" title="Meh - 3.5 stars"></label>
                            <input type="radio" id="star3" name="rating" value="3" /><label class = "full" for="star3" title="Meh - 3 stars"></label>
                            <input type="radio" id="star2half" name="rating" value="2 and a half" /><label class="half" for="star2half" title="Kinda bad - 2.5 stars"></label>
                            <input type="radio" id="star2" name="rating" value="2" /><label class = "full" for="star2" title="Kinda bad - 2 stars"></label>
                            <input type="radio" id="star1half" name="rating" value="1 and a half" /><label class="half" for="star1half" title="Meh - 1.5 stars"></label>
                            <input type="radio" id="star1" name="rating" value="1" /><label class = "full" for="star1" title="Sucks big time - 1 star"></label>
                            <input type="radio" id="starhalf" name="rating" value="half" /><label class="half" for="starhalf" title="Sucks big time - 0.5 stars"></label>
                        </fieldset><br/>
                        <h5 style="font-size: 15px;">MÁY TÍNH XÁCH TAY LENOVO IDEAPAD 310-14ISK,I3-6100U(2.3GHZ/3MB),4GB DDR4,1TB HDD,14" FHD,2CELL,FREE-DOS,SILVER (BẠC),1YWTY_80SL0069VN</h5>
<<<<<<< HEAD
                        <p ><b><span style="color:red;">Giá bán:</span><span style="color:red;" class="giaban"> <%=formatter.format(giaBan) + " VNĐ"%></span><span style="color:red;"> </span></b><span > (Đã bao gồm thuế VAT)</span></p>
=======

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
>>>>>>> origin/master
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
                        <button style="margin-top: 20px;" type="button" class="btn btn-success active center-block">Thêm Vào Giỏ</button>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="baivietlienquan col-md-6 col-sm-6">
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
                        <span style="font-size: 15px;padding-top: 10px;" class="glyphicon glyphicon-list-alt  "> Macbook Pro 2016 - siêu phẩm đột phá của Apple</span
                        ></a>
                </div>
                <div class="baivietctsp col-md-6 col-sm-6">

                    <center><span class="tenbaivietctsp" style="color:#008ac2;font-size: 25px">LAPTOP DELL INSPIRON 3558 - MÀN HÌNH LED LỚN, XỬ LÝ MẠNH MẼ</span></center>
                    <p style="font-size: 18px">Laptop Dell Inspiron 3558 sở hữu màn hình LED có kích thước lớn 15.6 inches và độ phân giải HD cho hình ảnh sắc nét, màu sắc tươi sáng và giúp người dùng dễ dàng thao tác hơn. Đồng hành cùng màn hình kích thước lớn, laptop còn được trang bị một bộ vi xử lý mạnh mẽ với chip Intel Core i5 Broadwell 5200U, RAM 4GB cùng card đồ họa nVidia GeForce 820M 2GB có thể đáp ứng hoạt động cùng lúc nhiều chương trình mà vẫn mượt mà.</p>
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
