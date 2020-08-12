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
	<table>
		<tr>
			<th>이름</th>
			<th>주소</th>
			<th>나이</th>
		</tr>
		<c:forEach var="mem" items="${mList}">
		<tr>
			<td>${mem.mname}</td>
			<td>${mem.maddr}</td>
			<td>${mem.mage}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>