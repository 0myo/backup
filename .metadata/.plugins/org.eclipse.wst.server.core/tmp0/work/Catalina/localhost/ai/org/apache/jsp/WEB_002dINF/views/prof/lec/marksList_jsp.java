/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.81
 * Generated at: 2022-11-27 02:44:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.prof.lec;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class marksList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/resources/css/tui-date-picker.css\" >\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/resources/css/tui-example-style.css\" >\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://uicdn.toast.com/tui.pagination/latest/tui-pagination.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://uicdn.toast.com/grid/latest/tui-grid.css\" />\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://unpkg.com/ag-grid-community/dist/ag-grid-community.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("<!-- MAIN-CONTENT -->\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("	<!-- ================================================= -->\r\n");
      out.write("	<!-- 본문 1 -->\r\n");
      out.write("	<!-- ================================================= -->\r\n");
      out.write("	<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!-- ================================================= -->\r\n");
      out.write("		<!-- 탭 -->\r\n");
      out.write("		<!-- ================================================= -->\r\n");
      out.write("		<div class=\"pills-regular col-xl-12\">\r\n");
      out.write("\r\n");
      out.write("			<!-- ================================================= -->\r\n");
      out.write("			<!-- 탭LIST 시작 -->\r\n");
      out.write("			<!-- ================================================= -->\r\n");
      out.write("			<ul class=\"menuMove nav nav-pills mb-1\" id=\"pills-tab\" role=\"tablist\">\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("					id=\"lecMain-tab\"\r\n");
      out.write("					onclick=\"pageMove('");
      out.print(request.getContextPath() );
      out.write("/prof/lec/main?lecCd=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lecCd }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("')\"\r\n");
      out.write("					data-toggle=\"pill\" href=\"#\"\r\n");
      out.write("					role=\"tab\" aria-controls=\"home\" aria-selected=\"true\">메인</a></li>\r\n");
      out.write("					\r\n");
      out.write("				\r\n");
      out.write("				<li class=\"menuMove nav-item\"><a class=\"nav-link\"\r\n");
      out.write("					id=\"lecAttend-tab\"\r\n");
      out.write("					onclick=\"pageMove('");
      out.print(request.getContextPath() );
      out.write("/prof/lec/attend/list.do?lecCd=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lecCd}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("')\"\r\n");
      out.write("					data-toggle=\"pill\" href=\"#\"\r\n");
      out.write("					role=\"tab\" aria-controls=\"contact\" aria-selected=\"false\">출결관리</a>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"menuMove nav-item\"><a class=\"nav-link active show\"\r\n");
      out.write("					id=\"lecMarks-tab\"\r\n");
      out.write("					onclick=\"pageMove('");
      out.print(request.getContextPath() );
      out.write("/prof/lec/marks/list.do?lecCd=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lecCd}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("')\"\r\n");
      out.write("					data-toggle=\"pill\" href=\"#\"\r\n");
      out.write("					role=\"tab\" aria-controls=\"contact\" aria-selected=\"false\">성적관리</a>\r\n");
      out.write("				</li>\r\n");
      out.write("				\r\n");
      out.write("				<li class=\"menuMove nav-item\"><a class=\"nav-link\"\r\n");
      out.write("					id=\"lecMaterials-tab\"\r\n");
      out.write("					onclick=\"pageMove('");
      out.print(request.getContextPath() );
      out.write("/prof/lec/materials/list.do?lecCd=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lecCd}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("')\"\r\n");
      out.write("					data-toggle=\"pill\" href=\"#\"\r\n");
      out.write("					role=\"tab\" aria-controls=\"contact\" aria-selected=\"false\">학습자료</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<!-- ================================================= -->\r\n");
      out.write("			<!-- 탭 LIST 끝 -->\r\n");
      out.write("			<!-- ================================================= -->\r\n");
      out.write("			\r\n");
      out.write("			<!-- ================================================= -->\r\n");
      out.write("			<!-- 탭 CONTENT 시작 -->\r\n");
      out.write("			<!-- ================================================= -->\r\n");
      out.write("<!-- 				 onload=\"pageChanged()\"  -->\r\n");
      out.write("<!-- alert(this.contentWindow.location); -->\r\n");
      out.write("<!-- 				<iframe id=\"innerFrame\" -->\r\n");
      out.write("\r\n");
      out.write("<!-- 					scrolling=\"no\" style=\"border:1px dotted red; overflow-x:hidden; width:100%;height:93%;\"></iframe> -->\r\n");
      out.write("\r\n");
      out.write("			<div class=\"tab-content\" id=\"pills-tabContent\">\r\n");
      out.write("				<!-- 탭 1 시작 -->\r\n");
      out.write("				<div class=\"tab-pane fade\" id=\"lecMain\" role=\"tabpanel\" aria-labelledby=\"pills-lecMain-tab\">\r\n");
      out.write("					<p>텍스트1</p>\r\n");
      out.write("				</div> \r\n");
      out.write("				<!-- 탭 1 끝 -->\r\n");
      out.write("				<!-- 탭 2 시작 -->\r\n");
      out.write("				\r\n");
      out.write("				<!-- 탭 5 끝 -->\r\n");
      out.write("				<!-- 탭 6 시작 -->\r\n");
      out.write("				<div class=\"tab-pane fade\" id=\"lecAttend\" role=\"tabpanel\" aria-labelledby=\"pills-lecAttend-tab\">\r\n");
      out.write("					<p>텍스트6</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- 탭 6 끝 -->\r\n");
      out.write("				<!-- 탭 7 시작 -->\r\n");
      out.write("				<div class=\"tab-pane fade active show\" id=\"lecMarks\" role=\"tabpanel\" aria-labelledby=\"pills-lecMarks-tab\">\r\n");
      out.write("				\r\n");
      out.write("					<div id=\"myGrid\" class=\"ag-theme-alpine\" style=\"height: 500px\"></div>\r\n");
      out.write("				</div>\r\n");
      out.write("			\r\n");
      out.write("				<!-- 탭 7 끝 -->\r\n");
      out.write("				<!-- 탭 8 시작 -->\r\n");
      out.write("				<div class=\"tab-pane fade\" id=\"lecMaterials\" role=\"tabpanel\" aria-labelledby=\"pills-lecMaterials-tab\">\r\n");
      out.write("					<p>텍스트8</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- 탭 8 끝 -->\r\n");
      out.write("				<!-- 탭 9 시작 -->\r\n");
      out.write("				<!-- 탭 9 끝 -->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- ================================================= -->\r\n");
      out.write("			<!-- 탭 CONTENT 끝 -->\r\n");
      out.write("			<!-- ================================================= -->\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- ================================================= -->\r\n");
      out.write("		<!-- 탭 끝 -->\r\n");
      out.write("		<!-- ================================================= -->\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- ================================================= -->\r\n");
      out.write("	<!-- 본문1 끝 -->\r\n");
      out.write("	<!-- ================================================= -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("<!-- MAIN-CONTENT 끝 -->\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("<script>\r\n");
      out.write("var lecCd =\"");
      out.print(request.getParameter("lecCd"));
      out.write("\";\r\n");
      out.write("console.log(\"lecCd\",lecCd);\r\n");
      out.write("\r\n");
      out.write("class myDropDown {\r\n");
      out.write("	  init(params) {\r\n");
      out.write("		    this.eGui = document.createElement('div');\r\n");
      out.write("		    this.eGui.innerHTML = `\r\n");
      out.write("		    <select class=\"agSel\" style=\"width:100%;height:100%;\">\r\n");
      out.write("		    <option  value=\"\"></option>\r\n");
      out.write("		    <option  value=\"A+\">A+</option>\r\n");
      out.write("		    <option  value=\"A\">A</option>\r\n");
      out.write("		    <option  value=\"B+\">B+</option>\r\n");
      out.write("		    <option  value=\"B\">B</option>\r\n");
      out.write("		    <option  value=\"C+\">C+</option>\r\n");
      out.write("		    <option  value=\"C\">C</option>\r\n");
      out.write("		    <option  value=\"D+\">D+</option>\r\n");
      out.write("		    <option  value=\"D\">D</option>\r\n");
      out.write("		    <option  value=\"F\">F</option>\r\n");
      out.write("		    </select>`;\r\n");
      out.write("		    \r\n");
      out.write("	\r\n");
      out.write("		    this.mySel = this.eGui.querySelectorAll('.agSel');\r\n");
      out.write("		    \r\n");
      out.write("		    for (var i = 0; i < this.mySel.length; i++) {\r\n");
      out.write("		    	\r\n");
      out.write("		    	var options = this.mySel[i].children;\r\n");
      out.write("		    	\r\n");
      out.write("		    	for (var j = 0; j < options.length; j++) {\r\n");
      out.write("		    		if (options[j].value == params.data.finalMarks) {\r\n");
      out.write("		    			\r\n");
      out.write("						options[j].setAttribute(\"selected\",\"selected\");\r\n");
      out.write("					}\r\n");
      out.write("				}\r\n");
      out.write("		    	\r\n");
      out.write("		    	this.mySel[i].onchange=function(){\r\n");
      out.write("		    		params.data.finalMarks = this.value;\r\n");
      out.write("		    		\r\n");
      out.write("		    		$.ajax({\r\n");
      out.write("		    			method:\"post\",\r\n");
      out.write("		    			url:\"");
      out.print(request.getContextPath());
      out.write("/prof/lec/marks/update\",\r\n");
      out.write("		    			contentType : \"application/json; charset=utf-8\",\r\n");
      out.write("		    			data : JSON.stringify(params.data),\r\n");
      out.write("		    	        dataType:\"text\",\r\n");
      out.write("		    			success:function(){\r\n");
      out.write("		    			},\r\n");
      out.write("		    			error:function(){\r\n");
      out.write("		    				alert(\"실패\");\r\n");
      out.write("		    			}\r\n");
      out.write("		    		});\r\n");
      out.write("		    	}\r\n");
      out.write("		    	\r\n");
      out.write("		    }\r\n");
      out.write("		    \r\n");
      out.write("		  }\r\n");
      out.write("	  getGui() {\r\n");
      out.write("	    return this.eGui;\r\n");
      out.write("	  }\r\n");
      out.write("	  refresh() {\r\n");
      out.write("	    return false;\r\n");
      out.write("	  }\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function totalValueGetter(params) {\r\n");
      out.write("	\r\n");
      out.write("	var midRatio = params.data.midRatio;\r\n");
      out.write("	var finalRatio = params.data.finalRatio;\r\n");
      out.write("	var assignRatio = params.data.assignRatio;\r\n");
      out.write("	var attendRatio = params.data.attendRatio;\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	var mid = parseInt(params.getValue('midScore')) * midRatio * 0.01;\r\n");
      out.write("	var fin = parseInt(params.getValue('finScore'))  * finalRatio * 0.01;\r\n");
      out.write("	var ass = parseInt(params.getValue('assScore')) * assignRatio * 0.01;\r\n");
      out.write("	var attend = parseInt(params.getValue('attendScore') * attendRatio * 0.01);\r\n");
      out.write("	var result = mid + fin+attend+ass;\r\n");
      out.write("	\r\n");
      out.write("	params.data.finalScore = result;\r\n");
      out.write("	\r\n");
      out.write("	  return result;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("const columnDefs = [\r\n");
      out.write("  { headerName:\"학번\",field: \"stuCd\" },\r\n");
      out.write("  { headerName:\"이름\",field: \"name\"},\r\n");
      out.write("  { headerName:\"중간고사(40)\" ,field: \"midScore\",editable: true },\r\n");
      out.write("  { headerName:\"기말고사(40)\",field: \"finScore\",editable: true },\r\n");
      out.write("  { headerName:\"과제점수(10)\",field: \"assScore\" },\r\n");
      out.write("  { headerName:\"출결점수(10)\",field: \"attendScore\" },\r\n");
      out.write("  { headerName:\"종합점수\",field: \"finalScore\" ,valueGetter: totalValueGetter},\r\n");
      out.write("  { headerName:\"종합점수\",field: \"fianlMarks\",cellRenderer:myDropDown }\r\n");
      out.write("];\r\n");
      out.write("\r\n");
      out.write("fetch(\"");
      out.print(request.getContextPath());
      out.write("/prof/lec/marks/gradeList?lecCd=\"+lecCd)\r\n");
      out.write(".then(response => response.json())\r\n");
      out.write(".then(data => { \r\n");
      out.write("	console.log(data);\r\n");
      out.write("	gridOptions.api.setColumnDefs(columnDefs);     \r\n");
      out.write("	gridOptions.api.setRowData(data);\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("	const gridOptions = {\r\n");
      out.write("	        defaultColDef: {\r\n");
      out.write("	            sortable:true,\r\n");
      out.write("	            filter:true,\r\n");
      out.write("	            resizable:true,\r\n");
      out.write("	            editable:false,\r\n");
      out.write("	            flex: 1\r\n");
      out.write("	    },\r\n");
      out.write("	    enableCellChangeFlash: true,\r\n");
      out.write("	    onCellValueChanged:function(params) {\r\n");
      out.write("	    	  if (params.oldValue !== params.newValue) {\r\n");
      out.write("	    	      var column = params.column.colDef.field;\r\n");
      out.write("// 	    	            params.column.colDef.cellStyle = { 'background-color': 'lightgreen' };\r\n");
      out.write("	    	            params.api.refreshCells({\r\n");
      out.write("	    	                force: true,\r\n");
      out.write("	    	                columns: [column],\r\n");
      out.write("	    	                rowNodes: [params.node]\r\n");
      out.write("	    	        });\r\n");
      out.write("	    	  }\r\n");
      out.write("	    	  \r\n");
      out.write("	    	  \r\n");
      out.write("	    		$.ajax({\r\n");
      out.write("	    			method:\"post\",\r\n");
      out.write("	    			url:\"");
      out.print(request.getContextPath());
      out.write("/prof/lec/marks/update\",\r\n");
      out.write("	    			contentType : \"application/json; charset=utf-8\",\r\n");
      out.write("	    			data : JSON.stringify(params.data),\r\n");
      out.write("	    	        dataType:\"text\",\r\n");
      out.write("	    			success:function(){\r\n");
      out.write("// 	    				alert(\"성공\");\r\n");
      out.write("	    			},\r\n");
      out.write("	    			error:function(){\r\n");
      out.write("	    				alert(\"실패\");\r\n");
      out.write("	    			}\r\n");
      out.write("	    		});\r\n");
      out.write("	    \r\n");
      out.write("	    }\r\n");
      out.write("	    \r\n");
      out.write("	   \r\n");
      out.write("	};\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	document.addEventListener('DOMContentLoaded', () => {\r\n");
      out.write("        const gridDiv = document.querySelector('#myGrid');\r\n");
      out.write("        new agGrid.Grid(gridDiv, gridOptions);\r\n");
      out.write("    }); \r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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