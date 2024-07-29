<%@page import="common.JDBConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>webxml_test.jsp : servletContext 활용</title>
</head>
<body>
<h2>jdbc 연결(servletContext 활용)</h2>
	<%
		JDBConnect jdbc = new JDBConnect(application);
		jdbc.close();
	%>
</body>
</html>