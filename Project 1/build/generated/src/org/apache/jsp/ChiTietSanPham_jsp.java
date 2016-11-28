package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ChiTietSanPham_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/includes/headtag.jsp");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Chi Tiet San Pham</title>\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Headtag</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link href=\"css/cssto.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://www.w3schools.com/lib/w3.css\">\n");
      out.write("        <script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/javascript.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <style>\r\n");
      out.write("            .mySlides {display:none}\r\n");
      out.write("            .demo {cursor:pointer}\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <section class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12 col-sm-6 ctsp\">\r\n");
      out.write("                    <div class=\"col-md-6 col-sm-6 hinhctsp text-center\">\r\n");
      out.write("                        <div class=\"w3-content\" style=\"max-width:300px\">\r\n");
      out.write("                            <img class=\"mySlides\" src=\"img/dell.png\" style=\"width:100%; display: block\">\r\n");
      out.write("                            <img class=\"mySlides\" src=\"img/tải xuống (1).png\" style=\"width:300px;height: 300px;\">\r\n");
      out.write("                            <img class=\"mySlides\" src=\"img/dell.png\" style=\"width:100%\">\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"w3-row-padding w3-section\">\r\n");
      out.write("                                <div class=\"w3-col s4\">\r\n");
      out.write("                                    <img class=\"demo w3-opacity w3-hover-opacity-off\" src=\"img/dell.png\" style=\"width:100%\" onclick=\"currentDiv(1)\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"w3-col s4\">\r\n");
      out.write("                                    <img class=\"demo w3-opacity w3-hover-opacity-off\" src=\"img/tải xuống (1).png\" style=\"width:100%\" onclick=\"currentDiv(2)\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"w3-col s4\">\r\n");
      out.write("                                    <img class=\"demo w3-opacity w3-hover-opacity-off\" src=\"img/dell.png\" style=\"width:100%\" onclick=\"currentDiv(3)\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 col-sm-6 thongsoctsp\">\r\n");
      out.write("                        <h4 style=\"color:black;font-size: 25px;font-weight: normal\">LENOVO IDEAPAD 310-14ISK 80SL0069VN</h4>\r\n");
      out.write("                        <h5 style=\"font-size: 15px;\">MÁY TÍNH XÁCH TAY LENOVO IDEAPAD 310-14ISK,I3-6100U(2.3GHZ/3MB),4GB DDR4,1TB HDD,14\" FHD,2CELL,FREE-DOS,SILVER (BẠC),1YWTY_80SL0069VN</h5>\r\n");
      out.write("                        <p ><b><span style=\"color:red;\">Giá bán:</span><span style=\"color:red;\" class=\"giaban\"> 9.999.000</span><span style=\"color:red;\"> VNĐ</span></b><span > (Đã bao gồm thuế VAT)</span></p>\r\n");
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
      out.write("            <script>\r\n");
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
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row rowsplienquan \">\r\n");
      out.write("                <center><span class=\"tenbaivietctsp\" style=\"color:#008ac2;font-size: 25px\">Sản phẩm liên quan</span></center>\r\n");
      out.write("                <div class=\"col-md-12 col-sm-6 splienquan\">\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"col-md-3 splienquan1 \">\r\n");
      out.write("                        \r\n");
      out.write("                            <a href=\"#\"><img  class=\"img-responsive\" src=\"img/dell.png\" alt=\"\"/><br/>\r\n");
      out.write("                                <span style=\"font-size: 20px;color: #008ae2;\">Intel core i5</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        \r\n");
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
