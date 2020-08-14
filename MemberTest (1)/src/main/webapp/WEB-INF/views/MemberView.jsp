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
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>생년월일</th>
			<th>성별</th>
			<th>이메일</th>
		</tr>
		
			<tr>
				<td>${mView.jsid }</td>
				<td>${mView.jspassword }</td>
				<td>${mView.jsname }</td>
				<td>${mView.jsbirth }</td>
				<td>${mView.jsgender }</td>
				<td>${mView.jsemail }</td>
			</tr>
		
		
	
	</table>
</body>
</html>