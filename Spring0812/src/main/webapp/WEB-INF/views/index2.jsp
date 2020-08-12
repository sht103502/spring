<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
<form action="insertDB1" method="GET">
	<table border="1">
	
		<tr>
			<th>ID</th>
			<td><input type="text" name="jid"></td>
		</tr>
		<tr>
			<th>PW</th>
			<td><input type="password" name="jpw"></td>
		</tr>
		<tr>
			<th>이름</th>
			<td><input type="text" name="jname"></td>
		</tr>
		<tr>
			<th>주소</th>
			<td><input type="text" name="jaddr"></td>
		</tr>
		<tr>
			<th>생일</th>
			<td><input type="Date" name="jbirth"></td>
		</tr>
		<tr>
			<th>폰번호</th>
			<td><input type="text" name="jphone"></td>
		</tr>
	</table>
	<input type="submit" value="제출">
	</form>
	
</body>
</html>