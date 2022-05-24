<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 등록</title>
</head>
<body>

	<h1>회원 상세보기</h1>
	
		<table border="1">
		<tr>
			<td>회원 번호</td>
			<td>회원 아이디</td>
			<td>회원 비밀번호</td>
			<td>회원 주소</td>
			<td>회원 등록일</td>
		</tr>
		<tr>
			<td>${dto.m_no}</td>
			<td>${dto.m_id}</td>
			<td>${dto.m_pw}</td>
			<td>${dto.m_address}</td>
			<td>${dto.m_regDate}</td>
		</tr>
		</table>
		
		<a href="/memberUpdate?m_no=${dto.m_no}">수정</a>
		<a href="/">홈으로</a>


</body>
</html>