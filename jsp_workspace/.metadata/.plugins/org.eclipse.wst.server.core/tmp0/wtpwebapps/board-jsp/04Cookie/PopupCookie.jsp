<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- var check_value= $("input:checkbox[id=inactiveToday]:checked").val(); //타입이 checkbox인 input에 id가 inactiveToday가 체크되어있는지 확인해서 var에 넣는다.
		$.ajax({//비동기 코드 : 현재창을 유지하면서 데이터를 전송해준다.
			url : '/PopupCookie.jsp',
			type : get,
			data : {inactiveToday : check_value},
			dataType : "text",
			success : function(resData){
				if(resData != ''){//''는 null이랑 비슷함
					location.reload();
				}
				
			}
		}); -->
</head>
<body>
<% 
String check_value = request.getParameter("inactiveToday");
System.out.println(check_value);
if(check_value!=null && check_value.equals("1")){
Cookie popUpClose = new Cookie("popUpClose","off");
popUpClose.setPath(request.getContextPath()); //쿠기가 생성된 경로
popUpClose.setMaxAge(3_600*24);
response.addCookie(popUpClose);
System.out.println("쿠키생성");
}
%>

</body>
</html>