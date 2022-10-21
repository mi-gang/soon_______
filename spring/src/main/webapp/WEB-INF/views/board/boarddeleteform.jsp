<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글삭제</title>
</head>
<body>

<!-- param : EL 내장객체, request.getParamater와 동일함 -->
no: ${param.no} <br>
page: ${param.page }<br>

<form method=post action="boarddelete.do">
<!-- controller에서 값 전달하지 않았으나 param으로 값 받아올 수 있음 -->
<input type="hidden" name="no" value="${param.no}">			<!-- DB에서 비밀번호 꺼낼 때 사용 -->
<input type="hidden" name="page" value="${param.page}">		<!-- 수정 후 기존 페이지로 돌아오기 위해 사용 -->
<table border=1 width=400 align=center>
	<caption>글삭제</caption>
	<tr><th>비밀번호</th>
		<td><input type=password name="passwd" required="required"></td>
	</tr>
	<tr><td colspan=2 align=center>
			<input type=submit value="글삭제">
			<input type=reset value="취소">
		</td>
	</tr>
</table>
</form>

</body>
</html>