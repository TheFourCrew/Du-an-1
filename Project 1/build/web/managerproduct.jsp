<%-- 
    Document   : managerproduct
    Created on : Dec 3, 2016, 2:06:29 PM
    Author     : MinhNguyen
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="com.javaweb.model.ProductCategory"%>
<%@page import="com.javaweb.service.ProductCategoryServices"%>
<%@page import="com.javaweb.model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.javaweb.service.ProductServices"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản lý sản phẩm</title>
        <%@include file="include-dashboard/headtag.jsp" %>
    </head>
    <body>
        <div id="wrapper">
            <%@include file="include-dashboard/sidebar.jsp" %>
            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Quản lý sản phẩm</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <div class="row">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    Danh sách sản phẩm
                                </div>
                                <!-- /.panel-heading -->
                                <div class="panel-body">
                                    <form action="DeleteMultipleServlet" method="post">
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
                                                checkboxes = document.getElementsByName('id-product');
                                                for (var i = 0; i < checkboxes.length; i++) {
                                                    checkboxes[i].checked = source.checked;
                                                }
                                            }
                                        </script>
                                        <%
                                            int pageSize = 15;
                                            int pageNumber = 1;
                                            String url = "managerproduct.jsp";
                                            ProductServices ps = new ProductServices();
                                            ArrayList<Product> listProduct = null;

                                            if (request.getParameter("pagenumber") != null) {
                                                session.setAttribute("pagenumber", request.getParameter("pagenumber"));
                                                pageNumber = Integer.parseInt(request.getParameter("pagenumber"));
                                            } else {
                                                session.setAttribute("pagenumber", "1");
                                            }

                                            listProduct = ps.getAllProducts(pageSize, pageNumber);

                                            int pageCount = (ps.productcount) / pageSize + (ps.productcount % pageSize > 0 ? 1 : 0);

                                            String nextPage = (pageCount > pageNumber ? (pageNumber + 1) : pageNumber) + "";
                                            String prevPage = (pageNumber <= 1 ? 1 : pageNumber - 1) + "";

                                            ProductCategoryServices pcs = new ProductCategoryServices();
                                            ProductCategory pc = null;
                                        %>
                                        <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                                            <thead>
                                                <tr>
                                                    <th><input type="checkbox" name="delete-product" onclick="check(this)" /></th>
                                                    <th>STT</th>
                                                    <th>Tên sản phẩm</th>
                                                    <th>Giá bán</th>
                                                    <th>Loại</th>
                                                    <th>Số lượng</th>
                                                    <th>Ngày tạo</th>
                                                    <th>Hình</th>
                                                    <th class="col-md-2">Hành động</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%
                                                    DecimalFormat formatter = new DecimalFormat("###,###,###");
                                                    for (int i = 0; i < listProduct.size(); i++) {
                                                        Product product = listProduct.get(i);
                                                        String id = String.valueOf(product.getIdproductCategory());
                                                        pc = pcs.getbyid(id);
                                                        double dGiaBan = product.getPricePerUnit();

                                                        String kqGiaBan = formatter.format(dGiaBan) + " VNĐ";
                                                        int dem = i + 1;
                                                        if (pageNumber > 1) {
                                                            dem = i + pageSize * (pageNumber - 1) + 1;
                                                        }
                                                %>
                                                <tr>
                                                    <th><input type="checkbox" name="id-product" value="<%=product.getIdproduct()%>" /></th>
                                                    <td><%=dem%></td>
                                                    <td><a href="ChiTietSanPham.jsp?id=<%=product.getIdproduct()%>"><%=product.getProductName()%></a></td>
                                                    <td><%=kqGiaBan%></td>
                                                    <td><%= pc.getCategoryName()%></td>
                                                    <td><%=product.getProductQuantity() %> <%=product.getUnit() %></td>
                                                    <td><%=product.getCreatedDate()%></td>
                                                    <td><img class="img-thumbnail" src="uploads/<%=product.getProductImage()%>" alt="<%=product.getProductName()%>" width="80px"/></td>
                                                    <td>
                                                        <a href="editproduct.jsp?idpt=<%=product.getIdproduct()%>" class="btn btn-info">
                                                            Sửa<!--<input class="btn btn-info" type="submit" value="Sửa" />-->
                                                        </a>
                                                        <a href="DeleteProduct?idpt=<%=product.getIdproduct()%>" onclick="return confirm('Bạn có chắc không?')">
                                                            <input class="btn btn-danger" type="submit" value="Xóa" />
                                                        </a>
                                                    </td>
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
