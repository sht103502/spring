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
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>주소</th>
			<th>생일</th>
			<th>전화번호</th>
		</tr>
		<c:forEach var="mem" items="${mList1}">
		<tr>
			<td>${mem.jid }</td>
			<td>${mem.jpw }</td>
			<td>${mem.jname }</td>
			<td>${mem.jaddr }</td>
			<td>${mem.jbirth }</td>
			<td>${mem.jphone }</td>
			
			
		</tr>
		</c:forEach>
	</table>
</body>
</html>