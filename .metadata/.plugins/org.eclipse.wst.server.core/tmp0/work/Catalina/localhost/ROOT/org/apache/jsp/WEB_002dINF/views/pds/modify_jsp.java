/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.81
 * Generated at: 2022-09-02 08:18:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.pds;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modify_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:escapeXml", org.apache.taglibs.standard.functions.Functions.class, "escapeXml", new Class[] {java.lang.String.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/D:/A_TeachingMaterial/6.JspSpring/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/JSP_command_bootstrap/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1661154304095L));
    _jspx_dependants.put("jar:file:/D:/A_TeachingMaterial/6.JspSpring/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/JSP_command_bootstrap/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write(" <!-- summernote -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/resources/bootstrap/plugins/summernote/summernote-bs4.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>????????? ???????????????</title>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<body>	\r\n");
      out.write("	 <!-- Content Header (Page header) -->\r\n");
      out.write("    <section class=\"content-header\">\r\n");
      out.write("    	<div class=\"container-fluid\">\r\n");
      out.write("    		<div class=\"row mb-2\">\r\n");
      out.write("    			<div class=\"col-sm-6\">\r\n");
      out.write("	      			<h1>?????????</h1>\r\n");
      out.write("	      		</div>	      		\r\n");
      out.write("	    	\r\n");
      out.write("	       		\r\n");
      out.write("	       		<div class=\"col-sm-6\">\r\n");
      out.write("			      <ol class=\"breadcrumb float-sm-right\">\r\n");
      out.write("			        <li class=\"breadcrumb-item\"><a href=\"list.do\"><i class=\"fa fa-dashboard\"></i>?????????</a></li>\r\n");
      out.write("			        <li class=\"breadcrumb-item active\">?????????</li>		        \r\n");
      out.write("			      </ol>\r\n");
      out.write("		      	</div>\r\n");
      out.write("	     	</div>	     	\r\n");
      out.write("      	</div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("   <!-- Main content -->\r\n");
      out.write("    <section class=\"content container-fluid\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-md-12\">\r\n");
      out.write("				<div class=\"card card-outline card-primary\">\r\n");
      out.write("					<div class=\"card-header\">\r\n");
      out.write("						<h3>?????? ??????</h3>\r\n");
      out.write("					</div><!--end card-header  -->\r\n");
      out.write("					<div class=\"card-body\">\r\n");
      out.write("						<form enctype=\"multipart/form-data\" role=\"form\" method=\"post\" action=\"modify.do\" name=\"modifyForm\">\r\n");
      out.write("							<input type=\"hidden\" name=\"pno\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pds.pno }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("							\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"writer\">?????????</label> \r\n");
      out.write("								<input type=\"text\" id=\"writer\" readonly\r\n");
      out.write("									name=\"writer\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pds.writer }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"title\">??? ???</label> \r\n");
      out.write("								<input type=\"text\" id=\"title\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pds.title }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("									name='title' class=\"form-control\" placeholder=\"????????? ?????????\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"content\">??? ???</label>\r\n");
      out.write("								<textarea id=\"content\" name=\"content\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(pds.content) }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</textarea>\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("							<div class=\"form-group\">								\r\n");
      out.write("								<div class=\"card card-outline card-success\">\r\n");
      out.write("									<div class=\"card-header\">\r\n");
      out.write("										<h3 style=\"display:inline;line-height:40px;\">???????????? : </h3>\r\n");
      out.write("										&nbsp;&nbsp;\r\n");
      out.write("										<button class=\"btn btn-primary\"	onclick=\"addFile_go()\" type=\"button\" id=\"addFileBtn\">Add File</button>\r\n");
      out.write("									</div>									\r\n");
      out.write("									<div class=\"card-footer fileInput\">\r\n");
      out.write("										<ul class=\"mailbox-attachments d-flex align-items-stretch clearfix\">\r\n");
      out.write("											<!-- ???????????? ????????? -->		\r\n");
      out.write("											");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      boolean _jspx_th_c_005fforEach_005f0_reused = false;
      try {
        _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fforEach_005f0.setParent(null);
        // /WEB-INF/views/pds/modify.jsp(72,11) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/pds/modify.jsp(72,11) '${pds.attachList }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pds.attachList }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
        // /WEB-INF/views/pds/modify.jsp(72,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setVar("attach");
        int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
          if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("												<li class=\"attach-item thumb");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attach.ano }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\" file-name=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attach.fileName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\" target-ano=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attach.ano }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\">																			\r\n");
              out.write("												<div class=\"mailbox-attachment-info \">\r\n");
              out.write("													<a class=\"mailbox-attachment-name\" name=\"attachedFile\" attach-fileName=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attach.fileName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\" attach-no=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attach.ano }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\" href=\"");
              out.print(request.getContextPath());
              out.write("/pds/getFile.do?ano=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attach.ano }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\"  >													\r\n");
              out.write("														<i class=\"fas fa-paperclip\"></i>\r\n");
              out.write("														");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attach.fileName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("&nbsp;&nbsp;\r\n");
              out.write("														<button type=\"button\" onclick=\"removeFile_go('thumb");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attach.ano}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("');return false;\" style=\"border:0;outline:0;\" \r\n");
              out.write("																class=\"badge bg-red\">X</button>																									\r\n");
              out.write("													</a>													\r\n");
              out.write("												</div>\r\n");
              out.write("											</li>	\r\n");
              out.write("											");
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
      out.write("								\r\n");
      out.write("										</ul>\r\n");
      out.write("										<br/>														\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("						\r\n");
      out.write("						</form>\r\n");
      out.write("					</div><!--end card-body  -->\r\n");
      out.write("					<div class=\"card-footer\">\r\n");
      out.write("						<button type=\"button\" class=\"btn btn-warning\" id=\"modifyBtn\" onclick=\"modify_go();\">??? ???</button>\r\n");
      out.write("						&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("						<button type=\"button\" class=\"btn\" id=\"cancelBtn\" onclick=\"history.go(-1);\">??? ???</button>\r\n");
      out.write("					</div><!--end card-footer  -->\r\n");
      out.write("				</div><!-- end card -->				\r\n");
      out.write("			</div><!-- end col-md-12 -->\r\n");
      out.write("		</div><!-- end row -->\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- /.content -->\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("<script>\r\n");
      out.write("	window.onload=function(){\r\n");
      out.write("		summernote_go($('#content'),'");
      out.print(request.getContextPath());
      out.write("');\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function modify_go(){\r\n");
      out.write("	$(\"form[role='form']\").submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function removeFile_go(className){\r\n");
      out.write("	//alert(\"X btn click\");\r\n");
      out.write("	var li = $('li.'+className);\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
}
