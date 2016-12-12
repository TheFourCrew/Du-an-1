package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.javaweb.model.Rating;
import java.text.SimpleDateFormat;
import com.javaweb.service.CommentServices;
import com.javaweb.model.Comment;
import java.text.DecimalFormat;
import java.util.ArrayList;
import com.javaweb.model.Product;
import com.javaweb.service.ProductServices;

public final class ChiTietSanPham_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Chi Tiet San Pham</title>\r\n");
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
      out.write("        <style>\r\n");
      out.write("            .mySlides {display:none}\r\n");
      out.write("            .demo {cursor:pointer}\r\n");
      out.write("        </style>\r\n");
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
      out.write("        <section class=\"container\">\r\n");
      out.write("            ");
                String idPT = request.getParameter("id");
                ProductServices ps = new ProductServices();
                Product pt = null;
                pt = ps.GetById(idPT);
                DecimalFormat formatter = new DecimalFormat("###,###,###");
                double giaBan = pt.getPricePerUnit();
                double giaGiam = pt.getDiscountPrice();
                ArrayList<Rating> ratings = null;
                Rating rg = null;
            
      out.write("\r\n");
      out.write("            <div class=\"row hinhvathongso\" style=\"margin:auto 0px;\">\r\n");
      out.write("                <div class=\"col-md-12 col-sm-6 ctsp\">\r\n");
      out.write("                    <div class=\"col-md-6 col-sm-6 hinhctsp text-center\">\r\n");
      out.write("                        <div class=\"w3-content\">\r\n");
      out.write("                            <!-- Start WOWSlider.com BODY section -->\r\n");
      out.write("                            <div id=\"wowslider-container1\">\r\n");
      out.write("                                <div class=\"ws_images\">\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li><img src=\"uploads/");
      out.print(pt.getProductImage());
      out.write("\" alt=\"");
      out.print(pt.getProductImage());
      out.write("\" title=\"");
      out.print(pt.getProductImage());
      out.write("\" id=\"wows1_0\"/></li>\r\n");
      out.write("                                            ");

                                                String chuoi = pt.getDetailImages();
                                                String[] word = chuoi.split("<\\s", 0);
                                                for (int h = 0; h < word.length; h++) {
                                            
      out.write("\r\n");
      out.write("                                        <li><img src=\"uploads/");
      out.print(word[h]);
      out.write("\" alt=\"");
      out.print(word[h]);
      out.write("\" title=\"");
      out.print(word[h]);
      out.write("\" id=\"wows1_");
      out.print(h + 1);
      out.write("\" /></li>\r\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"ws_thumbs\">\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <a href=\"#wows1_0\" title=\"");
      out.print(pt.getProductImage());
      out.write("\"><img src=\"uploads/");
      out.print(pt.getProductImage());
      out.write("\" alt=\"");
      out.print(pt.getProductImage());
      out.write("\" /></a>\r\n");
      out.write("                                            ");

                                                for (int h = 0; h < word.length; h++) {

                                            
      out.write("\r\n");
      out.write("                                        <a href=\"#wows1_");
      out.print(h + 1);
      out.write("\" title=\"");
      out.print(word[h]);
      out.write("\"><img src=\"uploads/");
      out.print(word[h]);
      out.write("\" alt=\"");
      out.print(word[h]);
      out.write("\" /></a>\r\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!--                                <div class=\"ws_script\" style=\"position:absolute;left:-99%\"><a href=\"http://wowslider.net\">jquery carousel</a> by WOWSlider.com v8.7</div>\r\n");
      out.write("                                                                <div class=\"ws_shadow\"></div>-->\r\n");
      out.write("                            </div>\t\r\n");
      out.write("                            <script src=\"engine1/wowslider.js\" type=\"text/javascript\"></script>\r\n");
      out.write("                            <script src=\"engine1/script.js\" type=\"text/javascript\"></script>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 col-sm-6 thongsoctsp\">\r\n");
      out.write("                        <h4 style=\"color:black;font-size: 25px;font-weight: normal\">");
      out.print(pt.getProductName());
      out.write("</h4>\r\n");
      out.write("                        ");

                            DecimalFormat formatPoint = new DecimalFormat("#.#");
                            ratings = ps.GetDataByIdSP(idPT);
                            double point = 0;
                            double sumPoint = 0;
                            for (int i = 0; i < ratings.size(); i++) {
                                rg = ratings.get(i);
                                sumPoint += rg.getRatingPoint();
                            }
                            if (sumPoint != 0) {
                                point = Double.parseDouble(formatPoint.format(sumPoint / ratings.size()));
                            }
                        
      out.write("\r\n");
      out.write("                        <fieldset class=\"rating-result\">\r\n");
      out.write("                            <label title=\"");
      out.print(point);
      out.write("/5 điểm\">\r\n");
      out.write("                                ");

                                    if (point == 5) {
                                
      out.write("\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                ");

                                } else if (point > 4 && point <= 4.9) {
                                
      out.write("\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                <label class = \"icon star-half\"></label>\r\n");
      out.write("                                ");

                                } else if (point == 4) {
                                
      out.write("\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                ");

                                } else if (point > 3 && point <= 3.9) {
                                
      out.write("\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                <label class = \"icon star-half\"></label>\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                ");

                                } else if (point == 3) {
                                
      out.write("\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                ");

                                } else if (point > 2 && point <= 2.9) {
                                
      out.write("\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                <label class = \"icon star-half\"></label>\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                ");

                                } else if (point == 2) {
                                
      out.write("\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                ");

                                } else if (point > 1 && point <= 1.9) {
                                
      out.write("\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                <label class = \"icon star-half\"></label>\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                ");

                                } else if (point == 1) {
                                
      out.write("\r\n");
      out.write("                                <label class = \"icon star-full\"></label>\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                ");

                                } else if (point > 0 && point <= 0.9) {
                                
      out.write("\r\n");
      out.write("                                <label class = \"icon star-half\"></label>\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                ");

                                } else {
                                
      out.write("\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                <label class = \"icon\"></label>\r\n");
      out.write("                                ");

                                    }
                                
      out.write("\r\n");
      out.write("                                <label class=\"sum-rater\">(");
      out.print(ratings.size());
      out.write(" người đánh giá)</label>\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </fieldset>\r\n");
      out.write("                        <p><span style=\"font-size: 15px; word-wrap: break-word;\">MÁY TÍNH XÁCH TAY LENO <span>(");
      out.print(ratings.size());
      out.write(")</span>VO IDEAPAD 310-14ISK,I3-6100U(2.3GHZ/3MB),4GB DDR4,1TB HDD,14\" FHD,2CELL,FREE-DOS,SILVER (BẠC),1YWTY_80SL0069VNasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa</span></p>\r\n");
      out.write("\r\n");
      out.write("                        <p >\r\n");
      out.write("                            ");

                                if (giaGiam > 0) {
                            
      out.write("\r\n");
      out.write("                            <b><span style=\"color:grey; text-decoration: line-through;\">Giá bán: ");
      out.print(formatter.format(giaBan) + " VNĐ");
      out.write("</span></b>\r\n");
      out.write("                            <br/><b><span style=\"color:red;\">Giá giảm: ");
      out.print(formatter.format(giaGiam) + " VNĐ");
      out.write("\r\n");
      out.write("                                    (Đã bao gồm thuế VAT)</span></b>\r\n");
      out.write("                                    ");

                                    } else {
                                    
      out.write("\r\n");
      out.write("                            <b><span style=\"color:red;\">Giá bán: ");
      out.print(formatter.format(giaBan) + " VNĐ");
      out.write("\r\n");
      out.write("                                    (Đã bao gồm thuế VAT)</b>\r\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\r\n");
      out.write("                        </p>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"thongsokythuat\">\r\n");
      out.write("                            <div class=\"thongsokythuattrai\">\r\n");
      out.write("                                <p>MoDel: <span>Dell core i5</span></p>\r\n");
      out.write("                                <p style=\"padding-top: 15px\">CPU: <span>Intel Core i3 SkyLake</span></p>\r\n");
      out.write("                                <p style=\"padding-top: 15px\">Ram: <span>4G</span></p>\r\n");
      out.write("                                <p style=\"padding-top: 15px\">Resolution: <span>1366x768</span></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"thongsokythuatphai\">\r\n");
      out.write("\r\n");
      out.write("                                <p>Size: <span>40x40</span></p>\r\n");
      out.write("                                <p style=\"padding-top: 15px\">Weight: <span>1kg</span></p>\r\n");
      out.write("                                <p style=\"padding-top: 15px\">System: <span>Windows 10</span></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <button style=\"margin-top: 20px;margin-bottom: 10px;\" type=\"button\" class=\"btn btn-success active center-block\">Thêm Vào Giỏ</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\" style=\"background-color: #fff; margin: 10px 0px; border: 1px solid  #e7e7e7;\">\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <ul class=\"nav nav-tabs\">\r\n");
      out.write("                        ");

                            CommentServices cms = new CommentServices();
                            long countCmt = 0;
                            countCmt = cms.getCountComment(idPT);
                        
      out.write("\r\n");
      out.write("                        <li class=\"active\"><a data-toggle=\"tab\" href=\"#description\">Mô Tả</a></li>\r\n");
      out.write("                        <li><a data-toggle=\"tab\" href=\"#cmment\">Bình Luận <span class=\"badge\">");
      out.print(countCmt);
      out.write("</span></a></li>\r\n");
      out.write("                        <li><a data-toggle=\"tab\" href=\"#rating\">Đánh giá <span class=\"badge\">");
      out.print(ratings.size());
      out.write("</span></a></li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"tab-content\">\r\n");
      out.write("                        <div id=\"description\" class=\"tab-pane fade in active\">\r\n");
      out.write("                            <h3>Mô Tả</h3>\r\n");
      out.write("                            <!--                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>-->\r\n");
      out.write("                            ");
      out.print(pt.getDescription());
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div id=\"cmment\" class=\"tab-pane fade\">\r\n");
      out.write("\r\n");
      out.write("                            <h3>Bình Luận</h3>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <form action=\"CommentServlet\" method=\"post\">\r\n");
      out.write("                                    <input type=\"hidden\" name=\"spID\" value=\"");
      out.print(idPT);
      out.write("\" />\r\n");
      out.write("                                    ");

                                        if (session.getAttribute("cmtname") == null || session.getAttribute("fullname") == null) {

                                    
      out.write("\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <div class=\"col-sm-3 col-md-7\">\r\n");
      out.write("                                            <label class=\"control-label\" for=\"c-Name\">Họ tên<em>*</em>:</label>\r\n");
      out.write("                                            <input type=\"text\" name=\"cName\" placeholder=\"Nhập tên người gửi\" class=\"form-control\" id=\"c-Name\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <div class=\"col-sm-3 col-md-7\">\r\n");
      out.write("                                            <label class=\"control-label\" for=\"c-Email\">Email<em>*</em>:</label>\r\n");
      out.write("                                            <input type=\"email\" name=\"cEmail\" placeholder=\"Nhập thư điện tử\" class=\"form-control\" id=\"c-Email\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    ");
                } else {

                                    
      out.write("\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <div class=\"col-sm-3 col-md-7\">\r\n");
      out.write("                                            <label class=\"control-label\" for=\"c-Name\">Họ tên<em>*</em>: ");
      out.print(session.getAttribute("cmtname"));
      out.print(session.getAttribute("fullname"));
      out.write(" </label>\r\n");
      out.write("                                            <a href=\"logout.jsp\"> Logout </a>\r\n");
      out.write("                                            <input type=\"hidden\" name=\"cName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmtname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" id=\"c-Name\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"form-group \">\r\n");
      out.write("                                        <div class=\"col-sm-3 col-md-12 dia-chi\">\r\n");
      out.write("                                            <label class=\"control-label\" for=\"c-Message\">Nội dung<em>*</em>:</label>\r\n");
      out.write("                                            <textarea rows=\"4\" id=\"c-Message\" cols=\"20\" class=\"form-control\" placeholder=\"Nhập nội dung\" name=\"cMessage\"></textarea>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <div class=\"col-sm-3 col-md-7\" style=\"margin-top: 10px;\">\r\n");
      out.write("                                            <button  type=\"submit\" class=\"btn btn-info\">Bình luận</button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <hr>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                ");

                                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:s");
                                    String gioCMT = "";
                                    ArrayList<Comment> cmt = null;
                                    cmt = cms.getAll(idPT);
                                    for (int i = 0; i < cmt.size(); i++) {
                                        Comment cmtc = cmt.get(i);
                                        gioCMT = sdf.format(cmtc.getDateComment());
                                
      out.write("\r\n");
      out.write("                                <div class=\"col-md-12\" style=\"word-break: break-word;\">\r\n");
      out.write("                                    <div class=\"media\">\r\n");
      out.write("                                        <a href=\"#collapse");
      out.print(cmtc.getIdcomment());
      out.write("\" data-toggle=\"collapse\">Reply ");
      out.print(cmtc.getIdcomment());
      out.write("</a>\r\n");
      out.write("                                        <div class=\"media-left\">\r\n");
      out.write("                                            <img class=\"media-object\" src=\"uploads/Photo-Unavailable.jpg\" style=\"width:80px\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"media-body\">\r\n");
      out.write("                                            <h4 class=\"media-heading\">");
      out.print(cmtc.getNameUser());
      out.write(" <small><i> ");
      out.print(gioCMT);
      out.write("</i></small></h4>\r\n");
      out.write("                                            <p>");
      out.print(cmtc.getContent());
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("                                            ");

                                                ArrayList<Comment> cmtRep = null;
                                                cmtRep = cms.getByIdspAndReply(String.valueOf(cmtc.getIdcomment()), idPT);
                                                Comment cmtReps = null;
                                                for (int j = 0; j < cmtRep.size(); j++) {
                                                    cmtReps = cmtRep.get(j);
                                                    gioCMT = sdf.format(cmtReps.getDateComment());
                                            
      out.write("\r\n");
      out.write("                                            <div class=\"media\">\r\n");
      out.write("                                                <!--<a href=\"#collapse1\" data-toggle=\"collapse\">Reply ");
      out.print(cmtc.getIdcomment());
      out.write("</a>-->\r\n");
      out.write("                                                <div class=\"media-left\">\r\n");
      out.write("                                                    <img class=\"media-object\" src=\"uploads/Photo-Unavailable.jpg\" style=\"width:80px\" />\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"media-body\">\r\n");
      out.write("                                                    <h4 class=\"media-heading\">");
      out.print(cmtReps.getNameUser());
      out.write(" <small><i> ");
      out.print(gioCMT);
      out.write("</i></small></h4>\r\n");
      out.write("                                                    <p>");
      out.print(cmtReps.getContent());
      out.write("</p>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            <form action=\"CommentServlet\" method=\"post\">\r\n");
      out.write("                                                <input type=\"hidden\" name=\"idCMT\" value=\"");
      out.print(cmtc.getIdcomment());
      out.write("\" />\r\n");
      out.write("                                                <input type=\"hidden\" name=\"spID\" value=\"");
      out.print(idPT);
      out.write("\" />\r\n");
      out.write("                                                <div id=\"collapse");
      out.print(cmtc.getIdcomment());
      out.write("\" class=\"panel-collapse collapse\">\r\n");
      out.write("                                                    ");

                                                        if (session.getAttribute("cmtname") == null) {

                                                    
      out.write("\r\n");
      out.write("                                                    <div class=\"form-group\">\r\n");
      out.write("                                                        <div class=\"col-sm-3 col-md-7\">\r\n");
      out.write("                                                            <label class=\"control-label\" for=\"c-Name\">Họ tên<em>*</em>:</label>\r\n");
      out.write("                                                            <input type=\"text\" name=\"cName\" placeholder=\"Nhập tên người gửi\" class=\"form-control\" id=\"c-Name\">\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                                    <div class=\"form-group\">\r\n");
      out.write("                                                        <div class=\"col-sm-3 col-md-7\">\r\n");
      out.write("                                                            <label class=\"control-label\" for=\"c-Email\">Email<em>*</em>:</label>\r\n");
      out.write("                                                            <input type=\"email\" name=\"cEmail\" placeholder=\"Nhập thư điện tử\" class=\"form-control\" id=\"c-Email\">\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                                    ");
                } else {
                                                    
      out.write("\r\n");
      out.write("                                                    <div class=\"form-group\">\r\n");
      out.write("                                                        <div class=\"col-sm-3 col-md-7\">\r\n");
      out.write("                                                            <label class=\"control-label\" for=\"c-Name\">Họ tên<em>*</em>: ");
      out.print( session.getAttribute("cmtname"));
      out.write(" </label>\r\n");
      out.write("                                                            <a href=\"logout.jsp\"> Logout </a>\r\n");
      out.write("                                                            <input type=\"hidden\" name=\"cName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmtname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" id=\"c-Name\">\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    ");

                                                        }
                                                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                    <div class=\"form-group \">\r\n");
      out.write("                                                        <div class=\"col-sm-3 col-md-12 dia-chi\">\r\n");
      out.write("                                                            <label class=\"control-label\" for=\"c-Message\">Nội dung<em>*</em>:</label>\r\n");
      out.write("                                                            <textarea rows=\"4\" id=\"c-Message\" cols=\"20\" class=\"form-control\" placeholder=\"Nhập nội dung\" name=\"cMessage\"></textarea>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"form-group\">\r\n");
      out.write("                                                        <div class=\"col-sm-3 col-md-7\" style=\"margin-top: 10px;\">\r\n");
      out.write("                                                            <button  type=\"submit\" class=\"btn btn-info\">Bình luận</button>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <hr>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                ");

                                    }
                                
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div id=\"rating\" class=\"tab-pane fade\">\r\n");
      out.write("                            <h3>Đánh giá<span class=\"badge\"></span></h3>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <form method=\"post\" action=\"RatingServlet\">\r\n");
      out.write("                                    <input type=\"hidden\" name=\"spID\" value=\"");
      out.print(idPT);
      out.write("\" />\r\n");
      out.write("                                    <fieldset class=\"rating\">\r\n");
      out.write("                                        <input type=\"radio\" id=\"star5\" name=\"rating\" value=\"5\" /><label class = \"star full\" for=\"star5\" title=\"Awesome - 5 stars\"></label>\r\n");
      out.write("                                        <input type=\"radio\" id=\"star4\" name=\"rating\" value=\"4\" /><label class = \"star full\" for=\"star4\" title=\"Pretty good - 4 stars\"></label>\r\n");
      out.write("                                        <input type=\"radio\" id=\"star3\" name=\"rating\" value=\"3\" /><label class = \"star full\" for=\"star3\" title=\"Meh - 3 stars\"></label>\r\n");
      out.write("                                        <input type=\"radio\" id=\"star2\" name=\"rating\" value=\"2\" /><label class = \"star full\" for=\"star2\" title=\"Kinda bad - 2 stars\"></label>\r\n");
      out.write("                                        <input type=\"radio\" id=\"star1\" name=\"rating\" value=\"1\" /><label class = \"star full\" for=\"star1\" title=\"Sucks big time - 1 star\"></label>\r\n");
      out.write("                                    </fieldset><br/><br/>\r\n");
      out.write("                                    ");

                                        if (session.getAttribute("cmtname") == null) {

                                    
      out.write("\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <div class=\"col-sm-3 col-md-7\">\r\n");
      out.write("                                            <label class=\"control-label\" for=\"c-Name\">Họ tên<em>*</em>:</label>\r\n");
      out.write("                                            <input type=\"text\" name=\"cName\" placeholder=\"Nhập tên người gửi\" class=\"form-control\" id=\"c-Name\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    ");
                            } else {
                                    
      out.write("\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <div class=\"col-sm-3 col-md-7\">\r\n");
      out.write("                                            <label class=\"control-label\" for=\"c-Name\">Họ tên<em>*</em>: ");
      out.print( session.getAttribute("cmtname"));
      out.write(" </label>\r\n");
      out.write("                                            <a href=\"logout.jsp\"> Logout </a>\r\n");
      out.write("                                            <input type=\"hidden\" name=\"cName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmtname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" id=\"c-Name\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\r\n");
      out.write("                                    <div class=\"form-group \">\r\n");
      out.write("                                        <div class=\"col-sm-3 col-md-12 dia-chi\">\r\n");
      out.write("                                            <label class=\"control-label\" for=\"c-Message\">Nội dung<em>*</em>:</label>\r\n");
      out.write("                                            <textarea rows=\"4\" id=\"c-Message\" cols=\"20\" class=\"form-control\" placeholder=\"Nhập nội dung\" name=\"cMessage\"></textarea>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <div class=\"col-sm-3 col-md-7\" style=\"margin-top: 10px;\">\r\n");
      out.write("                                            <button  type=\"submit\" class=\"btn btn-info\">Đánh giá</button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <hr>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                ");

                                    ratings = ps.GetDataByIdSP(idPT);
                                    String gioDG = "";
                                    for (int i = 0; i < ratings.size(); i++) {
                                        rg = ratings.get(i);
                                        gioDG = sdf.format(rg.getRatingDate());
                                
      out.write("\r\n");
      out.write("                                <div class=\"col-md-12\" style=\"word-break: break-word;\">\r\n");
      out.write("                                    <div class=\"media\">\r\n");
      out.write("                                        <div class=\"media-left\">\r\n");
      out.write("                                            <img class=\"media-object\" src=\"uploads/Photo-Unavailable.jpg\" style=\"width:80px\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"media-body\">\r\n");
      out.write("                                            <fieldset style=\"float: right;\">\r\n");
      out.write("                                                <!--<span class=\"glyphicon glyphicon-star\" style=\"color: red; font-size: 50px;\">&#9734;</span>-->\r\n");
      out.write("                                                <!--<span style=\"font-size:300%;color:yellow;\">&starf;</span>-->\r\n");
      out.write("                                                <!--<span style=\"font-size:500%;color:red;\">&star;</span>-->\r\n");
      out.write("                                                ");

                                                    switch (rg.getRatingPoint()) {
                                                        case 1:
                                                
      out.write("\r\n");
      out.write("                                                <span class=\"sao-check\">&bigstar;<span class=\"sao-uncheck\">&bigstar;&bigstar;&bigstar;&bigstar;</span></span>\r\n");
      out.write("                                                ");
      break;
                                                    case 2:
                                                
      out.write("\r\n");
      out.write("                                                <span class=\"sao-check\">&bigstar;&bigstar;<span class=\"sao-uncheck\">&bigstar;&bigstar;&bigstar;</span></span>\r\n");
      out.write("                                                ");
      break;
                                                    case 3:
                                                
      out.write("\r\n");
      out.write("                                                <span class=\"sao-check\">&bigstar;&bigstar;&bigstar;<span class=\"sao-uncheck\">&bigstar;&bigstar;</span></span>\r\n");
      out.write("                                                ");

                                                        break;
                                                    case 4:
                                                
      out.write("\r\n");
      out.write("                                                <span class=\"sao-check\">&bigstar;&bigstar;&bigstar;&bigstar;<span class=\"sao-uncheck\">&bigstar;</span></span>\r\n");
      out.write("                                                ");

                                                        break;
                                                    default:
                                                
      out.write("\r\n");
      out.write("                                                <span class=\"sao-check\">&bigstar;&bigstar;&bigstar;&bigstar;&bigstar;</span>\r\n");
      out.write("                                                ");

                                                    }
                                                
      out.write("\r\n");
      out.write("                                            </fieldset>\r\n");
      out.write("                                            <h4 class=\"media-heading\">");
      out.print(rg.getNameUser());
      out.write(" <small><i> ");
      out.print(gioDG);
      out.write("</i></small></h4>\r\n");
      out.write("                                            <p>");
      out.print(rg.getReview());
      out.write("</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <hr>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                ");

                                    }
                                
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"baivietlienquanctsp\">\r\n");
      out.write("                        <div class=\"baivietlienquan col-md-12 col-sm-6\">\r\n");
      out.write("                            <center><span class=\"tenbaivietctsp\" style=\"color:#008ac2;font-size: 30px\">Bài viết liên quan</span></center>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <span style=\"font-size: 15px;padding-top: 36px;\" class=\"glyphicon glyphicon-list-alt  \"> Mẹo \"cấpcứu\" bàn phím máy tính bị vô nước</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <span style=\"font-size: 15px;padding-top: 10px;\" class=\"glyphicon glyphicon-list-alt  \"> Laptop màn hình cong đầu tiên trên thế giới giá 4.000 USD</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <span style=\"font-size: 15px;padding-top: 10px;\" class=\"glyphicon glyphicon-list-alt  \"> Máy tính siêu nhỏ chạy trên Windows 10 sắp \"đổ bộ\" </span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <span style=\"font-size: 15px;padding-top: 10px;\" class=\"glyphicon glyphicon-list-alt  \"> Đánh giá laptop ThinkPad X1 Yoga đa năng 14 inch siêu mỏng</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <span style=\"font-size: 15px;padding-top: 10px;\" class=\"glyphicon glyphicon-list-alt  \"> So sánh ASUS Zenbook và Macbook 12 inch </span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <span style=\"font-size: 15px;padding-top: 10px;\" class=\"glyphicon glyphicon-list-alt  \"> Bật mí về chiếc laptop Eve V - đối thủ của Surface Pro</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <span style=\"font-size: 15px;padding-top: 10px;\" class=\"glyphicon glyphicon-list-alt  \"> \"Dì ghẻ\" Ngô Thanh Vân bật mí bộ sưu tập công nghệ </span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <span style=\"font-size: 15px;padding-top: 10px;\" class=\"glyphicon glyphicon-list-alt  \"> Macbook Pro 2016 - siêu phẩm đột phá của Apple</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--</-->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row rowsplienquan \">\r\n");
      out.write("                <center><span class=\"tenbaivietctsp\" style=\"color:#008ac2;font-size: 25px\">Sản phẩm liên quan</span></center>\r\n");
      out.write("                <div class=\"col-md-12 col-sm-6 splienquan\">\r\n");
      out.write("                    ");

                        ArrayList<Product> aPT = null;
                        String idLoai = String.valueOf(pt.getIdproductCategory());
                        aPT = ps.getRalatedProducts(idLoai);
                        Product pct = null;
                        for (int i = 0; i < aPT.size(); i++) {
                            pct = aPT.get(i);
                            if (pct.getIdproduct() != Integer.parseInt(idPT)) {
                    
      out.write("\r\n");
      out.write("                    <div class=\"col-md-3 splienquan1 \">\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                        <center>\r\n");
      out.write("                            <a href=\"ChiTietSanPham.jsp?id=");
      out.print(pct.getIdproduct());
      out.write("\"><img  class=\"img-responsive\" src=\"uploads/");
      out.print(pct.getProductImage());
      out.write("\" alt=\"");
      out.print(pct.getProductName());
      out.write("\"/><br/>\r\n");
      out.write("                                <span style=\"font-size: 20px;color: #008ae2;\">");
      out.print(pct.getProductName());
      out.write("</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </center>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    ");

                            }
                        }
                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
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
      out.write("</html>\r\n");
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
