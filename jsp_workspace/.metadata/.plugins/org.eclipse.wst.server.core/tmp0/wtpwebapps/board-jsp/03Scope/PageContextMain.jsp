
<%@page import="common.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    pageContext.setAttribute("pageInt", 8282);  //page영역에 값 저장(int)
    pageContext.setAttribute("pageString", "MBC");
    pageContext.setAttribute("PersonDTO", new Person("네임",40));
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PageContextMain : 자바dto를 활용</title>
</head>
<body>
<h2>PageContext 영역의 값 저장</h2>
<%
int pageContextInt = (Integer) pageContext.getAttribute("pageInt");
String pageContextString = (String) pageContext.getAttribute("pageString");
Person person = (Person) pageContext.getAttribute("PersonDTO");
%>
<br>
<hr>
<h2>PageContext 영역의 값 출력</h2>

<ol>
<li>정수 출력 : <%=pageContextInt %></li>
<li>문자열 출력 : <%=pageContextString %></li>
<li>DTO 출력 : <%= person.getName() %> , <%= person.getAge() %></li>
</ol>
</body>
</html>