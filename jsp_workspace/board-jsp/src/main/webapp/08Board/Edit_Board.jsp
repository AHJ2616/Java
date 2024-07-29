<%@page import="model1.board.BoardDAO"%>
<%@page import="model1.board.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="isLoggedIn.jsp" %>
<%
	String num= request.getParameter("num");
	BoardDAO dao = new BoardDAO();
	BoardDTO dto = dao.view_page(num);
	String sessionID = session.getAttribute("id").toString();//로그인 아이디 가져오기
	if(!sessionID.equals(dto.getB_id()))
	{JSFunction.alertBack("작성자만 수정 가능합니다", out);
	return;}
	dao.close();
%>
<html>
<head>
<meta charset="UTF-8">
<title>수정 페이지</title>
<jsp:include page="../Common/Link.jsp" />
</head>
<body>
<form name="Edit_Form" method="post" action="Edit_Process.jsp"
      onsubmit="return validateForm(this);">
      <input type="hidden" name="num" value="<%=dto.getB_num()%>" />
    <table border="1" width="90%">
        <tr>
            <td>제목</td>
            <td>
                <input type="text" name="title" style="width: 90%;" required value="<%=dto.getB_title() %>"/>
            </td>
        </tr>
        <tr>
            <td>내용</td>
            <td>
                <textarea name="content" style="width: 90%; height: 100px;" required><%=dto.getB_contents()%></textarea>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <button type="submit">작성 완료</button>
                <button type="reset">다시 입력</button>
                <button type="button" onclick="location.href='List.jsp';">
                    취소</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>