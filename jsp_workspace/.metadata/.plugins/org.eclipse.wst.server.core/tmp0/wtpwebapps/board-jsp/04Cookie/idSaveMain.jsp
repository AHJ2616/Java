<%@page import="utils.CookieManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String loginId = CookieManager.readCookie(request, "loginID"); //로그인ID를 넣어서 value값을 가져와서 집어 넣는다.
    
    String cookieCheck="";
    if(!loginId.equals("")){
    	cookieCheck = "checked";
    	
    }
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>idSaveMain.jsp : 쿠키를 이용한 아이디 저장 및 alert 테스트</title>
</head>
<body>
<h2>로그인 페이지</h2>
<form action= "id_save.jsp" method= "post">
 ID <input type= "text" name="user_id" value= "<%= loginId %>" />
 아이디 저장<input type="checkbox" name="save_check" value="yes" <%= cookieCheck %> />
<br>
PW <input type= "password" name="user_pw" />
<input type= "submit" value="로그인">

</form>
</body>
</html>