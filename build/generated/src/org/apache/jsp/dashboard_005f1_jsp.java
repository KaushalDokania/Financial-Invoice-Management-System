package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("Features:\n");
      out.write("1. Partners\n");
      out.write("1.1. View partners\n");
      out.write("1.2. \n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Dashboard</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <script type=\"text/javascript\" src=\"//cdn.jsdelivr.net/jquery/1/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"//cdn.jsdelivr.net/momentjs/latest/moment.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"//cdn.jsdelivr.net/bootstrap/latest/css/bootstrap.css\" />\n");
      out.write(" \n");
      out.write("        <!-- Include Date Range Picker -->\n");
      out.write("        <script type=\"text/javascript\" src=\"//cdn.jsdelivr.net/bootstrap.daterangepicker/2/daterangepicker.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"//cdn.jsdelivr.net/bootstrap.daterangepicker/2/daterangepicker.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div>    \n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"jumbotron\">\n");
      out.write("                    <h1>Dashboard</h1>\n");
      out.write("                    <h3> Find the important stuffs over here</h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"container col-md-6\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                &nbsp;\n");
      out.write("                                    <div id=\"custom-search-input\">\n");
      out.write("                                        <div class=\"input-group col-md-12\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control input-lg\" placeholder=\"Search Partner ID\" />\n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                &nbsp;\n");
      out.write("                                    <div id=\"custom-search-input\">\n");
      out.write("                                        <div class=\"input-group col-md-12\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control input-lg\" placeholder=\"From MM/DD/YYYY\" />\n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                &nbsp;\n");
      out.write("                                    <div id=\"custom-search-input\">\n");
      out.write("                                        <div class=\"input-group col-md-12\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control input-lg\" placeholder=\"To MM/DD/YYYY\" />\n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                &nbsp;\n");
      out.write("                                    <div id=\"custom-search-input\">\n");
      out.write("                                        <div class=\"input-group col-md-12\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control input-lg\" placeholder=\"From Invoice#\" />\n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                &nbsp;\n");
      out.write("                                    <div id=\"custom-search-input\">\n");
      out.write("                                        <div class=\"input-group col-md-12\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control input-lg\" placeholder=\"To Invoice#\" />\n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                                \n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-1\" style=\"padding: 10px;\"></div>\n");
      out.write("                                    <div class=\"col-md-5\" style='padding-top:20px'>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-primary btn-block\" value=\"submit\">Get Overdue amount</button>\n");
      out.write("                                    </div>                 \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                    <div class=\"col-md-5\" style=\"padding-top:20px;\">\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-primary btn-block\" value=\"submit\">Get Details</button>\n");
      out.write("                                    </div>                 \n");
      out.write("                                    <div class=\"col-md-1\" style=\"padding: 10px;\"></div>\n");
      out.write("                                \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div style='padding:10px'></div>\n");
      out.write("                    <div class=\"container col-md-6\" >\n");
      out.write("                        <div style='background-color:powderblue; padding: 30px'>\n");
      out.write("                            <h2>Total amount overdue</h2>\n");
      out.write("                            <h1>Rs. 9999</h1>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <div style='padding: 8px;'></div>\n");
      out.write("                        <div>\n");
      out.write("                            <a href=\"block.jsp\"><button type=\"button\" class='btn btn-danger btn-block'>Block Partner</button></a>\n");
      out.write("                        </div>\n");
      out.write("                    \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                     \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
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
