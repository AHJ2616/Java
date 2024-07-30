/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.91
 * Generated at: 2024-07-29 04:42:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._08Board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model1.board.BoardDTO;
import model1.board.BoardDAO;

public final class View_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("model1.board.BoardDTO");
    _jspx_imports_classes.add("model1.board.BoardDAO");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("<!DOCTYPE html>\r\n");

String num = request.getParameter("num");
BoardDAO dao = new BoardDAO();
dao.increase_b_count(num);
BoardDTO dto = dao.view_page(num);
dao.close();

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>페이지 상세보기</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Common/Link.jsp", out, false);
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<script>\r\n");
      out.write("function deletePost(){//삭제 동작\r\n");
      out.write("	const confirmed = confirm(\"정말로 삭제 하시겠습니까?\"); //예,아니오가 있는 alert창\r\n");
      out.write("/* 	if(confirmed){//예 = true 아니오 = false\r\n");
      out.write("		const form = document.Write_Form;//html의 form이름을 가져와 form이라는 객체를 만든다\r\n");
      out.write("		form.method = \"post\";\r\n");
      out.write("		form.action = \"Delete_Process.jsp\";\r\n");
      out.write("		form.submit();\r\n");
      out.write("	}\r\n");
      out.write(" */\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<form name= \"Write_Form\" id= \"Write_Form\" >\r\n");
      out.write("	<input type= \"hidden\" name= \"num\" value= \"");
      out.print(num);
      out.write("\" /> <!-- 다른페이지로 전달할 input 생성 -->\r\n");
      out.write("	<table border=\"1\" width=\"90%\">\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>번호</td>\r\n");
      out.write("			<td>");
      out.print(dto.getB_num());
      out.write("</td>\r\n");
      out.write("			<td>작성자</td>\r\n");
      out.write("			<td>");
      out.print(dto.getName() );
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>작성일</td>\r\n");
      out.write("			<td>");
      out.print(dto.getB_postdate());
      out.write("</td>\r\n");
      out.write("			<td>조회수</td>\r\n");
      out.write("			<td>");
      out.print(dto.getB_count() );
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>제목</td>\r\n");
      out.write("			<td colspan=\"3\">");
      out.print(dto.getB_title());
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>내용</td>\r\n");
      out.write("			<td colspan=\"3\" height=\"100\"><pre>");
      out.print(dto.getB_contents());
      out.write("</pre></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td colspan=\"4\" align=\"center\">\r\n");
      out.write("				");
if(session.getAttribute("id")!=null&&session.getAttribute("id").toString().equals(dto.getB_id()))
				{
      out.write("\r\n");
      out.write("				<button type=\"button\" onclick=\"location.href='Edit_Board.jsp?num=");
      out.print(dto.getB_num());
      out.write("'\">\r\n");
      out.write("					수정\r\n");
      out.write("				</button> &nbsp;\r\n");
      out.write("				<button type=\"button\" onclick=\"deletePost();\">\r\n");
      out.write("					삭제 \r\n");
      out.write("				</button>&nbsp;\r\n");
      out.write("				");
}
      out.write("\r\n");
      out.write("					<button type=\"button\" onclick=\"location.href='List.jsp'\">\r\n");
      out.write("						목록\r\n");
      out.write("					</button>\r\n");
      out.write("			</td> <!-- 수정,삭제 버튼 만들기 -->\r\n");
      out.write("		</tr>\r\n");
      out.write("	</table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("<footer>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Common/Foot.jsp", out, false);
      out.write("</footer>\r\n");
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
