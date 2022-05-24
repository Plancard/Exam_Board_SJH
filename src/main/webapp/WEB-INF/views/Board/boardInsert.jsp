<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
	
	<h1>글 작성</h1>
	
	<form action="/boardInsert" method="post">
		글 제목 : <input type="text" name="b_title"> <br>
		글 내용 : <input type="text" name="b_content"> <br>
		작성자 : <input type="text" name="b_writer" value="${sessionScope.m_id}" readonly="readonly"> <br>
		<input type="submit" value="작성하기">
	</form>
	
	<a href="/boardList">목록</a>
	
</body>
</html>