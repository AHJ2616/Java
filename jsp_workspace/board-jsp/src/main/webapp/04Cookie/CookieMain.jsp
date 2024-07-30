<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CookieMain.jsp : 쿠키 생성</title>
</head>
<body>
<h2>1. 쿠키 생성</h2>
<%
Cookie cookie1 = new Cookie("cookie11","초코칩쿠키");
Cookie cookie2 = new Cookie("cookie21","크렌베리쿠키");
cookie1.setPath("/"); // '/'= http://192.168.111.120:80/index.jsp/ xml메인 기본경로를 뜻한다.
cookie2.setPath(request.getContextPath()); //쿠기가 생성된 경로
cookie1.setMaxAge(200_000_000);
cookie2.setMaxAge(3_600);
response.addCookie(cookie1);
response.addCookie(cookie2);
System.out.println(cookie1.getPath()); //콘솔에만 표시된다
System.out.println(cookie2.getPath()); //콘솔에만 표시된다
out.println("쿠키 생성 완료");
%>
<br>
<h2>2. 쿠키 생성된 결과 확인</h2>
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
<br>

<div>
<h2>3.쿠키의 이동 확인</h2>
<a href="CookieResult.jsp">페이지이동</a>
</div>

</body>
</html>