<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인창</title>
<script src="js/jquery-3.6.0.min.js"></script>
<script src="js/login2.js"></script>
</head>
<body>

	<!-- <form id="frmLogin" method="post" action="login"> -->
	<form id="frmLogin2"> <!-- Ajax 사용하는 경우 -->
		아이디 :<input type="text" id="user_id" name="user_id"><br> 
		비밀번호:<input type="password" id="user_pw" name="user_pw"><br> 
		<input type="submit" value="로그인"> <input type="reset" value="다시입력">
	</form>

</body>
</html>