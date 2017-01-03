<%-- 
    Document   : AddNewArticle
    Created on : Jan 2, 2017, 11:16:46 PM
    Author     : ilove
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thêm bài viết</title>
        <%@include file="include-dashboard/headtag.jsp" %>
    </head>
    <body>
        <div id="wrapper">
            <%@include file="include-dashboard/sidebar.jsp" %>
            <section class="container">
                <form class="form-horizontal" action="AddArticle" name="fART" method="post" onsubmit="return validateFormProduct()" enctype="multipart/form-data" id="addArticle">
                    <div class="form-group">
                        <label class="control-label col-sm-2 col-md-3" for="ntd">Tiêu đề:</label>
                        <div class="col-sm-3 col-md-7">
                            <input type="text" name="ntd" placeholder="Nhập tiêu đề" class="form-control" id="nbv">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2 col-md-3" for="ntv">Tin vắn:</label>
                        <div class="col-sm-3 col-md-7">
                            <input type="text" name="ntv" placeholder="Nhập tin" class="form-control" id="ntv">
                        </div>
                    </div>
                    <div class="form-group ">
                        <label class="control-label col-sm-2 col-md-3" for="contents">Nội dung:</label>
                        <div class="col-sm-3 col-md-7">
                            <textarea rows="4" cols="10" class="form-control ckeditor" id="contents" name="contents"></textarea>
                        </div>
                        <!--<script src="//cdn.ckeditor.com/4.6.0/ull/ckeditor.js"></script>-->
                        <script type="text/javascript">
                            config = {};
                            config.language = 'vi';
                            CKEDITOR.replace('prod-describe', config);
                        </script>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2 col-md-3" for="nthumbnail">Chọn hình đại diện<em>*</em>:</label>
                        <div class="col-sm-3 col-md-7">
                            <input type="file" name="nthumbnail" id="thumbnail" onchange="loadFile(event, 'addpic')">
                            <img  id="outputadd"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-3 col-md-1">
                        </div>
                        <div class="col-sm-3 col-md-7">
                            <button  type="submit" class="btn btn-info">Thêm</button>
                            <button  type="reset" class="btn btn-info">Hủy</button>
                        </div>
                    </div>
                </form>
            </section>
        </div>
    </body>
</html>
