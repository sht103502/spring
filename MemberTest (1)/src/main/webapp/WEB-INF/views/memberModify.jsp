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
			<th>이름</th>
			<th>생년월일</th>
			<th>성별</th>
			<th>이메일</th>
		</tr>
		
			<tr>
				<td>${mbModify.jsid }</td>
				<td>${mbModify.jspassword }</td>
				<td>${mbModify.jsname }</td>
				<td>${mbModify.jsbirth }</td>
				<td>${mbModify.jsgender }</td>
				<td>${mbModify.jsemail }</td>
			</tr>
		
		
	
	</table>
		<form action="modifyProcess" method="POST">
			아이디: ${mbModify.jsid } <br/>
			<input type="hidden" name="jsid" value="${mbModify.jsid }"/><br/>
			비밀번호: <input type="password" name="jspassword"/><br/>
			이름: <input type="text" name="jsname"/><br/>
			생년월일: <input type="date" name="jsbirth"/><br/>
			셩별: <input type="radio" name="jsgender" value="남"/>남자
			     <input type="radio" name="jsgender" value="여"/>여자<br/>
			이메일: <input type="email" name="jsemail"/><br/>
			<input type="submit" value="회원수정"/>
			<input type="reset" value="다시작성"/>
			
		</form>

</body>
</html>