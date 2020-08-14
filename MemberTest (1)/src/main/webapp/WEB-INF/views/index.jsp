<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- d:if사용시 -->
<!-- eq; 같다 -->
<!-- ne; 다르다 -->
<!-- null:empty -->
<!-- not null: not empty -->

	<c:if test="${not empty sessionScope.loginID}">
		${sessionScope.loginID }님 환영합니다.
		<button onclick="location.href='logOut'">로그아웃</button>
	</c:if>
	<button onclick="location.href='joinForm'">회원가입 페이지</button>
	<button onclick="location.href='loginForm'">로그인 페이지</button>
	<button onclick="location.href='memberList'">회원목록 페이지</button>
</body>
</html>