<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
<th>파일이름</th>
<td></td>

</tr>

<c:forEach var="board" items="${List}">
	<tr>
		<td>${board.bNum}</td>
		<td>${board.bWriter}</td>
		<td>${board.bPassword}</td>
		<td>${board.bTitle}</td>
		<td>${board.bContents}</td>
		<td>${board.bDate}</td>
		<td>${board.bHit}</td>
		<td>${board.bFile}</td>
		<td>${board.bFileName}</td>
	</tr>
</c:forEach>

<c:if test="${paging.page>=1}">
<a href="pagingList?page${paging.startpage}">[맨앞]</a>
</c:if>
<c:if test="${paging.page<=1}">[이전]&nbsp;</c:if>
	<c:if test="${paging.page>1}">
		<a href="pagingList?page=${paging.page-1}">[이전]</a>
	</c:if>

	<c:forEach begin="${paging.startpage}" end="${paging.endpage }" var="i"
		step="1">
			
		<c:choose>
			<c:when test="${i eq paging.page}">
				${i}
			</c:when>
			<c:otherwise>
				<a href="pagingList?page=${i}">${i}</a>
			</c:otherwise>
		</c:choose>

	</c:forEach>

	<c:if test="${paging.page>=paging.maxpage}">[다음]</c:if>
	<c:if test="${paging.page<paging.maxpage}">
		<a href="pagingList?page=${paging.page+1}">[다음]</a>
	</c:if>

	 <c:if test="${paging.page<=paging.maxpage}">
	 <a href="pagingList?page=${paging.endpage}">[맨뒤]</a>
	 </c:if>

</table>
</body>
</html>