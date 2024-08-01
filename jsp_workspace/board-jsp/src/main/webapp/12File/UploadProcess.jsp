<%@page import="utils.JSFunction"%>
<%@page import="java.io.File"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%> <!-- cos.jar에서 가져옴 -->
<%@page import="fileUpload.MyfileDAO"%>
<%@page import="fileUpload.MyfileDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- 파일 업로드 처리 cos.jar을 사용하려면 4가지가 필요하다. 
1. request
2. 저장경로 설정
3. 단일파일 크기 설정(max file size)
4. 인코딩방식 설정
-->
<%
// 1단계 : cos.jar 설정
String save_directory = application.getRealPath("/Uploads"); //파일을 저장할 경로(폴더) 먼저 직접 만들어줘야함
// http://ip:port/프로젝트명/파일명(Uploads)
int max_post_size = 100 * 1024 * 1024; //100MB
String encoding = "utf-8";

MultipartRequest mr = new MultipartRequest(request,save_directory,max_post_size,encoding);
System.out.print("save_directory : "+save_directory);

// 2. 새로운 파일명 생성
String fileName = mr.getFilesystemName("attachedFile");  // 현재 파일 이름
String ext = fileName.substring(fileName.lastIndexOf("."));  // 파일 확장자
String now = new SimpleDateFormat("yyyyMMdd_HmsS").format(new Date());
String newFileName = now + ext;  // 새로운 파일 이름("업로드일시.확장자")

// 3. 파일명 변경
File oldFile = new File(save_directory + File.separator + fileName); //해당 경로에 있는 파일 불러오기
//File.separator = 컴퓨터의 운영체제마다 파일경로를 구분하는 \ 가 다르니까 문자대신 사용한다
File newFile = new File(save_directory + File.separator + newFileName);
oldFile.renameTo(newFile);

String name = mr.getParameter("name"); //작성자
String[] categories = mr.getParameterValues("cate");
StringBuffer cate_buffer = new StringBuffer();
if(categories==null){cate_buffer.append("선택없음");}
else{
	for(String s : categories){
		cate_buffer.append(s+ ",");
	}
}

MyfileDTO dto = new MyfileDTO();
dto.setF_name(session.getAttribute("id").toString()); /* 작성자 */
dto.setF_title(mr.getParameter("title"));
dto.setF_category(cate_buffer.toString());
dto.setF_original(fileName);
dto.setSaved_name(newFileName);
MyfileDAO dao = new MyfileDAO();
int result = dao.insert_file(dto);
dao.close();
if(result==1){
response.sendRedirect("file_list.jsp");
}
else if(result==0)
{	request.setAttribute("errorMessage","파일 업로드 오류");
	request.getRequestDispatcher("fileUploadMain.jsp").forward(request,response);}
%>