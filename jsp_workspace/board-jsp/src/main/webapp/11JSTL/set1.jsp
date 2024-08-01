<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="common.Person"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix= "c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- jstl의 core tag 사용 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> <!-- jstl의 formatting tag 사용 -->
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %> <!-- jstl의 xml tag 사용 -->
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> <!-- jstl의 function tag 사용 -->
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %> <!-- jstl의 sql tag 사용 -->
<!-- 자주쓰는 5개의 tag library인데 core를 가장 많이 쓴다. -->


<html>
<head>
<meta charset="UTF-8">
<title>set1.jsp : JSTL 연습</title>
</head>
<body>
<!-- 변수선언 - 중간에 주석을 넣으면 500 error 발생한다 -->
<!-- 띄어쓰기 오류 안생김 -->
<c:set var="direct" value ="100" />
<c:set var="elVar" value= "${direct mod 5 }" />
<c:set var= "expVar" value="<%= new Date() %>" />
<c:set var="betweenVar">변수값</c:set>

<h4>EL로 변수 출력</h4>
<ul>
<li>1. ${direct}</li>
<li>2. ${elVar}</li>
<li>3. ${expVar}</li>
<li>4. ${betweenVar}</li>
</ul>

<h4>자바 빈즈 생성</h4>
<!-- scope= 저장할 메모리 지정, 사용자 지정 생성자를 이용하여 Person Class 인스턴스 생성 뒤 값 입력 -->
<c:set var =  "personValue1" value = '<%= new Person("엠비씨",12) %>' scope="request"></c:set>
<h4>출력</h4>
<p>이름 : ${requestScope.personValue1.name}</p>
<p>나이 : ${personValue1.age}</p>
<h4>출력2</h4>
<c:set var = "personValue2" value = "<%= new Person() %>" scope="request"/>
<c:set target = "${personValue2}" property="name" value = "김기원" />
<c:set target = "${personValue2}" property= "age" value = "44" />
<p>이름 : ${requestScope.personValue2.name}</p>
<p>나이 : ${personValue2.age}</p>

<h4>list Collection을 사용</h4>
<%
	List<Person> lists = new ArrayList<>();
	lists.add(new Person("나",30));
	lists.add(new Person("너",10));
%>
<!-- jstl을 사용하면 쉽게 호출을 할 수 있다. -->
<c:set var= "personList" value="<%=lists%>" scope="request" />
<ul>
	<li>이름 : ${personList[0].name} </li>
	<li>나이 : ${personList[0].age} </li>
</ul>
<h4>map Collection을 사용</h4>
<%
	Map<String,Person> maps = new HashMap<>();
	maps.put("person1",new Person("나",30));
	maps.put("person2",new Person("너",222));
%>
<c:set var="personMap" value="<%= maps %>" scope= "request" />
<ul>
	<li>이름 : ${requestScope.personMap.person1.name="value변경가능(출력,저장)"} </li>
	<li>나이 : ${requestScope.personMap.person2.age} </li>
</ul>
<h4>삭제 테스트</h4>
<!-- 삭제되어 출력 안됨 -->
<c:remove var="personValue2" scope="request"/>
<p>이름 : ${requestScope.personValue2.name}</p>
<p>나이 : ${personValue2.age}</p>
</body>
</html>