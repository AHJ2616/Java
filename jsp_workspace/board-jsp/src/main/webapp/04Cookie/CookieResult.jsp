<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CookieResult.jsp : 쿠키의 이동 확인</title>
</head>
<body>
<h2>쿠키값 확인</h2>
<%
Cookie[] cookies = request.getCookies(); //String[] 타입으로 쿠키 전부 가져오기
if(cookies != null){
	for(Cookie cook : cookies){
		String cookieName = cook.getName();
		String cookieValue = cook.getValue();
		int cookieAge = cook.getMaxAge();
		
		out.print("쿠키 이름 : "+ cookieName);
		out.print(",  쿠키 값 : "+ cookieValue);
		out.print(",  쿠키 유효시간 : "+ cookieAge + "초<br>");
		
		
	}//for end
	
	
}//if end
else {
	out.print("현재 쿠키가 없습니다");
}
%>

</body>
</html>