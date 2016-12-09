<%-- 
    Document   : editproduct
    Created on : Dec 2, 2016, 3:38:15 PM
    Author     : MinhNguyen
--%>

<%@page import="com.javaweb.service.TagServices"%>
<%@page import="com.javaweb.model.Tags"%>
<%@page import="com.javaweb.model.ProductTags"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.javaweb.service.ProductServices"%>
<%@page import="com.javaweb.model.Product"%>
<%@page import="com.javaweb.model.ProductCategory"%>
<%@page import="com.javaweb.service.ProductCategoryServices"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sửa sản phẩm</title>
        <%@include file="include-dashboard/headtag.jsp" %>
    </head>
    <body>
        <div id="wrapper">
            <%@include file="include-dashboard/sidebar.jsp" %>
            <div id="page-wrapper">
                <div class="row">
                    <div class="">
                        <h1 class="page-header">Sửa sản phẩm</h1>
                    </div>
                </div>
                <%
                    DecimalFormat formatter = new DecimalFormat("#########");
                    Product pt = null;
                    String id = request.getParameter("idpt");
                    ProductServices ps = new ProductServices();
                    pt = ps.GetById(id);
                    double dGiaBan = pt.getPricePerUnit();

                    String kqGiaBan = formatter.format(dGiaBan);
                    String giaGiam = String.valueOf(pt.getDiscountPrice());
                    String hinh = pt.getDetailImages();
                %>
                <section class="container">
                    <div class="col-md-9">
                        <p><strong>Chú ý:</strong> Những trường bắt buộc có dấu sao (<em>* </em>)</p>
                        <form class="form-horizontal" action="EditProductServlet" method="post" enctype="multipart/form-data" >
                            <input type="hidden" name="idPT" value="<%=pt.getIdproduct()%>">
                            <div class="form-group">
                                <label class="control-label col-sm-2 col-md-3" for="prod-name">Tên sản phẩm<em>*</em>:</label>
                                <div class="col-md-7">
                                    <input type="text" name="prod-name" value="<%=pt.getProductName()%>" class="form-control" id="prod-name">
                                </div>
                            </div>

                            <!--                    <div class="form-group">
                                                    <label class="control-label col-sm-2 col-md-3" for="prod-number">Mã số sản phẩm<em>*</em>:</label>
                                                    <div class="col-sm-3 col-md-9">
                                                        <input type="text" name="prod-number" placeholder="Nhập mã sản phẩm" class="form-control" id="prod-number">
                                                    </div>
                                                </div>-->

                            <div class="form-group ">
                                <label class="control-label col-sm-2 col-md-3" for="prod-describe">Mô tả thông tin<em>*</em>:</label>
                                <div class="col-sm-3 col-md-9">
                                    <textarea rows="4" id="prod-describe" cols="20" class="form-control ckeditor" name="prod-describe"><%=pt.getDescription()%></textarea>
                                </div>
                                <!--<script src="//cdn.ckeditor.com/4.6.0/ull/ckeditor.js"></script>-->
                                <script type="text/javascript">
                                    config = {};
                                    config.language = 'vi';
                                    CKEDITOR.replace('prod-describe', config);
                                </script>
                            </div>

                            <div class="form-group ">
                                <label class="control-label col-sm-2 col-md-3" for="prod-price">Giá bán<em>*</em>:</label>
                                <div class="col-sm-3 col-md-7">
                                    <input type="text" name="prod-price" value="<%=kqGiaBan%>" class="form-control" id="prodprice">
                                    <!--<span class="input-group-addon">VNĐ</span>-->
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-sm-2 col-md-3" for="prod-discount">Giá giảm:</label>
                                <div class="col-sm-3 col-md-7">
                                    <input type="text" name="prod-discount" value="<%=giaGiam.substring(0, giaGiam.indexOf("."))%>" class="form-control" id="prod-discount">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-sm-2 col-md-3" for="prod-quantity">Số lượng<em>*</em>:</label>
                                <div class="col-sm-3 col-md-7">
                                    <input type="number" name="prod-quantity" value="<%=pt.getProductQuantity()%>" class="form-control" id="prod-quantity">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-sm-2 col-md-3" for="prod-unit">Đơn vị<em>*</em>:</label>
                                <div class="col-sm-3 col-md-7">
                                    <input type="text" name="prod-unit" value="<%=pt.getUnit()%>" class="form-control" id="prod-unit">
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
//                                            String idpct = pt.getIdproductCategory();

                                            aPC = pcs.getAll();
                                            for (int i = 0; i < aPC.size(); i++) {
                                                if (pt.getIdproductCategory() == aPC.get(i).getIdproductCategory()) {
//                                                    pcs.getbyid(id)
                                        %>
                                        <option value="<%=aPC.get(i).getIdproductCategory()%>" selected><%=aPC.get(i).getCategoryName()%></option>
                                        <%
                                        } else {

                                        %>
                                        <option value="<%=aPC.get(i).getIdproductCategory()%>"><%=aPC.get(i).getCategoryName()%></option>
                                        <%
                                                }
                                            }
                                        %>
                                    </select>
                                </div>
                            </div>
                            <%
                                TagServices ts = new TagServices();
                                ArrayList<ProductTags> prodTags = null;
                                prodTags = ts.GetProductTagsById(id);
                                ProductTags theCTSP = null;
                                Tags tag = null;
                                String theTag = "";
                                for (int i = 0; i < prodTags.size(); i++) {
                                    theCTSP = prodTags.get(i);

                                    tag = ts.GetByTagsId(String.valueOf(theCTSP.getIdTag()));
                                    theTag += tag.getTagName() + ", ";
                                }
                            %>
                            <div class="form-group">
                                <label class="control-label col-sm-2 col-md-3" for="prod-tags">Thẻ sản phẩm<em>*</em>:</label>
                                <div class="col-sm-3 col-md-7">
                                    <input type="text" name="prod-tags" value="<%=theTag%>" class="form-control" id="prod-tags">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-sm-2 col-md-3" for="prod-thumbnail">Chọn hình đại diện<em>*</em>:</label>
                                <div class="col-sm-3 col-md-7">
                                    <input type="file" name="prod-thumbnail" id="prod-thumbnail" onchange="loadFile(event, 'addpro')">
                                    <img  id="outputaddpro" class="img-responsive" src="uploads/<%=pt.getProductImage()%>" heigh="100px"/>
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-sm-2 col-md-3" for="prod-images">Chọn hình chi tiết<em>*</em>:</label>
                                <div class="col-sm-3 col-md-7">
                                    <input type="file" name="prod-images" id="prod-images" multiple>
                                    <div id="gallery">
                                        <%

                                            String chuoi = pt.getDetailImages();

                                            String[] word = chuoi.split("<\\s", 0);
                                            for (int h = 0; h < word.length; h++) {
                                        %>
                                        <img src="uploads/<%=word[h]%>" class="img-thumbnail" style="height: 100px;"/>
                                        <%
                                            }
                                        %>
                                    </div>
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
                    </div>
                </section>
            </div><!--Đóng page-wrapper-->
        </div><!--Đóng wrapper-->
    </body>
</html>
