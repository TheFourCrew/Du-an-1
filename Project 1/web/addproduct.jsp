<%-- 
    Document   : addproduct
    Created on : Nov 30, 2016, 5:58:01 PM
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
            <div class="col-md-7">
                <form action="LienLac" method="post" enctype="multipart/form-data">
                    <div class="form-group">
                        <div class="col-sm-3 col-md-7">
                            <label class="control-label" for="c-Name">Tên sản phẩm<em>*</em>:</label>
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
            </div>
        </section>
        <%@include file="includes/footer.jsp" %>
    </body>
</html>
