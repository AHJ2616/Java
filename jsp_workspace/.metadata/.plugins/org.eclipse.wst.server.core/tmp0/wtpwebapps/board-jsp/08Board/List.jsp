<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="model1.board.BoardDTO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.LinkedList"%>
<%@page import="model1.board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
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
    list_BoardDTO=boardDAO.show_list(map);
    boardDAO.close();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>보드게시판</title>
<jsp:include page="../Common/Link.jsp" />
</head>
<body>
<h2 align="center">보드게시판 - 목록보기</h2>
<form method="get" id="search" action="" >
<table border="1" width="90%">
<tr align="right">
	<td>
	<button type="button" onclick="location.href='Write.jsp';">글쓰기 </button>
	</td>
</tr>
<tr>
<th width="10%">번호</th>
<th width="50%">제목</th>
<th width="15%">작성자</th>
<th width="10%">조회수</th>
<th width="15%">작성일</th>
</tr>
<%
if(list_BoardDTO.isEmpty()){
%>
<tr>
	<td colspan="5" align="center"> 등록된 게시물이 없습니다. </td>

</tr>
<% } else{ 
	int number=0;
	for(BoardDTO dto : list_BoardDTO){
		number = total_count--;%>
		<tr>
		<td><%=number%></td>
		<td><a href="View.jsp?num=<%=dto.getB_num()%>"><%=dto.getB_title()%></a></td>
		<td><%=dto.getB_id()%></td>
		<td><%=dto.getB_count()%></td>
		<td><%=dto.getB_postdate()%></td>
		</tr>	
<%
}}		
 %>
</table>
<table border="1" width="90%">
	<tr>
		<td align="center">
		<select name="search_field">
		<option value="b_title" >제목</option>
		<option value="b_id">작성자</option>
		<option value="b_contents">내용</option>
		</select>&nbsp;&nbsp;
		<input type="text" name="search_word" />&nbsp;
		<input type="submit" value="검색" />
		</td>
	</tr>
</table>

</form>
</body>
<footer><jsp:include page="../Common/Foot.jsp" /></footer>
</html>