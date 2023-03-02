<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${root }/mainpage/iogin" method="post">
		아이디 <input type="text" id="id" name="id">
		비밀번호 <input type="password" id="password" name="password">
		<button type="submit">로그인</button>
		<a href="sign_up">회원가입</a>
	</form>
</body>
</html>