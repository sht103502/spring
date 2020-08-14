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
			<th>이름</th>
			<th>상세보기</th>			
			<th>삭제</th>
			<th>수정</th>
		</tr>
		<c:forEach var="mem" items="${mList}">
			<tr>
				<td>${mem.jsid }</td>
				<td>${mem.jsname }</td>	
				<td><a href="memberView?jsid=${mem.jsid }">클릭</a></td>
				<td><a href="memberModify?jsid=${mem.jsid}">수정</a></td>
				<td><a href="memberDelete?jsid=${mem.jsid }">삭제</a></td>	
			</tr>
		
		</c:forEach>
	
	</table>
</body>
</html>