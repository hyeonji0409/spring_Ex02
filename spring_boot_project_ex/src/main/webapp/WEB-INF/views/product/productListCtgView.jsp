<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카테고리별 상품 조회</title>
</head>
<body>
	<div id="wrap">

		<!-- TOP  -->
		<jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true' />

		<section>
			<h3>상품목록</h3>
			<table border="1" width="600">
				<tr>
					<th>상품 번호</th>
					<th>상품명</th>
					<th>가격</th>
					<th>제조사</th>
					<th>재고</th>
				</tr>

				<c:forEach items="${prdList }" var="prd">
					<tr>
						<td><a href="<c:url value='/product/detailViewProduct/${prd.prdNo}'/>">${prd.prdNo}</a></td>
						<td><img src="<c:url value='/images/${prd.prdImg}' />" width="30" height="20"></td>
						<td>${prd.prdName}</td>
						<td>${prd.prdPrice}</td>
						<td>${prd.prdCompany}</td>
						<td>${prd.prdStock}</td>
					</tr>
				</c:forEach>
			</table>
		</section>

		<!-- BOTTOM  -->
		<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true' />

	</div>
</body>
</html>