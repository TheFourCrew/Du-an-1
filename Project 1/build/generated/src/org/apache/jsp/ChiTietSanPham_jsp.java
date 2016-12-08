package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
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
      out.write("<link href=\"css/w3.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
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
      out.write("<script src=\"engine1/wowslider.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"engine1/script.js\" type=\"text/javascript\"></script>");
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
      out.write("                            <a href=\"login.jsp\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                                <span class=\"glyphicon glyphicon-log-in\"></span> Đăng nhập\r\n");
      out.write("                                <span class=\"caret\"></span>\r\n");
      out.write("                            </a>\r\n");
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
                String id = request.getParameter("id");
                ProductServices ps = new ProductServices();
                Product pt = null;
                pt = ps.GetById(id);
                DecimalFormat formatter = new DecimalFormat("###,###,###");
                double giaBan = pt.getPricePerUnit();
            
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12 col-sm-6 ctsp\">\r\n");
      out.write("                    <div class=\"col-md-6 col-sm-6 hinhctsp text-center\">\r\n");
      out.write("                        <div class=\"w3-content\" style=\"max-width:300px\">\r\n");
      out.write("                            <!-- Start WOWSlider.com BODY section -->\r\n");
      out.write("                            <div id=\"wowslider-container1\">\r\n");
      out.write("                                <div class=\"ws_images\"><ul>\r\n");
      out.write("                                        <li><img src=\"data1/images/chrysanthemum.jpg\" alt=\"Chrysanthemum\" title=\"Chrysanthemum\" id=\"wows1_0\"/></li>\r\n");
      out.write("                                        <li><img src=\"data1/images/desert.jpg\" alt=\"Desert\" title=\"Desert\" id=\"wows1_1\"/></li>\r\n");
      out.write("                                        <li><img src=\"data1/images/hydrangeas.jpg\" alt=\"Hydrangeas\" title=\"Hydrangeas\" id=\"wows1_2\"/></li>\r\n");
      out.write("                                        <li><img src=\"data1/images/jellyfish.jpg\" alt=\"Jellyfish\" title=\"Jellyfish\" id=\"wows1_3\"/></li>\r\n");
      out.write("                                        <li><img src=\"data1/images/koala.jpg\" alt=\"Koala\" title=\"Koala\" id=\"wows1_4\"/></li>\r\n");
      out.write("                                        <li><img src=\"data1/images/lighthouse.jpg\" alt=\"Lighthouse\" title=\"Lighthouse\" id=\"wows1_5\"/></li>\r\n");
      out.write("                                        <li><a href=\"http://wowslider.com/vi\"><img src=\"data1/images/penguins.jpg\" alt=\"bootstrap slider\" title=\"Penguins\" id=\"wows1_6\"/></a></li>\r\n");
      out.write("                                        <li><img src=\"data1/images/tulips.jpg\" alt=\"Tulips\" title=\"Tulips\" id=\"wows1_7\"/></li>\r\n");
      out.write("                                    </ul></div>\r\n");
      out.write("                                <div class=\"ws_thumbs\">\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <a href=\"#wows1_0\" title=\"Chrysanthemum\"><img src=\"data1/tooltips/chrysanthemum.jpg\" alt=\"\" /></a>\r\n");
      out.write("                                        <a href=\"#wows1_1\" title=\"Desert\"><img src=\"data1/tooltips/desert.jpg\" alt=\"\" /></a>\r\n");
      out.write("                                        <a href=\"#wows1_2\" title=\"Hydrangeas\"><img src=\"data1/tooltips/hydrangeas.jpg\" alt=\"\" /></a>\r\n");
      out.write("                                        <a href=\"#wows1_3\" title=\"Jellyfish\"><img src=\"data1/tooltips/jellyfish.jpg\" alt=\"\" /></a>\r\n");
      out.write("                                        <a href=\"#wows1_4\" title=\"Koala\"><img src=\"data1/tooltips/koala.jpg\" alt=\"\" /></a>\r\n");
      out.write("                                        <a href=\"#wows1_5\" title=\"Lighthouse\"><img src=\"data1/tooltips/lighthouse.jpg\" alt=\"\" /></a>\r\n");
      out.write("                                        <a href=\"#wows1_6\" title=\"Penguins\"><img src=\"data1/tooltips/penguins.jpg\" alt=\"\" /></a>\r\n");
      out.write("                                        <a href=\"#wows1_7\" title=\"Tulips\"><img src=\"data1/tooltips/tulips.jpg\" alt=\"\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"ws_script\" style=\"position:absolute;left:-99%\"><a href=\"http://wowslider.net\">jquery carousel</a> by WOWSlider.com v8.7</div>\r\n");
      out.write("                                <div class=\"ws_shadow\"></div>\r\n");
      out.write("                            </div>\t\r\n");
      out.write("                            <!-- End WOWSlider.com BODY section -->\r\n");
      out.write("                            <img class=\"mySlides\" src=\"uploads/");
      out.print(pt.getProductImage());
      out.write("\" style=\"width:300px;height: 300px; display: block\">\r\n");
      out.write("                            ");


                                String chuoi = pt.getDetailImages();

                                String[] word = chuoi.split("<\\s", 0);
                                for (int h = 0; h < word.length; h++) {
                                    //                                    System.out.println(word[h]);
                            
      out.write("\r\n");
      out.write("                            <img class=\"mySlides img-responsive\" src=\"uploads/");
      out.print(word[h]);
      out.write("\" style=\"width:300px;height: 300px;\">\r\n");
      out.write("                            ");

                                }
                            
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"w3-row-padding w3-section\">\r\n");
      out.write("                                <div class=\"w3-col s4\">\r\n");
      out.write("                                    <img class=\"demo w3-opacity w3-hover-opacity-off\" src=\"uploads/");
      out.print(pt.getProductImage());
      out.write("\" style=\"width:100%\" onclick=\"currentDiv(1)\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                ");

                                for (int h = 0; h < word.length; h++) {
                                    
                                
      out.write("\r\n");
      out.write("                                <div class=\"w3-col s4\">\r\n");
      out.write("                                    <img class=\"demo w3-opacity w3-hover-opacity-off\" src=\"uploads/");
      out.print(word[h] );
      out.write("\" style=\"width:100%\" onclick=\"currentDiv(");
      out.print(h+2);
      out.write(")\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                ");

                                }
                                
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 col-sm-6 thongsoctsp\">\r\n");
      out.write("                        <h4 style=\"color:black;font-size: 25px;font-weight: normal\">");
      out.print(pt.getProductName());
      out.write("</h4>\r\n");
      out.write("                        <h5 style=\"font-size: 15px;\">MÁY TÍNH XÁCH TAY LENOVO IDEAPAD 310-14ISK,I3-6100U(2.3GHZ/3MB),4GB DDR4,1TB HDD,14\" FHD,2CELL,FREE-DOS,SILVER (BẠC),1YWTY_80SL0069VN</h5>\r\n");
      out.write("                        <p ><b><span style=\"color:red;\">Giá bán:</span><span style=\"color:red;\" class=\"giaban\"> ");
      out.print(formatter.format(giaBan) + " VNĐ");
      out.write("</span><span style=\"color:red;\"> VNĐ</span></b><span > (Đã bao gồm thuế VAT)</span></p>\r\n");
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
      out.write("                        <button style=\"margin-top: 20px;\" type=\"button\" class=\"btn btn-success active center-block\">Thêm Vào Giỏ</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <script type=\"text/javascript\">\r\n");
      out.write("                var slideIndex = 1;\r\n");
      out.write("                showDivs(slideIndex);\r\n");
      out.write("\r\n");
      out.write("                function plusDivs(n) {\r\n");
      out.write("                    showDivs(slideIndex += n);\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                function currentDiv(n) {\r\n");
      out.write("                    showDivs(slideIndex = n);\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                function showDivs(n) {\r\n");
      out.write("                    var i;\r\n");
      out.write("                    var x = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("                    var dots = document.getElementsByClassName(\"demo\");\r\n");
      out.write("                    if (n > x.length) {\r\n");
      out.write("                        slideIndex = 1\r\n");
      out.write("                    }\r\n");
      out.write("                    if (n < 1) {\r\n");
      out.write("                        slideIndex = x.length\r\n");
      out.write("                    }\r\n");
      out.write("                    for (i = 0; i < x.length; i++) {\r\n");
      out.write("                        x[i].style.display = \"none\";\r\n");
      out.write("                    }\r\n");
      out.write("                    for (i = 0; i < dots.length; i++) {\r\n");
      out.write("                        dots[i].className = dots[i].className.replace(\" w3-opacity-off\", \"\");\r\n");
      out.write("                    }\r\n");
      out.write("                    x[slideIndex - 1].style.display = \"block\";\r\n");
      out.write("                    dots[slideIndex - 1].className += \" w3-opacity-off\";\r\n");
      out.write("                }\r\n");
      out.write("            </script>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"baivietlienquan col-md-6 col-sm-6\">\r\n");
      out.write("                    <center><span class=\"tenbaivietctsp\" style=\"color:#008ac2;font-size: 30px\">Bài viết liên quan</span></center>\r\n");
      out.write("                    <a href=\"#\"><span style=\"font-size: 15px;padding-top: 36px;\" class=\"glyphicon glyphicon-list-alt  \"> Mẹo \"cấpcứu\" bàn phím máy tính bị vô nước</span></a>\r\n");
      out.write("                    <a href=\"#\"><span style=\"font-size: 15px;padding-top: 10px;\" class=\"glyphicon glyphicon-list-alt  \"> Laptop màn hình cong đầu tiên trên thế giới giá 4.000 USD</span></a>\r\n");
      out.write("                    <a href=\"#\"><span style=\"font-size: 15px;padding-top: 10px;\" class=\"glyphicon glyphicon-list-alt  \"> Máy tính siêu nhỏ chạy trên Windows 10 sắp \"đổ bộ\" </span></a>\r\n");
      out.write("                    <a href=\"#\"><span style=\"font-size: 15px;padding-top: 10px;\" class=\"glyphicon glyphicon-list-alt  \"> Đánh giá laptop ThinkPad X1 Yoga đa năng 14 inch siêu mỏng</span></a>\r\n");
      out.write("                    <a href=\"#\"><span style=\"font-size: 15px;padding-top: 10px;\" class=\"glyphicon glyphicon-list-alt  \"> So sánh ASUS Zenbook và Macbook 12 inch </span></a>\r\n");
      out.write("                    <a href=\"#\"><span style=\"font-size: 15px;padding-top: 10px;\" class=\"glyphicon glyphicon-list-alt  \"> Bật mí về chiếc laptop Eve V - đối thủ của Surface Pro</span></a>\r\n");
      out.write("                    <a href=\"#\"><span style=\"font-size: 15px;padding-top: 10px;\" class=\"glyphicon glyphicon-list-alt  \"> \"Dì ghẻ\" Ngô Thanh Vân bật mí bộ sưu tập công nghệ </span></a>\r\n");
      out.write("                    <a href=\"#\"><span style=\"font-size: 15px;padding-top: 10px;\" class=\"glyphicon glyphicon-list-alt  \"> Macbook Pro 2016 - siêu phẩm đột phá của Apple</span></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"baivietctsp col-md-6 col-sm-6\">\r\n");
      out.write("\r\n");
      out.write("                    <center><span class=\"tenbaivietctsp\" style=\"color:#008ac2;font-size: 25px\">LAPTOP DELL INSPIRON 3558 - MÀN HÌNH LED LỚN, XỬ LÝ MẠNH MẼ</span></center>\r\n");
      out.write("                    <p style=\"font-size: 18px\">Laptop Dell Inspiron 3558 sở hữu màn hình LED có kích thước lớn 15.6 inches và độ phân giải HD cho hình ảnh sắc nét, màu sắc tươi sáng và giúp người dùng dễ dàng thao tác hơn. Đồng hành cùng màn hình kích thước lớn, laptop còn được trang bị một bộ vi xử lý mạnh mẽ với chip Intel Core i5 Broadwell 5200U, RAM 4GB cùng card đồ họa nVidia GeForce 820M 2GB có thể đáp ứng hoạt động cùng lúc nhiều chương trình mà vẫn mượt mà.</p>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row rowsplienquan \">\r\n");
      out.write("                <center><span class=\"tenbaivietctsp\" style=\"color:#008ac2;font-size: 25px\">Sản phẩm liên quan</span></center>\r\n");
      out.write("                <div class=\"col-md-12 col-sm-6 splienquan\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-3 splienquan1 \">\r\n");
      out.write("\r\n");
      out.write("                        <a href=\"#\"><img  class=\"img-responsive\" src=\"img/dell.png\" alt=\"\"/><br/>\r\n");
      out.write("                            <span style=\"font-size: 20px;color: #008ae2;\">Intel core i5</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-3 splienquan1 \">\r\n");
      out.write("                        <center>\r\n");
      out.write("                            <a href=\"#\"><img  class=\"img-responsive\" src=\"img/dell.png\" alt=\"\"/><br/>\r\n");
      out.write("                                <span style=\"font-size: 20px;color: #008ae2;\">Intel core i5</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </center>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-3 splienquan1 \">\r\n");
      out.write("                        <center>\r\n");
      out.write("                            <a href=\"#\"><img  class=\"img-responsive\" src=\"img/dell.png\" alt=\"\"/><br/>\r\n");
      out.write("                                <span style=\"font-size: 20px;color: #008ae2;\">Intel core i5</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </center>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-3 splienquan1 \">\r\n");
      out.write("                        <center>\r\n");
      out.write("                            <a href=\"#\"><img  class=\"img-responsive\" src=\"img/dell.png\" alt=\"\"/><br/>\r\n");
      out.write("                                <span style=\"font-size: 20px;color: #008ae2;\">Intel core i5</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </center>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<footer class=\"container-fluid\">\n");
      out.write("    <div class=\"footer\" id=\"footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-4  col-md-4 col-sm-4 col-xs-6\">\n");
      out.write("                    <h3> Giới thiệu </h3>\n");
      out.write("                    <ul>\n");
      out.write("                        <li> <a href=\"#\"> Lorem Ipsum </a> </li>\n");
      out.write("                        <li> <a href=\"#\"> Lorem Ipsum </a> </li>\n");
      out.write("                        <li> <a href=\"#\"> Lorem Ipsum </a> </li>\n");
      out.write("                        <li> <a href=\"#\"> Lorem Ipsum </a> </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4  col-md-4 col-sm-4 col-xs-6\">\n");
      out.write("                    <h3> Thông tin liên hệ </h3>\n");
      out.write("                    <ul>\n");
      out.write("                        <li> <a href=\"#\"> Liên kết </a> </li>\n");
      out.write("                        <li> <a href=\"#\"> Lorem Ipsum </a> </li>\n");
      out.write("                        <li> <a href=\"#\"> Lorem Ipsum </a> </li>\n");
      out.write("                        <li> <a href=\"#\"> Lorem Ipsum </a> </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4  col-md-4 col-sm-4 col-xs-6\">\n");
      out.write("                    <h3> Liên kết </h3>\n");
      out.write("                    <ul>\n");
      out.write("                        <li> <a href=\"#\"> Lorem Ipsum </a> </li>\n");
      out.write("                        <li> <a href=\"#\"> Lorem Ipsum </a> </li>\n");
      out.write("                        <li> <a href=\"#\"> Lorem Ipsum </a> </li>\n");
      out.write("                        <li> <a href=\"#\"> Lorem Ipsum </a> </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!--<div class=\"col-lg-3  col-md-3 col-sm-6 col-xs-12 \">\n");
      out.write("                    <h3> Lorem Ipsum </h3>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>\n");
      out.write("                            <div class=\"input-append newsletter-box text-center\">\n");
      out.write("                                <input type=\"text\" class=\"full text-center\" placeholder=\"Email \">\n");
      out.write("                                <button class=\"btn  bg-gray\" type=\"button\"> Lorem ipsum <i class=\"fa fa-long-arrow-right\"> </i> </button>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>-->\n");
      out.write("                <ul class=\"social pull-right\">\n");
      out.write("                    <li> <a href=\"#\"> <i class=\" fa fa-facebook\">   </i> </a> </li>\n");
      out.write("                    <li> <a href=\"#\"> <i class=\"fa fa-twitter\">   </i> </a> </li>\n");
      out.write("                    <li> <a href=\"#\"> <i class=\"fa fa-google-plus\">   </i> </a> </li>\n");
      out.write("                    <li> <a href=\"#\"> <i class=\"fa fa-pinterest\">   </i> </a> </li>\n");
      out.write("                    <li> <a href=\"#\"> <i class=\"fa fa-youtube\">   </i> </a> </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--/.row--> \n");
      out.write("    </div>\n");
      out.write("    <div class=\"footer-bottom\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <p class=\"pull-left\"> Copyright © 2016. All right reserved. </p>\n");
      out.write("            <div class=\"pull-right\">\n");
      out.write("                <ul class=\"nav nav-pills payments\">\n");
      out.write("                    <li><i class=\"fa fa-cc-visa\"></i></li>\n");
      out.write("                    <li><i class=\"fa fa-cc-mastercard\"></i></li>\n");
      out.write("                    <li><i class=\"fa fa-cc-amex\"></i></li>\n");
      out.write("                    <li><i class=\"fa fa-cc-paypal\"></i></li>\n");
      out.write("                </ul> \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
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
