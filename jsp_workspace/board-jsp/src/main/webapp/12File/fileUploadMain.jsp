<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>FileUpload</title>
<jsp:include page="../Common/Link.jsp" />
<%@ include file="../08Board/isLoggedIn.jsp" %>
</head>
<script>
    function validateForm(form) { 
        if (form.name.value == "") {
            alert("작성자를 입력하세요.");
            form.name.focus();
            return false;
        }
        if (form.title.value == "") {
            alert("제목을 입력하세요.");
            form.title.focus();
            return false;
        }
        if (form.attachedFile.value == "") {
            alert("첨부파일은 필수 입니다.");
            return false;
        }
    }
</script>
<body>
    <h3>파일 업로드</h3>
    <!-- error massage 출력용 span -->
    <span style="color: red;">${errorMessage }</span>
    <!-- 파일전송용 form -->
    <form name="fileForm" method="post" enctype="multipart/form-data"
          action="UploadProcess.jsp" onsubmit="return validateForm(this);">
        제목 : <input type="text" name="title" required /><br /> 
        카테고리(선택사항) : 
            <input type="checkbox" name="cate" value="사진" checked />사진 
            <input type="checkbox" name="cate" value="과제" />과제 
            <input type="checkbox" name="cate" value="워드" />워드 
            <input type="checkbox" name="cate" value="음원" />음원 <br /> 
        첨부파일 : <input type="file" name="attachedFile" /> <br /> <!-- input의 type이 file이면 찾아보기 버튼이 나온다. -->
        <input type="submit" value="전송하기" />
    </form>
</body>
</html>