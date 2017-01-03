<%-- 
    Document   : editreceipt
    Created on : Jan 1, 2017, 5:05:29 PM
    Author     : MinhNguyen
--%>

<%@page import="com.javaweb.model.ReceiptDetail"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.javaweb.service.ReceiptServices"%>
<%@page import="com.javaweb.model.Receipt"%>
<%@page import="com.javaweb.model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.javaweb.service.ProductServices"%>
<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sửa hóa đơn</title>

        <%@include file="include-dashboard/headtag.jsp" %>
        <script type="text/javascript">
            jQuery.browser = {};
            (function () {
                jQuery.browser.msie = false;
                jQuery.browser.version = 0;
                if (navigator.userAgent.match(/MSIE ([0-9]+)\./)) {
                    jQuery.browser.msie = true;
                    jQuery.browser.version = RegExp.$1;
                }
            })();
        </script>
        <!--<script src="js/jquery-migrate-3.0.0.min.js" type="text/javascript"></script>-->
        <!--<script src="js/jquery-1-3-2.js" type="text/javascript"></script>-->
        <script src="js/tablesorter.js" type="text/javascript"></script>
        <script src="js/tablesorter_filter.js" type="text/javascript"></script>
        <script src="js/jquery.tablesorter.pager.js" type="text/javascript"></script>
    </head>
    <body>
        <div id="wrapper">
            <%@include file="include-dashboard/sidebar.jsp" %>
            <div id="page-wrapper">
                <div class="row">
                    <div class="">
                        <h1 class="page-header">Sửa hóa đơn</h1>
                    </div>
                </div>
                <%
                    Receipt rt = null;
                    ReceiptServices rts = new ReceiptServices();
                    String idRt = request.getParameter("idRT");
                    rt = rts.getReceiptById(idRt);
                %>
                <section class="container">
                    <div class="row">
                        <div class="col-md-8">
                            <form action="EditReceipt" method="post" id="editreceipt" >
                                <input style="display: none;" name="idrt" value="<%=rt.getIdreceipt()%>" />
                                <div class="row">
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <label for="rtnumber">Mã số hóa đơn </label>
                                            <input type="text" name="rtnumber" disabled value="<%=rt.getReceiptNumber()%>" class="form-control" id="rtnumber">
                                        </div>
                                        <div class="col-md-6">
                                            <label for="createrhd">Người tạo</label>
                                            <input type="text" name="createrhd" disabled value="<%=rt.getCreater()%>" class="form-control" id="createrhd">
                                        </div>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <label for="recreateddate">Ngày tạo</label>
                                            <input type="text" value="<%=rt.getCreatedDate()%>" class="form-control" id="recreateddate">
                                        </div>
                                        <div class="col-md-6">
                                            <label for="rtstatus">Trạng thái</label>
                                            <select name="rtstatus" class="form-control">
                                                <%
                                                    String[] trangThai = new String[]{"Đang chờ xử lý", "Hoàn thành", "Hủy hóa đơn"};
                                                    for (int i = 0; i < trangThai.length; i++) {

                                                        if (rt.getStatus().equals(trangThai[i])) {
                                                %>
                                                <option value ="<%=rt.getStatus()%>" selected><%=rt.getStatus()%></option>
                                                <%
                                                } else {
                                                %>
                                                <option value ="<%=trangThai[i]%>"><%=trangThai[i]%></option>
                                                <%
                                                        }
                                                    }
                                                %>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <label for="rtbuyer">Tên Người mua <em>*</em> </label>
                                            <input type="text" name="rtbuyer" value="<%=rt.getBuyer()%>" class="form-control" id="rtbuyer">
                                        </div>
                                        <div class="col-md-6">
                                            <label for="rtemail">Email Người mua <em>*</em></label>
                                            <input type="text" name="rtemail" value="<%=rt.getEmail()%>" class="form-control" id="rtemail">
                                        </div>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <label for="address">Địa chỉ <em>*</em>:</label>
                                            <input type="text" name="rtaddress" value="<%=rt.getAddress()%>" class="form-control" id="address">
                                        </div>
                                        <div class="col-md-6">
                                            <label for="rtphone">SĐT <em>*</em></label>
                                            <input type="text" name="rtphone" value="<%=rt.getPhoneNumber()%>" class="form-control" id="rtphone">
                                        </div>
                                    </div>
                                </div>

                                <hr>
                                <div class="form-group">
                                    <%if (session.getAttribute("trukho") != null) {
                                            if (session.getAttribute("trukho").equals("failed")) {
                                    %>
                                    <div class="alert alert-danger alert-dismissible">
                                        <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                                        <strong>Thất bại!</strong> <%=session.getAttribute("tenpt")%> chỉ còn <strong>${inst}</strong> sản phẩm trong kho.
                                    </div>
                                    <%
                                            }
                                        }
                                        session.removeAttribute("trukho");
                                    %>
                                    <label >Sản phẩm đã mua</label>
                                    <%
                                        ArrayList<ReceiptDetail> aRdtl = null;
                                        aRdtl = rts.getReceiptDetailByIdReceipt(idRt);
                                    %>
                                    <table border="1" class="table table-striped table-bordered table-hover">
                                        <thead>
                                            <tr>
                                                <th>Xóa</th>
                                                <th>STT</th>
                                                <th>Tên sản phẩm</th>
                                                <th>Hình ảnh</th>
                                                <th>Đơn giá x Số lượng</th>
                                                <th>Giá</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <%
                                                DecimalFormat formatter = new DecimalFormat("###,###,###");
                                                double total = 0;
                                                for (int i = 0; i < aRdtl.size(); i++) {
                                                    ReceiptDetail rdl = aRdtl.get(i);
                                                    ProductServices ps = new ProductServices();
                                                    double giaBan = rdl.getUnitPrice();
                                                    Product pt = ps.GetById(rdl.getIdProduct() + "");
                                                    double thanhTien = giaBan * rdl.getQuantity();
                                                    total += thanhTien;
                                                    int soLuongKho = 0;
                                                    if(pt.getProductQuantity()<=0){
                                                        soLuongKho = 1;
                                                    }else{
                                                        soLuongKho = pt.getProductQuantity();
                                                    }
                                            %>
                                            <tr>
                                                <td><input type="checkbox" name="idDel" value="<%=pt.getIdproduct()%>" />
                                                    <input type="hidden" name="SlAdd" value="<%=pt.getIdproduct()%>" />
                                                </td>
                                                <td><%=i + 1%></td>
                                                <td><%=pt.getProductName()%></td>
                                                <td><input type="image" class="img-responsive" width="100px" height="100px" src="uploads/<%=pt.getProductImage()%>" /> </td>
                                                
                                                <td><%=formatter.format(giaBan)%> VNĐ x <input type="number" name="slDel<%=pt.getIdproduct()%>" value="<%=rdl.getQuantity() %>" min="1" max="<%=soLuongKho%>" /></td>
                                                <td><%=formatter.format(thanhTien)%> VNĐ</td>
                                            </tr>
                                            <%
                                                }
                                            %>
                                            <tr>
                                                <td></td>
                                                <td></td>
                                                <td></td>
                                                <td></td>
                                                <td>Tổng tiền</td>
                                                <td><%=formatter.format(total)%> VNĐ</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                                <div class="form-group">
                                    <button type="button" class="btn btn-info" data-toggle="collapse" data-target="#rtaddsp">Thêm sản phẩm</button>
                                    <%
                                        ProductServices ps = new ProductServices();
                                        ArrayList<Product> aPT = null;
                                        aPT = ps.getProductInStock();
                                    %>
                                    <div class="collapse" id="rtaddsp" style="margin-top: 10px;">
                                        <table border="1" id="myTable" class="table table-striped table-bordered table-hover" id="dataTables-example">
                                            <thead>
                                                <tr>
                                                    <th></th>
                                                    <th>Tên sản phẩm</th>
                                                    <th>Giá</th>
                                                    <th>Số lượng</th>
                                                    <th>Hình</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%
                                                    for (int i = 0; i < aPT.size(); i++) {
                                                        Product pt = aPT.get(i);
                                                %>
                                                <tr>
                                                    <td>
                                                        <input type="checkbox" name="idAdd" value="<%=pt.getIdproduct()%>" />
                                                        <input type="hidden" name="priceAdd<%=pt.getIdproduct()%>" value="<%=pt.getPricePerUnit()%>" />
                                                    </td>
                                                    <td><%=pt.getProductName()%></td>
                                                    <td><%=formatter.format(pt.getPricePerUnit())%> VNĐ </td>
                                                    <td><%=pt.getProductQuantity()%></td>
                                                    <td>
                                                        <input type="image" class="img-responsive" src="uploads/<%=pt.getProductImage()%>" width="100px" height="100px" />
                                                    </td>
                                                </tr>
                                                <%
                                                    }
                                                %>
                                            </tbody>
                                        </table>
                                        <div id="pager" class="pager-2 ">
                                            <input type="button" class="first" value="<<" />
                                            <input type="button" class="prev" value="<" />
                                            <input type="text" class="pagedisplay" />
                                            <input type="button" class="next" value=">" />
                                            <input type="button" class="last" value=">>" />

                                            <select class="pagesize">
                                                <option value="2">2</option>
                                                <option value="10" selected="selected" >10</option>
                                                <option value="20">20</option>
                                                <option value="30">30</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                                <%
                                    SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
                                %>
                                <div class="form-group">
                                    <label for="note">Ghi chú</label>
                                    <textarea row="4" cols="20" class="form-control" name="rtnote"> <%=rt.getNote()%></textarea>
                                </div>

                                <div class="form-group">
                                    <button type="submit" class="btn btn-primary">Cập nhật</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </section>
                <script type="text/javascript">
            jQuery(document).ready(function () {
                $("#myTable")
                        .tablesorter({debug: false, widgets: ['zebra'], sortList: [[0, 1]]})
                        .tablesorterPager({container: $(".pager-2"), size: 10})
                        .tablesorterFilter({filterContainer: $("#filter-box"),
                            filterClearContainer: $("#filter-clear-button"),
                            filterColumns: [0],
                            filterCaseSensitive: false});

            });
                </script>
            </div>
        </div>
    </body>

</html>
