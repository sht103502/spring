<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-3.5.1.js"></script>
<script>
 function idOverlap(){
		var idCheck = document.getElementById("idForm").value;
		var confirmId = document.getElementById("confirmId");


		$.ajax({
			type : "post",
			url : "idoverlap",
			data : {"mid" : idCheck},
			dataType : "text",
			success : function(data){//성공시
				console.log("data값 :" + data);
					if(data=="OK"){
						confirmId.style.color = "#0000ff";
						confirmId.innerHTML = "사용가능한 아이디";
					}else{
						confirmId.style.color = "#ff0000";
						confirmId.innerHTML = "사용중인 아이디";			
					}
				},
				error : function(){//실패시
					alert("idOverlap함수 통신 실패");	
					}
			});
		 }

 
</script>
</head>
<body>
<h1>회원가입 폼</h1>
	<form action="join" method="POST">
			아이디: <input type="text" name="mid" id="idForm" onkeyup="idOverlap()" /><br/>
			<span id ="confirmId"></span><br/>
			비밀번호: <input type="password" name="mpassword"/><br/>
			<input type="submit" value="제출"/>
			<input type="reset" value="다시작성"/>
			
		</form>
		
<!-- 		<h2>JoinForm(회원가입 페이지)</h2>
	<form action="memberJoin" method="POST">
		아이디: <input type="text" id="idForm" name="jsid" onkeyup="idOverlap()" /><br />
		비밀번호: <input type="password" name="jspassword" /><br /> 
		<span id ="confirmId"></span><br/>
		이름: <input type="text" name="jsname" /><br /> 
		생년월일: <input type="date" name="jsbirth" /><br /> 
		셩별: <input type="radio" name="jsgender"value="남" />남자 
		     <input type="radio" name="jsgender" value="여" />여자<br />
		이메일: <input type="email" name="jsemail" /><br /> 
		<input type="submit"value="제출" /> <input type="reset" value="다시작성" />

	</form> -->



</body>


</html>