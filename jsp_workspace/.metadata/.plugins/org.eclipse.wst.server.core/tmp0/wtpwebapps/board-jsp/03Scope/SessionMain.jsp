<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SessionMain : 세션 영역 value 유지</title>
</head>
<body>
<% 
ArrayList<String> list = new ArrayList<String>();
list.add("엠비씨");
list.add("아카데미");
list.add("컴퓨터");
list.add("교육센터");

session.setAttribute("lists", list); //리스트로 세션영역에 값 저장

%>

<h2>세션 영역에 리스트 저장 완료</h2>
<a href="./SessionLocation.jsp">이동</a>
</body>
</html>