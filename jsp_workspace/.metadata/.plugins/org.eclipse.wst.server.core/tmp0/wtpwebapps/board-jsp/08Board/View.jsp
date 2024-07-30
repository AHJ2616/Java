<%@page import="model1.board.BoardDTO"%>
<%@page import="model1.board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String num = request.getParameter("num");
BoardDAO dao = new BoardDAO();
dao.increase_b_count(num);
BoardDTO dto = dao.view_page(num);
dao.close();
%>
<html>
<head>
<meta charset="UTF-8">
<title>페이지 상세보기</title>
<jsp:include page="../Common/Link.jsp" />
</head>
<body>
<script>
function deletePost(){//삭제 동작
	const confirmed = confirm("정말로 삭제 하시겠습니까?"); //예,아니오가 있는 alert창
 	if(confirmed){//예 = true 아니오 = false
		const form = document.Write_Form;//html의 form이름을 가져와 form이라는 객체를 만든다
		form.method = "post";
		form.action = "Delete_Process.jsp";
		form.submit();
	}
}
</script>
<form name= "Write_Form" id= "Write_Form" >
	<input type= "hidden" name= "num" value= "<%=num%>" /> <!-- 다른페이지로 전달할 input 생성 -->
	<table border="1" width="90%">
		<tr>
			<td>번호</td>
			<td><%=dto.getB_num()%></td>
			<td>작성자</td>
			<td><%=dto.getName() %></td>
		</tr>
		<tr>
			<td>작성일</td>
			<td><%=dto.getB_postdate()%></td>
			<td>조회수</td>
			<td><%=dto.getB_count() %></td>
		</tr>
		<tr>
			<td>제목</td>
			<td colspan="3"><%=dto.getB_title()%></td>
		</tr>
		<tr>
			<td>내용</td>
			<td colspan="3" height="100"><pre><%=dto.getB_contents()%></pre></td>
		</tr>
		<tr>
			<td colspan="4" align="center">
				<%if(session.getAttribute("id")!=null&&session.getAttribute("id").toString().equals(dto.getB_id()))
				{%>
				<button type="button" onclick="location.href='Edit_Board.jsp?num=<%=dto.getB_num()%>'">
					수정
				</button> &nbsp;
				<button type="button" onclick="deletePost();">
					삭제 
				</button>&nbsp;
				<%}%>
					<button type="button" onclick="location.href='List.jsp'">
						목록
					</button>
			</td> <!-- 수정,삭제 버튼 만들기 -->
		</tr>
	</table>
</form>
</body>
<footer><jsp:include page="../Common/Foot.jsp" /></footer>
</html>