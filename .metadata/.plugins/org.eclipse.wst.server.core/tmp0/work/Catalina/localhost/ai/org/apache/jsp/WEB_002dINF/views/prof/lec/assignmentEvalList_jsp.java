/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.81
 * Generated at: 2022-11-27 03:55:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.prof.lec;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class assignmentEvalList_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("        .pdfobject-container { height: 500px;}\r\n");
      out.write("        .pdfobject { border: 1px solid #666; }\r\n");
      out.write("        \r\n");
      out.write("#dorpdownBox{\r\n");
      out.write("\r\n");
      out.write("position:fixed;\r\n");
      out.write("top: 80px;\r\n");
      out.write("left: 550px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- ??????????????? -->\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("<!-- MAIN-CONTENT -->\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("	<div class=\"main-content-jsp\">\r\n");
      out.write("\r\n");
      out.write("		<!-- 111111 -->\r\n");
      out.write("		<div class=\"row mr-0\">\r\n");
      out.write("			<div class=\"col-xl-12\">\r\n");
      out.write("				<div class=\"card\">\r\n");
      out.write("					<h2 class=\"card-header\">???????????? ????????????</h2>\r\n");
      out.write("					<div class=\"card-body\">\r\n");
      out.write("					\r\n");
      out.write("		\r\n");
      out.write("	\r\n");
      out.write("					\r\n");
      out.write("					\r\n");
      out.write("					\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<div class=\"col-xl-3\">\r\n");
      out.write("								<div class=\"card-body\" style=\"height:850px;overflow:auto;\">\r\n");
      out.write("                                    <div class=\"list-group\">\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("									\r\n");
      out.write("									\r\n");
      out.write("									\r\n");
      out.write("									\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"col-xl-6\">\r\n");
      out.write("							\r\n");
      out.write("							\r\n");
      out.write("								<iframe id=\"pdfdisp\"\r\n");
      out.write("									src=\"\"\r\n");
      out.write("									style=\"width: 100%; height: 850px;\"></iframe>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<div class=\"col-xl-3\">\r\n");
      out.write("							\r\n");
      out.write("							<div class=\"row\">\r\n");
      out.write("							\r\n");
      out.write("							<div class=\"card\" style=\"height:250px; width:466px;\">\r\n");
      out.write("                                    <div class=\"card-header\">?????? ?????????</div>\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <p class=\"card-text\" id=\"StuSubComment\"></p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"card-footer d-flex text-muted\" id=\"StuSubDate\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("							\r\n");
      out.write("								<h4>??????</h4>\r\n");
      out.write("								<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("									<div class=\"col-xl-6\">\r\n");
      out.write("										<a href=\"#\" class=\"btn btn-primary\">???</a> <a href=\"#\"\r\n");
      out.write("											class=\"btn btn-primary\">???</a> <a href=\"#\"\r\n");
      out.write("											class=\"btn btn-primary\">???</a>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"col-xl-6\">\r\n");
      out.write("										<div class=\"input-group-append\">\r\n");
      out.write("\r\n");
      out.write("											<input id=\"submitScore\" type=\"text\" class=\"form-control\"style=\"text-align:right\" oninput=\"this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\\..*)\\./g, '$1');\"/>\r\n");
      out.write("											<div class=\"input-group-append\">\r\n");
      out.write("											<input type=\"hidden\" id=\"hiddenStuCd\" value=\"\">\r\n");
      out.write("												<span class=\"input-group-text\">/100???</span>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("								<h4 style=\"padding-top:10px;\">?????????</h4>\r\n");
      out.write("									<textarea id=\"summernote\"></textarea>\r\n");
      out.write("								<a onclick=\"evalAss();\" class=\"btn btn-primary\" style=\"float:right;\">????????????</a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<!-- ================================================= -->\r\n");
      out.write("						<!-- ?????? ?????? -->\r\n");
      out.write("						<!-- ================================================= -->\r\n");
      out.write("\r\n");
      out.write("						<!-- ================================================= -->\r\n");
      out.write("						<!-- ?????? ??? -->\r\n");
      out.write("						<!-- ================================================= -->\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/pdfobject/2.2.8/pdfobject.min.js\" integrity=\"sha512-MoP2OErV7Mtk4VL893VYBFq8yJHWQtqJxTyIAsCVKzILrvHyKQpAwJf9noILczN6psvXUxTr19T5h+ndywCoVw==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("        var options = {\r\n");
      out.write("        height: \"500px\",\r\n");
      out.write("        page: '1',\r\n");
      out.write("        pdfOpenParams: {\r\n");
      out.write("                view: 'FitV',\r\n");
      out.write("                pagemode: 'thumbs',\r\n");
      out.write("                search: 'lorem ipsum'\r\n");
      out.write("        },\r\n");
      out.write("        \r\n");
      out.write("        forcePDFJS: true, // ????????? PDF Viewer??? ??????????????? ??????\r\n");
      out.write("    PDFJS_URL: \"/pdftest/web/viewer.html\" //PDF.js??? PDF viewer??? viewer??? ??????.\r\n");
      out.write("        };\r\n");
      out.write(" \r\n");
      out.write("        //?????? ?????? ????????? pdf?????? ?????? ??????.\r\n");
      out.write("//         PDFObject.embed(\"files/samplepdf.pdf\", \"#example1\", options);\r\n");
      out.write("</script>\r\n");
      out.write(" \r\n");
      out.write("<!-- ??????????????????????????? ????????? ????????? ?????? pdf????????? ???????????? ?????? ?????? -->\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("	  $('#summernote').summernote({\r\n");
      out.write("		  placeholder:'????????? ????????? ????????????.',\r\n");
      out.write("			lang:'ko-KR',\r\n");
      out.write("			height:300,\r\n");
      out.write("		  \r\n");
      out.write("		  toolbar: [\r\n");
      out.write("			    ['style', ['bold', 'italic', 'underline', 'clear']],\r\n");
      out.write("			  ]\r\n");
      out.write("		  \r\n");
      out.write("	  });\r\n");
      out.write("	  \r\n");
      out.write("	  \r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("var uploadPath = \"http://localhost/filepath/\";\r\n");
      out.write("\r\n");
      out.write("$(\"div[class='list-group']>a\").on(\"click\",function(e){\r\n");
      out.write("	\r\n");
      out.write("	$(\"div[class='list-group']\").find(\"a\").removeClass(\"active\");\r\n");
      out.write("	$(this).addClass(\"active\");\r\n");
      out.write("	\r\n");
      out.write("	event.stopPropagation();\r\n");
      out.write("	var stuCd = $(this).attr(\"data-stuCd\");\r\n");
      out.write("	if(e.currentTarget.children[0].innerText == \"?????????\"){\r\n");
      out.write("		return;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	var v_stuCd = $(this).attr('data-stucd');\r\n");
      out.write("	$('#hiddenStuCd').val(v_stuCd);\r\n");
      out.write("	getDetail(v_stuCd);\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("var lecCd = '");
      out.print(request.getParameter("lecCd"));
      out.write("';\r\n");
      out.write("var assBno = '");
      out.print(request.getParameter("assBno"));
      out.write("';\r\n");
      out.write("\r\n");
      out.write("function getDetail(stuCd){\r\n");
      out.write("	$('#summernote').summernote('code', \"\");\r\n");
      out.write("\r\n");
      out.write("	$.ajax({\r\n");
      out.write("		method:\"get\",\r\n");
      out.write("		url:\"");
      out.print(request.getContextPath());
      out.write("/prof/lec/assignment/eval/detail?lecCd=\"+lecCd+\"&stuCd=\"+stuCd+\"&AssBno=\"+assBno,\r\n");
      out.write("		dataType:\"json\",\r\n");
      out.write("		success:function(data){\r\n");
      out.write("			\r\n");
      out.write("			var dropdownStr = ``;\r\n");
      out.write("			\r\n");
      out.write("			dropdownStr += `<div id=\"dorpdownBox\">`;\r\n");
      out.write("// 	        <!-- ???????????? ????????? ?????? -->\r\n");
      out.write("	        dropdownStr += `<select onchange=\"f_changePdf(this.value);\"`+\r\n");
      out.write("	        `style=\"height:35px; background:#1e1e1e; width:250px; height:50px; color:#fff; border-left:1px solid #5d5d5d;`+\r\n");
      out.write("	        `border-top:1px solid #5d5d5d; border-right:1px solid #5d5d5d; border-bottom:1px solid #1e1e1e;\">`;\r\n");
      out.write("	        \r\n");
      out.write("	        \r\n");
      out.write("	        for (var i = 0; i < data.attachList.length; i++) {\r\n");
      out.write("	        	var filename = data.attachList[i].filename.split(\"$$\")[1];\r\n");
      out.write("// 	        	console.log(filename);\r\n");
      out.write("	        	dropdownStr +=  `<option value=\"`+data.attachList[i].filename+`\">`+filename+`</option>`;\r\n");
      out.write("		        \r\n");
      out.write("			}\r\n");
      out.write("	             \r\n");
      out.write("	        dropdownStr += `</div>`;\r\n");
      out.write("\r\n");
      out.write("			$('body').append(dropdownStr);\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			var fileName = data.attachList[0].filename\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			$(\"#pdfdisp\").attr(\"src\",uploadPath+fileName);\r\n");
      out.write("			$('#StuSubComment').html(data.subContent);\r\n");
      out.write("			$('#StuSubDate').html(data.submitDate);\r\n");
      out.write("			$('#submitScore').val(data.score);\r\n");
      out.write("			$('#summernote').summernote('code', data.evalContent);\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("		},\r\n");
      out.write("		error:function(){\r\n");
      out.write("// 			alert(\"??????\");\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("	});\r\n");
      out.write("}		\r\n");
      out.write("\r\n");
      out.write("function evalAss(){\r\n");
      out.write("	\r\n");
      out.write("	var vv_score = $('#submitScore').val();\r\n");
      out.write("	var vv_stuCd = $('#hiddenStuCd').val();\r\n");
      out.write("	var vv_comment = $('#summernote').val();\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	if (vv_stuCd == \"\") {\r\n");
      out.write("		alert(\"????????? ???????????????\");\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	if (vv_score > 100) {\r\n");
      out.write("		alert(\"100??? ???????????????.\");\r\n");
      out.write("		return;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	$.ajax({\r\n");
      out.write("		method:\"post\",\r\n");
      out.write("		url:\"");
      out.print(request.getContextPath());
      out.write("/prof/lec/assignment/eval/modify\",\r\n");
      out.write("		data:{\r\n");
      out.write("			stuCd:vv_stuCd,\r\n");
      out.write("			lecCd:lecCd,\r\n");
      out.write("			assBno:assBno,\r\n");
      out.write("			score:vv_score,\r\n");
      out.write("			evalContent:vv_comment\r\n");
      out.write("		},\r\n");
      out.write("		success:function(data){\r\n");
      out.write("			var activeOne = $(\"a[class='list-group-item d-flex justify-content-between align-items-center active']\")\r\n");
      out.write("			activeOne[0].children[0].className =\"badge badge-success\";\r\n");
      out.write("			Swal.fire(\r\n");
      out.write("					  '??????????????? ?????????????????????.',\r\n");
      out.write("					  '',\r\n");
      out.write("					  'success'\r\n");
      out.write("					).then(()=>{\r\n");
      out.write("						\r\n");
      out.write("						getDetail(data.stuCd);\r\n");
      out.write("					});\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("		},\r\n");
      out.write("		error:function(){\r\n");
      out.write("			alert(\"??????\");\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("		\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("function f_changePdf(e){\r\n");
      out.write("	\r\n");
      out.write("	$(\"#pdfdisp\").attr(\"src\",uploadPath+e);\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/prof/lec/assignmentEvalList.jsp(44,36) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/prof/lec/assignmentEvalList.jsp(44,36) '${evalStuList }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${evalStuList }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/prof/lec/assignmentEvalList.jsp(44,36) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("list");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                                        <a href=\"#\" class=\"list-group-item d-flex justify-content-between align-items-center\" \r\n");
            out.write("                                        data-stuCd=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.stuCd }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"\r\n");
            out.write("                                        data-LecCd=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.lecCd }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"\r\n");
            out.write("                                        data-assBno=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.assBno }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"\r\n");
            out.write("                                        data-status=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.subEvalStatusCd }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"\r\n");
            out.write("                                        > ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\r\n");
            out.write("                                        \r\n");
            out.write("                                        \r\n");
            out.write("                                        \r\n");
            out.write("                                        \r\n");
            out.write("                                        \r\n");
            out.write("                                        ");
            if (_jspx_meth_c_005fchoose_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\r\n");
            out.write("                                        </a>\r\n");
            out.write("                                    ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
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
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        ");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("                                        ");
          if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("                                        ");
          if (_jspx_meth_c_005fwhen_005f2(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/views/prof/lec/assignmentEvalList.jsp(57,40) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.subEvalStatusCd eq null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<span class=\"badge badge-danger\">?????????</span>");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f1_reused = false;
    try {
      _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/views/prof/lec/assignmentEvalList.jsp(58,40) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.subEvalStatusCd eq 'submit' }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
      if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<span class=\"badge badge-primary\">????????????</span>");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      _jspx_th_c_005fwhen_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f2_reused = false;
    try {
      _jspx_th_c_005fwhen_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/views/prof/lec/assignmentEvalList.jsp(59,40) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.subEvalStatusCd eq 'evalcom' }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f2 = _jspx_th_c_005fwhen_005f2.doStartTag();
      if (_jspx_eval_c_005fwhen_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<span class=\"badge badge-success\">????????????</span>");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
      _jspx_th_c_005fwhen_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/prof/lec/assignmentEvalList.jsp(320,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${from eq 'modfy' }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("	<script>\r\n");
          out.write("		window.close();\r\n");
          out.write("		alert(\"?????????????????????.\");\r\n");
          out.write("		window.opener.location.reload();			\r\n");
          out.write("	</script>\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}
