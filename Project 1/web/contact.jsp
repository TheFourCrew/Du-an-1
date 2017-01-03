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
            </div>
        </section>
        <%@include file="includes/footer.jsp" %>
    </body>
</html>
