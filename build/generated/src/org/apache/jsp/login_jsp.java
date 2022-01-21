package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/TestLogin.jsp");
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write('\n');
     
    
if(session.getAttribute("idUser")!=null){
        
        
               response.sendRedirect("NewFile.jsp");
        
    }
    
    
    
    

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <title>Lina Admin</title>\n");
      out.write("    <!-- plugins:css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/vendors/mdi/css/materialdesignicons.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/vendors/css/vendor.bundle.base.css\">\n");
      out.write("    <!-- endinject -->\n");
      out.write("    <!-- Plugin css for this page -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/vendors/jvectormap/jquery-jvectormap.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/vendors/flag-icon-css/css/flag-icon.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/vendors/owl-carousel-2/owl.carousel.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/vendors/owl-carousel-2/owl.theme.default.min.css\">\n");
      out.write("    <!-- End plugin css for this page -->\n");
      out.write("    <!-- inject:css -->\n");
      out.write("    <!-- endinject --> \n");
      out.write("    <!-- Layout styles -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("    <!-- End layout styles -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"assets/images/favicon.png\">\n");
      out.write("  <style type=\"text/css\">/* Chart.js */\n");
      out.write("@keyframes chartjs-render-animation{from{opacity:.99}to{opacity:1}}.chartjs-render-monitor{animation:chartjs-render-animation 1ms}.chartjs-size-monitor,.chartjs-size-monitor-expand,.chartjs-size-monitor-shrink{position:absolute;direction:ltr;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:-1}.chartjs-size-monitor-expand>div{position:absolute;width:1000000px;height:1000000px;left:0;top:0}.chartjs-size-monitor-shrink>div{position:absolute;width:200%;height:200%;left:0;top:0}</style>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container-scroller\">\n");
      out.write("\t\t<div class=\"container-fluid page-body-wrapper full-page-wrapper\">\n");
      out.write("\t\t\t<div class=\"content-wrapper d-flex align-items-center auth px-0\">\n");
      out.write("\t\t\t\t<div class=\"row w-100 mx-0\">\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-4 mx-auto\">\n");
      out.write("\t\t\t\t\t\t<div class=\"auth-form-light text-left py-5 px-4 px-sm-5\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<h4 style=\"color:black;\">Hello ! let's get started</h4>\n");
      out.write("\t\t\t\t\t\t\t<h6 class=\"fw-light\" style=\"color:black;\">Sign in to continue.</h6>\n");
      out.write("\t\t\t\t\t\t\t<form class=\"pt-3\" action=\"LoginServlet\" method=\"Post\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"op\" class=\"form-control form-control-lg\"\n");
      out.write("                                                                       id=\"Login\" value=\"Login\"  placeholder=\"\" hidden>\t\n");
      out.write("                                                            \n");
      out.write("                                                            <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"email\" name=\"email\" class=\"form-control form-control-lg\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"exampleInputEmail1\"  placeholder=\"Username\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" class=\"form-control form-control-lg\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"exampleInputPassword1\" placeholder=\"Password\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"mt-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<button\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"submit\">Connect</button>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"my-2 d-flex justify-content-between align-items-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-check\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"form-check-label text-muted\"> <input\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttype=\"checkbox\" class=\"form-check-input\"> Keep me signed in\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"mb-2\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"text-center mt-4 fw-light\" style=\"color:black;\">Don't have an account? <a href=\"inscription.jsp\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"text-primary\"> Create</a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- content-wrapper ends -->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- page-body-wrapper ends -->\n");
      out.write("\t</div>\n");
      out.write("\t<!-- container-scroller -->\n");
      out.write("\t<!-- plugins:js -->\n");
      out.write("\t<script src=\"resources/vendors/js/vendor.bundle.base.js\"></script>\n");
      out.write("\t<!-- endinject -->\n");
      out.write("\t<!-- Plugin js for this page -->\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"resources/vendors/bootstrap-datepicker/bootstrap-datepicker.min.js\"></script>\n");
      out.write("\t<!-- End plugin js for this page -->\n");
      out.write("\t<!-- inject:js -->\n");
      out.write("\t<script src=\"resources/js/off-canvas.js\"></script>\n");
      out.write("\t<script src=\"resources/js/hoverable-collapse.js\"></script>\n");
      out.write("\t<script src=\"resources/js/template.js\"></script>\n");
      out.write("\t<script src=\"resources/js/settings.js\"></script>\n");
      out.write("\t<script src=\"resources/js/todolist.js\"></script>\n");
      out.write("\t<!-- endinject -->\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
