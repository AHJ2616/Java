<%@page import="common.Person"%>
<%@page import="java.util.Set"%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ApplicationResult : application 영역에 저장된 값 확인</title>
</head>
<body>
<%
HashMap<String,Person> maps = (HashMap)application.getAttribute("Amaps");
Set<String> keys = maps.keySet();
for(String key : keys){
	Person person = maps.get(key);
	out.print(String.format("이름 : %s, 나이 : %d <br>",person.getName(),person.getAge()));
}

out.print(maps.get("학생1").getName()+"<br>");
out.print(maps.get("학생2").getName());
%>
</body>
</html>