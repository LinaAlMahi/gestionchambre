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
      out.write("<!-- Required meta tags -->\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<title>Star Admin2</title>\n");
      out.write("<!-- plugins:css -->\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/vendors/feather/feather.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"resources/vendors/mdi/css/materialdesignicons.min.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"resources/vendors/ti-icons/css/themify-icons.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/vendors/typicons/typicons.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"resources/vendors/simple-line-icons/css/simple-line-icons.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"resources/vendors/css/vendor.bundle.base.css\">\n");
      out.write("<!-- endinject -->\n");
      out.write("<!-- Plugin css for this page -->\n");
      out.write("<!-- End plugin css for this page -->\n");
      out.write("<!-- inject:css -->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"resources/css/vertical-layout-light/style.css\">\n");
      out.write("<!-- endinject -->\n");
      out.write("<link rel=\"shortcut icon\" href=\"resources/images/favicon.png\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container-scroller\">\n");
      out.write("\t\t<div class=\"container-fluid page-body-wrapper full-page-wrapper\">\n");
      out.write("\t\t\t<div class=\"content-wrapper d-flex align-items-center auth px-0\">\n");
      out.write("\t\t\t\t<div class=\"row w-100 mx-0\">\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-4 mx-auto\">\n");
      out.write("\t\t\t\t\t\t<div class=\"auth-form-light text-left py-5 px-4 px-sm-5\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"brand-logo\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"resources/images/logo.svg\" alt=\"logo\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<h4>Hello! let's get started</h4>\n");
      out.write("\t\t\t\t\t\t\t<h6 class=\"fw-light\">Sign in to continue.</h6>\n");
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
      out.write("\t\t\t\t\t\t\t\t\t\t\ttype=\"checkbox\" class=\"form-check-input\"> Keep me\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsigned in\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"mb-2\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"text-center mt-4 fw-light\">\n");
      out.write("\t\t\t\t\t\t\t\t\tDon't have an account? <a href=\"inscription.jsp\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"text-primary\">Create</a>\n");
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
