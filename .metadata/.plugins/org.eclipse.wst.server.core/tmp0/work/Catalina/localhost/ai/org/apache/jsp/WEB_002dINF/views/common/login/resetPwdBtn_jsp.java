/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.81
 * Generated at: 2022-11-16 12:31:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.common.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class resetPwdBtn_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/D:/A_TeachingMaterial/6.JspSpring/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/FinalProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/A_TeachingMaterial/6.JspSpring/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/FinalProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1662347357502L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("#enterCR{\r\n");
      out.write("\r\n");
      out.write("position:fixed;\r\n");
      out.write("top:200px;\r\n");
      out.write("left:1900px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"splash-container\">\r\n");
      out.write("      <div class=\"card \">\r\n");
      out.write("         <div class=\"card-header text-center\">\r\n");
      out.write("            <a href=#><img class=\"logo-img\"\r\n");
      out.write("               src=\"");
      out.print(request.getContextPath() );
      out.write("/resources/img/??????.jpg\" alt=\" logo\"></a>\r\n");
      out.write("               <span class=\"splash-description\">???????????? ?????????</span>\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"card-body\">\r\n");
      out.write("            <form method=\"post\" action = \"resetPwdForm.do\">\r\n");
      out.write("               <div class=\"form-group\">\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" name=\"memId\" placeholder=\"???????????? ???????????????.\" required=\"required\">\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"form-group\">\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" name=\"name\" placeholder=\"????????? ???????????????.\" required=\"required\">\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"form-group\">\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" name=\"phone\" placeholder=\"?????????????????? ???????????????.\" required=\"required\">\r\n");
      out.write("               </div>\r\n");
      out.write("               <button type=\"submit\" class=\"btn btn-primary btn-lg btn-block\">??? ???</button>\r\n");
      out.write("            </form>\r\n");
      out.write("         </div>\r\n");
      out.write("         \r\n");
      out.write("      </div>\r\n");
      out.write("   </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <script src=\"../assets/vendor/jquery/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("   <script src=\"../assets/vendor/bootstrap/js/bootstrap.bundle.js\"></script>\r\n");
      out.write("\r\n");
      out.write("   <script async=\"\"\r\n");
      out.write("      src=\"https://www.googletagmanager.com/gtag/js?id=UA-23581568-13\"></script>\r\n");
      out.write("   <script>\r\n");
      out.write("      window.dataLayer = window.dataLayer || [];\r\n");
      out.write("      function gtag() {\r\n");
      out.write("         dataLayer.push(arguments);\r\n");
      out.write("      }\r\n");
      out.write("      gtag('js', new Date());\r\n");
      out.write("\r\n");
      out.write("      gtag('config', 'UA-23581568-13');\r\n");
      out.write("   </script>\r\n");
      out.write("   \r\n");
      out.write("  <script>\r\n");
      out.write("	\r\n");
      out.write("	window.onload = function() {\r\n");
      out.write("		document.getElementById('submit').onclick = function() {\r\n");
      out.write("			\r\n");
      out.write("			if ( document.pfrm.memId.value.trim() == '' ) {\r\n");
      out.write("				alert( 'ID??? ??????????????????' );\r\n");
      out.write("				return false;\r\n");
      out.write("			}\r\n");
      out.write("			if ( document.pfrm.name.value.trim() == '' ) {\r\n");
      out.write("				alert( '????????? ??????????????????' );\r\n");
      out.write("				return false;\r\n");
      out.write("			}\r\n");
      out.write("			if ( document.pfrm.phone.value.trim() == '' ) {\r\n");
      out.write("				alert( '????????? ????????? ??????????????????' );\r\n");
      out.write("				return false;\r\n");
      out.write("			}\r\n");
      out.write("			document.pfrm.submit();\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("   \r\n");
      out.write("   <script defer=\"\"\r\n");
      out.write("      src=\"https://static.cloudflareinsights.com/beacon.min.js/v652eace1692a40cfa3763df669d7439c1639079717194\"\r\n");
      out.write("      integrity=\"sha512-Gi7xpJR8tSkrpF7aordPZQlW2DLtzUlZcumS8dMQjwDHEnw9I7ZLyiOj/6tZStRBGtGgN6ceN6cMH8z7etPGlw==\"\r\n");
      out.write("      data-cf-beacon=\"{&quot;rayId&quot;:&quot;758529c84b4534b1&quot;,&quot;token&quot;:&quot;cd0b4b3a733644fc843ef0b185f98241&quot;,&quot;version&quot;:&quot;2022.8.1&quot;,&quot;si&quot;:100}\"\r\n");
      out.write("      crossorigin=\"anonymous\"></script>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
