<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="../Common/Link.jsp" />
</head>
<body>
<form action="member" method="post" onsubmit="return method(tihs);">
<label for="pw">회원정보를 변경하기위해 로그인 비밀번호를 확인합니다</label><br>
<input type= "password" name= "pw" id="pw" required placeholder="password"/><br>
</form>
</body>
</html>