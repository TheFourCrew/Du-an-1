
<%-- 
    Document   : index
    Created on : Nov 28, 2016, 3:45:16 PM
    Author     : MinhNguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="includes/headtag.jsp" %>
        
    </head>
    <body>
        <%@include file="includes/header.jsp" %>
        <section class="container">
            <div class="row">
                <div class="col-md-6">
                    Slider
                    
                    <div class="dmsanpham">
            <div class="sanpham">
                <a href="#">Tên sản phẩm 1</a>
                <a href="addtocart.jsp?idsanpham=1">Mua hàng</a>                
            </div>
            <div class="sanpham">
                <a href="#">Tên sản phẩm 2</a>
                <a href="addtocart.jsp?idsanpham=2">Mua hàng</a>                
            </div>
            <div class="sanpham">
                <a href="#">Tên sản phẩm 3</a>
                <a href="addtocart.jsp?idsanpham=3">Mua hàng</a>                
            </div>
            <div class="sanpham">
                <a href="#">Tên sản phẩm 4</a>
                <a href="addtocart.jsp?idsanpham=4">Mua hàng</a>                
            </div>
        </div>
                </div>
                <div class="col-md-6">

                </div>
            </div>
            <div class="row">
                <h3>sadsadsads</h3>
                <div class="col-md-3">
                    <img class="img-responsive" src="img/dell.png" alt=""/>
                    <h4>9000đ</h4>
                    <div>
                        
                    </div>
                </div>
                <div class="col-md-3">
                    <img class="img-responsive" src="img/dell.png" alt=""/>
                </div>
                <div class="col-md-3">
                    <img class="img-responsive" src="img/dell.png" alt=""/>
                </div>
                <div class="col-md-3">
                    <img class="img-responsive" src="img/dell.png" alt=""/>
                </div>
            </div>
            
        </section>
        <%@include file="includes/footer.jsp" %>
    </body>
</html>

