<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 페이지 위에있는 메뉴 바 -->
<!-- include용 파일은 기본 태그가 필요 없다 -->

<table border= "1" width= "90%" > <!-- 두께 1 , 가로크기 90% -->
  <tr>
    <td align="center" >
    	<%
    	if(session.getAttribute("id")==null){ //session에 id가 없으면(로그인 안한 상태면) 로그인 표시 %>
    		<button type= "button" onclick= "location.href='../06Session/login_form.jsp'">로그인</button>&nbsp;&nbsp;&nbsp;&nbsp;
    	<% }else{//로그인상태면 로그아웃 표시 %>
    		<button type= "button" onclick= "location.href='../06Session/logout.jsp'">로그아웃</button>&nbsp;&nbsp;&nbsp;&nbsp;
    		
    	<% }
    	%>
    	<!-- 게시판 링크 추가 -->
    	<button type= "button" onclick= "location.href='../08Board/List.jsp'">회원게시판</button>&nbsp;&nbsp;&nbsp;&nbsp;
    	<button type= "button" onclick= "location.href='../09File/List.jsp'">파일게시판</button>&nbsp;&nbsp;&nbsp;&nbsp;
    	<button type= "button" onclick= "location.href='../10Mvc/List.jsp'">서블릿게시판</button>&nbsp;&nbsp;&nbsp;&nbsp;
    	<button type= "button" onclick= "location.href='../11Item/List.jsp'">상품게시판</button>&nbsp;&nbsp;&nbsp;&nbsp;
    </td>
    <!-- 로그인상태를 보고 로그인 | 로그아웃 표시 -->
    
  </tr>
</table>
