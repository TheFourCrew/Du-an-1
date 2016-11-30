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
        <!--        <script>
                    window.CKEDITOR_BASEPATH = '/ckeditor/';
                </script>-->
        <%@include file="includes/headtag.jsp" %>
    </head>
    <body>
        <%@include file="includes/header.jsp" %>
        <section class="container">
            <div class="col-md-9">
                <form class="form-horizontal" action="LienLac" method="post" enctype="multipart/form-data">
                    <div class="form-group">
                        <label class="control-label col-sm-2 col-md-3" for="prod-name">Tên sản phẩm<em>*</em>:</label>
                        <div class="col-md-7">
                            <input type="text" name="prod-name" placeholder="Nhập tên sản phẩm" class="form-control" id="prod-name">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2 col-md-3" for="prod-number">Mã số sản phẩm<em>*</em>:</label>
                        <div class="col-sm-3 col-md-9">
                            <input type="text" name="prod-number" placeholder="Nhập mã sản phẩm" class="form-control" id="prod-number">
                        </div>
                    </div>

                    <div class="form-group ">
                        <label class="control-label col-sm-2 col-md-3" for="prod-describe">Mô tả thông tin<em>*</em>:</label>
                        <div class="col-sm-3 col-md-9">
                            <textarea rows="4" id="prod-describe" cols="20" class="form-control ckeditor" placeholder="Nhập" name="cMessage"></textarea>
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
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2 col-md-3" for="prod-thumbnail">Chọn hình đại diện<em>*</em>:</label>
                        <div class="col-sm-3 col-md-7">
                            <input type="file" name="prod-thumbnail"  class="form-control" id="prod-thumbnail">

                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2 col-md-3" for="prod-images">Chọn hình chi tiết<em>*</em>:</label>
                        <div class="col-sm-3 col-md-7">
                            <input type="file" name="prod-images" class="form-control" id="prod-images" multiple="">
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
