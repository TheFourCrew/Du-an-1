package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Product_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Product</title>\n");
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
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"container-fluid\">\n");
      out.write("            <div class=\"row \">\n");
      out.write("                <div class=\"col-md-12 col-sm-6 danhmucsp \">\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div  class=\"col-md-3 trai col-sm-3 \">\n");
      out.write("\n");
      out.write("                    <div class=\"row theohang t\">\n");
      out.write("                        <p >Thương hiệu</p>\n");
      out.write("                        <div class=\" col-md-6 \">\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"checkbox\" name=\"thuonghieu\"> Apple</label><br/>\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"checkbox\" name=\"thuonghieu\"> Acer</label><br/>\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"checkbox\" name=\"thuonghieu\"> HP</label><br/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\" col-md-6\">\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"checkbox\" name=\"thuonghieu\"> Dell</label><br/>\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"checkbox\" name=\"thuonghieu\"> Asus</label><br/>\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"checkbox\" name=\"thuonghieu\"> Lenovo</label><br/>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row theogia\">\n");
      out.write("                        <p >Giá bán</p>\n");
      out.write("                        <div class=\" col-md-6\">\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"radio\" name=\"gia\">Dưới 5 triệu</label><br/>\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"radio\" name=\"gia\">Từ 5-10 triệu</label><br/>\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"radio\" name=\"gia\">Từ 10-15 triệu</label><br/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\" col-md-6\">\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"radio\" name=\"gia\">Từ 15-20 triệu</label><br/>\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"radio\" name=\"gia\">Từ 20-30 triệu</label><br/>\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"radio\" name=\"gia\">Trên 30 triệu</label><br/>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"quangcao row\">\n");
      out.write("                        <a href=\"#\"><img style=\"width:300px; height:300px;margin: 0 auto;\" class=\"img-responsive\" src=\"img/tải xuống.jpg\" alt=\"\" /></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"spnoibat row text-center\">\n");
      out.write("                        <a href=\"#\"><img style=\"width:240px; height:250px\" class=\"img-responsive\" src=\"img/dell.png\" alt=\"\"/>\n");
      out.write("                            <p class=\"spbc\" style=\"color: red;padding-top: 25px\">Sản phẩm bán chạy</p></a>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"spnoibat row text-center\">\n");
      out.write("                        <a href=\"#\"><img style=\"width:240px; height:250px\" class=\"img-responsive\" src=\"img/dell.png\" alt=\"\"/>\n");
      out.write("                            <p class=\"spbc\" style=\"color: red;padding-top: 25px\">Sản phẩm nổi bật</p></a>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-9 phai col-sm-3 text-center\">\n");
      out.write("                    <p>Máy Tính </p>\n");
      out.write("                    <div class=\"col-md-4 sp \">\n");
      out.write("                        <a href=\"#\"><img style=\"width:240px; height:250px;\" class=\"img-responsive\" src=\"img/dell.png\" alt=\"\"/>\n");
      out.write("                            \n");
      out.write("                            <span style=\"font-weight: 600;font-size: 20px;color: #008ae2;\">Intel core i5</span>\n");
      out.write("                            <span style=\"font-weight: 600;font-size: 20px;color: #008ae2;\">14.0 inch</span>\n");
      out.write("                            <p style=\"color: black;padding-top: 6px;\"> DELL INSPIRON 15-N3543A P40F001 </p>\n");
      out.write("                            <p style=\"color: red;font-weight: 600;font-size: 20px;\">9.999.000 vnd</p>\n");
      out.write("                            <button  type=\"button\" class=\"btn btn-success active center-block\">Thêm Vào Giỏ</button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 sp\">\n");
      out.write("                        <a href=\"#\"><img style=\"width:240px; height:250px;\" class=\"img-responsive\" src=\"img/dell.png\" alt=\"\"/>\n");
      out.write("                            \n");
      out.write("                            <span style=\"font-weight: 600;font-size: 20px;color: #008ae2;\">Intel core i5</span>\n");
      out.write("                            <span style=\"font-weight: 600;font-size: 20px;color: #008ae2;\">14.0 inch</span>\n");
      out.write("                            <p style=\"color: black;padding-top: 6px;\"> DELL INSPIRON 15-N3543A P40F001 </p>\n");
      out.write("                            <p style=\"color: red;font-weight: 600;font-size: 20px;\">9.999.000 vnd</p>\n");
      out.write("                            <button  type=\"button\" class=\"btn btn-success active center-block\">Thêm Vào Giỏ</button>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-md-4 sp\">\n");
      out.write("                       <a href=\"#\"><img style=\"width:240px; height:250px;\" class=\"img-responsive\" src=\"img/dell.png\" alt=\"\"/>\n");
      out.write("                            \n");
      out.write("                            <span style=\"font-weight: 600;font-size: 20px;color: #008ae2;\">Intel core i5</span>\n");
      out.write("                            <span style=\"font-weight: 600;font-size: 20px;color: #008ae2;\">14.0 inch</span>\n");
      out.write("                            <p style=\"color: black;padding-top: 6px;\"> DELL INSPIRON 15-N3543A P40F001 </p>\n");
      out.write("                            <p style=\"color: red;font-weight: 600;font-size: 20px;\">9.999.000 vnd</p>\n");
      out.write("                            <button  type=\"button\" class=\"btn btn-success active center-block\">Thêm Vào Giỏ</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 sp\">\n");
      out.write("                        <a href=\"#\"><img style=\"width:240px; height:250px;\"class=\"img-responsive\" src=\"img/dell.png\" alt=\"\"/>\n");
      out.write("                            \n");
      out.write("                            <span style=\"font-weight: 600;font-size: 20px;color: #008ae2;\">Intel core i5</span>\n");
      out.write("                            <span style=\"font-weight: 600;font-size: 20px;color: #008ae2;\">14.0 inch</span>\n");
      out.write("                            <p style=\"color: black;padding-top: 6px;\"> DELL INSPIRON 15-N3543A P40F001 </p>\n");
      out.write("                            <p style=\"color: red;font-weight: 600;font-size: 20px;\">9.999.000 vnd</p>\n");
      out.write("                            <button  type=\"button\" class=\"btn btn-success active center-block\">Thêm Vào Giỏ</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 sp\">\n");
      out.write("                        <a href=\"#\"><img style=\"width:240px; height:250px;\" class=\"img-responsive\" src=\"img/dell.png\" alt=\"\"/>\n");
      out.write("                            \n");
      out.write("                            <span style=\"font-weight: 600;font-size: 20px;color: #008ae2;\">Intel core i5</span>\n");
      out.write("                            <span style=\"font-weight: 600;font-size: 20px;color: #008ae2;\">14.0 inch</span>\n");
      out.write("                            <p style=\"color: black;padding-top: 6px;\"> DELL INSPIRON 15-N3543A P40F001 </p>\n");
      out.write("                            <p style=\"color: red;font-weight: 600;font-size: 20px;\">9.999.000 vnd</p>\n");
      out.write("                            <button  type=\"button\" class=\"btn btn-success active center-block\">Thêm Vào Giỏ</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 sp\">\n");
      out.write("                        <a href=\"#\"><img style=\"width:240px; height:250px;\" class=\"img-responsive\" src=\"img/dell.png\" alt=\"\"/>\n");
      out.write("                            \n");
      out.write("                            <span style=\"font-weight: 600;font-size: 20px;color: #008ae2;\">Intel core i5</span>\n");
      out.write("                            <span style=\"font-weight: 600;font-size: 20px;color: #008ae2;\">14.0 inch</span>\n");
      out.write("                            <p style=\"color: black;padding-top: 6px;\"> DELL INSPIRON 15-N3543A P40F001 </p>\n");
      out.write("                            <p style=\"color: red;font-weight: 600;font-size: 20px;\">9.999.000 vnd</p>\n");
      out.write("                            <button  type=\"button\" class=\"btn btn-success active center-block\">Thêm Vào Giỏ</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 sp\">\n");
      out.write("                        <a href=\"#\"><img style=\"width:240px; height:250px;\" class=\"img-responsive\" src=\"img/dell.png\" alt=\"\"/>\n");
      out.write("                            \n");
      out.write("                            <span style=\"font-weight: 600;font-size: 20px;color: #008ae2;\">Intel core i5</span>\n");
      out.write("                            <span style=\"font-weight: 600;font-size: 20px;color: #008ae2;\">14.0 inch</span>\n");
      out.write("                            <p style=\"color: black;padding-top: 6px;\"> DELL INSPIRON 15-N3543A P40F001 </p>\n");
      out.write("                            <p style=\"color: red;font-weight: 600;font-size: 20px;\">9.999.000 vnd</p>\n");
      out.write("                            <button  type=\"button\" class=\"btn btn-success active center-block\">Thêm Vào Giỏ</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 sp\">\n");
      out.write("                        <a href=\"#\"><img style=\"width:240px; height:250px;\" class=\"img-responsive\" src=\"img/dell.png\" alt=\"\"/>\n");
      out.write("                            \n");
      out.write("                            <span style=\"font-weight: 600;font-size: 20px;color: #008ae2;\">Intel core i5</span>\n");
      out.write("                            <span style=\"font-weight: 600;font-size: 20px;color: #008ae2;\">14.0 inch</span>\n");
      out.write("                            <p style=\"color: black;padding-top: 6px;\"> DELL INSPIRON 15-N3543A P40F001 </p>\n");
      out.write("                            <p style=\"color: red;font-weight: 600;font-size: 20px;\">9.999.000 vnd</p>\n");
      out.write("                            <button  type=\"button\" class=\"btn btn-success active center-block\">Thêm Vào Giỏ</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 sp\">\n");
      out.write("                        <a href=\"#\"><img style=\"width:240px; height:250px;\" class=\"img-responsive\" src=\"img/dell.png\" alt=\"\"/>\n");
      out.write("                            \n");
      out.write("                            <span style=\"font-weight: 600;font-size: 20px;color: #008ae2;\">Intel core i5</span>\n");
      out.write("                            <span style=\"font-weight: 600;font-size: 20px;color: #008ae2;\">14.0 inch</span>\n");
      out.write("                            <p style=\"color: black;padding-top: 6px;\"> DELL INSPIRON 15-N3543A P40F001 </p>\n");
      out.write("                            <p style=\"color: red;font-weight: 600;font-size: 20px;\">9.999.000 vnd</p>\n");
      out.write("                            <button  type=\"button\" class=\"btn btn-success active center-block\">Thêm Vào Giỏ</button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
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
