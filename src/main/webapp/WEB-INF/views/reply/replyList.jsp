<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>댓글</title>
</head>
<body>
	<table border="1">
		<c:forEach var="list" items="${list}">
		<tr>
			<td>${list.b_no}</td>
			<td><a href="/boardRead?b_no=${list.b_no}">${list.b_title}</a></td>
			<td>${list.b_writer}</td>
			<td>${list.b_regDate}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>