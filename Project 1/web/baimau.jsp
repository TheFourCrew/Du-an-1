<%-- 
    Document   : baimau
    Created on : Dec 2, 2016, 1:33:57 PM
    Author     : ilove
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
        
        <div class="container">
            <div class="baiviet col-md-9 col-xs-12">
                <div class="row">
                    <div class="noidung">
                        <div class="tieude">
                            <div class="anhbv" style="background-image: url(images/3923310_Tinhte.vn_MSI_VR_One_Backpack-5.jpg); background-size: cover;">
                                <div class="tieude">
                                    <h3>Tieu de</h3>
                                </div>
                            </div>
                        </div>
                        <div class="textbv">
                            <p>
                                Chiếc máy tính balo dùng để chơi game VR không dây của ZOTAC đã có giá bán chính thức tại Mỹ là 1.999 USD cho cấu hình i7-6700T, GTX 1070, 16 GB RAM và 240 GB SSD. Máy có 2 cục pin được tích hợp sẵn để người dùng có thể chơi game mà không cần cắm nguồn trong khoảng thời gian tầm 2 tiếng đồng hồ. Pin này có thể tháo rời khỏi máy tính và đem đi sạc ở bên ngoài. Còn riêng máy tính ngoài việc đeo lên lưng còn có thể dùng như một cái máy tính để bàn nhờ vào thiết kế vuông vức của các cạnh.

                                <b>Cấu hình chi tiết ZOTAC VR GO:</b></p>
                            <ul>
                                <li>Model: ZBOX-VR7N70-W2B/W4B-BE/J/U/K</li>
                                <li>OS: Windows 10 Home</li>
                                <li>CPU: Intel Core i7-6700T, 4 nhân, 8 luồng</li>
                                <li>VGA: NVIDIA GeForce GTX 1070, 8 GB GDDR5</li>
                                <li>RAM: 16 GB DDR4-2133 (2 khe SODIMM), nâng tối đa được 32 GB</li>
                                <li>Lưu trữ: SSD M.2/PCIe 240 GB, còn trống 1 khe SATA 2.5"</li>
                                <li>Wi-Fi ac, BT 4.2, 2 x Ethernet GbE, 3 x HDMI 2.0, 2 x DP 1.3, 3.5mm audio in, 3.5mm audio out, 6 x USB 3.0</li>
                                <li>Kích thước: 410 x 270 x 76 mm</li>
                                <li>Khối lượng: 4,95 kg</li>
                                <li>Pin: 2 cục, 95Wh, 6.600 mAh</li>
                            </ul>
                        </div>


                    </div>
                    <div class="binhluan">
                        <h3>Gửi bình luận của bạn</h3>
                        <div class="user col-lg-2 col-md-2">
                            <img src="images/works_12.jpg">
                            <a href="">User01</a>
                        </div>
                        <form>
                            <div class="form-group ">
                                <div class="col-sm-3 col-md-10">
                                    <textarea rows="4" id="prod-describe" cols="10" class="form-control ckeditor" name="contents"></textarea>
                                </div>
                                <!--<script src="//cdn.ckeditor.com/4.6.0/ull/ckeditor.js"></script>-->
                                <script type="text/javascript">
                                    config = {};
                                    config.language = 'vi';
                                    CKEDITOR.replace('prod-describe', config);
                                </script>
                            </div>
                            <div class="form-group">
                                <button  type="submit" class="btn btn-info">Gửi bình luận</button>
                            </div>
                        </form>
                        <h3>Các bình luận trước</h3>
                        <ol>
                            <li>
                                <div class="user col-lg-2 col-md-2">
                                    <img src="images/works_12.jpg">
                                    <a href="">User01</a>
                                </div>
                                <div class="textCmt col-md-10">
                                    adfadf 
                                </div>
                            </li>
                        </ol>
                    </div>
                </div>
                <script>
                    $(function () {
                        $('#edit').froalaEditor({
                            theme: 'dark'
                        })
                    });
                </script>

            </div>
            <div class="rightPanel col-md-3">
                <div class="row">
                    <div class="bailq">
                        <h4>Bài liên quan</h4>
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
                    <div class="sanpham">
                        <h4>Sản phẩm tương tự</h4>
                    </div>
                    <div class="tag">
                        <h4>Chuyên mục nổi bật</h4>
                    </div>
                </div>
            </div>

        </div> 

        <%@include file="includes/footer.jsp" %>
    </body>
</html>
