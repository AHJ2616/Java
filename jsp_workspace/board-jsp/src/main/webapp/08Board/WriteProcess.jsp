<%@page import="model1.board.BoardDAO"%>
<%@page import="model1.board.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./isLoggedIn.jsp" %>
<%
String b_title = request.getParameter("title");
String b_contents = request.getParameter("content");
BoardDTO boardDTO = new BoardDTO();
boardDTO.setB_contents(b_contents);
boardDTO.setB_title(b_title);
boardDTO.setB_id(session.getAttribute("id").toString());
BoardDAO boardDAO = new BoardDAO();
int result = boardDAO.write_board(boardDTO); 
/* int result = 0;
for(int i=1;i<101;i++){
	boardDTO.setB_title(b_title+"-"+i);
	result = boardDAO.write_board(boardDTO);
} */
boardDAO.close();
if(result==1){
	response.sendRedirect("List.jsp");
}
else{
	JSFunction.alertBack("글을 저장하는데 실패하였습니다", out);
}
%>