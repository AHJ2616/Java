
<%@page import="common.Person"%>
<%@page import="java.util.Map"%>

<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ApplicationMain : 톰캣이 갖고 있는 영역</title>
<!-- 톰캣 종료시 사라진다 -->
</head>
<body>
<h2>Application 영역의 값 저장</h2>
<%
Map<String,Person> maps = new HashMap<String,Person>();
maps.put("학생1", new Person("이현우",20));
maps.put("학생2", new Person("함시은",24));

application.setAttribute("Amaps", maps); // application 영역에 값 저장
out.print("값 저장 완료");
%>
</body>
</html>