<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<div id="register_member_menu">
<form method="post" action="register_member2.jsp">
아이디 : <input type="text" name="id" autofocus="autofocus" required="required" placeholder="사용하실 아이디를 입력해주세요" /><br>
패스워드 : <input type="password" name="pw" required="required" placeholder="사용하실 비밀번호를 입력해주세요"/><br>
이름 : <input type="text" name="name" required="required" placeholder="한글이름 예)홍길동" /><br>
<input type="submit" value="회원가입"/> &nbsp;&nbsp;&nbsp;
<input type="reset" value="취소" />
</form>
</div>
</body>
</html>