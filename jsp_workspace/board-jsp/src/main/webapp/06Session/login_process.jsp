<%@page import="membership.Memberdto"%>
<%@page import="membership.Memberdao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login_process.jsp : login_form의 포워드 페이지</title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
String id1 = request.getParameter("id");
String pw1 = request.getParameter("pw");
Memberdao memberdao = new Memberdao();
Memberdto memberdto = memberdao.getMemberdto(id1, pw1);
memberdao.close();
/* 로그인 성공시 session에 넣고 실패하면 돌아가기 */
if(memberdto.getId() !=null){
session.setAttribute("id",memberdto.getId());
session.setAttribute("name",memberdto.getName());//필요한 정보만 넣기
response.sendRedirect("login_form.jsp");
}
else{
	request.setAttribute("LoginErrMsg","로그인정보가 일치하지 않습니다");
	request.getRequestDispatcher("login_form.jsp").forward(request, response);
}
%>
</body>
</html>