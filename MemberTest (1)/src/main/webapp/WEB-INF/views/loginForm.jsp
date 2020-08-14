<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<h2>loginForm(로그인 페이지)</h2>
		<form action="memberLogin" method="POST" id="loginForm">
			<table border="1">
				<tr>
					<th>아이디</th>
					<td><input type="text" name="jsid"/></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="jspassword"/></td>
				</tr>
				<tr>
					<td colspan="2">
						<button onclick="login()">로그인</button>
						<button onclick="joinForm()">회원가입</button>
					</td>
				</tr>
			</table>
		</form>
</body>
</html>