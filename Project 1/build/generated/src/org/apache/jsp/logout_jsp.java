package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import com.javaweb.service.ProductServices;
import com.javaweb.model.Product;
import com.javaweb.service.GioHang;
import java.util.ArrayList;

public final class logout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/includes/header.jsp");
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
      out.write("        <title>Logout</title>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("                        <li class=\"dropdown-submenu menu dropdown\">\r\n");
      out.write("                            <a class=\"dropdown-toggle menu dropbtn\" href=\"Product.jsp\">\r\n");
      out.write("                                <span class=\"glyphicon glyphicon-usd\"></span> Áo\r\n");
      out.write("                                <span class=\"caret\"></span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu menu dropdown-content\">\r\n");
      out.write("                                <li><a href=\"#\" class=\"menu\">Áo sơ mi</a></li>\r\n");
      out.write("                                <li><a href=\"#\" class=\"menu\">Áo hoodie</a></li>\r\n");
      out.write("                                <li><a href=\"#\" class=\"menu\">Áo thun</a></li> \r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"contact.jsp\" class=\"menu\">Liên hệ</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                        <li class=\"dropdown-submenu menu dropdown\">\r\n");
      out.write("                            <ul class=\"dropdown-menu menu gioHang col-md-12 dropdown-content\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <form action=\"SaveServlet\" method=\"post\">\r\n");
      out.write("                                        ");

                                            if (session.getAttribute("dshang") != null) {
                                                ArrayList<GioHang> listGioHang = (ArrayList) session.getAttribute("dshang");
                                                double tongTien = 0;
                                                DecimalFormat dcf = new DecimalFormat("###,###,###");
                                                if (request.getParameter("removeidsp") != null) {
                                                    String removeidsp = request.getParameter("removeidsp");
                                                    GioHang.XoaTuGioHang(listGioHang, removeidsp);
                                                    session.setAttribute("dshang", listGioHang);
                                                }
                                        
      out.write("\r\n");
      out.write("                                        <table class=\"table\">\r\n");
      out.write("                                            <tbody>\r\n");
      out.write("                                                ");

                                                    for (int i = 0; i < listGioHang.size(); i++) {
                                                        ProductServices pssh = new ProductServices();
                                                        Product pth = null;
                                                        GioHang item = listGioHang.get(i);
                                                        pth = pssh.GetById(item.getMaSP());
                                                        int soLuong = Integer.parseInt(item.getSoLuong());
                                                        double donGia = pth.getPricePerUnit();
                                                        double ketQua = GioHang.TinhTongTien(soLuong, donGia);
                                                        tongTien += ketQua;
                                                
      out.write("\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <div class=\"x-btn\">\r\n");
      out.write("                                                            <center>\r\n");
      out.write("                                                                <a href=\"");
      out.print(session.getAttribute("urlcur"));
      out.write("?removeidsp=");
      out.print(item.getMaSP());
      out.write("\">X</a>\r\n");
      out.write("                                                            </center>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <a href=\"ChiTietSanPham.jsp?id=");
      out.print(pth.getIdproduct());
      out.write("\" title=\"Xem chi tiết sản phẩm\">\r\n");
      out.write("                                                            <img class=\"img-responsive\" src=\"uploads/");
      out.print(pth.getProductImage());
      out.write("\" width=\"100px\" height=\"100px\"/> \r\n");
      out.write("                                                        </a>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <a href=\"ChiTietSanPham.jsp?id=");
      out.print(pth.getIdproduct());
      out.write("\" title=\"Xem chi tiết sản phẩm\" style=\"color: white;\">\r\n");
      out.write("                                                            ");
      out.print(pth.getProductName());
      out.write("<br/>\r\n");
      out.write("                                                        </a>\r\n");
      out.write("                                                        ");
      out.print(soLuong);
      out.write(" x ");
      out.print(dcf.format(donGia) + " VNĐ");
      out.write(" \r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("\r\n");
      out.write("<!--<span>Sản phẩm : </span> <span name=\"idsp");
      out.print(item.getMaSP());
      out.write('"');
      out.write('>');
      out.print(item.getMaSP());
      out.write("</span>--> \r\n");
      out.write("\r\n");
      out.write("                                        <!--<span>Số lượng: </span><input name=\"sl");
      out.print(item.getMaSP());
      out.write("\" type=\"number\" value=\"");
      out.print(item.getSoLuong());
      out.write("\"/>-->\r\n");
      out.write("                                                ");

                                                    }
                                                
      out.write("\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <td></td>\r\n");
      out.write("                                                    <td><b>Tổng tiền</b></td>\r\n");
      out.write("                                                    <td><b>");
      out.print(dcf.format(tongTien) + " VNĐ");
      out.write("</b></td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                            </tbody>\r\n");
      out.write("                                        </table>\r\n");
      out.write("\r\n");
      out.write("                                        <center> \r\n");
      out.write("                                            <a href=\"checkout.jsp\" class=\"btn btn-info\">\r\n");
      out.write("                                                Thanh toán\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                            <a href=\"viewcart.jsp\" class=\"btn btn-info\">\r\n");
      out.write("                                                Xem giỏ hàng\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </center>\r\n");
      out.write("                                        ");

                                        } else {
                                        
      out.write("\r\n");
      out.write("                                        <center><span style=\"color:#00ffffff;\">Chưa có nào sản phẩm nào trong giỏ.\r\n");
      out.write("                                                <br/>Click vào <a href=\"Product.jsp\">đây</a> để mua hàng</span></center>\r\n");
      out.write("                                                ");

                                                    }
                                                
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <a href=\"#\" style=\"outline: none;border: none;background: transparent;\" class=\"dropdown-toggle menu dropbtn\" >\r\n");
      out.write("                                ");

                                    ArrayList<GioHang> gioHang = null;
                                
      out.write("\r\n");
      out.write("                                <img src=\"img/shop-cart-icon.png\" alt=\"\"/>\r\n");
      out.write("                                ");

                                    if (session.getAttribute("dshang") != null) {
                                        gioHang = (ArrayList) session.getAttribute("dshang");
                                
      out.write("\r\n");
      out.write("                                <span class=\"badge\" style=\"background-color: #fff;color:red;\">");
      out.print(gioHang.size());
      out.write("</span>\r\n");
      out.write("                                ");

                                } else {
                                
      out.write("\r\n");
      out.write("                                <span class=\"badge\" style=\"background-color: #fff;color:red;\">0</span>\r\n");
      out.write("                                ");

                                    }
                                
      out.write("\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
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
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("                                            <div class=\"form-group\"> \r\n");
      out.write("                                                <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("                                                    <button type=\"submit\" class=\"btn btn-default\" style=\"margin-left: 150px;\">Đăng nhập</button>\r\n");
      out.write("\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <!--<ul id=\"login-dp\" class=\"dropdown-menu\">-->\r\n");
      out.write("                        ");

                        } else {
                        
      out.write("\r\n");
      out.write("                        <li class=\"dropdown-submenu menu dropdown\">\r\n");
      out.write("                            <a href=\"index.jsp\" class=\"dropdown-toggle menu dropbtn\">\r\n");
      out.write("                                <i class=\"glyphicon glyphicon-user\"> <strong style=\"color: white\">");
      out.print(session.getAttribute("fullname"));
      out.write(" </strong></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu menu dropdown-content\">\r\n");
      out.write("                                <li><a href=\"infouser.jsp\" class=\"menu\">Điều chỉnh hồ sơ</a></li>\r\n");
      out.write("                                <li><a href=\"dashboard.jsp\" class=\"menu\">Về trang quản trị</a></li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"logout.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span>Thoát</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            }
                        
      out.write("\r\n");
      out.write("                        <!--</ul>-->\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("        ");
 if(session!=null){
                session.removeAttribute("idrole_user");
                session.removeAttribute("email");
                session.removeAttribute("fullname");
                session.removeAttribute("iduser");
                session.removeAttribute("avatar");
                session.removeAttribute("cmtname");
                
                response.sendRedirect(session.getAttribute("urlcur")+"");
            }
            
      out.write(" \r\n");
      out.write("        \r\n");
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
