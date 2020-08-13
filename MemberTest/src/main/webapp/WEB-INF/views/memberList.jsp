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
		
	</tr>
	
	<c:forEach var="mem" items="${mList}">
	<tr>
	 
	<th>${mem.jsid}</th>
	<th>${mem.jspassword}</th>
	
	<td> <a href="memberView?jsid=${mem.jsid}">상세보기</a></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>