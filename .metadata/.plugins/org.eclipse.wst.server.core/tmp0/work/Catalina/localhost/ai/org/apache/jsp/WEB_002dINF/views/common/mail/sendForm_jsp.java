/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.81
 * Generated at: 2022-11-25 11:00:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.common.mail;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sendForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("/* #uplode {\r\n");
      out.write("		margin: 1px 0;\r\n");
      out.write("		border-width: 2px;\r\n");
      out.write("		border-color: red;\r\n");
      out.write("		border-style: dotted;\r\n");
      out.write("	} */\r\n");
      out.write("#myModal {   /* 모달창 기본 css*/\r\n");
      out.write("    position:fixed; \r\n");
      out.write("    width:100%;\r\n");
      out.write("    height:100%;  /* 화면을 꽉 채움  fixed인 경우 % 작동됨 */\r\n");
      out.write("    background-color: rgba(0,0, 0, 0.3);\r\n");
      out.write("    }\r\n");
      out.write("#modal {\r\n");
      out.write("	position: absolute;\r\n");
      out.write("    top:50%;\r\n");
      out.write("    left:50%;  /* 화면을 꽉 채움  fixed인 경우 % 작동됨 */\r\n");
      out.write("    transform: translate(-50%, -50%);\r\n");
      out.write("}\r\n");
      out.write(".drop-zone {\r\n");
      out.write("    width: 500px;\r\n");
      out.write("    height: 300px;\r\n");
      out.write("    background-color: #ffffff;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("    position:relative;\r\n");
      out.write("    padding : 50px;\r\n");
      out.write("   	border-radius: 15px;\r\n");
      out.write("   	border : 3px dashed #71748d;\r\n");
      out.write("   	font-size:15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#fileUpload{\r\n");
      out.write("	position:absolute;\r\n");
      out.write("	/* top : 400px;\r\n");
      out.write("	right : 200px; */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".drop-zone-dragenter, .drop-zone-dragover {\r\n");
      out.write("	background-color: #dbdbe7;\r\n");
      out.write("/*     border: 3px solid pink; */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".title{\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	font-size: 30px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"//cdn.jsdelivr.net/npm/jquery.fancytree@2.27/dist/skin-win8/ui.fancytree.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"//cdn.jsdelivr.net/npm/jquery.fancytree@2.27/dist/jquery.fancytree-all-deps.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 첨부파일 모달 -->\r\n");
      out.write("					<!-- ------------------------------------------- -->\r\n");
      out.write("				<div class=\"card\" id=\"myModal\" style=\"display:none; z-index: 9999999999\">\r\n");
      out.write("				\r\n");
      out.write("			        <div class=\"card-body\" id=\"modal\" class=\"modal-content\">\r\n");
      out.write("			        	<div class=\"card\" id=\"back\">\r\n");
      out.write("				        	<div class=\"card-body\">\r\n");
      out.write("									<div class=\"row\">\r\n");
      out.write("									\r\n");
      out.write("										<div>\r\n");
      out.write("											<div class=\"drop-zone \">\r\n");
      out.write("												<br />\r\n");
      out.write("												<div style=\"text-align: center; font-size: 50px;\">\r\n");
      out.write("													<i class=\"fas fa-upload\"></i>\r\n");
      out.write("												</div>\r\n");
      out.write("												<div\r\n");
      out.write("													style=\"text-align: center; font-size: 20px; font-weight: bold;\">\r\n");
      out.write("													파일 선택 클릭<br />또는 파일을 여기로 드래그하세요.\r\n");
      out.write("												</div>\r\n");
      out.write("\r\n");
      out.write("											</div>\r\n");
      out.write("											\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"row justify-content-left ml-3\">\r\n");
      out.write("				         		<input type=\"file\" id=\"fileUpload\" multiple>\r\n");
      out.write("				         	</div>\r\n");
      out.write("					        <div class=\"row justify-content-end mr-3 mt-1\">\r\n");
      out.write("				         		<input type=\"button\" class=\"btn btn-sm btn-primary\" style=\"font-size: 1em;\" name=\"\" value=\"close\" onclick=\"f_close()\">\r\n");
      out.write("				         	</div><br>\r\n");
      out.write("				         	\r\n");
      out.write("			         	</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("				</div>\r\n");
      out.write("					<!-- ------------------------------------------- -->\r\n");
      out.write("<div class=\"card\">\r\n");
      out.write("   <div class=\"card-body\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"dashboard-main-wrapper\">\r\n");
      out.write("	<div class=\"dashboard-wrapper\">\r\n");
      out.write("\r\n");
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
      out.write("						<button class=\"btn btn-lg btn-primary btn-block\" type=\"button\" \r\n");
      out.write("							onclick=\"pageMove('");
      out.print(request.getContextPath());
      out.write("/common/mail/sendForm.do');\" >쪽지 보내기</button>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"aside-nav collapse\" style=\"cursor: pointer;\" >\r\n");
      out.write("						<ul class=\"nav\">\r\n");
      out.write("							<li><a onclick=\"pageMove('");
      out.print(request.getContextPath() );
      out.write("/common/mail/received/list.do')\"><span class=\"icon\"><i\r\n");
      out.write("										class=\"fas fa-fw fa-inbox\"></i></span>받은 쪽지함<span\r\n");
      out.write("									class=\"badge badge-primary float-right\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${count }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span></a></li>\r\n");
      out.write("							<li><a onclick=\"pageMove('");
      out.print(request.getContextPath() );
      out.write("/common/mail/sent/list.do')\"><span class=\"icon\"><i\r\n");
      out.write("										class=\"fas fa-fw  fa-envelope\"></i></span>보낸 쪽지함</a></li>		\r\n");
      out.write("							<li><a onclick=\"pageMove('");
      out.print(request.getContextPath());
      out.write("/common/mail/bin/list.do')\"><span class=\"icon\"><i\r\n");
      out.write("										class=\"fas fa-fw fa-trash\"></i></span>휴지통</a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("						\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</aside>\r\n");
      out.write("\r\n");
      out.write("			<!-- 수정할 부분 -->\r\n");
      out.write("			<div class=\"main-content container-fluid p-0\">\r\n");
      out.write("				<div class=\"email-head\">\r\n");
      out.write("\r\n");
      out.write("			<div class=\"email-head-title\"><i class=\"fas fa-envelope\" style=\"margin-right: 10px\"></i>쪽지보내기<span class=\"icon mdi mdi-edit\"></span></div>\r\n");
      out.write("	\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"card\">\r\n");
      out.write("   				<div class=\"card-body\">\r\n");
      out.write("\r\n");
      out.write("					<div class=\"to\">\r\n");
      out.write("						<div class=\"form-group row pt-0\" >\r\n");
      out.write("							<label class=\"col-md-1 control-label\" ><strong>&nbsp;&nbsp;받는사람</strong></label>\r\n");
      out.write("	\r\n");
      out.write("					<div class=\"col-md-9\" class=\"receiverIdBar row\">\r\n");
      out.write("						<input class=\"form-control receiverIdBar__Input\" type=\"text\" id=\"receiverId\">\r\n");
      out.write("					</div>\r\n");
      out.write("						<a href=\"#\" class=\"btn btn-light\" style=\"width:85px; height:35px;\" data-toggle=\"modal\" data-target=\"#mailSendFormModal\"><strong>주소록</strong></a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("			<div class=\"subject\">\r\n");
      out.write("				<div class=\"form-group row pt-2\">\r\n");
      out.write("					<label class=\"col-md-1 control-label\"><strong>&nbsp;&nbsp;제 목</strong></label>\r\n");
      out.write("						<div class=\"col-md-10\">\r\n");
      out.write("							<input class=\"form-control\" type=\"text\" id=\"title\">\r\n");
      out.write("						</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("						<br>\r\n");
      out.write("			<div class=\"to\">\r\n");
      out.write("				<div class=\"form-group row pt-0\" >\r\n");
      out.write("					<label class=\"col-md-1 control-label\" ><strong>&nbsp;&nbsp;첨부파일</strong></label>\r\n");
      out.write("					<div class=\"col-md-9\" id=\"uplode\">\r\n");
      out.write("						<div class=\"form-control\" id=\"showFilessss\" style=\"height:35px;\"></div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<input type=\"button\" value=\"파일 선택\" onclick=\"f_modal()\" class=\"btn btn-sm btn-primary\" >\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("<!-- 			<div class=\"subject\">\r\n");
      out.write("				<div class=\"form-group row pt-2\">\r\n");
      out.write("					<label class=\"col-md-1 control-label\"><strong>&nbsp;&nbsp;첨부파일</strong></label>\r\n");
      out.write("						<div class=\"col-md-11\">\r\n");
      out.write("							<input class=\"form-control\" type=\"text\">\r\n");
      out.write("						</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div> -->\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"email editor\">\r\n");
      out.write("			<div class=\"col-md-12 p-0\">\r\n");
      out.write("				<div class=\"form-group\">\r\n");
      out.write("					<label class=\"control-label sr-only\" for=\"summernote\">Descriptions </label>\r\n");
      out.write("						<textarea class=\"textarea\" name=\"content\" id=\"content\" rows=\"20\"\r\n");
      out.write("							placeholder=\"1000자 내외로 작성하세요.\" style=\"display: none;\"></textarea>\r\n");
      out.write("						<div id=\"summernote\"></div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("			<div class=\"form-group col-md-12\" align=\"right\">\r\n");
      out.write("				<button class=\"btn btn-primary btn-space\" type=\"button\"  id=\"assignSubmit\" onclick=\"sendMail();\"><i class=\"icon s7-mail\"></i>보내기</button>\r\n");
      out.write("				<button onclick=\"goBack()\" class=\"btn btn-secondary btn-space\" style=width:75px;><i class=\"icon s7-close\"></i>취소</button>\r\n");
      out.write("			</div>\r\n");
      out.write("				<div class=\"modal fade\" id=\"mailSendFormModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"mailSendFormModalLabel\" aria-hidden=\"true\" style=\"display: none;\">\r\n");
      out.write("					<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("						<div class=\"modal-content\">\r\n");
      out.write("							<div class=\"modal-header\">\r\n");
      out.write("								<h5 class=\"modal-title\" id=\"mailSendFormModalLabel\">주소록</h5>\r\n");
      out.write("								\r\n");
      out.write("								\r\n");
      out.write("					\r\n");
      out.write("								\r\n");
      out.write("								\r\n");
      out.write("								<a href=\"#\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("								<span aria-hidden=\"true\">×</span>\r\n");
      out.write("								</a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"modal-body\">\r\n");
      out.write("										");
      out.write("	\r\n");
      out.write("										 <div id=\"tree\"></div>\r\n");
      out.write("										 \r\n");
      out.write("										     <input type=\"button\" style=\"margin-top:10px;\" class=\"btn btn-brand float-right\" value=\"받는 사람 아이디 추가\" onclick=\"addReceiverId()\" id=\"add\">\r\n");
      out.write("										 \r\n");
      out.write("										 \r\n");
      out.write("							</div>\r\n");
      out.write("									\r\n");
      out.write("						</div>		\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>	\r\n");
      out.write("			</div>	\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("/* var arrData = [\r\n");
      out.write("    {title: \"1조\", key: \"2\", folder: true, checkbox:true, children: [\r\n");
      out.write("      {title: \"동석\", key: \"3\",checkbox:true},\r\n");
      out.write("      {title: \"정현\", key: \"4\",checkbox:true}\r\n");
      out.write("    ]}\r\n");
      out.write("]; */\r\n");
      out.write("\r\n");
      out.write("console.log(\"원본 : \",arrData);\r\n");
      out.write("\r\n");
      out.write("var arrData = null;\r\n");
      out.write("$.ajax({\r\n");
      out.write("	url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/common/addressBook\",\r\n");
      out.write("	dataType:\"json\",\r\n");
      out.write("	success:function(data){\r\n");
      out.write("		console.log(\"데이터 : \",data)\r\n");
      out.write("		arrData=data;\r\n");
      out.write("		\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("		$(\"#tree\").fancytree({\r\n");
      out.write("		    //source:arrData,\r\n");
      out.write("		    source:arrData,\r\n");
      out.write("		    click:function(event,data){\r\n");
      out.write("		        //data에 필요한 정보를 거의 담아서 줌.\r\n");
      out.write("		        console.log(data.node.title)\r\n");
      out.write("		    },\r\n");
      out.write("		    icon:function(event,data){\r\n");
      out.write("		        if(data.node.folder){\r\n");
      out.write("		            return\r\n");
      out.write("		        }else{\r\n");
      out.write("		            return \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/addrPerson.png\"\r\n");
      out.write("		        }\r\n");
      out.write("		    }\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("	}\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function addReceiverId(){\r\n");
      out.write("    var tree = $.ui.fancytree.getTree(\"#tree\"),\r\n");
      out.write("    activeNode = tree.getActiveNode();\r\n");
      out.write("    console.log(tree.getSelectedNodes());\r\n");
      out.write("    var nodeList = tree.getSelectedNodes();\r\n");
      out.write("    var addressString = '';\r\n");
      out.write("    for(let i=0;i<nodeList.length;i++){\r\n");
      out.write("        if(i!=nodeList.length-1){\r\n");
      out.write("            addressString += nodeList[i].data.content +\",\"\r\n");
      out.write("        }else{\r\n");
      out.write("            addressString += nodeList[i].data.content\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("	$('#receiverId').val(addressString);\r\n");
      out.write("	$(\"#mailSendFormModal\").modal('hide');\r\n");
      out.write("	 \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("   function goBack(){\r\n");
      out.write("      window.history.back();\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("	var v_myModal = document.querySelector(\"#myModal\");\r\n");
      out.write("	function f_close(){\r\n");
      out.write("	  v_myModal.style.display = \"none\";   //   있어도 누네 안보이겡\r\n");
      out.write("	}\r\n");
      out.write("	function f_modal(reason){\r\n");
      out.write("	     v_myModal.style.display = \"block\";   //  눈에 보이겡\r\n");
      out.write("	     \r\n");
      out.write("	     $('#rejReason').val(reason)\r\n");
      out.write("	     \r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("window.onload=function(){\r\n");
      out.write("  summernote($('#content'),'");
      out.print(request.getContextPath());
      out.write("');	\r\n");
      out.write("\r\n");
      out.write(" }//-----------------------------------------------------------@5 써머노트 사용.\r\n");
      out.write("//summernote()라는 함수는 common.js에 있음.\r\n");
      out.write("	 \r\n");
      out.write("\r\n");
      out.write("function summernote(target,context){\r\n");
      out.write("	\r\n");
      out.write("	contextPath = context;\r\n");
      out.write("	\r\n");
      out.write("	target.summernote({\r\n");
      out.write("		placeholder:'여기에 내용을 적으세요.',\r\n");
      out.write("		lang:'ko-KR',\r\n");
      out.write("		height:350,\r\n");
      out.write("		disableResizeEditor: true,\r\n");
      out.write("		callbacks:{\r\n");
      out.write("			onImageUpload : function(files, editor, welEditable) {\r\n");
      out.write("				for(var file of files){\r\n");
      out.write("					//alert(file.name);\r\n");
      out.write("					\r\n");
      out.write("					if(file.name.substring(file.name.lastIndexOf(\".\")+1).toUpperCase() != \"JPG\"){\r\n");
      out.write("						alert(\"JPG 이미지형식만 가능합니다.\");\r\n");
      out.write("						return;\r\n");
      out.write("					}\r\n");
      out.write("					if(file.size > 1024*1024*5){\r\n");
      out.write("						alert(\"이미지는 5MB 미만입니다.\");\r\n");
      out.write("						return;\r\n");
      out.write("					}	\r\n");
      out.write("					\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				for (var file of files) {\r\n");
      out.write("					sendFile(file,this);\r\n");
      out.write("				}\r\n");
      out.write("			},\r\n");
      out.write("			onMediaDelete : function(target) {\r\n");
      out.write("				deleteFile(target[0].src);	\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write(" //--------------------------------------@6 드래그앤 드랍을 가능하게 하는 자바스크립트 코드\r\n");
      out.write("        (function() {\r\n");
      out.write("            \r\n");
      out.write("            var $file = document.getElementById(\"fileUpload\")\r\n");
      out.write("            var dropZone = document.querySelector(\".drop-zone\")\r\n");
      out.write("\r\n");
      out.write("            var toggleClass = function(className) {\r\n");
      out.write("                \r\n");
      out.write("                console.log(\"current event: \" + className)\r\n");
      out.write("\r\n");
      out.write("                var list = [\"dragenter\", \"dragleave\", \"dragover\", \"drop\"]\r\n");
      out.write("\r\n");
      out.write("                for (var i = 0; i < list.length; i++) {\r\n");
      out.write("                    if (className === list[i]) {\r\n");
      out.write("                        dropZone.classList.add(\"drop-zone-\" + list[i])\r\n");
      out.write("                    } else {\r\n");
      out.write("                        dropZone.classList.remove(\"drop-zone-\" + list[i])\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            var mytitle = document.querySelector(\"#showFilessss\");\r\n");
      out.write("            var showFiles = function(files) {\r\n");
      out.write("                dropZone.innerHTML = \"\"\r\n");
      out.write("                if(files.length == 0){\r\n");
      out.write("                	dropZone.innerHTML += `</br>\r\n");
      out.write("					 	<div style=\"text-align:center; font-size:50px;\"><i class=\"fas fa-upload\"></i></div>\r\n");
      out.write("			      		<div style=\"text-align:center; font-size:20px; font-weight:bold;\">파일 선택 클릭</br>또는 파일을 여기로 드래그하세요.</div>`;\r\n");
      out.write("                }\r\n");
      out.write("                for(var i = 0, len = files.length; i < len; i++) {\r\n");
      out.write("                    dropZone.innerHTML += \"<p><i class='fas fa-file'></i>&nbsp;&nbsp;\" + files[i].name + \"</p>\";\r\n");
      out.write("                    mytitle.innerHTML += \"<span class='mr-3'><i class='fas fa-file'></i>&nbsp;&nbsp;\" + files[i].name + \"</span>\";\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            var selectFile = function(files) {\r\n");
      out.write("                // input file 영역에 드랍된 파일들로 대체\r\n");
      out.write("                $file.files = files\r\n");
      out.write("                showFiles($file.files)\r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            $file.addEventListener(\"change\", function(e) {\r\n");
      out.write("                showFiles(e.target.files)\r\n");
      out.write("            })\r\n");
      out.write("\r\n");
      out.write("            // 드래그한 파일이 최초로 진입했을 때\r\n");
      out.write("            dropZone.addEventListener(\"dragenter\", function(e) {\r\n");
      out.write("                e.stopPropagation()\r\n");
      out.write("                e.preventDefault()\r\n");
      out.write("\r\n");
      out.write("                toggleClass(\"dragenter\")\r\n");
      out.write("\r\n");
      out.write("            })\r\n");
      out.write("\r\n");
      out.write("            // 드래그한 파일이 dropZone 영역을 벗어났을 때\r\n");
      out.write("            dropZone.addEventListener(\"dragleave\", function(e) {\r\n");
      out.write("                e.stopPropagation()\r\n");
      out.write("                e.preventDefault()\r\n");
      out.write("\r\n");
      out.write("                toggleClass(\"dragleave\")\r\n");
      out.write("\r\n");
      out.write("            })\r\n");
      out.write("\r\n");
      out.write("            // 드래그한 파일이 dropZone 영역에 머물러 있을 때\r\n");
      out.write("            dropZone.addEventListener(\"dragover\", function(e) {\r\n");
      out.write("                e.stopPropagation()\r\n");
      out.write("                e.preventDefault()\r\n");
      out.write("\r\n");
      out.write("                toggleClass(\"dragover\")\r\n");
      out.write("\r\n");
      out.write("            })\r\n");
      out.write("\r\n");
      out.write("            // 드래그한 파일이 드랍되었을 때\r\n");
      out.write("            dropZone.addEventListener(\"drop\", function(e) {\r\n");
      out.write("                e.preventDefault()\r\n");
      out.write("\r\n");
      out.write("                toggleClass(\"drop\")\r\n");
      out.write("\r\n");
      out.write("                var files = e.dataTransfer && e.dataTransfer.files\r\n");
      out.write("                console.log(files)\r\n");
      out.write("\r\n");
      out.write("                if (files != null) {\r\n");
      out.write("                    if (files.length < 1) {\r\n");
      out.write("                        alert(\"폴더 업로드 불가\")\r\n");
      out.write("                        return\r\n");
      out.write("                    }\r\n");
      out.write("                    selectFile(files)\r\n");
      out.write("                } else {\r\n");
      out.write("                    alert(\"ERROR\")\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            })\r\n");
      out.write("\r\n");
      out.write("        })();\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function sendMail(){\r\n");
      out.write("	\r\n");
      out.write("	var formData = new FormData();\r\n");
      out.write("	var content = $(\"#content\").val();\r\n");
      out.write("	var title = $(\"#title\").val();\r\n");
      out.write("	var receiverId=$(\"#receiverId\").val();\r\n");
      out.write("	console.log(\"receiverId\",receiverId);\r\n");
      out.write("	var uploadFile =$('#fileUpload');//------------------------------------@1\r\n");
      out.write("	\r\n");
      out.write("	formData.append(\"content\",content);\r\n");
      out.write("	formData.append(\"title\",title);\r\n");
      out.write("	formData.append(\"receiverIdList\",receiverId);\r\n");
      out.write("	for(var i=0;i<uploadFile[0].files.length;i++){ //-----------------------@2\r\n");
      out.write("		formData.append(\"uploadFile\",uploadFile[0].files[i]);\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	console.log(\"데이터 \",formData)\r\n");
      out.write("	\r\n");
      out.write("	$.ajax({//@--------------------------------------------------------------@3\r\n");
      out.write("		method:\"post\",\r\n");
      out.write("		url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/common/send\",\r\n");
      out.write("		contentType : false,\r\n");
      out.write("		processData : false,\r\n");
      out.write("		data:formData,\r\n");
      out.write("		success:function(data){\r\n");
      out.write("			alert(\"쪽지을 성공적으로 보냈습니다.\");\r\n");
      out.write("			pageMove('/ai/common/mail/sent/list.do');\r\n");
      out.write("		},error:function(){\r\n");
      out.write("			alert(\"올바르지 않은 대상입니다.\");\r\n");
      out.write("		}\r\n");
      out.write("	})\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>");
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
