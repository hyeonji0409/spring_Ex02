<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 폼</title>
<script src="<c:url value='js/jquery-3.6.0.min.js'/>"></script>
<script src="<c:url value='js/memIdCheck.js'/>"></script>
<script src="<c:url value='http://dmaps.daum.net/map_js_init/postcode.v2.js'/>"></script>
<script src="<c:url value="js/searchZip.js" />"></script>
<link href="<c:url value="css/join.css" />" rel="stylesheet" type="text/css">
</head>
<body>

	<div id="wrap">

		<!-- TOP  -->
		<jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true' />

		<!--  회원 가입 폼  -->
		<section>
			<h1 id="title">회원 가입</h1>
			<form id="joinForm" name="joinForm" action="<c:url value="/join" />" method="post">
				<table>
					<tr>
						<th>성명</th>
						<td><input type="text" id="memName" name="memName"></td>
					</tr>
					<tr>
						<th>ID</th>
						<td><input type="text" id="memId" name="memId"> <button id="idCheck">id 중복체크</button></td>
					</tr>
					<tr>
						<th>비밀번호</th>
						<td><input type="password" id="memPwd" name="memPwd"></td>
					</tr>
					<tr>
						<th>휴대폰 번호</th>
						<td><input type="text" id="memHp1" name="memHp1" size="3"> - <input type="text" id="memHp2" name="memHp2" size="4"> - <input type="text" id="memHp3" name="memHp3" size="4"></td>
					</tr>
					<tr>
						<th>학년</th>
						<td><input type="radio" id="memYear1" name="memYear" value="1">1학년 <input type="radio" id="memYear2" name="memYear" value="2">2학년 <input type="radio" id="memYear3" name="memYear" value="3">3학년 <input type="radio" id="memYear4" name="memYear" value="4">4학년</td>
					</tr>
					<tr>
						<th>관심분야</th>
						<td><input type="checkbox" id="web" name="memInterests" value="웹프로그래밍">웹 프로그래밍 <input type="checkbox" id="design" name="memInterests" value="웹디자인">웹 디자인 <input type="checkbox" id="bigdata" name="memInterests" value="빅데이터">빅데이터 <input type="checkbox" id="java" name="memInterests" value="자바프로그래밍">자바 프로그래밍</td>
					</tr>
					<tr>
						<th>학과</th>
						<td><select id="memDepartment" name="memDepartment">
								<option value="">선택하세요</option>
								<option value="경영학과">경영학과</option>
								<option value="수학과">수학과</option>
								<option value="통계학과">통계학과</option>
								<option value="정보통신공학과">정보통신공학과</option>
								<option value="중국어과">중국어과</option>
								<option value="컴퓨터학과">컴퓨터학과</option>
						</select></td>
					</tr>
					<tr>
						<th>주소</th>
						<td colspan="3"><input type="text" id="zipcode" name="zipcode" size="5"> 
						<input type="button" id="searchZip" name="searchZip" value="우편번호찾기" readonly><br> 
						<input type="text" id="address1" name="address1" size="70" readonly><br> 
						<input type="text" id="address2" name="address2" size="70" placeholder="상세 주소 입력"></td>
					</tr>
					<tr>
						<td colspan="2" align="center" id="button"><br>
						<input type="submit" value="완료"> <input type="reset" value="취소"></td>
					</tr>
				</table>
			</form>
		</section>

		<!-- BOTTOM  -->
		<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true' />
	</div>
</body>
</html>


