<%@page import="utils.JSFunction"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.util.List"%>
<%@page import="model1.member.MemberDAO"%>
<%@page import="model1.member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
MemberDTO memberDTO = new MemberDTO();
MemberDAO memberDAO = new MemberDAO();
memberDTO.setId(request.getParameter("id").toString());
memberDTO.setPw(request.getParameter("pw").toString());
memberDTO.setName(request.getParameter("name").toString());
int result = memberDAO.register(memberDTO);
memberDAO.close();
if(result==1){
	JSFunction.alertLocation("회원가입이 되었습니다","login_form.jsp",out);
	
} else if(result==0){JSFunction.alertBack("회원가입에 실패하였습니다", out);}
else if(result==3){JSFunction.alertBack("아이디가 중복되었습니다", out);}
%>