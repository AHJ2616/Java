
<%@page import="common.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RequestForword.jsp : forword는 request가 넘어오는 jsp</title>
</head>
<body>
<h2>forword로 전달 된 페이지</h2>
<h3>RequestMain.jsp 값 읽기</h3>
<%
Person person = (Person) request.getAttribute("reqPerson");
%>

<ol>
<li>person 객체 : <%=person.getName() %> 나이 : <%=person.getAge() %></li>

<h4>getRequestDispatcher로 전달된 값 출력</h4>
<%
request.setCharacterEncoding("utf-8"); // post method의 한글처리용
out.print(request.getParameter("kor"));
out.print("<br>");
out.print(request.getParameter("eng"));%>
</ol>
</body>
</html>