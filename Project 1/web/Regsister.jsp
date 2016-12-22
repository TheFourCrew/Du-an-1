<%-- 
    Document   : edituser
    Created on : Dec 2, 2016, 4:03:45 PM
    Author     : Admin
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User</title>
        <%@include file="includes/headtag.jsp" %>
    </head>
    <body>
        <%@include file="includes/header.jsp" %>
        <section class="container">
            <div class="row">
                <form class="form-horizontal" name="fUser" onsubmit="return validateFormUser()" action="RegsisterServlet" method="post" id="fregister">
                    <div class="form-group">
                        <label class="control-label col-sm-2 col-md-3" for="username">Tên Đăng Nhập: </label>
                        <div class="col-md-7">
                            <input type="text" name="username" onkeyup='loadXMLUserName()' class="form-control" id="username">
                            <span id="errUserName"></span>
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="control-label col-md-3" for="password">Mật Khẩu:</label>
                        <div class="col-md-7"> 
                            <input type="password" name="mk"  class="form-control"  id="password">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-md-3" for="idrole_user">Nhập lại mật khẩu:</label>
                        <div class="col-md-7"> 
                            <input type="password" name="repassword"  class="form-control"  id="repassword">
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="control-label col-md-3" for="fullname">Họ tên: </label>
                        <div class="col-md-7"> 
                            <input type="text" name="fullname" class="form-control"  id="fullname">
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="control-label col-md-3" for="dienthoai">Điện thoại: </label>
                        <div class="col-md-7"> 
                            <input type="text" name="dienthoai"  class="form-control"  id="dienthoai">
                        </div>
                    </div>



                    <div class="form-group">
                        <label class="control-label col-md-3" for="address">Địa chỉ:</label>
                        <div class="col-md-7"> 
                            <input type="text" name="address"  class="form-control"  id="address">
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="control-label col-md-3" for="email">Email: </label>
                        <div class="col-md-7">
                            <input type="email" name="email"  class="form-control"  id="email">
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="control-label col-md-3" for="birthday">Ngày sinh:</label>
                        <div class="col-md-7">
                            <input type="date" name="birthday"  class="form-control"  id="birthday">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-md-3">Giới Tính:</label>
                        <div class="col-md-7">
                            <input type="radio" name="gender" value="Nam" checked="checked" />Nam
                            <input type="radio" name="gender" value="Nữ"/>Nữ
                        </div>

                    </div>
                    <div class="form-group">
                        <div class="col-md-2">
                        </div>
                        <div class="col-md-3">
                            <input  type="checkbox" name="dieukhoan" value="Y">Agree condition! 
                        </div>
                    </div>
                    <div class="form-group" >
                        <div class="col-md-2">
                        </div>
                        <button type="submit"  class="btn btn-twitter">Đăng Ký</button>
                    </div>

                </form>
            </div>
        </section>
        <%@include file="includes//footer.jsp" %>
    </body>
</html>
