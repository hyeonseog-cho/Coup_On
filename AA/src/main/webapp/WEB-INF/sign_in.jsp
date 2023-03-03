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
	<form action="${root }/main/room_list" method="post">
		<ul>
			<li onclick="kakaoLogin();"><a href="javascript:void(0)"> <span>카카오
						로그인</span>
			</a></li>
			<li onclick="kakaoLogout();"><a href="javascript:void(0)"> <span>카카오
						로그아웃</span>
			</a></li>
		</ul>
		<br>

		<button>방목록보기</button>
	</form>

	<!-- 카카오 스크립트 -->
	<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
	<script>
		Kakao.init('dc7bc065525a91f76d65405721e97148'); //발급받은 키 중 javascript키를 사용해준다.
		console.log(Kakao.isInitialized()); // sdk초기화여부판단

		//카카오로그인
		function kakaoLogin() {
			Kakao.Auth.login({
				success : function(response) {
					Kakao.API.request({
						url : '/v2/user/me',
						success : function(response) {
							console.log(response)

							var userID = response.id; //유저의 카카오톡 고유 id
							var userNickName = response.properties.nickname; //유저가 등록한 별명
							console.log(userID)
							console.log(userEmail)
							console.log(userNickName)
						},
						fail : function(error) {
							console.log(error)
						},
					})
				},
				fail : function(error) {
					console.log(error)
				},
			})
		}

		//카카오로그아웃  
		function kakaoLogout() {
			if (Kakao.Auth.getAccessToken()) {
				Kakao.API.request({
					url : '/v1/user/unlink',
					success : function(response) {
						console.log(response)
					},
					fail : function(error) {
						console.log(error)
					},
				})
				Kakao.Auth.setAccessToken(undefined)
			}
		}
	</script>
</body>
</html>