<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
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
		<th>확인</th>
	</tr>
	
	<tr>
	 
	<th>${mView.jsid}</th>
	<th>${mView.jspassword}</th>
	<th>${mView.jsname}</th>
	<th>${mView.jsbirth}</th>
	<th>${mView.jsgender}</th>
	<th>${mView.jsemail}</th>
	<td><a href="">돌아가기</a></td>
	</tr>
	
</table>
</body>
</html>