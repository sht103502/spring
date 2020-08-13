<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function login(){
		loginForm.submit();
		}
	function joinFrom(){
		location.href="joinForm";
		}
</script>
</head>
<body>
<h2>LoginForm(로그인페이지) </h2>

<form action="memberLogin" method=POST id="loginForm">
<table>
<tr>
<th>아이디 </th>
<td> <input type="text" name="jsid"></td>
</tr>
<tr>
<th>비밀번호 </th>
<td><input type="password" name="jspassword"></td>
</tr>
	</table>
<button onclick="login()">로그인</button>	 
<button onclick="joinForm()">회원가입</button>	 
</form>

</body>
</html>