<%@page import="java.net.URLEncoder"%>
<%@page import="fileUpload.MyfileDTO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Vector"%>
<%@page import="fileUpload.MyfileDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>file_list.jsp : 자료 게시판</title>
<jsp:include page="../Common/Link.jsp" />
</head>
<body>
	<h2>자료 리스트</h2>
	<a href="fileUploadMain.jsp">파일 올리기</a>
	<%
		MyfileDAO dao = new MyfileDAO();
		List<MyfileDTO> lists = new Vector<>();
		lists=dao.show_file();
		dao.close();
	%>
	<table border="1">
		<tr>
		<th>파일 번호</th>
		<th>작성자</th>
		<th>제목</th>
		<th>카테고리</th>
		<th>원본 파일명</th>
		<th>저장된 파일명</th>
		<th>작성일</th>
		<th>다운로드</th>
		</tr>
			<%for(MyfileDTO d : lists){%>
				<tr>
				<td><%=d.getF_num()%></td>
				<td><%=d.getF_name()%></td>
				<td><%=d.getF_title()%></td>
				<td><%=d.getF_category()%></td>
				<td><%=d.getF_original()%></td>
				<td><%=d.getSaved_name()%></td>
				<td><%=d.getF_postdate()%></td>
				<td><a href="download.jsp?f_original=<%=URLEncoder.encode(d.getF_original(),"UTF-8")%>&saved_name=<%=URLEncoder.encode(d.getSaved_name(),"UTF-8")%>">[다운로드]</a></td>
				</tr> <!-- URL인코딩 : 파일명이 한글로 되었을때 깨질것을 대비하여 url을 인코딩함 -->
			<%} %>
	</table>
</body>
</html>