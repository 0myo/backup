/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.81
 * Generated at: 2022-11-07 10:46:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.staff.stuManage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class graduateList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>jsp ????????? ???????????????</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<<style>\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("<!-- MAIN-CONTENT -->\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("<div class=\"main-content-jsp\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("   <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12\">\r\n");
      out.write("   \r\n");
      out.write("   <!-- ================================================= -->\r\n");
      out.write("   <!-- ?????? ?????? -->\r\n");
      out.write("   <!-- ================================================= -->\r\n");
      out.write("   <div class=\"card\">\r\n");
      out.write("   \r\n");
      out.write("   <!-- ================================================= -->\r\n");
      out.write("   <!-- ???????????? ?????? -->\r\n");
      out.write("   <!-- ================================================= -->\r\n");
      out.write("      <div class=\"card-body\">\r\n");
      out.write("         <!-- ================================================= -->\r\n");
      out.write("         <!-- ????????? ?????? -->\r\n");
      out.write("         <!-- ================================================= -->\r\n");
      out.write("         <!-- <div class=\"input-group mb-3 justify-content-end\"> -->\r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("            <!-- keyword -->\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("       <!--   <div class=\"\"> -->\r\n");
      out.write("         	<!--  <div class=\"form-group \"  >\r\n");
      out.write("         	 	<label for=\"inputName\">????????????</label>\r\n");
      out.write("				<select class=\"form-control\">\r\n");
      out.write("					<option>???????????? </option>\r\n");
      out.write("				</select>\r\n");
      out.write("         	 	<label for=\"inputName\">????????????</label>\r\n");
      out.write("				<select class=\"form-control\">\r\n");
      out.write("					<option>?????? </option>\r\n");
      out.write("				</select>\r\n");
      out.write("         	 	<label for=\"inputName\">????????????</label>\r\n");
      out.write("				<select class=\"form-control\">\r\n");
      out.write("					<option>?????? </option>\r\n");
      out.write("				</select>\r\n");
      out.write("				\r\n");
      out.write("			</div> -->\r\n");
      out.write("      <!--    </div> -->\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("               <div class=\"input-group mb-3\" >\r\n");
      out.write("              	 <label for=\"inputName\" style=margin-top:10px;>????????????</label>\r\n");
      out.write("                  <select class=\"form-control col-md-1\" name=\"perPageNum\" id=\"perPageNum\" onchange=\"list_go(1);\">                               \r\n");
      out.write("                       <option value=\"10\"> ??????</option>\r\n");
      out.write("                       <option value=\"10\">?????????</option>\r\n");
      out.write("                       <option value=\"2\">??????</option>\r\n");
      out.write("                       <option value=\"3\">??????</option>\r\n");
      out.write("                   </select> \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("              	 <label for=\"inputName\" style=margin-left:30px;margin-top:10px; >????????????</label>\r\n");
      out.write("                  <select class=\"form-control col-md-1\" name=\"perPageNum\" id=\"perPageNum\" onchange=\"list_go(1);\">                               \r\n");
      out.write("                       <option value=\"10\">??????</option>\r\n");
      out.write("                       <option value=\"10\">?????????</option>\r\n");
      out.write("                       <option value=\"2\">??????</option>\r\n");
      out.write("                       <option value=\"3\">??????</option>\r\n");
      out.write("                   </select>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("              	 <label for=\"inputName\" style=margin-left:30px;margin-top:10px;>????????????</label>\r\n");
      out.write("                  <select class=\"form-control col-md-1\" name=\"perPageNum\" id=\"perPageNum\" onchange=\"list_go(1);\">                               \r\n");
      out.write("                       <option value=\"10\">??????</option>\r\n");
      out.write("                       <option value=\"10\">?????????</option>\r\n");
      out.write("                       <option value=\"2\">??????</option>\r\n");
      out.write("                       <option value=\"3\">??????</option>\r\n");
      out.write("                   </select>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            	</div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("         <div class=\"input-group mb-3 float:left\">\r\n");
      out.write("         	<label for=\"inputName\" style=margin-top:15px;>????????????</label>\r\n");
      out.write("             <input  class=\"form-control col-md-4\" type=\"text\" name=\"keyword\" placeholder=\"????????? ???????????????.\" value=\"\"/>\r\n");
      out.write("              <span class=\"input-group-append\">\r\n");
      out.write("               <button class=\"btn btn-primary m-1\"  type=\"button\" id=\"\" onclick=\"\">??????</button >\r\n");
      out.write("               <button class=\"btn btn-dark m-1\"  type=\"button\" id=\"\" onclick=\"\">?????????</button >\r\n");
      out.write("                 <!--  <i class=\"fa fa-fw fa-search\"></i> -->\r\n");
      out.write("               </button>\r\n");
      out.write("            </span>\r\n");
      out.write("         </div>\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("             \r\n");
      out.write("           <div class=\"row justify-content-end mt-2 mr-2\" style=margin-bottom:15px;>\r\n");
      out.write("			<button class=\"btn btn-outline-primary btn-sm\" type=\"button\" onclick=\"\">??????</button>&nbsp;&nbsp;\r\n");
      out.write("			<button class=\"btn btn-outline-danger btn-sm\" type=\"button\" onclick=\"\">??????</button>\r\n");
      out.write("		</div>  \r\n");
      out.write("             \r\n");
      out.write("         <!-- ================================================= -->\r\n");
      out.write("         <!-- ????????? ??? -->\r\n");
      out.write("         <!-- ================================================= -->\r\n");
      out.write("      \r\n");
      out.write("         <!-- ================================================= -->\r\n");
      out.write("         <!-- ????????? ?????? -->\r\n");
      out.write("         <!-- ================================================= -->\r\n");
      out.write("      \r\n");
      out.write("         <table class=\"table table-hover\">\r\n");
      out.write("            <thead>\r\n");
      out.write("               <tr>\r\n");
      out.write("                  <th scope=\"col\">\r\n");
      out.write("                  </th>\r\n");
      out.write("                  <th scope=\"col\">??????</th>\r\n");
      out.write("                  <th scope=\"col\">??????</th>\r\n");
      out.write("                  <th scope=\"col\">??????</th>\r\n");
      out.write("                  <th scope=\"col\">?????????</th>\r\n");
      out.write("                  <th scope=\"col\">????????????</th>\r\n");
      out.write("                  <th scope=\"col\">????????????</th>\r\n");
      out.write("                  <th scope=\"col\">????????????</th>\r\n");
      out.write("                  <th scope=\"col\">????????????</th>\r\n");
      out.write("                  <th scope=\"col\">????????????</th>\r\n");
      out.write("                  <th scope=\"col\">??????????????????</th>\r\n");
      out.write("                  <th scope=\"col\">?????????</th>\r\n");
      out.write("                  <th scope=\"col\">????????????</th>\r\n");
      out.write("               </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            \r\n");
      out.write("            <tbody>\r\n");
      out.write("            \r\n");
      out.write("               <tr>\r\n");
      out.write("                  <th scope=\"row\">\r\n");
      out.write("                    <form>\r\n");
      out.write("                  		 <input type='checkbox' name='schol' value='y' />\r\n");
      out.write("                  	</form>\r\n");
      out.write("                  </th>\r\n");
      out.write("                  <td>777</td>\r\n");
      out.write("                  <td>1</td>\r\n");
      out.write("                  <td>?????????</td>\r\n");
      out.write("                  <td>2022-09-29</td>\r\n");
      out.write("                  <td>????????????</td>\r\n");
      out.write("                  <td>??????????????????</td>\r\n");
      out.write("                  <td>????????????</td>\r\n");
      out.write("                  <td>??????</td>\r\n");
      out.write("                  <td>128</td>\r\n");
      out.write("                  <td>128</td>\r\n");
      out.write("                  <td>010-1234-1234</td>\r\n");
      out.write("                  <td>??????</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("               <tr>\r\n");
      out.write("                  <th scope=\"row\">\r\n");
      out.write("                    <form>\r\n");
      out.write("                  		 <input type='checkbox' name='schol' value='y' />\r\n");
      out.write("                  	</form>\r\n");
      out.write("                  </th>\r\n");
      out.write("                  <td>777</td>\r\n");
      out.write("                  <td>1</td>\r\n");
      out.write("                  <td>?????????</td>\r\n");
      out.write("                  <td>2022-09-29</td>\r\n");
      out.write("                  <td>????????????</td>\r\n");
      out.write("                  <td>??????????????????</td>\r\n");
      out.write("                  <td>????????????</td>\r\n");
      out.write("                  <td>??????</td>\r\n");
      out.write("                  <td>128</td>\r\n");
      out.write("                  <td>128</td>\r\n");
      out.write("                  <td>010-1234-1234</td>\r\n");
      out.write("                  <td>??????</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("               <tr>\r\n");
      out.write("                  <th scope=\"row\">\r\n");
      out.write("                    <form>\r\n");
      out.write("                  		 <input type='checkbox' name='schol' value='y' />\r\n");
      out.write("                  	</form>\r\n");
      out.write("                  </th>\r\n");
      out.write("                  <td>777</td>\r\n");
      out.write("                  <td>1</td>\r\n");
      out.write("                  <td>?????????</td>\r\n");
      out.write("                  <td>2022-09-29</td>\r\n");
      out.write("                  <td>????????????</td>\r\n");
      out.write("                  <td>??????????????????</td>\r\n");
      out.write("                  <td>????????????</td>\r\n");
      out.write("                  <td>??????</td>\r\n");
      out.write("                  <td>128</td>\r\n");
      out.write("                  <td>128</td>\r\n");
      out.write("                  <td>010-1234-1234</td>\r\n");
      out.write("                  <td>??????</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("               <tr>\r\n");
      out.write("                  <th scope=\"row\">\r\n");
      out.write("                    <form>\r\n");
      out.write("                  		 <input type='checkbox' name='schol' value='y' />\r\n");
      out.write("                  	</form>\r\n");
      out.write("                  </th>\r\n");
      out.write("                  <td>777</td>\r\n");
      out.write("                  <td>1</td>\r\n");
      out.write("                  <td>?????????</td>\r\n");
      out.write("                  <td>2022-09-29</td>\r\n");
      out.write("                  <td>????????????</td>\r\n");
      out.write("                  <td>??????????????????</td>\r\n");
      out.write("                  <td>????????????</td>\r\n");
      out.write("                  <td>??????</td>\r\n");
      out.write("                  <td>128</td>\r\n");
      out.write("                  <td>128</td>\r\n");
      out.write("                  <td>010-1234-1234</td>\r\n");
      out.write("                  <td>??????</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("               <tr>\r\n");
      out.write("                  <th scope=\"row\">\r\n");
      out.write("                    <form>\r\n");
      out.write("                  		 <input type='checkbox' name='schol' value='y' />\r\n");
      out.write("                  	</form>\r\n");
      out.write("                  </th>\r\n");
      out.write("                  <td>777</td>\r\n");
      out.write("                  <td>1</td>\r\n");
      out.write("                  <td>?????????</td>\r\n");
      out.write("                  <td>2022-09-29</td>\r\n");
      out.write("                  <td>????????????</td>\r\n");
      out.write("                  <td>??????????????????</td>\r\n");
      out.write("                  <td>????????????</td>\r\n");
      out.write("                  <td>??????</td>\r\n");
      out.write("                  <td>128</td>\r\n");
      out.write("                  <td>128</td>\r\n");
      out.write("                  <td>010-1234-1234</td>\r\n");
      out.write("                  <td>??????</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("               <tr>\r\n");
      out.write("                  <th scope=\"row\">\r\n");
      out.write("                    <form>\r\n");
      out.write("                  		 <input type='checkbox' name='schol' value='y' />\r\n");
      out.write("                  	</form>\r\n");
      out.write("                  </th>\r\n");
      out.write("                  <td>777</td>\r\n");
      out.write("                  <td>1</td>\r\n");
      out.write("                  <td>?????????</td>\r\n");
      out.write("                  <td>2022-09-29</td>\r\n");
      out.write("                  <td>????????????</td>\r\n");
      out.write("                  <td>??????????????????</td>\r\n");
      out.write("                  <td>????????????</td>\r\n");
      out.write("                  <td>??????</td>\r\n");
      out.write("                  <td>128</td>\r\n");
      out.write("                  <td>128</td>\r\n");
      out.write("                  <td>010-1234-1234</td>\r\n");
      out.write("                  <td>??????</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("               <tr>\r\n");
      out.write("                  <th scope=\"row\">\r\n");
      out.write("                    <form>\r\n");
      out.write("                  		 <input type='checkbox' name='schol' value='y' />\r\n");
      out.write("                  	</form>\r\n");
      out.write("                  </th>\r\n");
      out.write("                  <td>777</td>\r\n");
      out.write("                  <td>1</td>\r\n");
      out.write("                  <td>?????????</td>\r\n");
      out.write("                  <td>2022-09-29</td>\r\n");
      out.write("                  <td>????????????</td>\r\n");
      out.write("                  <td>??????????????????</td>\r\n");
      out.write("                  <td>????????????</td>\r\n");
      out.write("                  <td>??????</td>\r\n");
      out.write("                  <td>128</td>\r\n");
      out.write("                  <td>128</td>\r\n");
      out.write("                  <td>010-1234-1234</td>\r\n");
      out.write("                  <td>??????</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("               <tr>\r\n");
      out.write("                  <th scope=\"row\">\r\n");
      out.write("                    <form>\r\n");
      out.write("                  		 <input type='checkbox' name='schol' value='y' />\r\n");
      out.write("                  	</form>\r\n");
      out.write("                  </th>\r\n");
      out.write("                  <td>777</td>\r\n");
      out.write("                  <td>1</td>\r\n");
      out.write("                  <td>?????????</td>\r\n");
      out.write("                  <td>2022-09-29</td>\r\n");
      out.write("                  <td>????????????</td>\r\n");
      out.write("                  <td>??????????????????</td>\r\n");
      out.write("                  <td>????????????</td>\r\n");
      out.write("                  <td>??????</td>\r\n");
      out.write("                  <td>128</td>\r\n");
      out.write("                  <td>128</td>\r\n");
      out.write("                  <td>010-1234-1234</td>\r\n");
      out.write("                  <td>??????</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("           \r\n");
      out.write("              \r\n");
      out.write("          \r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("            </tbody>\r\n");
      out.write("         </table>\r\n");
      out.write("\r\n");
      out.write("      <!-- ================================================= -->\r\n");
      out.write("      <!-- ????????? ??? -->\r\n");
      out.write("      <!-- ================================================= -->\r\n");
      out.write("   \r\n");
      out.write("      <!-- ================================================= -->\r\n");
      out.write("      <!-- ?????? ?????? ?????? -->\r\n");
      out.write("      <!-- ================================================= -->\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("     <!--  <div class=\"row justify-content-end mt-2 mr-2\">\r\n");
      out.write("         <button class=\"btn btn-outline-primary btn-sm\" type=\"button\"onclick=\"\">????????????</button>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div> -->\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      <!-- ================================================= -->\r\n");
      out.write("      <!-- ?????? ?????? ??? -->\r\n");
      out.write("      <!-- ================================================= -->\r\n");
      out.write("   \r\n");
      out.write("      <!-- ================================================= -->\r\n");
      out.write("      <!-- ?????????????????? ?????? -->\r\n");
      out.write("      <!-- ================================================= -->\r\n");
      out.write("     <!--  <div class=\"row justify-content-center\">\r\n");
      out.write("            <nav aria-label=\"Page navigation example\">\r\n");
      out.write("               <ul class=\"pagination\">\r\n");
      out.write("                  <li class=\"page-item\">\r\n");
      out.write("                     <a class=\"page-link\" href=\"#\" aria-label=\"Previous\">\r\n");
      out.write("                        <span aria-hidden=\"true\">??</span>\r\n");
      out.write("                        <span class=\"sr-only\">Previous</span>\r\n");
      out.write("                     </a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"page-item active\">\r\n");
      out.write("                     <a class=\"page-link\" href=\"#\">1</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"page-item\">\r\n");
      out.write("                     <a class=\"page-link\" href=\"#\">2</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"page-item\">\r\n");
      out.write("                     <a class=\"page-link\" href=\"#\">3</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"page-item\">\r\n");
      out.write("                     <a class=\"page-link\" href=\"#\" aria-label=\"Next\">\r\n");
      out.write("                        <span aria-hidden=\"true\">??</span>\r\n");
      out.write("                        <span class=\"sr-only\">Next</span>\r\n");
      out.write("                     </a>\r\n");
      out.write("                  </li>\r\n");
      out.write("               </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("      </div> -->\r\n");
      out.write("      <!-- ================================================= -->\r\n");
      out.write("      <!-- ?????????????????? ??? -->\r\n");
      out.write("      <!-- ================================================= -->\r\n");
      out.write("      \r\n");
      out.write("   </div> \r\n");
      out.write("   <!-- ================================================= -->\r\n");
      out.write("   <!-- ???????????? ??? -->\r\n");
      out.write("   <!-- ================================================= -->\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   <div class=\"card-footer\">\r\n");
      out.write("      <div class=\"row justify-content-center\">\r\n");
      out.write("            <nav aria-label=\"Page navigation example\">\r\n");
      out.write("               <ul class=\"pagination\">\r\n");
      out.write("                  <li class=\"page-item\">\r\n");
      out.write("                     <a class=\"page-link\" href=\"#\" aria-label=\"Previous\">\r\n");
      out.write("                        <span aria-hidden=\"true\">??</span>\r\n");
      out.write("                        <span class=\"sr-only\">Previous</span>\r\n");
      out.write("                     </a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"page-item active\">\r\n");
      out.write("                     <a class=\"page-link\" href=\"#\">1</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"page-item\">\r\n");
      out.write("                     <a class=\"page-link\" href=\"#\">2</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"page-item\">\r\n");
      out.write("                     <a class=\"page-link\" href=\"#\">3</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"page-item\">\r\n");
      out.write("                     <a class=\"page-link\" href=\"#\" aria-label=\"Next\">\r\n");
      out.write("                        <span aria-hidden=\"true\">??</span>\r\n");
      out.write("                        <span class=\"sr-only\">Next</span>\r\n");
      out.write("                     </a>\r\n");
      out.write("                  </li>\r\n");
      out.write("               </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("      </div>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("     \r\n");
      out.write("   </div>\r\n");
      out.write("   <!-- ================================================= -->\r\n");
      out.write("   <!-- ?????? ??? -->\r\n");
      out.write("   <!-- ================================================= -->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("<!-- MAIN-CONTENT ??? -->\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("</body>\r\n");
      out.write("<!-- \r\n");
      out.write("<div class=\"form-row\">\r\n");
      out.write("	<div class=\"col-xl-4 col-lg-4 col-md-12 col-sm-12 col-12 mb-2\">\r\n");
      out.write("		<label for=\"validationCustom03\">City</label> <input type=\"text\"\r\n");
      out.write("			class=\"form-control\" id=\"validationCustom03\" placeholder=\"City\"\r\n");
      out.write("			required=\"\">\r\n");
      out.write("		<div class=\"invalid-feedback\">Please provide a valid city.</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"col-xl-4 col-lg-4 col-md-12 col-sm-12 col-12 mb-2\">\r\n");
      out.write("		<label for=\"validationCustom04\">State</label> <input type=\"text\"\r\n");
      out.write("			class=\"form-control\" id=\"validationCustom04\" placeholder=\"State\"\r\n");
      out.write("			required=\"\">\r\n");
      out.write("		<div class=\"invalid-feedback\">Please provide a valid state.</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"col-xl-4 col-lg-4 col-md-12 col-sm-12 col-12 mb-2\">\r\n");
      out.write("		<label for=\"validationCustom05\">Zip</label> <input type=\"text\"\r\n");
      out.write("			class=\"form-control\" id=\"validationCustom05\" placeholder=\"Zip\"\r\n");
      out.write("			required=\"\">\r\n");
      out.write("		<div class=\"invalid-feedback\">Please provide a valid zip.</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12\">\r\n");
      out.write("		<div class=\"form-group\">\r\n");
      out.write("			<div class=\"form-check\">\r\n");
      out.write("				<input class=\"form-check-input\" type=\"checkbox\" value=\"\"\r\n");
      out.write("					id=\"invalidCheck\" required=\"\"> <label\r\n");
      out.write("					class=\"form-check-label\" for=\"invalidCheck\"> Agree to terms\r\n");
      out.write("					and conditions </label>\r\n");
      out.write("				<div class=\"invalid-feedback\">You must agree before\r\n");
      out.write("					submitting.</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 \">\r\n");
      out.write("		<button class=\"btn btn-primary\" type=\"submit\">Submit form</button>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write(" -->");
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
