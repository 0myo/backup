/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.81
 * Generated at: 2022-11-16 03:25:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.prof.counsel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class completeList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/A_TeachingMaterial/6.JspSpring/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/FinalProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/A_TeachingMaterial/6.JspSpring/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/FinalProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/A_TeachingMaterial/6.JspSpring/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/FinalProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("   \r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("<!-- 검색바 시작 -->\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"input-group mb-3 justify-content-end\">\r\n");
      out.write("\r\n");
      out.write("   <select class=\"form-control col-md-1\" name=\"perPageNum\" id=\"perPageNum\" onchange=\"list_go(1);\">                               \r\n");
      out.write("        <option value=\"10\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cri.perPageNum eq 10 ? 'selected' : '' }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" >정렬개수</option>\r\n");
      out.write("        <option value=\"2\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cri.perPageNum eq 2 ? 'selected' : '' }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">2개씩</option>\r\n");
      out.write("        <option value=\"3\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cri.perPageNum eq 3 ? 'selected' : '' }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">3개씩</option>\r\n");
      out.write("        <option value=\"5\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cri.perPageNum eq 5 ? 'selected' : '' }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">5개씩</option>\r\n");
      out.write("     </select>\r\n");
      out.write("    <select class=\"form-control col-md-1\" name=\"searchType\" id=\"searchType\">\r\n");
      out.write("       <option value=\"\"  >검색구분</option>\r\n");
      out.write("      <option value=\"t\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.searchType=='t' ? \"selected\":\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">글제목</option>\r\n");
      out.write("      <option value=\"w\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.searchType=='w' ? \"selected\":\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">작성자</option>\r\n");
      out.write("      <option value=\"c\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.searchType=='c' ? \"selected\":\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">글내용</option>   \r\n");
      out.write("                                              \r\n");
      out.write("   </select>\r\n");
      out.write("   <!-- keyword -->\r\n");
      out.write("    <input  class=\"form-control col-md-2\" type=\"text\" name=\"keyword\" placeholder=\"검색어를 입력하세요.\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cri.keyword }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("   <span class=\"input-group-append\">\r\n");
      out.write("      <button class=\"btn btn-primary btn-sm\" type=\"button\" \r\n");
      out.write("            id=\"searchBtn\" onclick=\"list_go(1);\">\r\n");
      out.write("         <i class=\"fa fa-fw fa-search\"></i>\r\n");
      out.write("      </button>\r\n");
      out.write("   </span>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("<!-- 검색바 끝 -->\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("<!-- 게시판 시작 -->\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("							<table class=\"table table-hover\">\r\n");
      out.write("								<thead>\r\n");
      out.write("									<tr>\r\n");
      out.write("										<th scope=\"col\">상담번호</th>\r\n");
      out.write("										<th scope=\"col\">학번</th>\r\n");
      out.write("										<th scope=\"col\">이름</th>\r\n");
      out.write("										<th scope=\"col\">일시</th>\r\n");
      out.write("										<th scope=\"col\">장소</th>\r\n");
      out.write("										<th scope=\"col\">상태</th>\r\n");
      out.write("									</tr>\r\n");
      out.write("								</thead>\r\n");
      out.write("								<tbody>\r\n");
      out.write("								\r\n");
      out.write("								\r\n");
      out.write("									<tr style=\"cursor:pointer;\" onclick=\"OpenWindow('");
      out.print(request.getContextPath());
      out.write("/prof/counsel/complete/detail','글등록',800,550);\">\r\n");
      out.write("										<td scope=\"col\">1001</td>\r\n");
      out.write("										<td scope=\"col\">220102001</td>\r\n");
      out.write("										<td scope=\"col\">박건영</td>\r\n");
      out.write("										<td scope=\"col\">2022-09-30 10:00</td>\r\n");
      out.write("										<td scope=\"col\">401호</td>\r\n");
      out.write("										<td scope=\"col\">작성완료</td>\r\n");
      out.write("									</tr>\r\n");
      out.write("									<tr>\r\n");
      out.write("										<td scope=\"col\">1001</td>\r\n");
      out.write("										<td scope=\"col\">220102001</td>\r\n");
      out.write("										<td scope=\"col\">박건영</td>\r\n");
      out.write("										<td scope=\"col\">2022-09-30 10:00</td>\r\n");
      out.write("										<td scope=\"col\">401호</td>\r\n");
      out.write("										<td scope=\"col\">미작성</td>\r\n");
      out.write("									</tr>\r\n");
      out.write("									<tr>\r\n");
      out.write("										<td scope=\"col\">1001</td>\r\n");
      out.write("										<td scope=\"col\">220102001</td>\r\n");
      out.write("										<td scope=\"col\">박건영</td>\r\n");
      out.write("										<td scope=\"col\">2022-09-30 10:00</td>\r\n");
      out.write("										<td scope=\"col\">401호</td>\r\n");
      out.write("										<td scope=\"col\">미작성</td>\r\n");
      out.write("									</tr>\r\n");
      out.write("										\r\n");
      out.write("										\r\n");
      out.write("\r\n");
      out.write("									\r\n");
      out.write("								</tbody>\r\n");
      out.write("							</table>\r\n");
      out.write("						</div>\r\n");
      out.write("						\r\n");
      out.write("						\r\n");
      out.write("						<!-- 버튼 -->\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("<!-- 게시판 끝 -->\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("<!-- 페이지네이션 시작 -->\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("<div class=\"row justify-content-center\">\r\n");
      out.write("      <nav aria-label=\"Page navigation example\">\r\n");
      out.write("         <ul class=\"pagination\">\r\n");
      out.write("            <li class=\"page-item\">\r\n");
      out.write("               <a class=\"page-link\" href=\"#\" aria-label=\"Previous\">\r\n");
      out.write("                  <span aria-hidden=\"true\">«</span>\r\n");
      out.write("                  <span class=\"sr-only\">Previous</span>\r\n");
      out.write("               </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"page-item active\">\r\n");
      out.write("               <a class=\"page-link\" href=\"#\">1</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"page-item\">\r\n");
      out.write("               <a class=\"page-link\" href=\"#\">2</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"page-item\">\r\n");
      out.write("               <a class=\"page-link\" href=\"#\">3</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"page-item\">\r\n");
      out.write("               <a class=\"page-link\" href=\"#\" aria-label=\"Next\">\r\n");
      out.write("                  <span aria-hidden=\"true\">»</span>\r\n");
      out.write("                  <span class=\"sr-only\">Next</span>\r\n");
      out.write("               </a>\r\n");
      out.write("            </li>\r\n");
      out.write("         </ul>\r\n");
      out.write("      </nav>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("<!-- 페이지네이션 끝 -->\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("      \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("<!-- MAIN-CONTENT 끝 -->\r\n");
      out.write("<!-- ================================================= -->\r\n");
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
