/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.81
 * Generated at: 2022-11-05 03:08:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.stu.score;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class total_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- ================================================= -->\r\n");
      out.write("<!-- MAIN-CONTENT -->\r\n");
      out.write("<!-- ================================================= -->\r\n");
      out.write("<div class=\"card\">\r\n");
      out.write("	<div class=\"card-body\">\r\n");
      out.write("		<div class=\"main-content-jsp\">\r\n");
      out.write("		    <div class=\"row justify-content-center\">\r\n");
      out.write("			<div class=\"col-xl-10 col-lg-12 col-md-12 col-sm-12 col12\">\r\n");
      out.write("		<!-- <div class=\"pl-xl-3\"> -->\r\n");
      out.write("		<!-- <div class=\"m-b-0\"> -->\r\n");
      out.write("		<!-- <div class=\"user-avatar-name d-inline-block\"> -->\r\n");
      out.write("			<div class=\"card\">\r\n");
      out.write("				<h3 class=\"card-header\">기본정보</h3>\r\n");
      out.write("				<div class=\"card-body\">\r\n");
      out.write("					<table class=\"table table-hover\">\r\n");
      out.write("					    <thead>\r\n");
      out.write("					        <tr>\r\n");
      out.write("					            <th style=\"width: 25%\">이름</th>\r\n");
      out.write("					            <th style=\"width: 25%\">학년</th>\r\n");
      out.write("					            <th style=\"width: 25%\">학기</th>\r\n");
      out.write("					        </tr>\r\n");
      out.write("					    </thead>\r\n");
      out.write("					    <tbody>\r\n");
      out.write("					        <tr>\r\n");
      out.write("					            <td>박건영</td>\r\n");
      out.write("					            <td>2</td>\r\n");
      out.write("					            <td>2</td>\r\n");
      out.write("					        </tr>\r\n");
      out.write("					    </tbody>\r\n");
      out.write("					    <thead>\r\n");
      out.write("					        <tr>\r\n");
      out.write("					            <th >학번</th>\r\n");
      out.write("					            <th >전공</th>\r\n");
      out.write("					            <th >학적</th>\r\n");
      out.write("					        </tr>\r\n");
      out.write("					    </thead>\r\n");
      out.write("					    <tbody>\r\n");
      out.write("					        <tr>\r\n");
      out.write("					            <td>00-76008213</td>\r\n");
      out.write("					            <td>미디어컨텐츠학과</td>\r\n");
      out.write("					            <td>재학</td>\r\n");
      out.write("					        </tr>\r\n");
      out.write("					    </tbody>\r\n");
      out.write("					</table>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("			<!-- ================================================= -->\r\n");
      out.write("			<!-- 본문 1 -->\r\n");
      out.write("			<!-- ================================================= -->\r\n");
      out.write("\r\n");
      out.write("		             <div class=\"row\">\r\n");
      out.write("		             	<div class=\"card col-xl-12 col-lg-12 col-md-12 col-sm-12 col12\">\r\n");
      out.write("						<h3 class=\"card-header\">전체 학기 성적 조회</h3>\r\n");
      out.write("		                	<div class=\"card-body row\">\r\n");
      out.write("		                    <!--  <div class=\"float-right\"><a href=\"#\" class=\"user-avatar-email text-secondary\">www.henrybarbara.com</a></div> -->\r\n");
      out.write("										<div class=\"card col-xl-4 col-lg-4 col-md-4 col-sm-4 col12\">\r\n");
      out.write("										<div class=\"card-body\">\r\n");
      out.write("										\r\n");
      out.write("												<table class=\"table table-hover\">\r\n");
      out.write("												    <thead>\r\n");
      out.write("												        <tr>\r\n");
      out.write("												            <th scope=\"col\">학년-학기</th>\r\n");
      out.write("												            <th scope=\"col\">이수학점</th>\r\n");
      out.write("												            <th scope=\"col\">총점</th>\r\n");
      out.write("												        </tr>\r\n");
      out.write("												    </thead>\r\n");
      out.write("												    <tbody>\r\n");
      out.write("												        <tr>\r\n");
      out.write("												            <td>2022-1</td>\r\n");
      out.write("												            <td>18</td>\r\n");
      out.write("												            <td>91.40</td>\r\n");
      out.write("												        </tr>\r\n");
      out.write("												    </tbody>\r\n");
      out.write("												    <tbody>\r\n");
      out.write("												        <tr>\r\n");
      out.write("												            <td>2021-2</td>\r\n");
      out.write("												            <td>20</td>\r\n");
      out.write("												            <td>60.40</td>\r\n");
      out.write("												        </tr>\r\n");
      out.write("												    </tbody>\r\n");
      out.write("												</table>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("										\r\n");
      out.write("									<div class=\"card col-xl-8 col-lg-8 col-md-8 col-sm-8 col8\">\r\n");
      out.write("										<div class=\"card-body\">\r\n");
      out.write("											<table class=\"table table-hover\">\r\n");
      out.write("											    <thead>\r\n");
      out.write("											        <tr>\r\n");
      out.write("											            <th >과목코드</th>\r\n");
      out.write("											            <th >과목명</th>\r\n");
      out.write("											            <th >이수구분</th>\r\n");
      out.write("											            <th >학점</th>\r\n");
      out.write("											            <th >평점</th>\r\n");
      out.write("											            <th >등급</th>\r\n");
      out.write("											        </tr>\r\n");
      out.write("											    </thead>\r\n");
      out.write("											    <tbody>\r\n");
      out.write("											        <tr>\r\n");
      out.write("											            <td>JJH931125</td>\r\n");
      out.write("											            <td>미디어입학문</td>\r\n");
      out.write("											            <td>전공필수</td>\r\n");
      out.write("											            <td>3</td>\r\n");
      out.write("											            <td>4.5</td>\r\n");
      out.write("											            <td>A+</td>\r\n");
      out.write("											        </tr>\r\n");
      out.write("											        <tr>\r\n");
      out.write("											            <td>JJH931125</td>\r\n");
      out.write("											            <td>미디어입학문</td>\r\n");
      out.write("											            <td>전공필수</td>\r\n");
      out.write("											            <td>3</td>\r\n");
      out.write("											            <td>4.5</td>\r\n");
      out.write("											            <td>A+</td>\r\n");
      out.write("											        </tr>\r\n");
      out.write("											        <tr>\r\n");
      out.write("											            <td>JJH931125</td>\r\n");
      out.write("											            <td>미디어입학문</td>\r\n");
      out.write("											            <td>전공필수</td>\r\n");
      out.write("											            <td>3</td>\r\n");
      out.write("											            <td>4.5</td>\r\n");
      out.write("											            <td>A+</td>\r\n");
      out.write("											        </tr>\r\n");
      out.write("											        <tr>\r\n");
      out.write("											            <td>JJH931125</td>\r\n");
      out.write("											            <td>미디어입학문</td>\r\n");
      out.write("											            <td>전공필수</td>\r\n");
      out.write("											            <td>3</td>\r\n");
      out.write("											            <td>4.5</td>\r\n");
      out.write("											            <td>A+</td>\r\n");
      out.write("											        </tr>\r\n");
      out.write("											        <tr>\r\n");
      out.write("											            <td>JJH931125</td>\r\n");
      out.write("											            <td>미디어입학문</td>\r\n");
      out.write("											            <td>전공필수</td>\r\n");
      out.write("											            <td>3</td>\r\n");
      out.write("											            <td>4.5</td>\r\n");
      out.write("											            <td>A+</td>\r\n");
      out.write("											        </tr>\r\n");
      out.write("											    </tbody>\r\n");
      out.write("											</table>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("		                    	</div>\r\n");
      out.write("		                	</div>\r\n");
      out.write("		                </div>\r\n");
      out.write("		            </div>\r\n");
      out.write("			 	</div>\r\n");
      out.write("			<!-- ================================================= -->\r\n");
      out.write("			<!-- 본문1 끝 -->\r\n");
      out.write("			<!-- ================================================= -->\r\n");
      out.write("		\r\n");
      out.write("			<!-- ================================================= -->\r\n");
      out.write("			<!-- 본문 2 -->\r\n");
      out.write("			<!-- ================================================= -->\r\n");
      out.write("		\r\n");
      out.write("		<!-- </div> -->\r\n");
      out.write("		\r\n");
      out.write("			<!-- ================================================= -->\r\n");
      out.write("			<!-- 본문2 끝 -->\r\n");
      out.write("			<!-- ================================================= -->\r\n");
      out.write("		<!-- </div> -->\r\n");
      out.write("		<!-- </div> -->\r\n");
      out.write("		\r\n");
      out.write("		<!-- ================================================= -->\r\n");
      out.write("		<!-- MAIN-CONTENT 끝 -->\r\n");
      out.write("		<!-- ================================================= -->\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
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
