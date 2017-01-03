<%-- 
    Document   : lienlac
    Created on : Nov 23, 2016, 3:36:35 PM
    Author     : MinhNguyen
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
        <%
            session.setAttribute("urlcur", request.getServletPath().substring(1));
            session.removeAttribute("urlctsp");
        %>
        <%@include file="includes/header.jsp" %>
<<<<<<< HEAD
        <section class="container">
            <div class="col-md-12">
                <div class="heading-row">
                    <h3>Liên hệ</h3>
                </div>
            </div>
            <p>Có thắc mắc, nhu cầu quảng cáo hãy nhập thông tin dưới đây. Cảm ơn.</p>
            <div class="col-md-6" style="margin-bottom: 30px;">
                <form action="LienLac" method="post" id="form-contact">
                    <div class="form-group">
                        <div class="col-sm-3 col-md-12">
                            <label class="control-label" for="c-Name">Họ tên<em>*</em>:</label>
                            <input type="text" name="cName" placeholder="Nhập tên người gửi" class="form-control" id="c-Name">
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-sm-3 col-md-12">
                            <label class="control-label" for="c-Subject">Chủ đề<em>*</em>:</label>
                            <input type="text" name="cSubject" placeholder="Nhập chủ đề" class="form-control" id="c-Subject">
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-sm-3 col-md-12">
                            <label class="control-label" for="c-Email">Email<em>*</em>:</label>
                            <input type="email" name="cEmail" placeholder="Nhập thư điện tử" class="form-control" id="c-Email">
                        </div>
                    </div>

                    <div class="form-group" >
                        <div class="col-sm-3 col-md-12 dia-chi">
                            <label class="control-label" for="c-Message">Nội dung<em>*</em>:</label>
                            <textarea rows="4"  id="c-Message" cols="20" class="form-control" placeholder="Nhập nội dung" name="cMessage"></textarea>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-sm-3 col-md-7">
                            <button  type="submit" style="margin-top:20px" class="btn btn-info">Gửi lời nhắn</button>
                        </div>
                    </div>
                </form>
                <!--${Message}-->
            </div>
            <div class="col-md-6">
                <p><span class="glyphicon glyphicon-home"></span> California, United States 3000009</p>
                <p><span class="glyphicon glyphicon-earphone"></span> +6221 888 888 90 , +6221 888 88891</p>
                <p><span class="glyphicon glyphicon-envelope"></span> info@yourdomain.com</p>
                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3164.289259162295!2d-120.7989351!3d37.5246781!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8091042b3386acd7%3A0x3b4a4cedc60363dd!2sMain+St%2C+Denair%2C+CA+95316%2C+Hoa+K%E1%BB%B3!5e0!3m2!1svi!2s!4v1434016649434" width="95%" height="230" frameborder="0" style="border:0"></iframe>
=======

        <section>
            <div class="container-fluid thanht">
                <div class="gt">
                    <div class="ct col-md-6 col-sm-12">
                        <h1>Táo kho hiện đã có mặt trên toàn quốc!</h1>
                        <img src="img/map.png"/>
                        <span class="text3" style="
    padding-top: 40px;">Việc phủ sóng toàn quốc là một bước tiến quan trọng của công ty. Điều này cho thấy được sự mến mộ và cuồng táo của các FAN là không hề suy giảm. Để cảm kích về vấn đề này, công ty sẽ giảm giá đến <font size="14" color="red">1%</font> cho tất cả các sản phẩm. Cảm ơn tất cả quý khách hàng đã hỗ trợ trong những ngày qua. Thân chào và quyết thắng!</span>
                    </div>
                </div>
                <div class="map container-fluid">
                    <div class="text2"><span>Tìm chúng tôi trên gMap</span></div>
                    <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d373245.91566971445!2d108.17969179951797!3d12.689211493709026!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2s!4v1457580808262" width="100%" height="519" frameborder="0" style="border:0" allowfullscreen></iframe></div>
                <div class="container">
                    <div class="dg">
                        <div class="row">
                            <div class="lf col-sm-12 col-md-6">
                                <div class="cg">
                                    <div class="dgt"><a>Đánh giá từ người dùng</a></div>
                                    <img src="img/u1.png"/>
                                    <div class="paper">
                                        <div class="tx">
                                            <span>Mình thấy chất lượng sửa chữa khá tốt, máy không còn hư nhiều như hồi chưa sửa. Mua máy mới còn tặng hộp nữa. Mình rất thích.</span><br><span>Thị Tủn</span>
                                        </div>
                                    </div>
                                </div>
                                <div class="at">
                                    <img src="img/u2.png"/>
                                    <div class="paper">
                                        <div class="tx">
                                            <span>Ý kiến của mình giống với bạn trên. mình xin hết.</span><br><span>Văn Tàu</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="rt col-sm-12 col-md-6">
                                <div class="dgt"><a>Đăng kí nhận thông tin hỗ trợ</a></div>
                                <form action="LienLac" method="post" id="form-contact">
                                    <div class="form-group">
                                        <div class="col-sm-3 col-md-6">
                                            <label class="control-label" for="c-Name">Họ tên<em>*</em>:</label>
                                            <input type="text" name="cName" placeholder="Nhập tên người gửi" class="form-control" id="c-Name">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-sm-3 col-md-6">
                                            <label class="control-label" for="c-Subject">Chủ đề<em>*</em>:</label>
                                            <input type="text" name="cSubject" placeholder="Nhập chủ đề" class="form-control" id="c-Subject">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-sm-3 col-md-6">
                                            <label class="control-label" for="c-Email">Email<em>*</em>:</label>
                                            <input type="email" name="cEmail" placeholder="Nhập thư điện tử" class="form-control" id="c-Email">
                                        </div>
                                    </div>

                                    <div class="form-group" >
                                        <div class="col-sm-3 col-md-6 dia-chi">
                                            <label class="control-label" for="c-Message">Nội dung<em>*</em>:</label>
                                            <textarea rows="4"  id="c-Message" cols="20" class="form-control" placeholder="Nhập nội dung" name="cMessage"></textarea>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-sm-3 col-md-6">
                                            <button  type="submit" style="margin-top:20px" class="btn btn-info">Gửi lời nhắn</button>
                                        </div>
                                    </div>
                                </form>
                                <!--${Message}-->
                            </div>
                        </div>
                    </div>
                </div>
                <div class="kecuoi container-fluid">
                    <div class="container">
                        <div class="row">
                            <div class="cc col-md-6 col-sm-12">
                                <div class="ins">
                                    <span>1. Sản phẩm chính hãng 100%</span><br>
                                    <span>2. Bảo hành toàn quốc (Máy không <br>lỗi mới có thể bảo hành).</span><br>
                                    <span>3. Các sản phẩm như tai nghe, loa... sẽ được  tặng giắc 3.5mm</span>
                                </div>
                            </div>
                            <div class="brand col-md-6 ">
                                <a>Là đối tác chính thức của:</a>
                                <div class="lo">
                                    <a href="http://www.apple.com" target="_blank"><img src="css/images/a0p.png"/></a>
                                    <a href="http://www.jbl.com" target="_blank"><img src="css/images/jbl.png"/></a>
                                    <a href="http://beatsbydre.com" target="_blank"><img src="css/images/beat.png"/></a>
                                    <a href="http://www.bose.com" target="_blank"><img src="css/images/bose.png"/></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

>>>>>>> origin/master
            </div>
        </section>
        <%@include file="includes/footer.jsp" %>
    </body>
</html>
