
<%@page import="common.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    request.setAttribute("reqString","안희준");
    request.setAttribute("reqPerson", new Person("조용재",35));
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RequestMain.jsp : Request영역은 요청,처리 페이지에서 값이 유지된다. </title>
</head>
<body>
<h2>request 영역 값 삭제하기</h2>

<% request.removeAttribute("reqString");
	//removeAttribute("값") 의 값이 없어도 오류가 안뜨고 넘어간다.
%> 
<br><h2>request 영역 값 출력하기</h2>
<% String requestString = (String) request.getAttribute("reqString"); 
Person person = (Person) request.getAttribute("reqPerson");

%>

<ol>
<li>String 객체 : <%=requestString %></li>
<li>Person 객체 :<%=person.getName() %>의 나이 : <%=person.getAge() %></li>
</ol>

<h2> 포워드 된 페이지에서 request 값 읽기</h2>
<% 
	request.getRequestDispatcher("RequestForword.jsp?kor=한글%eng=english").forward(request,response);
	// request.getRequestDispatcher 실행되자마자 바로 페이지를 해당 url로 넘겨버린다.
%>

</body>
</html>