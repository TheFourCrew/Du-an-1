
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
        <section class="container-fluid">
            <div class="row ">
                <div class="col-md-12 col-sm-6 danhmucsp ">
                    <div class="col-md-1"><p>Máy Tính</p></div>
                    <div class="col-md-1"><p>Máy Bàn</p></div>
                    <div class="col-md-1"><p>Điện Thoại</p></div>
                    <div class="col-md-1"><p>Phụ kiện</p></div>

                </div>
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
                    <p>Máy Tính </p>
                    <div class="col-md-4 sp ">
                        <a href="#"><img style="width:240px; height:250px;" class="img-responsive" src="img/dell.png" alt=""/>
                            
                            <span style="font-weight: 600;font-size: 20px;color: #008ae2;">Intel core i5</span>
                            <span style="font-weight: 600;font-size: 20px;color: #008ae2;">14.0 inch</span>
                            <p style="color: black;padding-top: 6px;"> DELL INSPIRON 15-N3543A P40F001 </p>
                            <p style="color: red;font-weight: 600;font-size: 20px;">9.999.000 vnd</p>
                            <button  type="button" class="btn btn-success active center-block">Thêm Vào Giỏ</button>
                    </div>

                    <div class="col-md-4 sp">
                        <a href="#"><img style="width:240px; height:250px;" class="img-responsive" src="img/dell.png" alt=""/>
                            
                            <span style="font-weight: 600;font-size: 20px;color: #008ae2;">Intel core i5</span>
                            <span style="font-weight: 600;font-size: 20px;color: #008ae2;">14.0 inch</span>
                            <p style="color: black;padding-top: 6px;"> DELL INSPIRON 15-N3543A P40F001 </p>
                            <p style="color: red;font-weight: 600;font-size: 20px;">9.999.000 vnd</p>
                            <button  type="button" class="btn btn-success active center-block">Thêm Vào Giỏ</button>
                    </div>
                    
                    <div class="col-md-4 sp">
                       <a href="#"><img style="width:240px; height:250px;" class="img-responsive" src="img/dell.png" alt=""/>
                            
                            <span style="font-weight: 600;font-size: 20px;color: #008ae2;">Intel core i5</span>
                            <span style="font-weight: 600;font-size: 20px;color: #008ae2;">14.0 inch</span>
                            <p style="color: black;padding-top: 6px;"> DELL INSPIRON 15-N3543A P40F001 </p>
                            <p style="color: red;font-weight: 600;font-size: 20px;">9.999.000 vnd</p>
                            <button  type="button" class="btn btn-success active center-block">Thêm Vào Giỏ</button>
                    </div>
                    <div class="col-md-4 sp">
                        <a href="#"><img style="width:240px; height:250px;"class="img-responsive" src="img/dell.png" alt=""/>
                            
                            <span style="font-weight: 600;font-size: 20px;color: #008ae2;">Intel core i5</span>
                            <span style="font-weight: 600;font-size: 20px;color: #008ae2;">14.0 inch</span>
                            <p style="color: black;padding-top: 6px;"> DELL INSPIRON 15-N3543A P40F001 </p>
                            <p style="color: red;font-weight: 600;font-size: 20px;">9.999.000 vnd</p>
                            <button  type="button" class="btn btn-success active center-block">Thêm Vào Giỏ</button>
                    </div>
                    <div class="col-md-4 sp">
                        <a href="#"><img style="width:240px; height:250px;" class="img-responsive" src="img/dell.png" alt=""/>
                            
                            <span style="font-weight: 600;font-size: 20px;color: #008ae2;">Intel core i5</span>
                            <span style="font-weight: 600;font-size: 20px;color: #008ae2;">14.0 inch</span>
                            <p style="color: black;padding-top: 6px;"> DELL INSPIRON 15-N3543A P40F001 </p>
                            <p style="color: red;font-weight: 600;font-size: 20px;">9.999.000 vnd</p>
                            <button  type="button" class="btn btn-success active center-block">Thêm Vào Giỏ</button>
                    </div>
                    <div class="col-md-4 sp">
                        <a href="#"><img style="width:240px; height:250px;" class="img-responsive" src="img/dell.png" alt=""/>
                            
                            <span style="font-weight: 600;font-size: 20px;color: #008ae2;">Intel core i5</span>
                            <span style="font-weight: 600;font-size: 20px;color: #008ae2;">14.0 inch</span>
                            <p style="color: black;padding-top: 6px;"> DELL INSPIRON 15-N3543A P40F001 </p>
                            <p style="color: red;font-weight: 600;font-size: 20px;">9.999.000 vnd</p>
                            <button  type="button" class="btn btn-success active center-block">Thêm Vào Giỏ</button>
                    </div>
                    <div class="col-md-4 sp">
                        <a href="#"><img style="width:240px; height:250px;" class="img-responsive" src="img/dell.png" alt=""/>
                            
                            <span style="font-weight: 600;font-size: 20px;color: #008ae2;">Intel core i5</span>
                            <span style="font-weight: 600;font-size: 20px;color: #008ae2;">14.0 inch</span>
                            <p style="color: black;padding-top: 6px;"> DELL INSPIRON 15-N3543A P40F001 </p>
                            <p style="color: red;font-weight: 600;font-size: 20px;">9.999.000 vnd</p>
                            <button  type="button" class="btn btn-success active center-block">Thêm Vào Giỏ</button>
                    </div>
                    <div class="col-md-4 sp">
                        <a href="#"><img style="width:240px; height:250px;" class="img-responsive" src="img/dell.png" alt=""/>
                            
                            <span style="font-weight: 600;font-size: 20px;color: #008ae2;">Intel core i5</span>
                            <span style="font-weight: 600;font-size: 20px;color: #008ae2;">14.0 inch</span>
                            <p style="color: black;padding-top: 6px;"> DELL INSPIRON 15-N3543A P40F001 </p>
                            <p style="color: red;font-weight: 600;font-size: 20px;">9.999.000 vnd</p>
                            <button  type="button" class="btn btn-success active center-block">Thêm Vào Giỏ</button>
                    </div>
                    <div class="col-md-4 sp">
                        <a href="#"><img style="width:240px; height:250px;" class="img-responsive" src="img/dell.png" alt=""/>
                            
                            <span style="font-weight: 600;font-size: 20px;color: #008ae2;">Intel core i5</span>
                            <span style="font-weight: 600;font-size: 20px;color: #008ae2;">14.0 inch</span>
                            <p style="color: black;padding-top: 6px;"> DELL INSPIRON 15-N3543A P40F001 </p>
                            <p style="color: red;font-weight: 600;font-size: 20px;">9.999.000 vnd</p>
                            <button  type="button" class="btn btn-success active center-block">Thêm Vào Giỏ</button>
                    </div>

                </div>


            </div>
        </section>
    </body>
</html>