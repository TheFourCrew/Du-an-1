<%-- 
    Document   : addproduct
    Created on : Nov 30, 2016, 5:58:01 PM
    Author     : MinhNguyen
--%>

<%@page import="com.javaweb.service.ProductCategoryServices"%>
<%@page import="com.javaweb.model.ProductCategory"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thêm sản phẩm </title>
        <%@include file="include-dashboard/headtag.jsp" %>
    </head>
    <body>
        <div id="wrapper">
            <%@include file="include-dashboard/sidebar.jsp" %>
            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Thêm sản phẩm mới</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <section class="container">
                    <div class="col-md-9">
                        <p><strong>Chú ý:</strong> Những trường bắt buộc có dấu sao (<em>* </em>)</p>
                        <form class="form-horizontal" action="AddProduct" name="fProduct" method="post" onsubmit="return validateFormProduct()" enctype="multipart/form-data" id="addproduct">
                            <div class="form-group">
                                <label class="control-label col-sm-2 col-md-3" for="prod-name">Tên sản phẩm<em>*</em>:</label>
                                <div class="col-md-7">
                                    <input type="text" name="prod-name" onkeyup='loadXMLProductName()' placeholder="Nhập tên sản phẩm" class="form-control" id="prod-name">
                                    <span id="errProdName"></span>
                                </div>
                            </div>

                            <div class="form-group ">
                                <label class="control-label col-sm-2 col-md-3" for="prod-describe">Mô tả thông tin<em>*</em>:</label>
                                <div class="col-sm-3 col-md-9">
                                    <textarea rows="4" id="prod-describe" cols="20" class="form-control ckeditor" name="prod-describe"></textarea>
                                </div>
                                <!--<script src="//cdn.ckeditor.com/4.6.0/ull/ckeditor.js"></script>-->
                                <script type="text/javascript">
                                    config = {};
                                    config.language = 'vi';
                                    CKEDITOR.replace('prod-describe', config);
                                </script>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-sm-2 col-md-3" for="prod-price">Giá bán<em>*</em>:</label>
                                <div class="col-sm-3 col-md-7">
                                    <input type="text" name="prod-price" placeholder="Nhập giá" class="form-control" id="prodprice">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-sm-2 col-md-3" for="prod-discount">Giá giảm:</label>
                                <div class="col-sm-3 col-md-7">
                                    <input type="text" name="prod-discount" placeholder="Nhập giá" class="form-control" id="prod-discount">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-sm-2 col-md-3" for="prod-quantity">Số lượng<em>*</em>:</label>
                                <div class="col-sm-3 col-md-7">
                                    <input type="number" name="prod-quantity" placeholder="Nhập số lượng" class="form-control" id="prod-quantity">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-sm-2 col-md-3" for="prod-unit">Đơn vị<em>*</em>:</label>
                                <div class="col-sm-3 col-md-7">
                                    <input type="text" name="prod-unit" placeholder="Nhập đơn vị tính" class="form-control" id="prod-unit">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-sm-2 col-md-3" for="prod-category">Loại sản phẩm<em>*</em>:</label>
                                <div class="col-sm-3 col-md-5">
                                    <select name="loaiSP" class="form-control">
                                        <option value="">Chọn...</option>
                                        <%
                                            ArrayList<ProductCategory> aPC = null;
                                            ProductCategoryServices pcs = new ProductCategoryServices();
                                            aPC = pcs.getAll();
                                            for (int i = 0; i < aPC.size(); i++) {
                                        %>
                                        <option value="<%=aPC.get(i).getIdproductCategory()%>"><%=aPC.get(i).getCategoryName()%></option>
                                        <%
                                            }
                                        %>
                                    </select>
                                </div>
                                <div class="col-sm-3 col-md-3">
                                    <a href="#themLoai" class="btn btn-info" data-toggle="modal">Thêm loại</a>
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-sm-2 col-md-3" for="prod-tags">Thẻ sản phẩm<em>*</em>:</label>
                                <div class="col-sm-3 col-md-7">
                                    <input type="text" name="prod-tags" placeholder="Nhập thẻ" class="form-control" id="prod-tags">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-sm-2 col-md-3" for="prod-model">Model:</label>
                                <div class="col-sm-3 col-md-7">
                                    <input type="text" name="prod-model" placeholder="Nhập model" class="form-control" id="prod-model">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-sm-2 col-md-3" for="prod-cpu">CPU:</label>
                                <div class="col-sm-3 col-md-7">
                                    <input type="text" name="prod-cpu" placeholder="Nhập CPU" class="form-control" id="prod-cpu">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-sm-2 col-md-3" for="prod-ram">RAM:</label>
                                <div class="col-sm-3 col-md-7">
                                    <input type="text" name="prod-ram" placeholder="Nhập bộ nhớ trong" class="form-control" id="prod-ram">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-sm-2 col-md-3" for="prod-resolution">Độ phân giải:</label>
                                <div class="col-sm-3 col-md-7">
                                    <input type="text" name="prod-resolution" placeholder="Nhập độ phân giải" class="form-control" id="prod-resolution">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-sm-2 col-md-3" for="prod-size">Kích thước:</label>
                                <div class="col-sm-3 col-md-7">
                                    <input type="text" name="prod-size" placeholder="Nhập kích thước màn hình" class="form-control" id="prod-size">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-sm-2 col-md-3" for="prod-weight">Trọng lượng:</label>
                                <div class="col-sm-3 col-md-7">
                                    <input type="text" name="prod-weight" placeholder="Nhập trọng lượng" class="form-control" id="prod-weight">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-sm-2 col-md-3" for="prod-os">Hệ điều hành:</label>
                                <div class="col-sm-3 col-md-7">
                                    <input type="text" name="prod-os" placeholder="Nhập hệ điều hành" class="form-control" id="prod-os">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-sm-2 col-md-3" for="prod-thumbnail">Chọn hình đại diện<em>*</em>:</label>
                                <div class="col-sm-3 col-md-7">
                                    <input type="file" name="prod-thumbnail" id="prod-thumbnail" onchange="loadFile(event, 'addpro')">
                                    <img  id="outputaddpro"/>
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-sm-2 col-md-3" for="prod-images">Chọn hình chi tiết<em>*</em>:</label>
                                <div class="col-sm-3 col-md-7">
                                    <input type="file" name="prod-images" id="prod-images" multiple>
                                    <div id="gallery"></div>
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
                        <!--Begin:       Modal thêm loại sản phẩm-->
                        <%@include file="addcategory.jsp" %>
                        <!--Close........-->
                    </div>
                </section>
            </div><!--Đóng page-wrapper-->
        </div><!--Đóng wrapper-->
    </body>
</html>
