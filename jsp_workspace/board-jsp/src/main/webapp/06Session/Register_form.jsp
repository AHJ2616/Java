<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="../Common/Link.jsp" />
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
<div class="form-floating mb-3">
<label for= "id">아이디</label><br>
<input type= "text" class="form-control name="id" id="id" autofocus required placeholder="id"/>
</div>
<div class="form-floating">
<label for= "pw">패스워드</label><br>
<input type= "password" class="form-control name="pw" id="pw" required placeholder="password"/><br>
</div>
<div class="form-floating">
<label for= "pw2">패스워드 확인</label><br>
<input type= "password" name= "pw2" id="pw2" class="form-control" required placeholder="password 재확인"/><br>
</div>
<div class="form-floating">
<label for= "name">이름</label><br>
<input type= "text" name= "name" id="name" class="form-control" placeholder="한글이름"/>
</div><br>
<button type= "submit" class="btn btn-primary">회원가입</button> &nbsp;&nbsp;&nbsp;
<button type= "button" class="btn btn-primary" onclick= "location.href='login_form.jsp'">취소</button>
</form>
</body>
<footer><jsp:include page="../Common/Foot.jsp" /></footer>
</html>