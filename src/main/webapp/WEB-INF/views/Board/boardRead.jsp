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
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>

	<h1>글 상세보기</h1>
	글 제목 : ${dto.b_title}<br>
	글 내용 : ${dto.b_content} <br>
	작성자 : ${dto.b_writer}<br>
	작성일 : ${dto.b_regDate}<br>
	
	<a href="/boardList">목록</a>

	<c:if test="${sessionScope.m_id == dto.b_writer}">
	<a href="/boardUpdate?b_no=${dto.b_no}">수정</a>
	<a href="/boardDelete?b_no=${dto.b_no}">삭제</a>
	</c:if>
	
	<!-- 댓글 나오는 위치 -->
        <div id="replyShowZone"></div>
            <!-- 댓글 작성란 -->
            <input type="hidden" name="r_boardNum" id="r_boardNum" value="${dto.b_no}">
            <c:if test="${not empty sessionScope.m_id}">
            <div><input type="text" name="r_writer" value="${sessionScope.m_id}" id="r_writer" readonly="readonly"></div>
                    <div>
                        <input type="text" name="r_content" id="r_content" placeholder="여기에 댓글입력">
                    </div>
                    <div>
                        <input type="button" id="replyBtn" value="댓글달기">
                    </div>
            </c:if>

<script type="text/javascript" src="${path}/resources/js/reply.js"></script>
</body>
</html>