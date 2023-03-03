<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<c:import url="/WEB-INF/include/top.jsp"/>


	<h1>방 목록</h1>
	<a href="./sign_in">로그인</a>
	<a href="../board/board_list">게시판 보기</a>
	<a href="../rank/rank_list">랭킹보드</a>
	
	
	
<c:import url="/WEB-INF/include/bottom.jsp"/>
</body>
</html>
