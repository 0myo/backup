/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.81
 * Generated at: 2022-10-31 00:23:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.common.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- 게시판상세 -->\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("<!-- MAIN-CONTENT -->\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("<div class=container-fluid style=\"padding-left: 0px;\">\r\n");
      out.write("	<div class=\"main-content-jsp\">\r\n");
      out.write("\r\n");
      out.write("		<!-- 111111 -->\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("			<div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12\">\r\n");
      out.write("				<div class=\"card\" style=\"padding-bottom: 0px;\">\r\n");
      out.write("					<h2 class=\"card-header\">공지사항 작성</h2>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"card-body\">\r\n");
      out.write("\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<div class=\"col-xl-8\">\r\n");
      out.write("								<form role=\"form\" method=\"post\" action=\"");
      out.print(request.getContextPath());
      out.write("/common/notice/regist\" name=\"registForm\">\r\n");
      out.write("									<div class=\"form-group \">\r\n");
      out.write("										<label for=\"mark\" class=\"col-form-label\">중요공지여부</label>\r\n");
      out.write("										<input type=\"checkbox\" name=\"markCd\" value=\"mark\">\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"form-group\">\r\n");
      out.write("										<label for=\"inputText3\" class=\"col-form-label\">제목</label> <input\r\n");
      out.write("											id=\"inputText3\" name=\"title\" type=\"text\" class=\"form-control\">\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"form-group\">\r\n");
      out.write("										<label for=\"writer\" class=\"col-form-label\">작성자</label>\r\n");
      out.write("										<input id=\"writer\" name=\"staffId\" readonly type=\"text\" class=\"form-control\" >\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"form-group\" style=\"hegiht: 800px;\">\r\n");
      out.write("										<label for=\"content\">내용</label>\r\n");
      out.write("										<textarea class=\"textarea\" name=\"content\" id=\"content\"\r\n");
      out.write("											rows=\"20\" placeholder=\"1000자 내외로 작성하세요.\"\r\n");
      out.write("											style=\"display: none;\"></textarea>\r\n");
      out.write("									</div>\r\n");
      out.write("								</form>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("							<div class=\"col-xl-4\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("								<div class=\"form-group\" style=\"padding-top:37px;\">\r\n");
      out.write("									<div class=\"card card-outline card-success\">\r\n");
      out.write("										<div class=\"card-header\">\r\n");
      out.write("											<h5 style=\"display: inline; line-height: 40px;\">첨부파일 :</h5>\r\n");
      out.write("											&nbsp;&nbsp;\r\n");
      out.write("											<button class=\"btn btn-xs btn-primary\"\r\n");
      out.write("												onclick=\"addFile_go();\" type=\"button\" id=\"addFileBtn\">Add\r\n");
      out.write("												File</button>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"card-footer fileInput\"></div>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<!-- ================================================= -->\r\n");
      out.write("						<!-- 버튼 시작 -->\r\n");
      out.write("						<!-- ================================================= -->\r\n");
      out.write("						<div class=\"row justify-content-end mt-3\"\r\n");
      out.write("							style=\"padding-right: 30px; padding-bottom: 50px;\">\r\n");
      out.write("\r\n");
      out.write("							<!--                <button class=\"btn btn-info\" type=\"button\" onclick=\"\">수정</button>&nbsp; -->\r\n");
      out.write("							<!--                <button class=\"btn btn-secondary\" type=\"button\" onclick=\"\">삭제</button>&nbsp; -->\r\n");
      out.write("							<!--                <button class=\"btn btn-primary\" type=\"button\" onclick=\"\">목록</button>&nbsp; -->\r\n");
      out.write("							<!--                <br> -->\r\n");
      out.write("							<button class=\"btn btn-outline-primary\" type=\"button\"  id=\"registBtn\" onclick=\"regist_go();\">등록</button>\r\n");
      out.write("							&nbsp;&nbsp;\r\n");
      out.write("							<button class=\"btn btn-outline-danger\" type=\"button\"\r\n");
      out.write("								onclick=\"f_alert();\">취소</button>\r\n");
      out.write("							&nbsp;&nbsp;\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- ================================================= -->\r\n");
      out.write("					<!-- 버튼 끝 -->\r\n");
      out.write("					<!-- ================================================= -->\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- 11111끝 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Modal -->\r\n");
      out.write("<!-- 	<div id=\"modifyModal\" class=\"modal modal-default fade\" role=\"dialog\">\r\n");
      out.write("		<div class=\"modal-dialog\">\r\n");
      out.write("			Modal content\r\n");
      out.write("			<div class=\"modal-content\">\r\n");
      out.write("				<div class=\"modal-header\">\r\n");
      out.write("					<h4 class=\"modal-title\">댓글 수정</h4>\r\n");
      out.write("					<button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"modal-body\" data-rno>\r\n");
      out.write("					<p>\r\n");
      out.write("						<input type=\"text\" id=\"replytext\" class=\"form-control\">\r\n");
      out.write("					</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"modal-footer\">\r\n");
      out.write("					<button type=\"button\" class=\"btn btn-primary\" id=\"replyModBtn\"\r\n");
      out.write("						onclick=\"replyModify_go();\">Modify</button>\r\n");
      out.write("					<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div> -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Modal End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("window.onload=function(){\r\n");
      out.write("	summernote_go($('#content'),'");
      out.print(request.getContextPath());
      out.write("'); \r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function f_alert(){\r\n");
      out.write("   Swal.fire({\r\n");
      out.write("        title: '작성중인 글이 있습니다. 정말 취소 하시겠습니까?',\r\n");
      out.write("        icon: 'warning',\r\n");
      out.write("        showCancelButton: false,\r\n");
      out.write("        confirmButtonColor: '#5969FF',\r\n");
      out.write("        cancelButtonColor: '#EF172C',\r\n");
      out.write("        confirmButtonText: '취소하기'\r\n");
      out.write("      }).then((result) => {\r\n");
      out.write("        if (result.isConfirmed) {\r\n");
      out.write("          Swal.fire(\r\n");
      out.write("            '취소하였습니다.',\r\n");
      out.write("            \r\n");
      out.write("          ),\r\n");
      out.write("          CloseWindow();\r\n");
      out.write("        }\r\n");
      out.write("   });\r\n");
      out.write("      \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var dataNum=0;\r\n");
      out.write("\r\n");
      out.write("function addFile_go(){\r\n");
      out.write("	//alert(\"click add btn\");\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("	if($('input[name=\"uploadFile\"]').length >=5){\r\n");
      out.write("		alert(\"파일추가는 5개까지만 가능합니다.\");\r\n");
      out.write("		return;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	var div=$('<div>').addClass(\"inputRow\").attr(\"data-no\",dataNum).css(\"padding-top\",\"20px\");\r\n");
      out.write("	var input=$('<input>').attr({\"type\":\"file\",\"name\":\"uploadFile\"}).css(\"display\",\"inline\");\r\n");
      out.write("	\r\n");
      out.write("	var button=\"<button onclick='remove_go(\"+dataNum+\");' style='border:0;outline:0;' class='badge bg-red' type='button'>X</button>\";\r\n");
      out.write("	\r\n");
      out.write("	div.append(input).append(button);\r\n");
      out.write("	$('.fileInput').append(div);\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	dataNum++;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function remove_go(dataNum){\r\n");
      out.write("	$('div[data-no=\"'+dataNum+'\"]').remove();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function regist_go(){\r\n");
      out.write("	\r\n");
      out.write("	var form = document.registForm;\r\n");
      out.write("	if(form.title.value==\"\"){\r\n");
      out.write("		alert(\"제목은 필수입니다.\");\r\n");
      out.write("		return;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	form.submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
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
