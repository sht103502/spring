<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 새로추가 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 새로추가 -->
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jsquery-3.5.1.js"></script>
<script>
//댓글목록
function commentList(result){
	var output="";
	output += "<table><tr>";
	output+="<th>작성자</th>";
	output+="<th>내용</th>";
	output+="<th>삭제</th><tr>";

	for(var i in result){
		output +="<tr>";	
		output +="<td>"+ result[i].cwriter+"</td>";	
		output +="<td>"+ result[i].ccontents+"</td>";	
		output +="<td><button onclick='commentDelete(" +result[i].cnum +")'>삭제</button><td>";
		output +="</tr>";	
	}
	output +="</table>";
	${"#commentArea"}.html(output);
	
}

/* $(document).ready(function(){
	//페이지가 로딩될때 실행
	commentList(result);
}); */

//페이지가 로딩될때 실행
$(document).ready(function(){
	var cbnum = ${boardView.bnum};
	$.ajax({
		type : "POST",
		url : "comment/commentList",
		data: {"cbnum": cbnum},
		dataType:"json",
		success : function(result){
			commentList(result);
			},
			error : function(){
				alert("댓글 조회 실패");
				}
	});
});

//댓글입력
$(document).ready(function(){
	$("#commentWriteBtn").click(function(){
		var cwriter =$("#cwriter").val();
		var ccontents =$("#ccontents").val();
		var cbnum = ${boardView.bnum};

		$.ajax({
			type:"POST",
			url:"comment/commentwrite",
			data:{
				"cwriter":cwriter,
				"ccontents":ccontents,
				"cbnum":cbnum,

				},
			dataType:"json",
			success:function(result){
				commentList(result);
				$("#cwirter").val("");
				$("#ccontents").val("");
				},
				error:function(){
					alert("댓글입력 실패");
					}

				});
			
		});
});

//댓글삭제
function commentDelete(cnum){
	$.ajax({
		type : "GET",
		url : "comment/commentdelete",
		data : {
				"cnum" : cnum,
				"cbnum" : ${boardView.bnum}
			  },
		dataType : "json",
		success : function(result){
			commentList(result);
			},
			error:function(){
				alert("댓글입력 실패");
				}
	});
}

</script>

</head>
<body>
<table border="1">
<tr>

<th>글번호</th>
<th>작성자</th>
<th>비밀번호</th>
<th>제목</th>
<th>내용</th>
<th>날짜</th>
<th>조회수</th>
<th>첨부파일</th>
</tr>


	<tr>
		<td>${boardView.bnum}</td>
		<td>${boardView.bwriter}</td>
		<td>${boardView.bpassword}</td>
		<td>${boardView.btitle}</td>
		<td>${boardView.bcontents}</td>
		<td>${boardView.bdate}</td>
		<td>${boardView.bhit}</td>
		<td><img src="resources/fileUpload/${boardView.bfilename}"/>
			<br/>${boardView.bfilename}</td>
	</tr>
</table>
<!-- 새로추가 -->
<br/>
<div>
	작성자: <input type="text" id="cwriter"><br/>
	댓글: <textarea rows="5" cols="20" id="ccontents"></textarea>
	<button id="commentWriteBtn">댓글입력 </button>
</div>
	<div id="commentArea">
		<%-- <table>
			<tr>
				<th>작성자</th>
				<th>내용</th>
				<th>삭제</th>
			</tr>
			<c:forEach var="comment" items="${commentList}">
				<tr>
					<th>${comment.cwriter}</th>
					<th>${comment.ccontents}</th>
					<th><button onclick="commentDelete('${ comment.cnum}')">삭제</button></th>
				</tr>
			</c:forEach>
		</table> --%>
	</div>
	
<button onclick="location.href='boardModify?bnum=${boardView.bnum}'">수정하기</button> 
<button onclick="location.href='pagingList?page=${page}'">목록으로</button> 

</body>
</html>