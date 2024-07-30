<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="../08Board/isLoggedIn.jsp" %>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 작성</title>
<script>
function check_id(){
	alret("미구현 상태입니다");
}
</script>
</head>
<body>
<form id="register_form" action="Register.jsp" method="post" onsubmit="return check_id()">
<label for= "id">아이디</label><br>
<input type= "text" name= "id" id="id" autofocus="autofocus" required placeholder="id"/>
<button type= "button" onclick="check_id" >아이디 중복확인</button>
<br>
<label for= "pw">패스워드</label><br>
<input type= "password" name= "pw" id="pw" required placeholder="password"/><br>
<label for= "pw2">패스워드 확인</label><br>
<input type= "password" name= "pw2" id="pw2" required placeholder="password 재확인"/><br>
<label for= "name">이름</label><br>
<input type= "text" name= "name" id="name" placeholder="한글이름"/><br><br>
<input type= "submit" value="회원가입" /> &nbsp;&nbsp;&nbsp;
<button type= "button" onclick= "location.href='login_form.jsp'">취소</button>
</form>
</body>
<footer><jsp:include page="../Common/Foot.jsp" /></footer>
</html>