<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- c:if 사용시 -->
<!-- ne 다를시 -->
<!-- not empty 비어있지 x -->
<!--  -->
<c:if test="${not empty sessionScope.loginID}">
	${sessionScope.loginID}님 환영합니다.<br/>
</c:if>
<button onclick="location.href='joinForm'">회원가입 페이지</button>
<button onclick="location.href='loginForm'">로그인 페이지</button>
<button onclick="location.href='memberList'">회원목록 페이지</button>
</body>
</html>