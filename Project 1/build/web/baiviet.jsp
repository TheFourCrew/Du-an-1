<%-- 
    Document   : baimau
    Created on : Dec 2, 2016, 1:33:57 PM
    Author     : ilove
--%>

<%@page import="com.javaweb.model.Article"%>
<%@page import="com.javaweb.service.ArticleServices"%>
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
            ArticleServices as = new ArticleServices();
            String id = request.getParameter("idbv");
            Article news=null;
            news = as.GetNewsByID(id);
        %>
        <%@include file="includes/header.jsp" %>

        <div class="container">
            <div class="baiviet col-md-9 col-xs-12">
                <div class="row">
                    <div class="noidung">
                        <div class="tieude">
                            <div class="anhbv" style="background-image: url(uploads/<%=news.getThumbnail()%>); background-size: cover;">
                                <div class="tieude">
                                    <h3><%= news.getTitleArticle()%></h3>
                                </div>
                            </div>
                        </div>
                        <div class="textbv">
                            <article>
                                <%= news.getHeadline()%>
                                <%= news.getContent()%>
                            </article>
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
