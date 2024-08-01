<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<title>login_form.jsp : 로그인 창</title>
<!-- 성공시 세션에 저장 -->
<jsp:include page="../Common/Link.jsp" />
</head>
<body>

	<h2>로그인 페이지</h2>
	<span style="color: red; font-size: 1.2em;"> <%=request.getAttribute("LoginErrMsg") == null ? "" : request.getAttribute("LoginErrMsg")%>
		<!-- 조건 ; request 영역에 "loginErrMsg"가 있나 확인 ? true일때 : false일때 -->
	</span>
	<!-- 한줄짜리 글자창 출력 -->
	<%
	if (session.getAttribute("id") == null) {//로그인 상태
		//로그아웃 상태
	%>

	<script>
		function validateForm(form) {
			if (form.id.value == "") { /* form의 name="id"의 value가 없으면 alert호출 */
				alert("아이디를 입력하세요.")
				return false;
			}
			if (form.pw.value == "") { /* form의 name="pw"의 value가 없으면 alert호출 */
				alert("패스워드를 입력하세요.");
				return false;
			}
		}
	</script>

	
		<form action="login_process.jsp" method="post" name="login_form"
			onsubmit="return validateForm(this);">
			<!-- submit에서 action으로 보내기전에 먼저 실행하는 것 (this)안에 form값이 들어간다. -->
			<!-- onsubmit의 값이 true가 나와야만 action으로 form이 보내진다 -->
			<div class="form-floating mb-3">
			<input type="text" class="form-control" name="id" required />
			<label for="id">아이디</label>
			</div>
			 <div class="form-floating mb-3">
				<input type="password" class="form-control" name="pw" required />
				<label for="pw">비밀번호</label>
				</div>
			<button type="submit" class="btn btn-primary" >로그인</button>
			<button type="button" class="btn btn-primary" onclick="location.href='Register_form.jsp'">회원가입</button>
		</form>
	<%
	} else {
	%>
	<%=session.getAttribute("name")%>
	회원님, 로그인하셨습니다.
	<button type="button" onclick="location.href='logout.jsp'">로그아웃</button>
	<%
	}
	%>

</body>
<footer><jsp:include page="../Common/Foot.jsp" /></footer>
</html>