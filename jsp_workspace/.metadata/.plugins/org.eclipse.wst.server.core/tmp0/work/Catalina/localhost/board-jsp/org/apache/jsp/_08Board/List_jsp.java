/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.91
 * Generated at: 2024-07-30 02:37:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._08Board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import utils.PagingDAO;
import java.util.HashMap;
import java.util.Map;
import model1.board.BoardDTO;
import java.util.List;
import java.util.LinkedList;
import model1.board.BoardDAO;

public final class List_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(10);
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("model1.board.BoardDTO");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("model1.board.BoardDAO");
    _jspx_imports_classes.add("java.util.LinkedList");
    _jspx_imports_classes.add("utils.PagingDAO");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");

    BoardDAO boardDAO = new BoardDAO();
        List<BoardDTO> list_BoardDTO = new LinkedList<BoardDTO>();
        Map<String,Object> map = new HashMap<String,Object>();
        String search_field = request.getParameter("search_field");
        String search_word = request.getParameter("search_word");
        if(search_word!= null){
        	map.put("search_field",search_field);
        	map.put("search_word",search_word);
        }
        int total_count = boardDAO.take_count(map);
        //페이징 처리
        //1. 전체 페이지 수 계산
        int posts = Integer.parseInt(application.getInitParameter("POSTS_PER_PAGE")); //1페이지당 포스트 수=10
        int pages = Integer.parseInt(application.getInitParameter("PAGES_PER_BLOCK")); //1페지당 페이지 수=5
      	int total_page = (total_count-1)/posts +1; //총페이지 수
        // int total_page = (int) Math.ceil((double) total_count/posts);//총페이지수
        
        //현재 페이지
        int page_num =1; //첫페이지 기본값
        String page_temp = request.getParameter("page_num"); //List.jsp?page_num= 1
      	if(page_temp!=null && !page_temp.equals("")){ //url로 넘어온 값이 있다면
      		page_num = Integer.parseInt(page_temp);
      	}
       
        //목록에 출력할 게시물 범위 계산
        int start = (page_num-1)*posts + 1;
        int end = page_num*posts;
        map.put("start",start);
        map.put("end",end);
        
        list_BoardDTO=boardDAO.show_list(map);
        //map 의 저장된 값 =  search_field, search_word, start, end
        boardDAO.close();
    
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>보드게시판</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Common/Link.jsp", out, false);
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h2 align=\"center\">보드게시판 - 목록보기</h2>\r\n");
      out.write("<form method=\"get\" id=\"search\" action=\"\" >\r\n");
      out.write("<table border=\"1\" width=\"90%\">\r\n");
      out.write("<tr align=\"right\">\r\n");
      out.write("	<td>\r\n");
      out.write("	<button type=\"button\" onclick=\"location.href='Write.jsp';\">글쓰기 </button>\r\n");
      out.write("	</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<th width=\"10%\">번호</th>\r\n");
      out.write("<th width=\"50%\">제목</th>\r\n");
      out.write("<th width=\"15%\">작성자</th>\r\n");
      out.write("<th width=\"10%\">조회수</th>\r\n");
      out.write("<th width=\"15%\">작성일</th>\r\n");
      out.write("</tr>\r\n");

if(list_BoardDTO.isEmpty()){

      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("	<td colspan=\"5\" align=\"center\"> 등록된 게시물이 없습니다. </td>\r\n");
      out.write("\r\n");
      out.write("</tr>\r\n");

} else{ 
	int number=0;
	int count_num = 0;
	
	for(BoardDTO dto : list_BoardDTO){
		number = total_count-(((page_num-1)*posts)+count_num++);

      out.write("\r\n");
      out.write("		<!-- 보여줄 페이지들 가상번호 지정 -->\r\n");
      out.write("		<tr>\r\n");
      out.write("		<td>");
      out.print(number);
      out.write("</td>\r\n");
      out.write("		<td><a href=\"View.jsp?num=");
      out.print(dto.getB_num());
      out.write('"');
      out.write('>');
      out.print(dto.getB_title());
      out.write("</a></td>\r\n");
      out.write("		<td>");
      out.print(dto.getB_id());
      out.write("</td>\r\n");
      out.write("		<td>");
      out.print(dto.getB_count());
      out.write("</td>\r\n");
      out.write("		<td>");
      out.print(dto.getB_postdate());
      out.write("</td>\r\n");
      out.write("		</tr>	\r\n");

	}}
	
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<table border=\"1\" width=\"90%\">\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td align=\"center\">\r\n");
      out.write("		<select name=\"search_field\">\r\n");
      out.write("		<option value=\"b_title\" >제목</option>\r\n");
      out.write("		<option value=\"b_id\">작성자</option>\r\n");
      out.write("		<option value=\"b_contents\">내용</option>\r\n");
      out.write("		</select>&nbsp;&nbsp;\r\n");
      out.write("		<input type=\"text\" name=\"search_word\" />&nbsp;\r\n");
      out.write("		<input type=\"submit\" value=\"검색\" />\r\n");
      out.write("		</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	<tr align=\"center\">\r\n");
      out.write("	<td>\r\n");
      out.write("		");
      out.print(PagingDAO.paging_String(total_count, posts, pages, page_num,request.getRequestURI()));
      out.write("\r\n");
      out.write("	</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
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