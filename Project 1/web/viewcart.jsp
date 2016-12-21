<%-- 
    Document   : viewcart
    Created on : Dec 14, 2016, 10:38:53 AM
    Author     : MinhNguyen
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="com.javaweb.model.Product"%>
<%@page import="com.javaweb.service.ProductServices"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Giỏ hàng</title>
        <%@include file="includes/headtag.jsp" %>
    </head>
    <body>
        <%
            session.setAttribute("urlcur", request.getServletPath().substring(1));
            session.removeAttribute("urlctsp");
        %>
        <%@include file="includes/header.jsp" %>
        <section class="container">
            <div class="row">
                <%                    session.setAttribute("urlcur", request.getServletPath().substring(1));
                    session.removeAttribute("urlctsp");
                    if (session.getAttribute("dshang") != null) {
                        ArrayList<GioHang> itemCart = (ArrayList) session.getAttribute("dshang");
                %>
                <form action="SaveServlet" method="post">
                    <table class="table table-bordered table-responsive">
                        <thead>
                            <tr>
                                <th>Xóa</th>
                                <th>Tên sản phẩm</th>
                                <th>Số lượng</th>
                                <th>Đơn giá</th>
                                <th>Hình</th>
                                <th>Thành tiền</th>
                            </tr>
                        </thead>

                        <tbody>
                            <%
                                double total = 0;
                                DecimalFormat dcf = new DecimalFormat("###,###,###");
                                ProductServices pss = new ProductServices();
                                Product pdt = null;
                                for (int i = 0; i < itemCart.size(); i++) {
                                    GioHang item = itemCart.get(i);
                                    pdt = pss.GetById(item.getMaSP());
                                    int soLuong = Integer.parseInt(item.getSoLuong());
                                    double donGia = pdt.getPricePerUnit();
                                    double ketQua = GioHang.TinhTongTien(soLuong, donGia);
                                    total += ketQua;
                            %>
                            <tr>
                                <td>
                                    <div class="x-btn">
                                        <center>
                                            <a href="<%=session.getAttribute("urlcur")%>?removeidsp=<%=item.getMaSP()%>">X</a>
                                        </center>
                                    </div>
                                </td>
                                <td><%=pdt.getProductName()%></td>
                                <td><input type="number" name="sl<%=item.getMaSP()%>" value="<%=soLuong%>" min="<%=item.getSoLuong()%>" max="<%=pdt.getProductQuantity()%>" /> 
                                    <input type="submit" class="btn btn-default" value="Cập nhật" name="update" /> 
                                </td>
                                <td><%=dcf.format(donGia) + " VNĐ"%></td>
                                <td><img src="uploads/<%=pdt.getProductImage()%>" class="img-responsive" width="80px" height="80px"/></td>
                                <td><%=dcf.format(ketQua) + " VNĐ"%></td>
                            </tr>

                            <%
                                }
                            %>
                        </tbody>
                    </table>
                </form>
                <div class="row">
                    <div class=" col-md-4">
                        <div class="panel panel-info">
                            <div class="panel-heading"><h4>Tổng giỏ hàng</h4></div>
                            <div class="panel-body">
                                <table class="table table-responsive">
                                    <!--                    <thead>
                                                            <tr>
                                                                <th></th>
                                                                <th></th>
                                                            </tr>
                                                        </thead>-->
                                    <tbody>
                                        <tr>
                                            <td>Tổng tiền: </td>
                                            <td><%=dcf.format(total) + " VNĐ"%></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                            <div class="panel-footer">
                                <center>
                                    <a href="checkout.jsp">
                                        <span  class="btn btn-info" >Sẵn sàng thanh toán</span>
                                    </a>
                                </center>
                            </div>
                        </div>
                    </div>
                    <%
                    } else {
                    %>
                    <h3>Chưa có sản phẩm trong giỏ</h3>
                    <a href="Product.jsp" class="btn btn-default">Quay lại cửa hàng</a>
                    <%
                        }
                    %>
                </div>
            </div>
        </section>
        <%@include file="includes/footer.jsp" %>
    </body>
</html>
