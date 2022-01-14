<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>프로젝트 예제 : index</title>
	<link href="<c:url value='/css/common.css' />" rel="stylesheet" type="text/css">
	<link href="<c:url value='/css/index.css' />" rel="stylesheet" type="text/css">
	<link href="<c:url value='/css/menu.css' />" rel="stylesheet" type="text/css">
	<link href="<c:url value='/css/slideShow.css' />" rel="stylesheet" type="text/css">
	<link href="<c:url value='/css/tabMenu.css' />" rel="stylesheet" type="text/css">
	<link href="<c:url value='/css/product.css' />" rel="stylesheet" type="text/css">
	<script src="<c:url value='/js/jquery-3.6.0.min.js' />"></script>
	<script src="<c:url value='/js/subMenu.js' />"></script>
	<script src="<c:url value='/js/slideShow.js' />"></script>
	<script src="<c:url value='/js/tabMenu.js' />"></script>
	<script src="<c:url value='/js/index.js' />"></script>
</head>
<body>
	<header>
		<div id="headerBox">
			<div id="logoBox">
				<a href="<c:url value='/' />"><img src="<c:url value="/image/logo.png" />" id="logoImg"></a>
			</div>
			<div id="topMenuBox">
			
			<!-- 로그인 하기 않은 경우 보여줄 메뉴 항목 -->
			<c:if test="${empty sessionScope.sid }">
				<a href="<c:url value="/loginForm" />">로그인</a>
				<a href="<c:url value="/joinForm" />">회원가입</a>
				고객센터
			</c:if>
			
			<!-- 로그인 성공한 경우 보여줄 메뉴 항목 -->
			<c:if test="${not empty sessionScope.sid}">
				${sessionScope.sid} 님 환영합니다! &nbsp; &nbsp;
				<a href="<c:url value="/logout" />">로그아웃</a>
			</c:if>
			게시판 이벤트 
			<a href="<c:url value="/product/cartList" />">장바구니</a>
			 고객센터 MyPage</div>
		</div>
	</header>
	<nav>
		<div id="mainMenuBox">
			<ul id="menuItem">
				<li><a href="#">SPECIAL</a></li>
				<li><a href="#">메뉴항목1</a></li>
				<li><a href="#">메뉴항목2</a></li>
				<li><a href="#">메뉴항목3</a></li>
				<li><a href="#">메뉴항목4</a></li>
				<li><a href="#" id="showAllMenu">전체보기 ▼</a></li>
			</ul>
		</div>
		<!-- mainMenuBox 끝 -->
		<div id="subMenuBox">
			<div class="subMenuItem" id="subMenuItem1">
				<ul>
					<li><a href="<c:url value='/product/listCtgProduct/${1}' />">노트북</a></li>
					<li><a href="<c:url value='/product/listCtgProduct/${2}' />">프린터</a></li>
					<li><a href="<c:url value='/product/listCtgProduct/${3}' />">마우스</a></li>
					<li><a href="<c:url value='/product/listCtgProduct/${4}' />">키보드</a></li>
				</ul>
			</div>
			<div class="subMenuItem" id="subMenuItem2">
				<ul>
					<li><a href="#">subMenuItem2-1</a></li>
					<li><a href="#">subMenuItem2-2</a></li>
					<li><a href="#">subMenuItem2-3</a></li>
					<li><a href="#">subMenuItem2-4</a></li>
				</ul>
			</div>
			<div class="subMenuItem" id="subMenuItem3">
				<ul>
					<li><a href="#">subMenuItem3-1</a></li>
					<li><a href="#">subMenuItem3-2</a></li>
					<li><a href="#">subMenuItem3-3</a></li>
					<li><a href="#">subMenuItem3-4</a></li>
				</ul>
			</div>
			<div class="subMenuItem" id="subMenuItem4">
				<ul>
					<li><a href="#">subMenuItem4-1</a></li>
					<li><a href="#">subMenuItem4-2</a></li>
					<li><a href="#">subMenuItem4-3</a></li>
					<li><a href="#">subMenuItem4-4</a></li>
				</ul>
			</div>
			<div class="subMenuItem" id="subMenuItem5">
				<ul>
					<li><a href="#">subMenuItem5-1</a></li>
					<li><a href="#">subMenuItem5-2</a></li>
					<li><a href="#">subMenuItem5-3</a></li>
					<li><a href="#">subMenuItem5-4</a></li>
				</ul>
			</div>
			<div class="subMenuItem" id="subMenuItem6">
				<ul>
					<li><a href="#">subMenuItem6-1</a></li>
					<li><a href="#">subMenuItem6-2</a></li>
					<li><a href="#">subMenuItem6-3</a></li>
					<li><a href="#">subMenuItem6-4</a></li>
				</ul>
			</div>
		</div>
		<!-- subMenuBox 끝 -->
	</nav>
</body>
</html>