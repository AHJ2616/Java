<%@page import="utils.CookieManager"%>
<%@page import="utils.JSFunction"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String user_id = request.getParameter("user_id");
    String user_pw = request.getParameter("user_pw");
    String save_check = request.getParameter("save_check");
    
    if(user_id.equals("ahj")&& user_pw.equals("1234")){
    	if(save_check!=null && save_check.equals("yes")){
    		CookieManager.makeCookie(response,"loginID",user_id,60*60*24);
    		
    	}
    	else{
    		CookieManager.deleteCookie(response,"loginID");
    	}
    	JSFunction.alertLocation(response, "로그인성공!", "./");
    }else{
    	JSFunction.alertBack("로그인 실패 ID와PW를 확인해주세요", out);
    	
    }
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>id_save.jsp : 로그인 처리 (성공,실패 결과를 cookie 와 alert 으로 보여준다)</title>
</head>
<body>

</body>
</html>