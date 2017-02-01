package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_002dregister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!--\n");
      out.write("Author: W3layouts\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>Cool Login Form Responsive Widget Template :: w3layouts</title>\n");
      out.write("\t\t\n");
      out.write("\t\t<link href=\"css/login-register.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\t\t\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t\t<meta name=\"keywords\" content=\"Cool Login Form Tab Form,Login Forms,Sign up Forms,Registration Forms,News letter Forms,Elements\"./>\n");
      out.write("\t\t\n");
      out.write("\t\t<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<script src=\"js/jquery.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/easyResponsiveTabs.js\" type=\"text/javascript\"></script>\n");
      out.write("\t\t\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t\t\t$(document).ready(function () {\n");
      out.write("\t\t\t\t\t\t\t\t$('#horizontalTab').easyResponsiveTabs({\n");
      out.write("\t\t\t\t\t\t\t\t\ttype: 'default', //Types: default, vertical, accordion           \n");
      out.write("\t\t\t\t\t\t\t\t\twidth: 'auto', //auto or any width like 600px\n");
      out.write("\t\t\t\t\t\t\t\t\tfit: true   // 100% fit in a container\n");
      out.write("\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("\t\t\n");
      out.write("\t\t<link href='//fonts.googleapis.com/css?family=Quicksand:400,300,700' rel='stylesheet' type='text/css'>\n");
      out.write("\t</head>\n");
      out.write("<body\n");
      out.write("    ");

        
        //out.println(session.getAttribute("pid"));
        if(session.getAttribute("pid")!=null)
            response.sendRedirect("welcome.jsp");
    
      out.write("\n");
      out.write("<div class=\"wrap\">\n");
      out.write("\t<h1> Cool Login Form </h1>\t\t\t\n");
      out.write("\t<div class=\"main-content\">\n");
      out.write("\t\t<div class=\"sap_tabs\">\t\n");
      out.write("\t\t\t \n");
      out.write("\t\t\t<div id=\"horizontalTab\" style=\"display: block; width: 100%; margin: 0px;\">\n");
      out.write("\t\t\t \n");
      out.write("\t\t\t\t  <ul>\n");
      out.write("\t\t\t\t\t  <li class=\"resp-tab-item\" aria-controls=\"tab_item-0\" role=\"tab\"><span>Login</span></li>\n");
      out.write("\t\t\t\t\t  <li class=\"resp-tab-item\" aria-controls=\"tab_item-1\" role=\"tab\"><span>create account</span></li>\n");
      out.write("\t\t\t\t\t  \n");
      out.write("\t\t\t\t  </ul>\t\t\n");
      out.write("\t\t\t\t  <!------ Login Form --------->\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"tab-1 resp-tab-content\" aria-labelledby=\"tab_item-0\">\n");
      out.write("\t\t\t\t\t\t<div class=\"register\">\n");
      out.write("\t\t\t\t\t\t\t<form method=\"POST\" action=\"Login\">\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<input placeholder=\"Email or ID\" class=\"mail\" type=\"text\" name=\"id\" required=\"\">\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<input placeholder=\"Password\" class=\"lock\" type=\"password\" name=\"pwd\"required=\"\">\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Login\"/>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t<p>Forgot Your ID or Password?<a href=\"forgot_password.html\"> Click here</a></p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\t\n");
      out.write("                                <!----------Registration form------------>\n");
      out.write("                                \n");
      out.write("\t\t\t\t<div class=\"tab-2 resp-tab-content\" aria-labelledby=\"tab_item-1\">\n");
      out.write("\t\t\t\t\t\t<div class=\"register\">\n");
      out.write("\t\t\t\t\t\t\t<form method=\"POST\" action=\"Registration\">\t\n");
      out.write("\t\t\t\t\t\t\t\t<input placeholder=\"Name\" type=\"text\" name=\"name\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t<input placeholder=\"Email Address\" type=\"text\" name=\"email\" required=\"\">\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<input placeholder=\"Password\" type=\"password\" name=\"pwd\" required=\"\">\t\n");
      out.write("\t\t\t\t\t\t\t\t<input placeholder=\"Confirm Password\" type=\"password\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t<textarea name=\"add\" rows=\"4\" cols=\"50\" placeholder=\"Address\"></textarea>\n");
      out.write("                                                                <input type=\"date\" name=\"dob\"/>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"ph\" value=\"+91\">\n");
      out.write("\t\t\t\t\t\t\t\t<select name=\"sq\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"null\">----Security Question-----</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"pet_name\">Pet Name</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"Birthday\">Birthday</option>\n");
      out.write("\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"sqans\" placeholder=\"Security Answer\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"sign-up\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Create Account\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div> \t        \t\t\t\t\t            \t      \n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write(" </div>\n");
      out.write("</body>\n");
      out.write("</html\n");
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
