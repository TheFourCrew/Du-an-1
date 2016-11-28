<%-- 
    Document   : ChiTietSanPham
    Created on : Nov 15, 2016, 8:35:40 AM
    Author     : Computer
--%>

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
        <section class="container">
            <div class="row">
                <div class="col-md-12 col-sm-6 ctsp">
                    <div class="col-md-6 col-sm-6 hinhctsp text-center">
                        <div class="w3-content" style="max-width:300px">
                            <img class="mySlides" src="img/dell.png" style="width:300px;height: 300px; display: block">
                            <img class="mySlides" src="img/3.jpg" style="width:300px;height: 300px;">
                            <img class="mySlides" src="img/2.jpg" style="width:300px;height: 300px;">
                            
                            <div class="w3-row-padding w3-section">
                                <div class="w3-col s4">
                                    <img class="demo w3-opacity w3-hover-opacity-off" src="img/dell.png" style="width:100%" onclick="currentDiv(1)">
                                </div>
                                <div class="w3-col s4">
                                    <img class="demo w3-opacity w3-hover-opacity-off" src="img/3.jpg" style="width:100%" onclick="currentDiv(2)">
                                </div>
                                <div class="w3-col s4">
                                    <img class="demo w3-opacity w3-hover-opacity-off" src="img/2.jpg" style="width:100%" onclick="currentDiv(3)">
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6 col-sm-6 thongsoctsp">
                        <h4 style="color:black;font-size: 25px;font-weight: normal">LENOVO IDEAPAD 310-14ISK 80SL0069VN</h4>
                        <h5 style="font-size: 15px;">MÁY TÍNH XÁCH TAY LENOVO IDEAPAD 310-14ISK,I3-6100U(2.3GHZ/3MB),4GB DDR4,1TB HDD,14" FHD,2CELL,FREE-DOS,SILVER (BẠC),1YWTY_80SL0069VN</h5>
                        <p ><b><span style="color:red;">Giá bán:</span><span style="color:red;" class="giaban"> 9.999.000</span><span style="color:red;"> VNĐ</span></b><span > (Đã bao gồm thuế VAT)</span></p>
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
            <script>
                var slideIndex = 1;
                showDivs(slideIndex);

                function plusDivs(n) {
                    showDivs(slideIndex += n);
                }

                function currentDiv(n) {
                    showDivs(slideIndex = n);
                }

                function showDivs(n) {
                    var i;
                    var x = document.getElementsByClassName("mySlides");
                    var dots = document.getElementsByClassName("demo");
                    if (n > x.length) {
                        slideIndex = 1
                    }
                    if (n < 1) {
                        slideIndex = x.length
                    }
                    for (i = 0; i < x.length; i++) {
                        x[i].style.display = "none";
                    }
                    for (i = 0; i < dots.length; i++) {
                        dots[i].className = dots[i].className.replace(" w3-opacity-off", "");
                    }
                    x[slideIndex - 1].style.display = "block";
                    dots[slideIndex - 1].className += " w3-opacity-off";
                }
            </script>
            <div class="row">
                <div class="baivietlienquan col-md-6 col-sm-6">
                    <center><span class="tenbaivietctsp" style="color:#008ac2;font-size: 30px">Bài viết liên quan</span></center>
                    <a href="#"><span style="font-size: 15px;padding-top: 36px;" class="glyphicon glyphicon-list-alt  "> Mẹo "cấpcứu" bàn phím máy tính bị vô nước</span></a>
                    <a href="#"><span style="font-size: 15px;padding-top: 10px;" class="glyphicon glyphicon-list-alt  "> Laptop màn hình cong đầu tiên trên thế giới giá 4.000 USD</span></a>
                    <a href="#"><span style="font-size: 15px;padding-top: 10px;" class="glyphicon glyphicon-list-alt  "> Máy tính siêu nhỏ chạy trên Windows 10 sắp "đổ bộ" </span></a>
                    <a href="#"><span style="font-size: 15px;padding-top: 10px;" class="glyphicon glyphicon-list-alt  "> Đánh giá laptop ThinkPad X1 Yoga đa năng 14 inch siêu mỏng</span></a>
                    <a href="#"><span style="font-size: 15px;padding-top: 10px;" class="glyphicon glyphicon-list-alt  "> So sánh ASUS Zenbook và Macbook 12 inch </span></a>
                    <a href="#"><span style="font-size: 15px;padding-top: 10px;" class="glyphicon glyphicon-list-alt  "> Bật mí về chiếc laptop Eve V - đối thủ của Surface Pro</span></a>
                    <a href="#"><span style="font-size: 15px;padding-top: 10px;" class="glyphicon glyphicon-list-alt  "> "Dì ghẻ" Ngô Thanh Vân bật mí bộ sưu tập công nghệ </span></a>
                    <a href="#"><span style="font-size: 15px;padding-top: 10px;" class="glyphicon glyphicon-list-alt  "> Macbook Pro 2016 - siêu phẩm đột phá của Apple</span></a>
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
    </body>
</html>
