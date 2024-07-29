<%@page import="common.JDBConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>web_xml_jdbc_test.jsp : xml문서를 활용하여 접속테스트</title>
</head>
<body>
<h2>jdbc 연결(톰캣 Application 메모리영역 + jsp)</h2>

<!-- jsp를 만들때 마다 필수로 입력해줘야하는 단점이 있다 -->
<%
String driver = application.getInitParameter("OracleDriver");
String url = application.getInitParameter("OracleUrl");
String id = application.getInitParameter("OracleId");
String pw = application.getInitParameter("OraclePw");
JDBConnect jdbc = new JDBConnect(driver,url,id,pw);
jdbc.close();
%>

</body>
</html>