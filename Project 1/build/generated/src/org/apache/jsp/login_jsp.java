package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Headtag</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"js/javascript.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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

                                if (session.getAttribute("tenHo") == null) {
                            
      out.write("\r\n");
      out.write("                        <li><a href=\"signup.jsp\">\r\n");
      out.write("                                <span class=\"glyphicon glyphicon-user\"></span> Đăng ký\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"dropdown\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
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
      out.write("                                    <a href=\"profile.jsp\"><span class=\"glyphicon glyphicon-user\">Xin chào, \r\n");
      out.write("                                            <strong style=\"color: white\">");
      out.print(session.getAttribute("tenHo"));
      out.write(" </strong>\r\n");
      out.write("                                        </span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
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
      out.write("\n");
      out.write("        <section class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <form class=\"form-horizontal\"action=\"LoginServlet\" method=\"post\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" for=\"email\">Email or UserName:</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <input type=\"text\" name=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Enter email\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" for=\"pwd\">Password:</label>\n");
      out.write("                        <div class=\"col-sm-10\"> \n");
      out.write("                            <input type=\"password\" name=\"pw\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter password\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\"> \n");
      out.write("                        <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label><input type=\"checkbox\" name=\"remember\" value=\"R\"> Remember me</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\"> \n");
      out.write("                        <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("                            ");
                            if (session.getAttribute("errormsg") != null) {
                            
      out.write("\n");
      out.write("                            <div class=\"text-danger\">");
      out.print(session.getAttribute("errormsg"));
      out.write("</div>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
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
      out.write("    <!--/.container--> \r\n");
      out.write("    <!--</div>-->\r\n");
      out.write("    <!--/.footer-->\r\n");
      out.write("    <div class=\"footer-bottom\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <p class=\"pull-left\"> Copyright © Minhnc 2016. All right reserved. </p>\r\n");
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
      out.write("\n");
      out.write("    </body>\n");
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