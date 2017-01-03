<%-- 
    Document   : login
    Created on : Nov 30, 2016, 4:16:58 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <%@include file="includes/headtag.jsp" %>
    </head>
    <body>
        <%@include file="includes/header.jsp" %>
        <%            
        %>
        <section class="container">
            <div class="row">
                <div class="col-md-3"></div>
                <div class="col-md-6">
                    <form class="form-horizontal"action="LoginServlet" method="post">

                        <div class="form-group">
                            <label class="control-label col-sm-3" for="email">Tên đăng nhập</label>
                            <div class="col-sm-9">
                                <input type="text" name="email" class="form-control" id="email" placeholder="Nhập tên đăng nhập">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3" for="pwd">Mật khẩu:</label>
                            <div class="col-sm-9"> 
                                <input type="password" name="pw" class="form-control" id="pwd" placeholder="Nhập mật khẩu">
                            </div>
                        </div>
                        <div class="form-group"> 
                            <div class="col-sm-offset-2 col-sm-10">
                                <div class="checkbox">
                                    <label><input type="checkbox" name="remember" value="R"> Ghi nhớ tài khoản</label>
                                </div>
                            </div>
                        </div>
                        <div class="form-group"> 
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-default">Đăng nhập</button>
                                <%                            if (session.getAttribute("errormsg") != null) {
                                %>
                                <div class="text-danger"><%=session.getAttribute("errormsg")%></div>
                                <%
                                    }
                                %>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </section>
        <%@include file="includes/footer.jsp" %>
    </body>
</html>