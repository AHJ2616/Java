<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SessionLocation.jsp : 세선값 확인하기 </title>
</head>
<body>
<h2>세션 값 출력</h2>
<%
ArrayList<String> list = (ArrayList<String>) session.getAttribute("lists");
for(String x : list){
	out.println(x + "<br>");
}
%>
</body>
</html>