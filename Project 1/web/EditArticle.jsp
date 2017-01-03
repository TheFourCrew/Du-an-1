<%-- 
    Document   : EditArticle
    Created on : Jan 2, 2017, 11:16:46 PM
    Author     : ilove
--%>

<%@page import="com.javaweb.service.ArticleServices"%>
<%@page import="com.javaweb.model.Article"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Sửa bài viết: </title>
        <%@include file="include-dashboard/headtag.jsp" %>
    </head>
    <body><%            ArticleServices us = new ArticleServices();
        Article bv = null;
        String newsID = request.getParameter("idbv");
        bv = us.GetNewsByID(newsID);
        %>
        <div id="wrapper">
            <%@include file="include-dashboard/sidebar.jsp" %>
            <section class="container">
                <form class="form-horizontal" action="EditArticle" name="fART" method="post" enctype="multipart/form-data" id="addArticle">
                    <input type="hidden" name="idbv" value="<%=bv.getIdarticle()%>">
                    <div class="form-group">
                        <label class="control-label col-sm-2 col-md-3" for="prod-os">Tiêu đề:</label>
                        <div class="col-sm-3 col-md-7">
                            <input type="text" name="ntd" value="<%=bv.getTitleArticle()%>" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2 col-md-3" for="ntv">Tin vắn:</label>
                        <div class="col-sm-3 col-md-7">
                            <input type="text" name="ntv" value="<%=bv.getHeadline()%>" class="form-control">
                        </div>
                    </div>
                    <div class="form-group ">
                        <label class="control-label col-sm-2 col-md-3" for="prod-os">Nội dung:</label>
                        <div class="col-sm-3 col-md-7">
                            <textarea rows="4" id="prod-describe" cols="10" class="form-control ckeditor" name="contents">
                                <%=bv.getContent()%>
                            </textarea>
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
                            <input type="file" name="nthumbnail" id="prod-thumbnail" onchange="loadFile(event, 'addpro')">
                            <img  id="outputaddpro" class="img-responsive" src="uploads/<%=bv.getThumbnail()%>" heigh="100px"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-3 col-md-1">
                        </div>
                        <div class="col-sm-3 col-md-7">
                            <button  type="submit" class="btn btn-info">Sửa</button>
                            <button  type="reset" class="btn btn-info">Hủy</button>
                        </div>
                    </div>
                </form>
            </section>
        </div>
    </body>
</html>
