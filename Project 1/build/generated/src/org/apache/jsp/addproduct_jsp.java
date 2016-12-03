package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.javaweb.service.ProductCategoryServices;
import com.javaweb.model.ProductCategory;
import java.util.ArrayList;

public final class addproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <!--        <script>\r\n");
      out.write("                    window.CKEDITOR_BASEPATH = '/ckeditor/';\r\n");
      out.write("                </script>-->\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<!--<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">-->\r\n");
      out.write("<!--<link rel=\"stylesheet\" href=\"http://www.w3schools.com/lib/w3.css\">-->\r\n");
      out.write("<link href=\"css/w3.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"css/style-minh.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"css/cssto.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.js\" type=\"text/javascript\"></script>  \r\n");
      out.write("<script src=\"js/jquery.validate.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/javascript.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"ckeditor/ckeditor.js\" type=\"text/javascript\" ></script>\r\n");
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
      out.write("                        <li><a href=\"signup.jsp\">\r\n");
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
      out.write("            <div class=\"col-md-9\">\r\n");
      out.write("                <form class=\"form-horizontal\" action=\"AddProduct\" method=\"post\" enctype=\"multipart/form-data\" id=\"addproduct\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"control-label col-sm-2 col-md-3\" for=\"prod-name\">Tên sản phẩm<em>*</em>:</label>\r\n");
      out.write("                        <div class=\"col-md-7\">\r\n");
      out.write("                            <input type=\"text\" name=\"prod-name\" placeholder=\"Nhập tên sản phẩm\" class=\"form-control\" id=\"prod-name\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("<!--                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"control-label col-sm-2 col-md-3\" for=\"prod-number\">Mã số sản phẩm<em>*</em>:</label>\r\n");
      out.write("                        <div class=\"col-sm-3 col-md-9\">\r\n");
      out.write("                            <input type=\"text\" name=\"prod-number\" placeholder=\"Nhập mã sản phẩm\" class=\"form-control\" id=\"prod-number\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>-->\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group \">\r\n");
      out.write("                        <label class=\"control-label col-sm-2 col-md-3\" for=\"prod-describe\">Mô tả thông tin<em>*</em>:</label>\r\n");
      out.write("                        <div class=\"col-sm-3 col-md-9\">\r\n");
      out.write("                            <textarea rows=\"4\" id=\"prod-describe\" cols=\"20\" class=\"form-control ckeditor\" placeholder=\"Nhập\" name=\"prod-describe\"></textarea>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!--<script src=\"//cdn.ckeditor.com/4.6.0/ull/ckeditor.js\"></script>-->\r\n");
      out.write("                        <script type=\"text/javascript\">\r\n");
      out.write("                            config = {};\r\n");
      out.write("                            config.language = 'vi';\r\n");
      out.write("                            CKEDITOR.replace('prod-describe', config);\r\n");
      out.write("                        </script>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"control-label col-sm-2 col-md-3\" for=\"prod-price\">Giá bán<em>*</em>:</label>\r\n");
      out.write("                        <div class=\"col-sm-3 col-md-7\">\r\n");
      out.write("                            <input type=\"text\" name=\"prod-price\" placeholder=\"Nhập giá\" class=\"form-control\" id=\"prodprice\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"control-label col-sm-2 col-md-3\" for=\"prod-quantity\">Số lượng<em>*</em>:</label>\r\n");
      out.write("                        <div class=\"col-sm-3 col-md-7\">\r\n");
      out.write("                            <input type=\"number\" name=\"prod-quantity\" placeholder=\"Nhập số lượng\" class=\"form-control\" id=\"prod-quantity\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"control-label col-sm-2 col-md-3\" for=\"prod-unit\">Đơn vị<em>*</em>:</label>\r\n");
      out.write("                        <div class=\"col-sm-3 col-md-7\">\r\n");
      out.write("                            <input type=\"text\" name=\"prod-unit\" placeholder=\"Nhập đơn vị tính\" class=\"form-control\" id=\"prod-unit\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"control-label col-sm-2 col-md-3\" for=\"prod-category\">Loại sản phẩm<em>*</em>:</label>\r\n");
      out.write("                        <div class=\"col-sm-3 col-md-7\">\r\n");
      out.write("                            <select name=\"loaiSP\" class=\"form-control\">\r\n");
      out.write("                                <option value=\"\">Chọn...</option>\r\n");
      out.write("                                ");
                                    
                                    ArrayList<ProductCategory> aPC = null;
                                    ProductCategoryServices pcs = new ProductCategoryServices();
                                    aPC = pcs.getAll();
                                    for (int i = 0; i < aPC.size(); i++) {
                                
      out.write("\r\n");
      out.write("                                <option value=\"");
      out.print(aPC.get(i).getIdproductCategory());
      out.write('"');
      out.write('>');
      out.print(aPC.get(i).getCategoryName());
      out.write("</option>\r\n");
      out.write("                                ");

  
                                    }
                                
      out.write("\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"control-label col-sm-2 col-md-3\" for=\"prod-thumbnail\">Chọn hình đại diện<em>*</em>:</label>\r\n");
      out.write("                        <div class=\"col-sm-3 col-md-7\">\r\n");
      out.write("                            <input type=\"file\" name=\"prod-thumbnail\" id=\"prod-thumbnail\" onchange=\"loadFile(event, 'addpro')\">\r\n");
      out.write("                            <img  id=\"outputaddpro\"/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"control-label col-sm-2 col-md-3\" for=\"prod-images\">Chọn hình chi tiết<em>*</em>:</label>\r\n");
      out.write("                        <div class=\"col-sm-3 col-md-7\">\r\n");
      out.write("                            <input type=\"file\" name=\"prod-images\" id=\"prod-images\" multiple>\r\n");
      out.write("                            <div id=\"gallery\"></div>\r\n");
      out.write("                        </div> \r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"col-sm-3 col-md-7\">\r\n");
      out.write("                            <button  type=\"submit\" class=\"btn btn-info\">Thêm</button>\r\n");
      out.write("                            <button  type=\"reset\" class=\"btn btn-info\">Hủy</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
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
