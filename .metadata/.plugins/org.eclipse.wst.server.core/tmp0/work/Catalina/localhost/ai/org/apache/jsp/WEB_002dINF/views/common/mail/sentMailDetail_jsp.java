/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.81
 * Generated at: 2022-11-25 01:32:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.common.mail;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sentMailDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".dashboard-main-wrapper {\r\n");
      out.write("	padding-top: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dashboard-wrapper {\r\n");
      out.write("	margin-left: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-aside {\r\n");
      out.write("	margin-top: 0px;\r\n");
      out.write("	left: 0px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"dashboard-main-wrapper\">\r\n");
      out.write("	<div class=\"dashboard-wrapper\">\r\n");
      out.write("		<input type=\"hidden\" name=\"sentNoteSeq\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sentNoteSeq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"container-fluid\">\r\n");
      out.write("			<aside class=\"page-aside\">\r\n");
      out.write("				<div class=\"aside-content\">\r\n");
      out.write("					<div class=\"aside-header\">\r\n");
      out.write("						<button class=\"navbar-toggle\" data-target=\".aside-nav\"\r\n");
      out.write("							data-toggle=\"collapse\" type=\"button\">\r\n");
      out.write("							<span class=\"icon\"><i class=\"fas fa-caret-down\"></i></span>\r\n");
      out.write("						</button>\r\n");
      out.write("						<div class=\"f-icon\">\r\n");
      out.write("							<span class=\"title\" onclick=\"pageMove('");
      out.print(request.getContextPath());
      out.write("/common/mail/received/list');\"><i class=\"fas fa-envelope\" style=\"margin-right:10px\"></i>쪽지함</span>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"aside-compose\">\r\n");
      out.write("						<a class=\"btn btn-lg btn-primary btn-block\" href=\"#\"\r\n");
      out.write("						 style=\"cursor: pointer;\" onclick=\"pageMove('");
      out.print(request.getContextPath());
      out.write("/common/mail/sendForm.do');\">쪽지 보내기</a>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"aside-nav collapse\" >\r\n");
      out.write("						<ul class=\"nav\">\r\n");
      out.write("							<li ><a href=\"#\"  style=\"cursor: pointer;\" onclick=\"pageMove('");
      out.print(request.getContextPath());
      out.write("/common/mail/received/list.do');\"><span class=\"icon\"><i\r\n");
      out.write("										class=\"fas fa-fw fa-inbox\"></i></span>받은 쪽지함<span\r\n");
      out.write("									class=\"badge badge-primary float-right\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${count }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span></a></li>\r\n");
      out.write("							<li ><a href=\"#\" style=\"cursor: pointer;\" onclick=\"pageMove('");
      out.print(request.getContextPath());
      out.write("/common/mail/sent/list.do');\"><span class=\"icon\"><i\r\n");
      out.write("										class=\"fas fa-fw  fa-envelope\"></i></span>보낸 쪽지함</a></li>\r\n");
      out.write("						<!-- 	<li><a href=\"#\"><span class=\"icon\"><i\r\n");
      out.write("										class=\"fas fa-fw fa-briefcase\"></i></span>중요 쪽지함<span\r\n");
      out.write("									class=\"badge badge-secondary float-right\">4</span></a></li>\r\n");
      out.write("							<li><a href=\"#\"><span class=\"icon\"><i\r\n");
      out.write("										class=\"fas fa-fw fa-star\"></i></span>즐겨찾기</a></li> -->\r\n");
      out.write("							<li><a href=\"#\"  style=\"cursor: pointer;\" onclick=\"pageMove('");
      out.print(request.getContextPath());
      out.write("/common/mail/bin/list.do');\"><span class=\"icon\"><i\r\n");
      out.write("										class=\"fas fa-fw fa-trash\"></i></span>휴지통</a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("						<!-- <span class=\"title\">Labels</span>\r\n");
      out.write("						<ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("							<li><a href=\"#\"><i\r\n");
      out.write("									class=\"m-r-10 mdi mdi-label text-secondary\"></i> Important </a></li>\r\n");
      out.write("							<li><a href=\"#\"> <i\r\n");
      out.write("									class=\"m-r-10 mdi mdi-label text-primary\"></i> Business\r\n");
      out.write("							</a></li>\r\n");
      out.write("							<li><a href=\"#\"> <i\r\n");
      out.write("									class=\"m-r-10 mdi mdi-label text-brand\"></i> Inspiration\r\n");
      out.write("							</a></li>\r\n");
      out.write("						</ul> -->\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</aside>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<div class=\"main-content container-fluid p-0\">\r\n");
      out.write("				<div class=\"email-head\">\r\n");
      out.write("					<div class=\"email-head-subject\">\r\n");
      out.write("						<div class=\"title\">\r\n");
      out.write("							<a class=\"\" href=\"#\">\r\n");
      out.write("							<span class=\"icon\"><i\r\n");
      out.write("									class=\"fas fa-bookmark\"></i></span></a>\r\n");
      out.write("									 <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detail.title }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("									 \r\n");
      out.write("									 <!-- <div class=\"icons\">\r\n");
      out.write("								<a href=\"#\" class=\"icon\"><i class=\"fas fa-reply\"></i></a><a\r\n");
      out.write("									href=\"#\" class=\"icon\"><i class=\"fas fa-print\"></i></a><a\r\n");
      out.write("									href=\"#\" class=\"icon\"><i class=\"fas fa-trash\"></i></a>\r\n");
      out.write("							</div> -->\r\n");
      out.write("							\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"email-head-sender\">\r\n");
      out.write("						<div class=\"date\">");
      if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_page_context))
        return;
      out.write("</div>\r\n");
      out.write("						\r\n");
      out.write("						<div class=\"sender\">\r\n");
      out.write("							<a href=\"#\">보낸사람: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detail.senderId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("							<!-- to <a href=\"#\">me</a> -->\r\n");
      out.write("							<div class=\"actions\">\r\n");
      out.write("								<a class=\"icon toggle-dropdown\" href=\"#\" data-toggle=\"dropdown\"><i\r\n");
      out.write("									class=\"fas fa-caret-down\"></i></a>\r\n");
      out.write("								<div class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("									<a class=\"dropdown-item\" href=\"#\">바로 답장하기</a>\r\n");
      out.write("										\r\n");
      out.write("									<div class=\"dropdown-divider\"></div>\r\n");
      out.write("									<a class=\"dropdown-item\" href=\"#\">삭제</a>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"email-body\">\r\n");
      out.write("					");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detail.content }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"email-attachments\">\r\n");
      out.write("					<div class=\"title\">첨부파일</div>\r\n");
      out.write("					<ul>\r\n");
      out.write("						");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      boolean _jspx_th_c_005fif_005f0_reused = false;
      try {
        _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fif_005f0.setParent(null);
        // /WEB-INF/views/common/mail/sentMailDetail.jsp(121,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty detail.attachList}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
        int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
        if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                        <td>\r\n");
            out.write("										 ");
            //  c:forEach
            org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
            boolean _jspx_th_c_005fforEach_005f0_reused = false;
            try {
              _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
              // /WEB-INF/views/common/mail/sentMailDetail.jsp(123,11) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
              _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/common/mail/sentMailDetail.jsp(123,11) '${detail.attachList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${detail.attachList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
              // /WEB-INF/views/common/mail/sentMailDetail.jsp(123,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_c_005fforEach_005f0.setVar("attach");
              int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
              try {
                int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
                if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\r\n");
                    out.write("													<div class=\"col-md-12 col-sm-4 col-xs-12 d-flex justify-content-front\" style=\"cursor:pointer;\" onclick=\"location.href='");
                    out.print(request.getContextPath());
                    out.write("/getFile?anoCd=");
                    out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attach.anoCd}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                    out.write("&anoSeq=");
                    out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attach.anoSeq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                    out.write("'\">\r\n");
                    out.write("															\r\n");
                    out.write("																<i class=\"fa fa-copy\"></i>\r\n");
                    out.write("															<span class =\"info-box-number\">");
                    out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attach.filename }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                    out.write("</span>\r\n");
                    out.write("													</div>\r\n");
                    out.write("										");
                    int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  return;
                }
              } catch (java.lang.Throwable _jspx_exception) {
                while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
                  out = _jspx_page_context.popBody();
                _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
              } finally {
                _jspx_th_c_005fforEach_005f0.doFinally();
              }
              _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
              _jspx_th_c_005fforEach_005f0_reused = true;
            } finally {
              org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
            }
            out.write("\r\n");
            out.write("								</td>\r\n");
            out.write("							 ");
            int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
        _jspx_th_c_005fif_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
      }
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                        ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"../assets/vendor/jquery/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script src=\"../assets/vendor/bootstrap/js/bootstrap.bundle.js\"></script>\r\n");
      out.write("<script src=\"../assets/vendor/slimscroll/jquery.slimscroll.js\"></script>\r\n");
      out.write("<script src=\"../assets/libs/js/main-js.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("	$(document).ready(function() {\r\n");
      out.write("\r\n");
      out.write("		// binding the check all box to onClick event\r\n");
      out.write("		$(\".chk_all\").click(function() {\r\n");
      out.write("\r\n");
      out.write("			var checkAll = $(\".chk_all\").prop('checked');\r\n");
      out.write("			if (checkAll) {\r\n");
      out.write("				$(\".checkboxes\").prop(\"checked\", true);\r\n");
      out.write("			} else {\r\n");
      out.write("				$(\".checkboxes\").prop(\"checked\", false);\r\n");
      out.write("			}\r\n");
      out.write("\r\n");
      out.write("		});\r\n");
      out.write("\r\n");
      out.write("		// if all checkboxes are selected, then checked the main checkbox class and vise versa\r\n");
      out.write("		$(\".checkboxes\").click(function() {\r\n");
      out.write("\r\n");
      out.write("			if ($(\".checkboxes\").length == $(\".subscheked:checked\").length) {\r\n");
      out.write("				$(\".chk_all\").attr(\"checked\", \"checked\");\r\n");
      out.write("			} else {\r\n");
      out.write("				$(\".chk_all\").removeAttr(\"checked\");\r\n");
      out.write("			}\r\n");
      out.write("\r\n");
      out.write("		});\r\n");
      out.write("\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script async=\"\"\r\n");
      out.write("	src=\"https://www.googletagmanager.com/gtag/js?id=UA-23581568-13\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("	window.dataLayer = window.dataLayer || [];\r\n");
      out.write("	function gtag() {\r\n");
      out.write("		dataLayer.push(arguments);\r\n");
      out.write("	}\r\n");
      out.write("	gtag('js', new Date());\r\n");
      out.write("\r\n");
      out.write("	gtag('config', 'UA-23581568-13');\r\n");
      out.write("</script>\r\n");
      out.write("<script defer=\"\"\r\n");
      out.write("	src=\"https://static.cloudflareinsights.com/beacon.min.js/v652eace1692a40cfa3763df669d7439c1639079717194\"\r\n");
      out.write("	integrity=\"sha512-Gi7xpJR8tSkrpF7aordPZQlW2DLtzUlZcumS8dMQjwDHEnw9I7ZLyiOj/6tZStRBGtGgN6ceN6cMH8z7etPGlw==\"\r\n");
      out.write("	data-cf-beacon=\"{&quot;rayId&quot;:&quot;757d8f593c31af37&quot;,&quot;token&quot;:&quot;cd0b4b3a733644fc843ef0b185f98241&quot;,&quot;version&quot;:&quot;2022.8.1&quot;,&quot;si&quot;:100}\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    boolean _jspx_th_fmt_005fformatDate_005f0_reused = false;
    try {
      _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatDate_005f0.setParent(null);
      // /WEB-INF/views/common/mail/sentMailDetail.jsp(97,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detail.sendDate }", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/views/common/mail/sentMailDetail.jsp(97,24) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy년 MM월 dd일 hh:mm:ss");
      int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
      if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      _jspx_th_fmt_005fformatDate_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatDate_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatDate_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/common/mail/sentMailDetail.jsp(133,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty detail.attachList}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <td> <span>첨부파일 없음</span></td>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }
}
