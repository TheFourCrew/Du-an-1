<%-- 
    Document   : ChiTietBaiViet
    Created on : Nov 15, 2016, 8:35:30 AM
    Author     : Computer
--%>

<%@page import="com.javaweb.model.Article"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.javaweb.service.ArticleServices"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="include-dashboard/headtag.jsp" %>

    </head>
    <body>
        <div id="wrapper">
            <%@include file="include-dashboard/sidebar.jsp" %>
            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Quản lý bài viết</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <div class="row">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="panel panel-default">

                                <!-- /.panel-heading -->
                                <div class="panel-body">
                                    <form action="DeleteMultipleArticle" method="post">
                                        <div class="form-group">
                                            <label>
                                                <select name="tacvu" class="form-control-static">
                                                    <option value="">Tác vụ</option>
                                                    <option value="xoa">Xóa</option>
                                                </select>
                                                <input class="btn btn-danger" type="submit" value="Thực hiện" />
                                            </label>
                                        </div>
                                        <!-- Table -->
                                        <script type="text/javascript">
                                            function check(source) {
                                                checkboxes = document.getElementsByName('idArt');
                                                for (var i = 0; i < checkboxes.length; i++) {
                                                    checkboxes[i].checked = source.checked;
                                                }
                                            }
                                        </script>
                                        <%
                                            int pageSize = 10;
                                            int pageNumber = 1;
                                            String url = "ArticlesManager.jsp";
                                            ArticleServices as = new ArticleServices();
                                            ArrayList<Article> listArts = null;
                                            if (request.getParameter("pagenumber") != null) {
                                                session.setAttribute("pagenumber", request.getParameter("pagenumber"));
                                                pageNumber = Integer.parseInt(request.getParameter("pagenumber"));
                                            } else {
                                                session.setAttribute("pagenumber", "1");
                                            }

                                            listArts = as.getAllNews(pageSize, pageNumber);
                                            int pageCount = (as.newscount) / pageSize + (as.newscount % pageSize > 0 ? 1 : 0);
                                            String nextPage = (pageCount > pageNumber ? (pageNumber + 1) : pageNumber) + "";
                                            String prevPage = (pageNumber <= 1 ? 1 : pageNumber - 1) + "";
                                        %>
                                        <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                                            <thead>
                                                <tr>
                                                    <th><input type="checkbox" name="delete-product" onclick="check(this)" /></th>
                                                    <th>TT</th>                        
                                                    <th>Tên bài viết</th>
                                                    <th>Nội dung chính</th>
                                                    <th>Ngày tạo</th>
                                                    <th>Các chỉnh sửa</th>                       
                                                    <th class="col-md-3">Nội dung</th> 
                                                    <th>Ảnh chính</th>
                                                    <th>Ấn bản</th>
                                                    <th>Ghi chú</th>
                                                    <th>Xem bài</th>
                                                    <th>Xóa</th>
                                                    <th>Chỉnh sửa</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%
                                                    for (int i = 0; i < listArts.size(); i++) {
                                                        Article bv = listArts.get(i);
                                                        int dem = i + 1;
                                                        if (pageNumber > 1) {
                                                            dem = i + pageSize * (pageNumber - 1) + 1;
                                                        }
                                                %>
                                                <tr>
                                                    <th><input type="checkbox" name="idArt" value="<%=bv.getIdarticle()%>" /></th>
                                                    <td> <%= i + 1%> </td>
                                                    <td> <%= bv.getTitleArticle()%>  </td>
                                                    <td> <%= bv.getHeadline()%>  </td>
                                                    <td> <%= bv.getCreatedDate()%>  </td>
                                                    <td> <%= bv.getModifiedDate()%>  </td>
                                                    <td> <%= bv.getContent()%>  </td>
                                                    <td> <img src="uploads/<%= bv.getThumbnail()%>" style="width: 50px">  </td>
                                                    <td> <%= bv.getPublic_()%>  </td>
                                                    <td> <%= bv.getNote()%>  </td>
                                                    <td> <a href="baiviet.jsp?idbv=<%= bv.getIdarticle()%>">Xem bài</a></td>
                                                    <td> <a href="DeleteArticle?idArt=<%= bv.getIdarticle()%>" onclick="return confirm('Bạn có muốn xóa không?')">Xóa bài viết</a></td>
                                                    <td> <a href="EditArticle.jsp?idbv=<%= bv.getIdarticle()%>">Sửa bài viết</a></td>
                                                </tr>
                                                <%
                                                    }
                                                %>
                                            </tbody>
                                        </table>
                                        <span ></span>
                                        <!-- /.table-responsive -->
                                    </form>
                                    <%
                                        if (pageCount > 1) {
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
                                <!-- /.panel-body -->
                            </div>
                            <!-- /.panel -->
                        </div>
                        <!-- /.col-lg-12 -->
                    </div>
                </div>
            </div><!--End #page-wrapper-->
        </div><!--End #wrapper-->
    </body>
</html>
