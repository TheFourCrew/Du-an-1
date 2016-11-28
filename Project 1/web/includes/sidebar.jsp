<%-- 
    Document   : sidebar
    Created on : Nov 20, 2016, 1:41:47 PM
    Author     : Computer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="collapse navbar-collapse navbar-ex1-collapse">
    <ul class="nav navbar-nav side-nav">
        <li class="active">
            <a href="index-dashbord.jsp"><i class="fa fa-fw fa-dashboard"></i> Bảng Điều Khiển</a>
        </li>
        <li>
            <a href="charts.jsp"><i class="fa fa-fw fa-bar-chart-o"></i> Biểu Đồ</a>
        </li>
        <li >
            <a href="tables.html"><i class="fa fa-fw fa-table"></i> Bảng</a>
        </li>
        <li >
            <a href="forms.jsp"><i class="fa fa-fw fa-edit"></i> Danh Sách Biểu Mẫu</a>
        </li>
        <li >
            <a href="javascript:;" data-toggle="collapse" data-target="#baiviet"><i class="glyphicon glyphicon-pencil"></i>  Bài Viết <i class="fa fa-fw fa-caret-down"></i></a>
          
            <ul id="baiviet" class="collapse "  style="display: block" >
                <li class="active">
                    <a href="#">Tất cả bài viết</a>
                </li>
                <li>
                    <a href="#">Thêm bài viết</a>
                </li>

            </ul>
        </li>
        <li>
            <a href="javascript:;" data-toggle="collapse" data-target="#sanpham"><i class="glyphicon glyphicon-shopping-cart"></i>  Sản Phẩm <i class="fa fa-fw fa-caret-down"></i></a>
            <ul id="sanpham" class="collapse" style="display: block;" >
                <li class="active">
                    <a href="editproduct.jsp">Thêm sản phẩm</a>
                </li>

                <li>
                    <a href="#">Danh mục sản phẩm</a>
                </li>
            </ul>
        </li>
        <li>
            <a href="javascript:;" data-toggle="collapse" data-target="#quanlytv"><i  class="glyphicon glyphicon-user "></i>  Thành Viên <i class="fa fa-fw fa-caret-down "></i></a>
            <ul id="quanlytv" class="collapse" style="display: block;">
                <li>
                    <a href="edituser.jsp">Thêm thành viên </a>
                </li>

            </ul>
        </li>
        <li>
            <a href="javascript:;" data-toggle="collapse" data-target="#quanlydonhang"><i class="glyphicon glyphicon-calendar"></i>  Đơn Hàng <i class="fa fa-fw fa-caret-down"></i></a>
            <ul id="quanlydonhang" class="collapse" style="display: block;">
                <li>
                    <a href="#">Đang chờ xử lý </a>
                </li>
                <li>
                    <a href="#">Tất cả đơn hàng</a>
                </li>
            </ul>
        </li>
        <li>
            <a href="javascript:;" data-toggle="collapse" data-target="#quanlybinhluan"><i class="glyphicon glyphicon-comment"></i>  Bình Luận <i class="fa fa-fw fa-caret-down"></i></a>
            <ul id="quanlybinhluan" class="collapse" style="display: block;">
                <li>
                    <a href="comment.jsp">Đang chờ </a>
                </li>
                <li>
                    <a href="#">Đã được phê duyệt</a>
                </li>
            </ul>
        </li>
        <li>
            <a href="blank-page.html"><i class="fa fa-fw fa-file"></i> ....</a>
        </li>
        
    </ul>
</div>
<script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Morris Charts JavaScript -->
 
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/sb-admin.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="js/plugins/morris/raphael.min.js"></script>

    
    
