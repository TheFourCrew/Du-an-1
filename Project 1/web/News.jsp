<%-- 
    Document   : News
    Created on : Dec 22, 2016, 5:40:54 PM
    Author     : ilove
--%>
<%@page import="com.javaweb.model.Article"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.javaweb.service.ArticleServices"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tin tức nổi bật</title>
        <%@include file="includes/headtag.jsp" %>
    </head>
    <body>
        <%@include file="includes/header.jsp" %>
        <div class="container">
            <div class="col-lg-12 col-md-7 newsleft">
                <%                    int pageSize = 10;
                    int pageNumber = 1;
                    String url = "News.jsp";
                    ArticleServices as = new ArticleServices();
                    ArrayList<Article> listArticle = null;

                    if (request.getParameter("pagenumber") != null) {
                        session.setAttribute("pagenumber", request.getParameter("pagenumber"));
                        pageNumber = Integer.parseInt(request.getParameter("pagenumber"));
                    } else {
                        session.setAttribute("pagenumber", "1");
                    }

                    listArticle = as.getAllNews(pageSize, pageNumber);

                    int pageCount = (as.newscount) / pageSize + (as.newscount % pageSize > 0 ? 1 : 0);

                    String nextPage = (pageCount > pageNumber ? (pageNumber + 1) : pageNumber) + "";
                    String prevPage = (pageNumber <= 1 ? 1 : pageNumber - 1) + "";


                %>
                <div class="theard">
                    <%                        for (int i = 0; i < listArticle.size(); i++) {
                            Article art = listArticle.get(i);
                            int dem = i + 1;
                            if (pageNumber > 1) {
                                dem = i + pageSize * (pageNumber - 1) + 1;
                            }
                    %>
                    <div class="posts col-md-7">
                        <a href="baiviet.jsp?idbv=<%=art.getIdarticle()%>">
                            <div class="newsimage" style="height: 300px;background-image: url(uploads/<%=art.getThumbnail()%>)">
<!--                                <img src="uploads/<%=art.getThumbnail()%>"-->
                            </div>
                            <div class="titleP">
                                <h3><%=art.getTitleArticle()%></h3>
                            </div>

                            <div class="postbody">
                                <article>
                                    <a href="#">
                                        <%=art.getHeadline()%>
                                    </a>
                                </article>
                            </div>
                        </a>
                    </div>
                    <%

                        }
                    %>
                </div>
                <%
                    if (pageCount != 1) {
                %>
                <div class="panel-footer">
                    <nav aria-label="Page navigation">
                        <ul class="pagination">
                            <%
                                if (pageNumber != 1) {
                            %>
                            <li><a aria-label="Previous" href="<%=url%>?pagenumber=<%=prevPage%>"><span aria-hidden="true">&laquo;</span></a></li>
                                <%
                                    }
                                    for (int j = 1; j <= pageCount; j++) {
                                        if (pageNumber == j) {
                                %>
                            <li class="active"><a href="<%=url%>?pagenumber=<%=j%>"><%=j%></a></li>
                                <%
                                } else {
                                %>
                            <li><a href="<%=url%>?pagenumber=<%=j%>"><%=j%></a></li>
                                <%
                                        }
                                    }
                                    if (pageNumber != pageCount) {
                                %>
                            <li><a aria-label="Next" href="<%=url%>?pagenumber=<%=nextPage%>"><span aria-hidden="true">&raquo;</span></a></li>
                                <%
                                    }
                                %>
                        </ul>
                    </nav>
                </div>
                <%
                    }
                %>
            </div>
            <div class="col-lg-5">
            </div>
        </div>
        <%@include file="includes/footer.jsp" %>
    </body>
</html>
