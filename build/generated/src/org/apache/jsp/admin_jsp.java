package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>All Invoices</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Augment Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write(" <!-- Bootstrap Core CSS -->\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<!-- Custom CSS -->\n");
      out.write("<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<!-- Graph CSS -->\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \n");
      out.write("<!-- jQuery -->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Roboto:700,500,300,100italic,100,400' rel='stylesheet' type='text/css'>\n");
      out.write("<!-- lined-icons -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/icon-font.min.css\" type='text/css' />\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- //lined-icons -->\n");
      out.write("<script src=\"js/jquery-1.10.2.min.js\"></script>\n");
      out.write("<script src=\"js/amcharts.js\"></script>\t\n");
      out.write("<script src=\"js/serial.js\"></script>\t\n");
      out.write("<script src=\"js/light.js\"></script>\t\n");
      out.write("<script src=\"js/radar.js\"></script>\t\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"css/barChart.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<link href=\"css/fabochart.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\n");
      out.write("<link href=\"css/new_invoice.css\" rel=\"stylesheet\"> \n");
      out.write("<!--clock init-->\n");
      out.write("<script src=\"js/css3clock.js\"></script>\n");
      out.write("<!--Easy Pie Chart-->\n");
      out.write("<!--skycons-icons-->\n");
      out.write("<script src=\"js/skycons.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"js/jquery.easydropdown.js\"></script>\n");
      out.write("\n");
      out.write("<!--//skycons-icons-->\n");
      out.write("</head> \n");
      out.write("<body>\n");
      out.write("   <div class=\"page-container\">\n");
      out.write("   <!--/content-inner-->\n");
      out.write("\t<div class=\"left-content\">\n");
      out.write("\t   <div class=\"inner-content\">\n");
      out.write("\t\t<!-- header-starts -->\n");
      out.write("\t\t\t<div class=\"header-section\">\n");
      out.write("\t\t\t\t\t\t<!--menu-right-->\n");
      out.write("\t\t\t\t\t\t<div class=\"top_menu\">\n");
      out.write("\t\t\t\t\t\t        <div class=\"main-search\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t   <input type=\"text\" value=\"Search\" onFocus=\"this.value = '';\" onBlur=\"if (this.value == '') {this.value = 'Search';}\" class=\"text\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"close\"><img src=\"images/cross.png\" /></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"srch\"><button></button></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t $('.main-search').hide();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$('button').click(function (){\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('.main-search').show();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('.main-search text').focus();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$('.close').click(function(){\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('.main-search').hide();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t\t\t\t<!--/profile_details-->\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"profile_details_left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nofitications-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"dropdown note dra-down\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t   <div id=\"dd\" class=\"wrapper-dropdown-3\" tabindex=\"1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span>Italy</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<ul class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a class=\"deutsch\">France</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a class=\"english\"> Italy</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a class=\"espana\">Brazil</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a class=\"russian\">Usa</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfunction DropDown(el) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tthis.dd = el;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tthis.placeholder = this.dd.children('span');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tthis.opts = this.dd.find('ul.dropdown > li');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tthis.val = '';\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tthis.index = -1;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tthis.initEvents();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDropDown.prototype = {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tinitEvents : function() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar obj = this;\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tobj.dd.on('click', function(event){\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(this).toggleClass('active');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tobj.opts.on('click',function(){\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar opt = $(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tobj.val = opt.text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tobj.index = opt.index();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tobj.placeholder.text(obj.val);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tgetValue : function() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\treturn this.val;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tgetIndex : function() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\treturn this.index;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(function() {\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar dd = new DropDown( $('#dd') );\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(document).click(function() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// all dropdowns\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('.wrapper-dropdown-3').removeClass('active');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    </li>\n");
      out.write("\t\t\t\t\t\t\t\t\t       <li class=\"dropdown note\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\"><i class=\"fa fa-envelope-o\"></i> <span class=\"badge\">3</span></a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu two first\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"notification_header\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h3>You have 3 new messages  </h3> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t   <div class=\"user_img\"><img src=\"images/1.jpg\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t   <div class=\"notification_desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><span>1 hour ago</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t   <div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t <li class=\"odd\"><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"user_img\"><img src=\"images/in.jpg\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t   <div class=\"notification_desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet </p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><span>1 hour ago</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t   <div class=\"user_img\"><img src=\"images/in1.jpg\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t   <div class=\"notification_desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet </p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><span>1 hour ago</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t   <div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"notification_bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">See all messages</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown note\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\"><i class=\"fa fa-bell-o\"></i> <span class=\"badge\">5</span></a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu two\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"notification_header\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h3>You have 5 new notification</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"user_img\"><img src=\"images/in.jpg\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   <div class=\"notification_desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p><span>1 hour ago</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t <li class=\"odd\"><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"user_img\"><img src=\"images/in5.jpg\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   <div class=\"notification_desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet </p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p><span>1 hour ago</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   <div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t <li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"user_img\"><img src=\"images/in8.jpg\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   <div class=\"notification_desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet </p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p><span>1 hour ago</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   <div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t <li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"notification_bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">See all notification</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\t\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown note\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\"><i class=\"fa fa-tasks\"></i> <span class=\"badge blue1\">9</span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu two\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"notification_header\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h3>You have 9 pending task</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"task-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"task-desc\">Database update</span><span class=\"percentage\">40%</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t   </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"progress progress-striped active\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t <div class=\"bar yellow\" style=\"width:40%;\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"task-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"task-desc\">Dashboard done</span><span class=\"percentage\">90%</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t   <div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"progress progress-striped active\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t <div class=\"bar green\" style=\"width:90%;\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"task-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"task-desc\">Mobile App</span><span class=\"percentage\">33%</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   <div class=\"progress progress-striped active\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t <div class=\"bar red\" style=\"width: 33%;\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"task-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"task-desc\">Issues fixed</span><span class=\"percentage\">80%</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t   <div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"progress progress-striped active\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t <div class=\"bar  blue\" style=\"width: 80%;\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"notification_bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">See all pending task</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\t\t   \t\t\t\t\t\t\t   \t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t\t<!--//profile_details-->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!--//menu-right-->\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- //header-ends -->\n");
      out.write("\t\t\t\t\t\t<div class=\"outter-wp\">\n");
      out.write("\t\t\t\t\t\t\t\t<!--custom-widgets-->\n");
      out.write("                                                                                                <br/>\n");
      out.write("                                                                                               \n");
      out.write("                                                                                                <div>\n");
      out.write("                                                                                                    <table border=\"2\" width=\"800\" cellspacing=\"0\" cellpadding=\"8\">\n");
      out.write("                                                                                                        <tr>\n");
      out.write("                                                                                                            <th>S.No.</th>\n");
      out.write("                                                                                                            <th>Invoice No.</th>\n");
      out.write("                                                                                                            <th>Date</th>\n");
      out.write("                                                                                                            <th>Customer Name</th>\n");
      out.write("                                                                                                            <th>Amount</th>\n");
      out.write("                                                                                                            <th>Paid</th>\n");
      out.write("                                                                                                        </tr>\n");
      out.write("                                                                                                         ");

                                                                                                            String inv_no="",inv_dt="",cname="",paid="";
                                                                                                            float amount=0;
                                                                                                            int count = 0;
                                                                                                            ResultSet rs;
                                                                                                            String pid = (String)session.getAttribute("pid");
                                                                                                            out.println(pid);
                                                                                                            try
                                                                                                            {
                                                                                                                Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
                                                                                                                //connection with the child databasae(kd,password) by giving fulll path to the database
                                                                                                                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","fin_inv_system","password");//Connection is an interface
                                                                                                                Statement stmt = con.createStatement();//creating a statement reference required to execute a query
                                                                                                                
                                                                                                                String q1 = "select * from invoice where pid='"+pid+"'";
                                                                                                                rs = stmt.executeQuery(q1);//if query runs sucessfully it gives a +ve value

                                                                                                                while(rs.next() )   //both query runs
                                                                                                                {
                                                                                                                    count++;
                                                                                                                    inv_no = rs.getString("invoice_no");
                                                                                                                    inv_dt = rs.getString("invoice_date");
                                                                                                                    cname = rs.getString("customer_name");
                                                                                                                    amount = Float.parseFloat(rs.getString("amount"));
                                                                                                                    paid = rs.getString("paid");
                                                                                                                    if(paid==null || paid.equals(""))
                                                                                                                        paid = "NO";
                                                                                                                    out.print("<tr>"
                                                                                                                                +"<td>"+count+"</td>"
                                                                                                                                +"<td>"+inv_no+"</td>"
                                                                                                                                +"<td>"+inv_dt+"</td>"
                                                                                                                                +"<td>"+cname+"</td>"
                                                                                                                                +"<td>"+amount+"</td>"
                                                                                                                                +"<td>"+paid+"</td>"
                                                                                                                            + "</tr>");
                                                                                                                }

                                                                                                                con.close();
                                                                                                            }
                                                                                                            catch(Exception e)
                                                                                                            {
                                                                                                                out.println(e);
                                                                                                              }
                                                                                                        
      out.write("\n");
      out.write("                                                                                                        <tr>\n");
      out.write("                                                                                                            <td></td>\n");
      out.write("                                                                                                            <td></td>\n");
      out.write("                                                                                                            <td></td>\n");
      out.write("                                                                                                            <td></td>\n");
      out.write("                                                                                                            <td></td>\n");
      out.write("                                                                                                            <td></td>\n");
      out.write("                                                                                                        </tr>\n");
      out.write("                                                                                                    </table>\n");
      out.write("                                                                                                </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!--//outer-wp-->\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t <!--footer section start-->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<footer>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   <p>&copy 2016 Augment . All Rights Reserved | Design by <a href=\"https://w3layouts.com/\" target=\"_blank\">W3layouts.</a></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</footer>\n");
      out.write("\t\t\t\t\t\t\t\t\t<!--footer section end-->\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!--//content-inner-->\n");
      out.write("\t\t\t<!--/sidebar-menu-->\n");
      out.write("\t\t\t\t<div class=\"sidebar-menu\">\n");
      out.write("\t\t\t\t\t<header class=\"logo\">\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"sidebar-icon\"> <span class=\"fa fa-bars\"></span> </a> <a href=\"index.html\"> <span id=\"logo\"> <h1>Augment</h1></span> \n");
      out.write("\t\t\t\t\t<!--<img id=\"logo\" src=\"\" alt=\"Logo\"/>--> \n");
      out.write("\t\t\t\t  </a> \n");
      out.write("\t\t\t\t</header>\n");
      out.write("\t\t\t<div style=\"border-top:1px solid rgba(69, 74, 84, 0.7)\"></div>\n");
      out.write("\t\t\t<!--/down-->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"down\">\t\n");
      out.write("\t\t\t\t\t\t\t\t\t  <a href=\"index.html\"><img src=\"images/admin.jpg\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t  <a href=\"index.html\"><span class=\" name-caret\">Jasmin Leo</span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t <p>System Administrator in Company</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a class=\"tooltips\" href=\"index.html\"><span>Profile</span><i class=\"lnr lnr-user\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a class=\"tooltips\" href=\"index.html\"><span>Settings</span><i class=\"lnr lnr-cog\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a class=\"tooltips\" href=\"index.html\"><span>Log out</span><i class=\"lnr lnr-power-switch\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t   <!--//down-->\n");
      out.write("                           <div class=\"menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul id=\"menu\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"index.html\"><i class=\"fa fa-tachometer\"></i> <span>Dashboard</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t <li id=\"menu-academico\" ><a href=\"new_invoice.jsp\"><i class=\"fa fa-file-text-o\"></i> <span>New Invoice</span> </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t <li id=\"menu-academico\" ><a href=\"#\"><i class=\"fa fa-table\"></i> <span>All Invoices</span> </a></li>\n");
      out.write("                                                                                 <li id=\"menu-academico\" ><a href=\"dues.jsp\"><i class=\"fa fa-table\"></i> <span>Dues</span> </a></li>\n");
      out.write("                                                                                <li><a href=\"typography.html\"><i class=\"lnr lnr-pencil\"></i> <span>Payments</span></a></li>\n");
      out.write("                                                                                <li id=\"menu-academico\" ><a href=\"#\"><i class=\"lnr lnr-book\"></i> <span>Update Profile</span></a</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t\t\t\t  </ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t\t  <div class=\"clearfix\"></div>\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t\t\tvar toggle = true;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t$(\".sidebar-icon\").click(function() {                \n");
      out.write("\t\t\t\t\t\t\t  if (toggle)\n");
      out.write("\t\t\t\t\t\t\t  {\n");
      out.write("\t\t\t\t\t\t\t\t$(\".page-container\").addClass(\"sidebar-collapsed\").removeClass(\"sidebar-collapsed-back\");\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#menu span\").css({\"position\":\"absolute\"});\n");
      out.write("\t\t\t\t\t\t\t  }\n");
      out.write("\t\t\t\t\t\t\t  else\n");
      out.write("\t\t\t\t\t\t\t  {\n");
      out.write("\t\t\t\t\t\t\t\t$(\".page-container\").removeClass(\"sidebar-collapsed\").addClass(\"sidebar-collapsed-back\");\n");
      out.write("\t\t\t\t\t\t\t\tsetTimeout(function() {\n");
      out.write("\t\t\t\t\t\t\t\t  $(\"#menu span\").css({\"position\":\"relative\"});\n");
      out.write("\t\t\t\t\t\t\t\t}, 400);\n");
      out.write("\t\t\t\t\t\t\t  }\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttoggle = !toggle;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t</script>\n");
      out.write("<!--js -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/vroom.css\">\n");
      out.write("<script type=\"text/javascript\" src=\"js/vroom.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/TweenLite.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/CSSPlugin.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.nicescroll.js\"></script>\n");
      out.write("<script src=\"js/scripts.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Bootstrap Core JavaScript -->\n");
      out.write("   <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write('\n');
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
