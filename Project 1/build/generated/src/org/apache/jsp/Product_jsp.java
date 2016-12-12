package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import com.javaweb.model.Product;
import java.util.ArrayList;
import com.javaweb.service.ProductServices;

public final class Product_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/includes/headtag.jsp");
    _jspx_dependants.add("/includes/header.jsp");
    _jspx_dependants.add("/includes/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Product</title>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<!--<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">-->\r\n");
      out.write("<!--<link rel=\"stylesheet\" href=\"http://www.w3schools.com/lib/w3.css\">-->\r\n");
      out.write("\r\n");
      out.write("<!-- Start WOWSlider.com HEAD section -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"engine1/style.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"engine1/jquery.js\"></script>\r\n");
      out.write("<!-- End WOWSlider.com HEAD section -->\r\n");
      out.write("\r\n");
      out.write("<!--<link href=\"css/w3.css\" rel=\"stylesheet\" type=\"text/css\"/>-->\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"css/style-minh.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"css/cssto.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"css/dathang.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.js\" type=\"text/javascript\"></script>  \r\n");
      out.write("<script src=\"js/jquery.validate.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/additional-methods.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/javascript.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"ckeditor/ckeditor.js\" type=\"text/javascript\" ></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<header class=\"container-fluid\">\r\n");
      out.write("    <div class=\"container banner-logo\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("                <a href=\"index.jsp\">\r\n");
      out.write("                    <img class=\"img-responsive\" src=\"#\" alt=\"Logo\"/>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-8\">\r\n");
      out.write("                <center>\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <img class=\"img-responsive\" src=\"https://cdn.adf.ly/images/banners/adfly.728x90.2.gif\" alt=\"Advertisement\"/>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </center>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <nav class=\"navbar navbar-inverse menu-bar\" id=\"nav\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span> \r\n");
      out.write("                    </button>\r\n");
      out.write("                    <a class=\"navbar-brand active menu\" href=\"index.jsp\">\r\n");
      out.write("                        <span class=\"glyphicon glyphicon-home\"></span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav \">\r\n");
      out.write("                        <li><a href=\"#\" class=\"menu\">Introduce</a></li>\r\n");
      out.write("                        <li><a href=\"addproduct.jsp\" class=\"menu\">Thêm sản phẩm</a></li>\r\n");
      out.write("                            ");

                                if (session.getAttribute("tenHo") != null) {

                            
      out.write("\r\n");
      out.write("                        <li><a href=\"managementproduct.jsp\" class=\"menu\">Quản lý sản phẩm</a></li>\r\n");
      out.write("                        <li><a href=\"managementuser.jsp\" class=\"menu\">Quản lý người dùng</a></li>\r\n");
      out.write("                            ");
                                }
                            
      out.write("\r\n");
      out.write("                        <li class=\"dropdown-submenu menu\">\r\n");
      out.write("                            <a class=\"dropdown-toggle menu\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("                                <span class=\"glyphicon glyphicon-usd\"></span> Áo\r\n");
      out.write("                                <span class=\"caret\"></span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu menu\"  role=\"menu\" aria-labelledby=\"dropdownMenu\">\r\n");
      out.write("                                <li><a href=\"#\" class=\"menu\">Áo sơ mi</a></li>\r\n");
      out.write("                                <li><a href=\"#\" class=\"menu\">Áo hoodie</a></li>\r\n");
      out.write("                                <li><a href=\"#\" class=\"menu\">Áo thun</a></li> \r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"contact.jsp\" class=\"menu\">Liên hệ</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                        <li> <hr></li>\r\n");
      out.write("                            ");

                                if (session.getAttribute("email") == null) {
                            
      out.write("\r\n");
      out.write("                        <li><a href=\"Regsister.jsp\">\r\n");
      out.write("                                <span class=\"glyphicon glyphicon-user\"></span> Đăng ký\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"dropdown\">\r\n");
      out.write("                            <a href=\"#myModal\" style=\"outline: none;\" data-toggle=\"modal\"><span class=\"glyphicon glyphicon-log-in\"></span> Đăng nhập</a>\r\n");
      out.write("                            \r\n");
      out.write("                            <div id=\"myModal\" style=\"margin-top: 130px;\" class=\"modal fade\" role=\"dialog\">\r\n");
      out.write("                                <div class=\"modal-dialog\">\r\n");
      out.write("\r\n");
      out.write("                                    <!-- Modal content-->\r\n");
      out.write("                                    <div class=\"modal-content\">\r\n");
      out.write("                                        <div class=\"modal-header\">\r\n");
      out.write("                                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("                                            <h4 class=\"modal-title\" style=\"    margin-left: 246px;\">Đăng nhập</h4>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <form class=\"form-horizontal\"action=\"LoginServlet\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label class=\"control-label col-sm-2\" for=\"email\"> Email:</label>\r\n");
      out.write("                                                <div class=\"col-sm-10\">\r\n");
      out.write("                                                    <input type=\"text\" name=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Enter email\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label class=\"control-label col-sm-2\" for=\"pwd\">Mật khẩu:</label>\r\n");
      out.write("                                                <div class=\"col-sm-10\"> \r\n");
      out.write("                                                    <input type=\"password\" name=\"pw\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter password\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            \r\n");
      out.write("                                            <div class=\"form-group\"> \r\n");
      out.write("                                                <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("                                                    <button type=\"submit\" class=\"btn btn-default\" style=\"margin-left: 150px;\">Đăng nhập</button>\r\n");
      out.write("                                                   \r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                \r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <ul id=\"login-dp\" class=\"dropdown-menu\">\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                ");

                                } else {
                                
      out.write("\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"index.jsp\"><span class=\"glyphicon glyphicon-user\">\r\n");
      out.write("                                            <strong style=\"color: white\">");
      out.print(session.getAttribute("email"));
      out.write(" </strong>\r\n");
      out.write("                                        </span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li><a href=\"logout.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span>Thoát</a></li>\r\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("//            $(function () {\r\n");
      out.write("//                var pgurl = window.location.href.substr(window.location.href\r\n");
      out.write("//                        .lastIndexOf(\"/\") + 1);\r\n");
      out.write("//                $(\"#nav ul li a\").each(function () {\r\n");
      out.write("//                    if ($(this).attr(\"href\") == pgurl || $(this).attr(\"href\") == '')\r\n");
      out.write("//                        $(this).addClass(\"active\");\r\n");
      out.write("//                })\r\n");
      out.write("//            });\r\n");
      out.write("//            $(document).ready(function () {\r\n");
      out.write("//                $('.menu').click(function () {\r\n");
      out.write("//                    $('.menu').removeClass(\"active\");\r\n");
      out.write("//                    $(this).addClass(\"active\");\r\n");
      out.write("//                });\r\n");
      out.write("//            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("        <section class=\"container-fluid\">\r\n");
      out.write("            <div class=\"row \">\r\n");
      out.write("                <!--                <div class=\"col-md-12 col-sm-6 danhmucsp \">\r\n");
      out.write("                \r\n");
      out.write("                                </div>-->\r\n");
      out.write("                <div  class=\"col-md-3 trai col-sm-3 \">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row theohang t\">\r\n");
      out.write("                        <p >Thương hiệu</p>\r\n");
      out.write("                        <div class=\" col-md-6 \">\r\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"checkbox\" name=\"thuonghieu\"> Apple</label><br/>\r\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"checkbox\" name=\"thuonghieu\"> Acer</label><br/>\r\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"checkbox\" name=\"thuonghieu\"> HP</label><br/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\" col-md-6\">\r\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"checkbox\" name=\"thuonghieu\"> Dell</label><br/>\r\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"checkbox\" name=\"thuonghieu\"> Asus</label><br/>\r\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"checkbox\" name=\"thuonghieu\"> Lenovo</label><br/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row theogia\">\r\n");
      out.write("                        <p >Giá bán</p>\r\n");
      out.write("                        <div class=\" col-md-6\">\r\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"radio\" name=\"gia\">Dưới 5 triệu</label><br/>\r\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"radio\" name=\"gia\">Từ 5-10 triệu</label><br/>\r\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"radio\" name=\"gia\">Từ 10-15 triệu</label><br/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\" col-md-6\">\r\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"radio\" name=\"gia\">Từ 15-20 triệu</label><br/>\r\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"radio\" name=\"gia\">Từ 20-30 triệu</label><br/>\r\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"radio\" name=\"gia\">Trên 30 triệu</label><br/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"quangcao row\">\r\n");
      out.write("                        <a href=\"#\"><img style=\"width:300px; height:300px;margin: 0 auto;\" class=\"img-responsive\" src=\"img/tải xuống.jpg\" alt=\"\" /></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"spnoibat row text-center\">\r\n");
      out.write("                        <a href=\"#\"><img style=\"width:240px; height:250px\" class=\"img-responsive\" src=\"img/dell.png\" alt=\"\"/>\r\n");
      out.write("                            <p class=\"spbc\" style=\"color: red;padding-top: 25px\">Sản phẩm bán chạy</p></a>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"spnoibat row text-center\">\r\n");
      out.write("                        <a href=\"#\"><img style=\"width:240px; height:250px\" class=\"img-responsive\" src=\"img/dell.png\" alt=\"\"/>\r\n");
      out.write("                            <p class=\"spbc\" style=\"color: red;padding-top: 25px\">Sản phẩm nổi bật</p></a>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-9 phai col-sm-3 text-center\">\r\n");
      out.write("\r\n");
      out.write("                    <p style=\"    margin-bottom: 32px;font-weight: 600;font-size: 20px;color: #008ae2;\">Máy Tính </p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    ");
                        int pageSize = 9;
                        int pageNumber = 1;
                        String url = "managerproduct.jsp";
                        ProductServices ps = new ProductServices();
                        ArrayList<Product> listProduct = null;

                        if (request.getParameter("pagenumber") != null) {
                            session.setAttribute("pagenumber", request.getParameter("pagenumber"));
                            pageNumber = Integer.parseInt(request.getParameter("pagenumber"));
                        } else {
                            session.setAttribute("pagenumber", "1");
                        }

                        listProduct = ps.getAllProducts(pageSize, pageNumber);

                        int pageCount = (ps.productcount) / pageSize + (ps.productcount % pageSize > 0 ? 1 : 0);

                        String nextPage = (pageCount > pageNumber ? (pageNumber + 1) : pageNumber) + "";
                        String prevPage = (pageNumber <= 1 ? 1 : pageNumber - 1) + "";

                        Product pt = null;
                        DecimalFormat formatter = new DecimalFormat("###,###,###");

                        for (int i = 0; i < listProduct.size(); i++) {
                            pt = listProduct.get(i);
                            double giaBan = pt.getPricePerUnit();
                            double giaGiam = pt.getDiscountPrice();

                    
      out.write("\r\n");
      out.write("                    <div class=\"col-md-4 sp sty\">\r\n");
      out.write("                        <a href=\"ChiTietSanPham.jsp?id=");
      out.print(pt.getIdproduct());
      out.write("\">\r\n");
      out.write("                            <img style=\"width:240px; height:250px;margin:0 auto;\" class=\"img-responsive\" src=\"uploads/");
      out.print(pt.getProductImage());
      out.write("\" alt=\"\"/>\r\n");
      out.write("                            <span style=\"font-weight: 600;font-size: 20px;color: #008ae2;\">");
      out.print(pt.getProductName());
      out.write("</span>\r\n");
      out.write("                            <!--<span style=\"font-weight: 600;font-size: 20px;color: #008ae2;\">14.0 inch</span>-->\r\n");
      out.write("\r\n");
      out.write("                            ");

                                if (giaGiam > 0) {
                            
      out.write("\r\n");
      out.write("                            <p style=\"font-size: 16px; \">\r\n");
      out.write("                                <span style=\"text-decoration: line-through; color: grey;\">");
      out.print(formatter.format(giaBan) + " VNĐ");
      out.write("</span> <i class=\"glyphicon glyphicon-arrow-right\"></i>\r\n");
      out.write("                                <span style=\"color: red;\">");
      out.print(formatter.format(giaGiam) + " VNĐ");
      out.write("</span>\r\n");
      out.write("                            </p>\r\n");
      out.write("                            ");

                            } else {
                            
      out.write("\r\n");
      out.write("                            <p style=\"color: red;font-size: 16px;\">");
      out.print(formatter.format(giaBan) + " VNĐ");
      out.write("</p>\r\n");
      out.write("                            ");

                                }
                            
      out.write("\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <button  type=\"button\" class=\"btn btn-success active center-block\">Thêm Vào Giỏ</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    ");

                        }
                    
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                ");

                    if (pageNumber != 1) {
                
      out.write("\r\n");
      out.write("                    <nav aria-label=\"Page navigation\">\r\n");
      out.write("                        <ul class=\"pagination\">\r\n");
      out.write("                            ");

                                if (pageNumber != 1) {
                            
      out.write("\r\n");
      out.write("                            <li><a aria-label=\"Previous\" href=\"");
      out.print(url);
      out.write("?pagenumber=");
      out.print(prevPage);
      out.write("\"><span aria-hidden=\"true\">&laquo;</span></a></li>\r\n");
      out.write("                                ");

                                    }
                                    for (int j = 1; j <= pageCount; j++) {
                                        if (pageNumber == j) {
                                
      out.write("\r\n");
      out.write("                            <li class=\"active\"><a href=\"");
      out.print(url);
      out.write("?pagenumber=");
      out.print(j);
      out.write('"');
      out.write('>');
      out.print(j);
      out.write("</a></li>\r\n");
      out.write("                                ");

                                } else {
                                
      out.write("\r\n");
      out.write("                            <li><a href=\"");
      out.print(url);
      out.write("?pagenumber=");
      out.print(j);
      out.write('"');
      out.write('>');
      out.print(j);
      out.write("</a></li>\r\n");
      out.write("                                ");

                                        }
                                    }
                                    if (pageNumber != pageCount) {
                                
      out.write("\r\n");
      out.write("                            <li><a aria-label=\"Next\" href=\"");
      out.print(url);
      out.write("?pagenumber=");
      out.print(nextPage);
      out.write("\"><span aria-hidden=\"true\">&ra&raquo;</span></a></li>\r\n");
      out.write("                                ");

                                    }
                                
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                ");

                    }
                
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<footer class=\"container-fluid\">\r\n");
      out.write("    <div class=\"footer\" id=\"footer\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-4  col-md-4 col-sm-4 col-xs-6\">\r\n");
      out.write("                    <h3> Giới thiệu </h3>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li> <a href=\"#\"> Lorem Ipsum </a> </li>\r\n");
      out.write("                        <li> <a href=\"#\"> Lorem Ipsum </a> </li>\r\n");
      out.write("                        <li> <a href=\"#\"> Lorem Ipsum </a> </li>\r\n");
      out.write("                        <li> <a href=\"#\"> Lorem Ipsum </a> </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4  col-md-4 col-sm-4 col-xs-6\">\r\n");
      out.write("                    <h3> Thông tin liên hệ </h3>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li> <a href=\"#\"> Liên kết </a> </li>\r\n");
      out.write("                        <li> <a href=\"#\"> Lorem Ipsum </a> </li>\r\n");
      out.write("                        <li> <a href=\"#\"> Lorem Ipsum </a> </li>\r\n");
      out.write("                        <li> <a href=\"#\"> Lorem Ipsum </a> </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4  col-md-4 col-sm-4 col-xs-6\">\r\n");
      out.write("                    <h3> Liên kết </h3>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li> <a href=\"#\"> Lorem Ipsum </a> </li>\r\n");
      out.write("                        <li> <a href=\"#\"> Lorem Ipsum </a> </li>\r\n");
      out.write("                        <li> <a href=\"#\"> Lorem Ipsum </a> </li>\r\n");
      out.write("                        <li> <a href=\"#\"> Lorem Ipsum </a> </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--<div class=\"col-lg-3  col-md-3 col-sm-6 col-xs-12 \">\r\n");
      out.write("                    <h3> Lorem Ipsum </h3>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <div class=\"input-append newsletter-box text-center\">\r\n");
      out.write("                                <input type=\"text\" class=\"full text-center\" placeholder=\"Email \">\r\n");
      out.write("                                <button class=\"btn  bg-gray\" type=\"button\"> Lorem ipsum <i class=\"fa fa-long-arrow-right\"> </i> </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>-->\r\n");
      out.write("                <ul class=\"social pull-right\">\r\n");
      out.write("                    <li> <a href=\"#\"> <i class=\" fa fa-facebook\">   </i> </a> </li>\r\n");
      out.write("                    <li> <a href=\"#\"> <i class=\"fa fa-twitter\">   </i> </a> </li>\r\n");
      out.write("                    <li> <a href=\"#\"> <i class=\"fa fa-google-plus\">   </i> </a> </li>\r\n");
      out.write("                    <li> <a href=\"#\"> <i class=\"fa fa-pinterest\">   </i> </a> </li>\r\n");
      out.write("                    <li> <a href=\"#\"> <i class=\"fa fa-youtube\">   </i> </a> </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--/.row--> \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"footer-bottom\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <p class=\"pull-left\"> Copyright © 2016. All right reserved. </p>\r\n");
      out.write("            <div class=\"pull-right\">\r\n");
      out.write("                <ul class=\"nav nav-pills payments\">\r\n");
      out.write("                    <li><i class=\"fa fa-cc-visa\"></i></li>\r\n");
      out.write("                    <li><i class=\"fa fa-cc-mastercard\"></i></li>\r\n");
      out.write("                    <li><i class=\"fa fa-cc-amex\"></i></li>\r\n");
      out.write("                    <li><i class=\"fa fa-cc-paypal\"></i></li>\r\n");
      out.write("                </ul> \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
