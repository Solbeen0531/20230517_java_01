<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>searchSuccess</title>
</head>
<body>
	<h2>회원 정보</h2>
	<table border="1">
		<tr>
			<td>회원번호</td>
			<td>회원아이디</td>
			<td>회원이름</td>
			<td>회원나이</td>
		</tr>
		<tr>
			<td>${udto.userNo }</td>
			<td>${udto.userId }</td>
			<td>${udto.userName }</td>
			<td>${udto.userAge }</td>
		</tr>
	</table>

	<a href="${pageContext.request.contextPath }/">메인 페이지로 돌아가기</a>
</body>
</html>