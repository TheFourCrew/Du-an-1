<%-- 
    Document   : addcategory
    Created on : Dec 16, 2016, 7:40:42 PM
    Author     : MinhNguyen
--%>

<%@page import="com.javaweb.service.ProductCategoryServices"%>
<%@page import="com.javaweb.model.ProductCategory"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Modal -->
<div class="modal fade" id="themLoai" role="dialog">
    <div class="modal-dialog">
        <!-- Modal content-->
        <div class="modal-content">
            <form class="form-horizontal" action="AddCategory" method="post" id="addcategory">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Thêm loại sản phẩm</h4>
                </div>
                <div class="modal-body">
                    <!--modal content-->

                    <div class="form-group">
                        <label class="control-label col-sm-2 col-md-3" for="c-name">Tên loại<em>*</em>:</label>
                        <div class="col-sm-3 col-md-7">
                            <input type="text" name="c-name" placeholder="Nhập thẻ" class="form-control" id="c-name">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2 col-md-3" for="prod-tags">Cha mẹ:</label>
                        <div class="col-sm-3 col-md-7">
                            <select name="c-parent" class="form-control">
                                <option value="">Chọn...</option>
                                <%
                                    ArrayList<ProductCategory> aPCy = null;
                                    ProductCategoryServices pcss = new ProductCategoryServices();
                                    aPCy = pcss.getAll();
                                    for (int i = 0; i < aPCy.size(); i++) {
                                        ProductCategory pcy = aPCy.get(i);
                                        if (pcy.getCParent()==null) {
                                %>
                                <option value="<%=pcy.getIdproductCategory()%>" style="font-weight: bold;"><%=pcy.getCategoryName()%></option>
                                <%

                                    ArrayList<ProductCategory> parenty = null;
                                    parenty = pcss.getAllByIdParent(pcy.getIdproductCategory() + "");

                                    for (int j = 0; j < parenty.size(); j++) {
                                %>
                                <option style="font-style: italic; font-size: 14px;">&nbsp;&nbsp;&nbsp;<%=parenty.get(i).getCategoryName()%></option>
                                <%
                                            }
                                        }
                                    }
                                %>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2 col-md-3" for="c-note">Ghi chú:</label>
                        <div class="col-sm-3 col-md-7">
                            <!--<input type="text" name="prod-tags" placeholder="Nhập thẻ" class="form-control" id="prod-tags">-->
                            <textarea rows="4" id="c-note" cols="20" class="form-control" name="c-note"></textarea>
                        </div>
                    </div>
                    <!--                    <div class="form-group">
                                            <div class="col-sm-3 col-md-1">
                                            </div>
                                            <div class="col-sm-3 col-md-7">
                                                <button  type="submit" class="btn btn-info">Thêm</button>
                                                <button  type="reset" class="btn btn-info">Hủy</button>
                                            </div>
                                        </div>-->
                </div>
                <div class="modal-footer">
                    <button type="submit" class="btn btn-info">Thêm</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">Đóng</button>
                </div>
            </form>
        </div>
    </div>
</div>