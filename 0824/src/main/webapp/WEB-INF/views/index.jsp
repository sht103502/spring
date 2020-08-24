<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"  %>  --%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>	
<body>
<%--  <img src="<spring:url value='/resources/fileUpload/2.PNG'/>"> 
 <img src="<spring:url value='/resources/fileUpload/fileUpload3.gif'/>">   --%>
	<c:if test="${not empty sessionScope.loginID}">
		${sessionScope.loginID }님 환영합니다.
		<button onclick="location.href='logOut'">로그아웃</button>
		<button onclick="location.href='goboard'">게시판보기</button>
	</c:if>
	<c:if test="${empty sessionScope.loginID}"> 
		<button onclick="location.href='gologin'">로그인</button>
		<button onclick="location.href='gojoin'">회원가입</button>
		<button onclick="location.href='goboard'">게시판보기</button>
	</c:if>
	
	<button onclick="location.href='boardForm'">글쓰기</button>
	<button onclick="location.href='pagingList'">목록보기</button>
	
</body>
</html> 