<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session_main.jsp : web.xml 에서 설정한 session정보 확인</title>
</head>
<body>
	<h2>Session 설정 확인</h2>
	<%
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		long creation_time = session.getCreationTime();
		String creation_time_String = dateFormat.format(new Date(creation_time));
		
		long last_time = session.getLastAccessedTime();
		String last_time_String = dateFormat.format(new Date(last_time));
		
		
	%>
	<ul>
	<li>세션 유지 시간 설정값 : <%= session.getMaxInactiveInterval() %></li>
	<li>세션의 이름 : <%=session.getId() %></li>
	<li>최초 세션 생성 시간 : <%=creation_time_String %></li>
	<li>마지막 세션 요청 시간 : <%=last_time_String %></li>
	</ul>
	
	
</body>
</html>