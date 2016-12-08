<%-- 
    Document   : dathang
    Created on : Dec 3, 2016, 3:14:39 PM
    Author     : Computer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="includes/headtag.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
        <%@include file="includes/header.jsp" %>
        <div class="container">
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
                <div class="col-xs-12">
                    <div class="col-md-12">
                        <br/>
                        <div class="form-horizontal">
                            <form  role="form" id="dathang">
                                <fieldset>

                                    <legend>Thông Tin Đặt Hàng</legend>
                                    <br/>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label"  for="email">Email</label>
                                        <div class="col-sm-9">
                                            <input  maxlength="100" type="text" name="email" required="required" class="form-control" placeholder="Điền email của bạn"  />
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label" for="username">Họ Và Tên</label>
                                        <div class="col-sm-9">
                                            <input maxlength="100" type="text" name="username" required="required" class="form-control" placeholder="Nhập họ và tên của bạn" />
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label" for="sdt">Số Điện Thoại</label>
                                        <div class="col-sm-9">
                                            <input maxlength="100" type="text" name="sdt" required="required" class="form-control" placeholder="Nhập số điện thoại của bạn" />
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label" for="diachi">Địa Chỉ</label>
                                        <div class="col-sm-9">
                                            <input maxlength="100" type="text" name="diachi" required="required" class="form-control" placeholder="Nhập địa chỉ của bạn" />
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="form-group">
                                            <label class="col-sm-6 control-label" for="thanhpho">Thành phố</label>
                                            <div class="col-sm-6" style="padding-left:8px">
                                                <input maxlength="100" type="text" name="thanhpho" required="required" class="form-control" placeholder="Nhập Thành phố bạn đang sống" />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="form-group">
                                            <label class="col-sm-6 control-label" for="tinhhuyen">Tỉnh/Huyện</label>
                                            <div class="col-sm-6" style="padding:0px">
                                                <input maxlength="100" type="text" name="tinhhuyen" required="required" class="form-control" placeholder="Tên tỉnh/huyện" />
                                            </div>
                                        </div>
                                    </div>
                                  
                                </fieldset>
                            </form>
                        </div>

                    </div>
                </div>
            </div>
            <div class="row setup-content" id="Security-Setup-step">
                <div class="col-xs-12">
                    <div class="col-md-12">

                        <button type="submit" class="btn btn-default">Xác Nhận Đặt Hàng</button>
                    </div>
                </div>
            </div>
        </form>
    </div>

    <%@include file="includes/footer.jsp" %>

</body>
</html>
