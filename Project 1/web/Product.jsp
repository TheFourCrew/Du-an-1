
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.javaweb.model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.javaweb.service.ProductServices"%>
<%-- 
    Document   : Product
    Created on : Nov 22, 2016, 7:34:47 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product</title>
        <%@include file="includes/headtag.jsp" %>

    </head>
    <body>
        <%@include file="includes/header.jsp" %>
        <section class="container-fluid">
            <div class="row ">
<!--                <div class="col-md-12 col-sm-6 danhmucsp ">

                </div>-->
                <div  class="col-md-3 trai col-sm-3 ">

                    <div class="row theohang t">
                        <p >Thương hiệu</p>
                        <div class=" col-md-6 ">
                            <label class="radio-inline"><input type="checkbox" name="thuonghieu"> Apple</label><br/>
                            <label class="radio-inline"><input type="checkbox" name="thuonghieu"> Acer</label><br/>
                            <label class="radio-inline"><input type="checkbox" name="thuonghieu"> HP</label><br/>
                        </div>
                        <div class=" col-md-6">
                            <label class="radio-inline"><input type="checkbox" name="thuonghieu"> Dell</label><br/>
                            <label class="radio-inline"><input type="checkbox" name="thuonghieu"> Asus</label><br/>
                            <label class="radio-inline"><input type="checkbox" name="thuonghieu"> Lenovo</label><br/>
                        </div>
                    </div>
                    <div class="row theogia">
                        <p >Giá bán</p>
                        <div class=" col-md-6">
                            <label class="radio-inline"><input type="radio" name="gia">Dưới 5 triệu</label><br/>
                            <label class="radio-inline"><input type="radio" name="gia">Từ 5-10 triệu</label><br/>
                            <label class="radio-inline"><input type="radio" name="gia">Từ 10-15 triệu</label><br/>
                        </div>
                        <div class=" col-md-6">
                            <label class="radio-inline"><input type="radio" name="gia">Từ 15-20 triệu</label><br/>
                            <label class="radio-inline"><input type="radio" name="gia">Từ 20-30 triệu</label><br/>
                            <label class="radio-inline"><input type="radio" name="gia">Trên 30 triệu</label><br/>
                        </div>
                    </div>
                    <div class="quangcao row">
                        <a href="#"><img style="width:300px; height:300px;margin: 0 auto;" class="img-responsive" src="img/tải xuống.jpg" alt="" /></a>
                    </div>
                    <div class="spnoibat row text-center">
                        <a href="#"><img style="width:240px; height:250px" class="img-responsive" src="img/dell.png" alt=""/>
                            <p class="spbc" style="color: red;padding-top: 25px">Sản phẩm bán chạy</p></a>

                    </div>
                    <div class="spnoibat row text-center">
                        <a href="#"><img style="width:240px; height:250px" class="img-responsive" src="img/dell.png" alt=""/>
                            <p class="spbc" style="color: red;padding-top: 25px">Sản phẩm nổi bật</p></a>

                    </div>
                </div>
                <div class="col-md-9 phai col-sm-3 text-center">
<<<<<<< HEAD
                    <p style="    margin-bottom: 32px;font-weight: 600;font-size: 20px;color: #008ae2;">Máy Tính </p>
                    <%
                    ProductServices ps = new ProductServices();
                    ArrayList<Product> apt = null;
                    apt = ps.getAll();
                    Product pt = null;
                    DecimalFormat formatter = new DecimalFormat("###,###,###");
                    
                    
                    for(int i =0;i<apt.size();i++){
                        pt = apt.get(i);
                        double giaBan = pt.getPricePerUnit();
=======
                    <p>Máy Tính </p>
                    <%                        ProductServices ps = new ProductServices();
                        ArrayList<Product> apt = null;
                        apt = ps.getAll();
                        Product pt = null;
                        DecimalFormat formatter = new DecimalFormat("###,###,###");

                        for (int i = 0; i < apt.size(); i++) {
                            pt = apt.get(i);
                            double giaBan = pt.getPricePerUnit();
                            double giaGiam = pt.getDiscountPrice();
>>>>>>> origin/master
                    %>
                    <div class="col-md-4 sp ">
                        <a href="ChiTietSanPham.jsp?id=<%=pt.getIdproduct()%>">
                            <img style="width:240px; height:250px;" class="img-responsive" src="uploads/<%=pt.getProductImage()%>" alt=""/>
                            <span style="font-weight: 600;font-size: 20px;color: #008ae2;"><%=pt.getProductName()%></span>
                            <!--<span style="font-weight: 600;font-size: 20px;color: #008ae2;">14.0 inch</span>-->
                            <p style="color: black;padding-top: 6px;"> DELL INSPIRON 15-N3543A P40F001 </p>
                            <%
                                if (giaGiam > 0) {
                            %>
                            <p style="font-size: 16px; ">
                                <span style="text-decoration: line-through; color: grey;"><%=formatter.format(giaBan) + " VNĐ"%></span> <i class="glyphicon glyphicon-arrow-right"></i>
                                <span style="color: red;"><%=formatter.format(giaGiam) + " VNĐ"%></span>
                            </p>
                            <%
                            } else {
                            %>
                            <p style="color: red;font-size: 16px;"><%=formatter.format(giaBan) + " VNĐ"%></p>
                            <%
                                }
                            %>
                        </a>
                        <button  type="button" class="btn btn-success active center-block">Thêm Vào Giỏ</button>
                    </div>
                    <%
                        }
                    %>
                </div>


            </div>
        </section>
        <%@include file="includes/footer.jsp" %>
    </body>
</html>