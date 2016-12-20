<%-- 
    Document   : receiptmanager
    Created on : Dec 16, 2016, 10:35:14 PM
    Author     : MinhNguyen
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.javaweb.model.Receipt"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.javaweb.service.ReceiptServices"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản lý hóa đơn</title>
        <%@include file="include-dashboard/headtag.jsp" %>
    </head>
    <body>
        <div id="wrapper">
            <%@include file="include-dashboard/sidebar.jsp" %>
            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Quản lý sản phẩm</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <div class="row">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    Danh sách sản phẩm
                                </div>
                                <!-- /.panel-heading -->
                                <div class="panel-body">
                                    <form action="DeleteMulitpleReceipt?action=multiple" method="post">
                                        <div class="form-group">
                                            <label>
                                                <select name="tacvu" class="form-control-static">
                                                    <option value="">Tác vụ</option>
                                                    <option value="xoa">Xóa</option>
                                                </select>
                                                <input class="btn btn-danger" type="submit" value="Thực hiện" />
                                            </label>
                                        </div>
                                        <!-- Table -->
                                        <script type="text/javascript">
                                            function check(source) {
                                                checkboxes = document.getElementsByName('id-receipt');
                                                for (var i = 0; i < checkboxes.length; i++) {
                                                    checkboxes[i].checked = source.checked;
                                                }
                                            }
                                        </script>
                                        <%
                                            int pageSize = 10;
                                            int pageNumber = 1;
                                            String url = "receiptmanager.jsp";
                                            ReceiptServices rs = new ReceiptServices();
                                            ArrayList<Receipt> listReceipt = null;

                                            if (request.getParameter("pagenumber") != null) {
                                                session.setAttribute("pagenumber", request.getParameter("pagenumber"));
                                                pageNumber = Integer.parseInt(request.getParameter("pagenumber"));
                                            } else {
                                                session.setAttribute("pagenumber", "1");
                                            }

                                            listReceipt = rs.getAllReceipt(pageSize, pageNumber);

                                            int pageCount = (rs.receiptcount) / pageSize + (rs.receiptcount % pageSize > 0 ? 1 : 0);

                                            String nextPage = (pageCount > pageNumber ? (pageNumber + 1) : pageNumber) + "";
                                            String prevPage = (pageNumber <= 1 ? 1 : pageNumber - 1) + "";

                                        %>
                                        <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                                            <thead>
                                                <tr>
                                                    <th><input type="checkbox" name="delete-receipt" onclick="check(this)" /></th>
                                                    <th>STT</th>
                                                    <th>Tổng tiền</th>
                                                    <th>Ngày tạo</th>
                                                    <th>Tình trạng</th>
                                                    <th class="col-md-2">Hành động</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%                                                    
                                                    DecimalFormat formatter = new DecimalFormat("###,###,###");
//                                                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
                                                    for (int i = 0; i < listReceipt.size(); i++) {
                                                        Receipt rt = listReceipt.get(i);
                                                        double tongTien = rt.getTotalPrice();
                                                        int dem = i + 1;
                                                        if (pageNumber > 1) {
                                                            dem = i + pageSize * (pageNumber - 1) + 1;
                                                        }
                                                %>
                                                <tr>
                                                    <td><input type="checkbox" value="<%=rt.getIdreceipt() %>" name="id-receipt" /></td>
                                                    <td><%=dem%></td>
                                                    <td><%=formatter.format(tongTien)+" VNĐ"%></a></td>
                                                    <td><%=rt.getCreatedDate()%></td>
                                                    <td><%= rt.getStatus()%></td>
                                                    <td>
                                                        <a href="editreceipt.jsp?idpt=<%=rt.getIdreceipt()%>" class="btn btn-info">
                                                            Sửa<!--<input class="btn btn-info" type="submit" value="Sửa" />-->
                                                        </a>
                                                        <a href="DeleteMulitpleReceipt?action=single&idpt=<%=rt.getIdreceipt()%>" class="btn btn-danger" onclick="return confirm('Bạn có chắc không?')">
                                                            Xóa
                                                        </a>
                                                    </td>
                                                </tr>
                                                <%
                                                    }
                                                %>
                                            </tbody>
                                        </table>
                                        <span ></span>
                                        <!-- /.table-responsive -->
                                    </form>
                                    <%
                                        if (pageCount > 1) {
                                    %>
                                    <div class="panel-footer">
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
                                                <li><a aria-label="Next" href="<%=url%>?pagenumber=<%=nextPage%>"><span aria-hidden="true">&raquo;</span></a></li>
                                                    <%
                                                        }
                                                    %>
                                            </ul>
                                        </nav>
                                    </div>
                                    <%
                                        }
                                    %>
                                </div>
                                <!-- /.panel-body -->
                            </div>
                            <!-- /.panel -->
                        </div>
                        <!-- /.col-lg-12 -->
                    </div>
                </div>
            </div><!--End #page-wrapper-->
        </div><!--End #wrapper-->
    </body>
</html>
