<%@page import="model1.board.BoardDAO"%>
<%@page import="model1.board.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="isLoggedIn.jsp" %>
<%
	String num = request.getParameter("num");
	String b_title = request.getParameter("title");
	String b_contents = request.getParameter("content");
	BoardDTO dto = new BoardDTO();
	dto.setB_num(num);
	dto.setB_title(b_title);
	dto.setB_contents(b_contents);
	out.print(dto.toString());
	BoardDAO dao = new BoardDAO();
	int result = dao.edit_board(dto);
	dao.close();
	if(result==1){//수정 성공
		response.sendRedirect("View.jsp?num="+dto.getB_num());
	} else if(result==0){//수정 실패
		JSFunction.alertBack("수정실패", out);
	return;
	}
%>