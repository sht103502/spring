<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>JoinForm(회원가입 페이지)</h2>
		<form action="memberJoin" method="POST">
			아이디: <input type="text" name="jsid"/><br/>
			비밀번호: <input type="password" name="jspassword"/><br/>
			이름: <input type="text" name="jsname"/><br/>
			생년월일: <input type="date" name="jsbirth"/><br/>
			셩별: <input type="radio" name="jsgender" value="남"/>남자
			     <input type="radio" name="jsgender" value="여"/>여자<br/>
			이메일: <input type="email" name="jsemail"/><br/>
			<input type="submit" value="제출"/>
			<input type="reset" value="다시작성"/>
			
		</form>
	
</body>
</html>