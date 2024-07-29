<%@page import="common.JDBConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Connection_test.jsp : jdbc 연결 확인</title>
</head>
<body>
<h2>jdbc 생성</h2>
<%
JDBConnect jdbconnect = new JDBConnect();
jdbconnect.close();
%>
</body>
</html>