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
        <%
            session.setAttribute("urlcur", request.getServletPath().substring(1));
        %>
        <%@include file="includes/header.jsp" %>
        <section class="container-fluid">
            <div class="row ">
                <!--                <div class="col-md-12 col-sm-6 danhmucsp ">
                
                                </div>-->
                <form action="Product.jsp" method="get">
                    <div  class="col-md-3 trai col-sm-3 ">

                        <div class="row theohang t">
                            <p >Thương hiệu</p>
                            <div class=" col-md-6 ">
                                <label class="radio-inline"><input type="radio" value="Apple" name="thuonghieu"> Apple</label><br/>
                                <label class="radio-inline"><input type="radio" value="Acer" name="thuonghieu"> Acer</label><br/>
                                <label class="radio-inline"><input type="radio" value="HPHP" name="thuonghieu"> HP</label><br/>
                            </div>
                            <div class=" col-md-6">
                                <label class="radio-inline"><input type="radio" value="Dell" name="thuonghieu"> Dell</label><br/>
                                <label class="radio-inline"><input type="radio" value="Asus" name="thuonghieu"> Asus</label><br/>
                                <label class="radio-inline"><input type="radio" value="Lenovo" name="thuonghieu"> Lenovo</label><br/>
                            </div>
                        </div>
                        <div class="row theogia">
                            <p >Giá bán</p>
                            <div class=" col-md-6">
                                <label class="radio-inline"><input type="radio" value="1" name="gia">Dưới 5 triệu</label><br/>
                                <label class="radio-inline"><input type="radio" value="2" name="gia">Từ 5-10 triệu</label><br/>
                                <label class="radio-inline"><input type="radio" value="3" name="gia">Từ 10-15 triệu</label><br/>
                            </div>
                            <div class=" col-md-6">
                                <label class="radio-inline"><input type="radio" value="4" name="gia">Từ 15-20 triệu</label><br/>
                                <label class="radio-inline"><input type="radio" value="5" name="gia">Từ 20-30 triệu</label><br/>
                                <label class="radio-inline"><input type="radio" value="6" name="gia">Trên 30 triệu</label><br/>
                            </div>
                            <div class="col-md-12">
                                <button style="    margin-top: 24px;"  type="submit" class="btn btn-info active center-block col-md-12">Tìm</button>
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
                </form> 
                <div class="col-md-9 phai col-sm-3 text-center">

                    <p style="    margin-bottom: 32px;font-weight: 600;font-size: 20px;color: #008ae2;">Máy Tính </p>


                    <%                        int pageSize = 9;
                        int pageNumber = 1;
                        String url = "Product.jsp";
                        ProductServices ps = new ProductServices();
                        ArrayList<Product> listProduct = null;
                        if (request.getParameter("pagenumber") != null) {
                            session.setAttribute("pagenumber", request.getParameter("pagenumber"));
                            pageNumber = Integer.parseInt(request.getParameter("pagenumber"));
                        } else {
                            session.setAttribute("pagenumber", "1");
                        }
                        String[] thuonghieu = request.getParameterValues("thuonghieu");
                        String[] gia = request.getParameterValues("gia");
                        String th = "";
                        String gia1 = "0";
                        String gia2 = "100000000";
                        ProductServices tim = new ProductServices();
                        if (thuonghieu != null || gia != null) {
                            if (thuonghieu != null) {
                                for (int i = 0; i < thuonghieu.length; i++) {
                                    th = thuonghieu[i];
                                }
                            }
                            if (gia != null) {
                                for (int i = 0; i < gia.length; i++) {
                                    gia1 = gia[i];
                                    if (gia1.equals("1")) {
                                        gia1 = "0";
                                        gia2 = "5000001";
                                    } else if (gia1.equals("2")) {
                                        gia1 = "5000001";
                                        gia2 = "10000001";
                                    } else if (gia1.equals("3")) {
                                        gia1 = "10000001";
                                        gia2 = "15000001";
                                    } else if (gia1.equals("4")) {
                                        gia1 = "15000001";
                                        gia2 = "20000001";
                                    } else if (gia1.equals("5")) {
                                        gia1 = "20000001";
                                        gia2 = "30000001";
                                    } else {
                                        gia1 = "30000001";
                                        gia2 = "100000001";
                                    }
                                }
                            }
                            listProduct = tim.searchproduct(th, Double.parseDouble(gia1), Double.parseDouble(gia2));
                        } else {
                            listProduct = ps.getAllProducts(pageSize, pageNumber);
                        }
                        int pageCount = (ps.productcount) / pageSize + (ps.productcount % pageSize > 0 ? 1 : 0);
                        String nextPage = (pageCount > pageNumber ? (pageNumber + 1) : pageNumber) + "";
                        String prevPage = (pageNumber <= 1 ? 1 : pageNumber - 1) + "";
                        Product pt = null;
                        DecimalFormat formatter = new DecimalFormat("###,###,###");
                        for (int i = 0; i < listProduct.size(); i++) {
                            pt = listProduct.get(i);
                            double giaBan = pt.getPricePerUnit();
                            double giaGiam = pt.getDiscountPrice();
                    %>
                    <div class="col-md-4 sp sty">
                        <a href="ChiTietSanPham.jsp?id=<%=pt.getIdproduct()%>">
                            <img style="width:240px; height:250px;" class="img-responsive" src="uploads/<%=pt.getProductImage()%>" alt=""/>
                            <span style="font-weight: 600;font-size: 20px;color: #008ae2;"><%=pt.getProductName()%></span>
                            <!--<span style="font-weight: 600;font-size: 20px;color: #008ae2;">14.0 inch</span>-->

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
                        <%
                            if (pt.getProductQuantity() >= 1) {
                        %>
                        <a href="addtocart.jsp?idsanpham=<%=pt.getIdproduct()%>">
                            <button  type="button" class="btn btn-success active center-block">Thêm Vào Giỏ</button>
                        </a>
                        <%
                        } else {
                        %>
                        <button  type="button" class="btn btn-primary active center-block">Hết Hàng</button>
                        <%
                            }
                        %>
                    </div>
                    <%
                        }
                    %>
                </div>
                <%
                    if (pageNumber != 1) {
                %>
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
                        <li><a aria-label="Next" href="<%=url%>?pagenumber=<%=nextPage%>"><span aria-hidden="true">&ra&raquo;</span></a></li>
                            <%
                                }
                            %>
                    </ul>
                </nav>
                <%
                    }
                %>
            </div>
        </section>
        <%@include file="includes/footer.jsp" %>
    </body>
</html>