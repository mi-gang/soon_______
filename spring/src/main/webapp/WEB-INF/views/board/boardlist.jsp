<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
</head>
<body>
	<a href="boardform.do">글작성</a>	<br>
	글 개수 : ${listcount }
	<table border=1 align=center width=700>
		<caption>게시판 목록</caption>
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>날짜</td>
			<td>조회수</td>
		</tr>
		
		<!-- 화면 출력 번호 -->
		<c:set var="num" value="${listcount-(page-1)*10}"/>
		<c:forEach var="b" items="${boardlist}">
		<tr>
			<td>${num}
				<c:set var="num" value="${num-1}"/>
							<!-- num을 출력한 뒤 num-1을 num에 저장함 -> 루프 돌아갈 때마다 1씩 감소 -->
			</td>	
			<td>
				<a href="boardcontent.do?no=${b.no}&page=${page}">	<!-- no, page 전달 (1) -->
				${b.subject}
				</a>
			</td>	
			<td>
				${b.writer}
			</td>	
			<td>
				<fmt:formatDate value="${b.register}"
					pattern="yyyy-MM-dd HH:mm:ss"/>
			</td>	
			<td>${b.readcount}</td>	
		</tr>
		</c:forEach>
		
	</table>
	
<!-- 페이지 처리 -->
<center>
<c:if test="${listcount > 0}">

<!-- 1페이지로 이동 -->
<a href="boardlist.do?page=1" style="text-decoration:none"> << </a>

<!-- 이전 블럭으로 이동 -->
<c:if test="${startPage > 10 }">
	<a href="boardlist.do?page=${startPage-10}">[이전]</a>
</c:if>

<!-- 각 블럭에 10개의 페이지 출력 -->
<c:forEach var = "i" begin="${startPage}" end="${endPage}">
	<c:if test="${i == page}">			<!-- 현재 페이지 -->
		[${i}]
	</c:if>
	<c:if test="${i != page}">			<!-- 현재 페이지가 아닌 경우 -->
		<a href="boardlist.do?page=${i}">[${i}]</a>
	</c:if>
</c:forEach>

<!-- 다음 블럭으로 이동 -->
<c:if test="${endPage < pageCount}">
	<a href="boardlist.do?page=${startPage+10}">[다음]</a>
</c:if>

<!-- 마지막 페이지로 이동 -->
<a href="boardlist.do?page=${pageCount}" style="text-decoretion:none"> >> </a>
</c:if>

</center>


</body>
</html>