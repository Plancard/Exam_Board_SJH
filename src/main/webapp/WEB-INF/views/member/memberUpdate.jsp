<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 등록</title>
</head>
<body>

	<h1>회원 수정</h1>
	<form action="/memberUpdate" method="post">
	<input type="hidden" name="m_no" value="${dto.m_no}">
		<table border="1">
		<tr>
			<td>회원 아이디</td>
			<td>회원 비밀번호</td>
			<td>회원 주소</td>
		</tr>
		<tr>
			<td><input type="text" name="m_id" value="${dto.m_id}"></td>
			<td><input type="text" name="m_pw" value="${dto.m_pw}"></td>
			<td><input type="text" name="m_address" value="${dto.m_address}"></td>
		</tr>
		</table>
		<input type="submit" value="수정하기">
		</form>

</body>
</html>