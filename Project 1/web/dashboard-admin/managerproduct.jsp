<%-- 
    Document   : managerproduct
    Created on : Dec 3, 2016, 2:06:29 PM
    Author     : MinhNguyen
--%>

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
                                        ProductServices ps = new ProductServices();
                                        ArrayList<Product> listProduct = null;
                                        listProduct = ps.getAll();
                                    %>
                                    <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                                        <thead>
                                            <tr>
                                                <th><input type="checkbox" name="delete-product" onclick="check(this)" /></th>
                                                <th class="col-md-1">STT</th>
                                                <th>Tên sản phẩm</th>
                                                <th>Loại</th>
                                                <th>Ngày tạo</th>
                                                <th>Hình</th>
                                                <th class="col-md-2">Hành động</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <%
                                                for (int i = 0; i < listProduct.size(); i++) {
                                                    Product product = listProduct.get(i);
                                            %>
                                            <tr>
                                                <th><input type="checkbox" name="id-product" value="ON" /></th>
                                                <td><%= i+1%></td>
                                                <td><%=product.getProductName() %></td>
                                                <td><%=product.getIdproductCategory()%></td>
                                                <td><%=product.getCreatedDate()%></td>
                                                <td><img class="img-thumbnail" src="../uploads/<%=product.getProductImage() %>" alt="<%=product.getProductName() %>"/></td>
                                                <td>
                                                    <a href="editproduct" class="">
                                                        <input class="btn btn-info" type="submit" value="Sửa" />
                                                    </a>
                                                    <a href="deleteproduct" class="">
                                                        <input class="btn btn-danger" type="submit" value="Xóa" />
                                                    </a>
                                                </td>
                                            </tr>
                                            <%
                                            }
                                            %>
                                        </tbody>
                                    </table>
                                    <!-- /.table-responsive -->
                                </div>
                                <!-- /.panel-body -->
                            </div>
                            <!-- /.panel -->
                        </div>
                        <!-- /.col-lg-12 -->
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
