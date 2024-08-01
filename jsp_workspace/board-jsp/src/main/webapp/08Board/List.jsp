<%@page import="utils.PagingDAO"%>
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
        int pageTemp = (((page_num - 1) / pages) * pages) + 1;
        list_BoardDTO=boardDAO.show_list(map);
        //map 의 저장된 값 =  search_field, search_word, start, end
        boardDAO.close();
    %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
<title>보드게시판</title>
<jsp:include page="../Common/Link.jsp" />
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  </head>
</head>
<body>
<h2 align="center">보드게시판 - 목록보기</h2>
<form method="get" id="search" action="" >
<table class="table">
<tr align="right">
	<td>
	<button type="button" class="btn btn-primary" onclick="location.href='Write.jsp';">글쓰기 </button>
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
<%
} else{ 
	int number=0;
	int count_num = 0;
	
	for(BoardDTO dto : list_BoardDTO){
		number = total_count-(((page_num-1)*posts)+count_num++);
%>
		<!-- 보여줄 페이지들 가상번호 지정 -->
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
		<button type="submit" class="btn btn-primary" >검색</button>
		</td>
	</tr>
	<td>
		<%=PagingDAO.paging_String(total_count, posts, pages, page_num,request.getRequestURI())%>
	</td>
</table>

</form>
</body>
<footer><jsp:include page="../Common/Foot.jsp" /></footer>
</html>