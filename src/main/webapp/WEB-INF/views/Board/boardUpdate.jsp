<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
	
	<h1>글 수정</h1>
	
	<form action="/boardUpdate" method="post">
	<input type="hidden" name="b_no" value="${dto.b_no}">
	글 제목 : <input type="text" name="b_title" value="${dto.b_title}"><br>
	글 내용 : <input type="text" name="b_content" value="${dto.b_content}"> <br>
	<input type="submit" value="수정">
	</form>
	
</body>
</html>