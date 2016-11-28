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
        <%@include file="includes/header.jsp" %>
        <section class="container">
            <h3>Liên hệ</h3>
            <p>Có thắc mắc, nhu cầu quảng cáo hãy nhập thông tin dưới đây. Cảm ơn.</p>
            <form action="LienLac" method="post">
                <div class="form-group">
                    <div class="col-sm-3 col-md-7">
                        <label class="control-label" for="c-Name">Họ tên<em>*</em>:</label>
                        <input type="text" name="cName" placeholder="Nhập tên người gửi" class="form-control" id="c-Name">
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-3 col-md-7">
                        <label class="control-label" for="c-Subject">Chủ đề<em>*</em>:</label>
                        <input type="text" name="cSubject" placeholder="Nhập chủ đề" class="form-control" id="c-Subject">
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-3 col-md-7">
                        <label class="control-label" for="c-Email">Email<em>*</em>:</label>
                        <input type="email" name="cEmail" placeholder="Nhập thư điện tử" class="form-control" id="c-Email">
                    </div>
                </div>

                <div class="form-group ">
                    <div class="col-sm-3 col-md-7 dia-chi">
                        <label class="control-label" for="c-Message">Nội dung<em>*</em>:</label>
                        <textarea rows="4" id="c-Message" cols="20" class="form-control" placeholder="Nhập nội dung" name="cMessage"></textarea>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-3 col-md-7">
                        <button  type="submit" class="btn btn-info">Gửi</button>
                    </div>
                </div>
            </form>
            ${Message}
        </section>
        <%@include file="includes/footer.jsp" %>
    </body>
</html>
