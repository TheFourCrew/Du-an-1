<%-- 
    Document   : dathang
    Created on : Dec 3, 2016, 3:14:39 PM
    Author     : Computer
--%>

<%@page import="com.javaweb.model.Product"%>
<%@page import="com.javaweb.service.ProductServices"%>
<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="includes/headtag.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body><%
            session.setAttribute("urlcur", request.getServletPath().substring(1));
            session.removeAttribute("urlctsp");
            session.removeAttribute("themgio");
        %>
        <%@include file="includes/header.jsp" %>
        
        <div class="container">
            <%                
                if (session.getAttribute("dshang") != null) {
            %>
            <div class="stepwizard">
                <div class="stepwizard-row setup-panel">
                    <div class="stepwizard-step">
                        <a href="#VerifyEmail-step" type="button" class="btn btn-success btn-circle" disabled="disabled">
                            <span class="glyphicon glyphicon-cloud-upload"></span>
                        </a>
                        <p>Giao Hàng Nhanh Chóng</p>
                    </div>
                    <div class="stepwizard-step">
                        <a href="#ProfileSetup-step" type="button" class="btn btn-primary btn-circle" id="ProfileSetup-step-2">
                            <span class="glyphicon glyphicon-plane"></span>
                        </a>
                        <p>Đam Bảo Chất Lượng   </p>
                    </div>
                    <div class="stepwizard-step">
                        <a href="#Security-Setup-step" type="button"  class="btn btn-success-2 btn-circle"  disabled="disabled" id="Security-Setup-step-3">
                            <span class="glyphicon glyphicon-ok"></span>
                        </a>
                        <p>Uy Tín </p>
                    </div>
                </div>
            </div>

            <div class="row setup-content" id="ProfileSetup-step">
                <center>
                    <%
                        if (session.getAttribute("thanhcong") == null) {
                    %>
                    <div class="col-md-6">
                        
                        <form action="CheckOutServlet" method="post"  role="form" id="dathang" class="form-horizontal">
                            <fieldset>
                                <legend>Thông Tin Đặt Hàng</legend>
                                <p><strong>Chú ý:</strong> Những trường bắt buộc có dấu sao (<em>* </em>)</p>
                                <br/>
                                <div class="form-group">
                                    <label class="col-md-3 control-label" for="username">Họ Và Tên<em>* </em></label>
                                    <div class="col-md-9">
                                        <input maxlength="100" type="text" name="username" class="form-control" placeholder="Nhập họ và tên" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label"  for="email">Email<em>* </em></label>
                                    <div class="col-md-9">
                                        <input  maxlength="100" type="text" name="email" class="form-control" placeholder="Nhập email"  />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-md-3 control-label" for="sdt">Số Điện Thoại<em>* </em></label>
                                    <div class="col-md-9">
                                        <input maxlength="100" type="text" name="phonenumber" class="form-control" placeholder="Nhập số điện thoại" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label" for="diachi">Địa Chỉ<em>* </em></label>
                                    <div class="col-md-9">
                                        <input maxlength="100" type="text" name="address" class="form-control" placeholder="Nhập địa chỉ" />
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label class="col-md-6 control-label" for="thanhpho">Thành phố<em>* </em></label>
                                        <div class="col-md-6" style="padding-left:8px">
                                            <input maxlength="100" type="text" name="city" class="form-control" placeholder="Nhập Thành phố" />
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label class="col-md-6 control-label" for="tinhhuyen">Tỉnh/Huyện</label>
                                        <div class="col-md-6" style="padding:0px">
                                            <input maxlength="100" type="text" name="province" class="form-control" placeholder="Tên tỉnh/huyện" />
                                        </div>
                                    </div>
                                </div>
                                <br/><br/>
                                <div class="form-group">
                                    <label class="col-md-3 control-label" for="note">Ghi chú</label>
                                    <div class="col-md-9">
                                        <textarea name="note" class="form-control" id="note" placeholder="Ghi chú về đơn hàng, ví dụ: lưu ý khi giao hàng." rows="5" cols="20"></textarea>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group pull-right">
                                        <a href="Product.jsp" class="control-label btn btn-default">
                                            Tiếp tục mua sắm
                                        </a>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group pull-right">
                                        <button type="submit" class="btn btn-primary">Xác Nhận Đặt Hàng</button>
                                    </div>
                                </div>

                            </fieldset>
                        </form>
                    </div>
                    <%
                        }else if(session.getAttribute("thanhcong") == "OK"){
                    %>
                    <div class="alert alert-success alert-dismissible">
                        <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                        <strong>Thành công!</strong> <h2>Cảm ơn bạn đã đặt hàng !</h2>.
                    </div>
                    
                    <%
                        session.removeAttribute("themgio");
                        session.removeAttribute("dshang");
                    }
                    %>
                    <div class="col-md-6">
                        <fieldset>
                            <legend>Đơn hàng của bạn</legend>
                            <%
                                if (session.getAttribute("dshang") != null) {
                                    ArrayList<GioHang> itemCart = (ArrayList) session.getAttribute("dshang");
                            %>
                            <table class="table table-bordered table-responsive">
                                <thead>
                                    <tr>
                                        <th>Tên sản phẩm</th>
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
                                            <a href="ChiTietSanPham.jsp?id=<%=pdt.getIdproduct()%>">
                                                <%=pdt.getProductName()%> x <%=soLuong%>
                                            </a>
                                        </td>
                                        <td><%=dcf.format(ketQua) + " VNĐ"%></td>
                                    </tr>
                                    <%
                                        }
                                    %>
                                    <tr>
                                        <td><b>Tổng tiền</b></td>
                                        <td><b><%=dcf.format(total) + " VNĐ"%></b></td>
                                    </tr>
                                </tbody>
                            </table>
                            <%
                                }
                            %>
                        </fieldset>
                    </div>
                </center>
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

        <%@include file="includes/footer.jsp" %>

    </body>
</html>
