/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.70
 * Generated at: 2021-11-03 07:24:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class springPwTemp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>TEMP PW</title>\r\n");
      out.write("<script  src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("	$(document).ready(function(){\r\n");
      out.write("		alert(\">>> : \");\r\n");
      out.write("		\r\n");
      out.write("		$(\"#emailbtn\").click(function(){\r\n");
      out.write("			alert(\"emailbtn >>> : \");\r\n");
      out.write("			\r\n");
      out.write("			let url = \"id_email_authentication.h\";\r\n");
      out.write("			let midVal = $(\"#mid\").val();			\r\n");
      out.write("			let memailVal = $(\"#memail\").val();\r\n");
      out.write("			\r\n");
      out.write("			$.get(url\r\n");
      out.write("				 ,{\"mid\": midVal, \"memail\": memailVal}\r\n");
      out.write("				 ,function(data){						\r\n");
      out.write("					var sVal = $(data).find(\"result\").text();	\r\n");
      out.write("					alert(sVal);					\r\n");
      out.write("				 }\r\n");
      out.write("			);			\r\n");
      out.write("		});\r\n");
      out.write("	\r\n");
      out.write("		$(\"#pwbtn\").click(function(){\r\n");
      out.write("			console.log(\"pwbtn >>> : \");\r\n");
      out.write("			$('#pwForm').attr({\r\n");
      out.write("				'action':'pwCreateForm.h',\r\n");
      out.write("				'method':'GET',\r\n");
      out.write("				'enctype':'application/x-www-form-urlencoded'\r\n");
      out.write("			}).submit();\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h3 align=\"center\">TEMPPW</h3>\r\n");
      out.write("<hr>\r\n");
      out.write("<form name=\"pwForm\" id=\"pwForm\">\r\n");
      out.write("<table border=\"1\" align=\"center\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td>아이디</td>\r\n");
      out.write("<td><input type=\"text\" name=\"mid\" id=\"mid\" style=\"width:200px;\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<td>이메일 주소</td>\r\n");
      out.write("<td>\r\n");
      out.write("	<input type=\"text\" name=\"memail\" id=\"memail\" style=\"width:200px;\">\r\n");
      out.write("	<button type=\"button\" id=\"emailbtn\">인증번호 받기</button>\r\n");
      out.write("</td>\r\n");
      out.write("<tr>\r\n");
      out.write("<td></td>\r\n");
      out.write("<td>인증번호가 오지 않나요<img src=\"/springHbe/img/img_mandu/ase.gif\" width=\"20\" height=\"20\"\r\n");
      out.write("title=\"발송한 메일이 스팸 메일로 분류되는 것은 아닌지 &#13;확인하세요, 스팸메일함에도 메일이 없으면, &#13;다시 한 번 '인증번호 받기'를 눌러주세요.\">\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td colspan=\"2\" align=\"center\">\r\n");
      out.write("<button type=\"button\" id=\"pwbtn\">다음</button>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table> \r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
