<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
</head>
<body>
	<h1>회원 정보 조회(아이디 검색)</h1>
	<form action="${pageContext.request.contextPath }/selectUser"
		method="get">
		<input type="text" name="userId" placeholder="회원 아이디 입력">
		<button type="submit">조회</button>
	</form>
</body>
</html>