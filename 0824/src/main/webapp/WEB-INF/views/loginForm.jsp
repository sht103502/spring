<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인 폼 </h1>
<form action="Login" method="POST" id="LoginForm">
			아이디: <input type="text" name="mid"/><br/>
			비밀번호: <input type="password" name="mpassword"/><br/>
			
		</form>
		<button onclick="login()">로그인</button>
			<button onclick="location.href='join.form'">회원가입</button>
</body>
<script>
 function login(){
	 LoginForm.submit();
	 }
</script>
</html>