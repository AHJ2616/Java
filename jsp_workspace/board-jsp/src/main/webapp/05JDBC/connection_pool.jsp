<%@page import="common.DBconnectionPool"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DBconnectionPool.jsp : 커넥션 풀을 이용한 접속</title>
</head>
<body>
<h2>커넥션풀을 이용한 접속</h2>
<p>톰캣에서 제공하는 connection pool을 이용한다.(context.xml 과 server.xml 이용)</p>

<%
	DBconnectionPool pool = new DBconnectionPool();
	pool.close();

%>

</body>
</html>