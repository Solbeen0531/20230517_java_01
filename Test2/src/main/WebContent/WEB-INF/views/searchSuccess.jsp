<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>searchSuccess</title>
</head>
<body>
	<h1>회원정보</h1>
	<table border="1">
		<tr>
			<th>회원번호</th>
			<th>회원아이디</th>
			<th>회원이름</th>
			<th>회원나이</th>
		</tr>
		<tr>
			<th>${uid.userNo }</th>
			<th>${uid.userId }</th>
			<th>${uid.userName }</th>
			<th>${uid.userAge }</th>
		</tr>
	</table>
	<a href="${pageContext.request.contextPath }/">메인페이지로 돌아가기</a>
</body>
</html>