<%@page import="model1.board.BoardDTO"%>
<%@page import="model1.board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="isLoggedIn.jsp" %>
<%
String num = request.getParameter("num");
BoardDTO dto = new BoardDTO();
BoardDAO dao = new BoardDAO();
dto = dao.view_page(num);
String sessionID = session.getAttribute("id").toString();
if(sessionID.equals(dto.getB_id())){
	int result = dao.delete_board(num);
	dao.close();
	if(result==1){//삭제성공
		JSFunction.alertLocation("삭제되었습니다", "List.jsp", out);
}
	else if(result==0){
		JSFunction.alertBack("삭제 실패되었습니다", out);
	}

}
else{JSFunction.alertBack("본인이 아닌경우 삭제가 불가능 합니다", out);
}
%>