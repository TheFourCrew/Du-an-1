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
        <title>JSP Page</title>
        <!--        <script>
                    window.CKEDITOR_BASEPATH = '/ckeditor/';
                </script>-->
        <%@include file="includes/headtag.jsp" %>
    </head>
    <body>
        <%@include file="includes/header.jsp" %>
        <section class="container">
            <div class="col-md-9">
<<<<<<< HEAD
                <form class="form-horizontal" action="AddProduct" method="post" enctype="multipart/form-data" id="addproduct">
=======
                <form class="form-horizontal" action="AddProduct" method="post" enctype="multipart/form-data">
>>>>>>> origin/master
                    <div class="form-group">
                        <label class="control-label col-sm-2 col-md-3" for="prod-name">Tên sản phẩm<em>*</em>:</label>
                        <div class="col-md-7">
                            <input type="text" name="prod-name" placeholder="Nhập tên sản phẩm" class="form-control" id="prod-name">
                        </div>
                    </div>

<<<<<<< HEAD
<!--                    <div class="form-group">
=======
                    <div class="form-group">
>>>>>>> origin/master
                        <label class="control-label col-sm-2 col-md-3" for="prod-number">Mã số sản phẩm<em>*</em>:</label>
                        <div class="col-sm-3 col-md-9">
                            <input type="text" name="prod-number" placeholder="Nhập mã sản phẩm" class="form-control" id="prod-number">
                        </div>
<<<<<<< HEAD
                    </div>-->
=======
                    </div>
>>>>>>> origin/master

                    <div class="form-group ">
                        <label class="control-label col-sm-2 col-md-3" for="prod-describe">Mô tả thông tin<em>*</em>:</label>
                        <div class="col-sm-3 col-md-9">
                            <textarea rows="4" id="prod-describe" cols="20" class="form-control ckeditor" placeholder="Nhập" name="prod-describe"></textarea>
                        </div>
<<<<<<< HEAD
=======

>>>>>>> origin/master
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
                            <input type="text" name="prod-price" placeholder="Nhập giá" class="form-control" id="prod-price">
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
                        <div class="col-sm-3 col-md-7">
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
                        <div class="col-sm-3 col-md-7">
                            <button  type="submit" class="btn btn-info">Thêm</button>
                            <button  type="reset" class="btn btn-info">Hủy</button>
                        </div>
                    </div>
                </form>
            </div>
        </section>
        <%@include file="includes/footer.jsp" %>
    </body>
</html>