<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니 목록</title>
<style>
	h3 { margin-top:20px;}
	table { width:900px;	margin-top:20px; }	
	tr {height:50px; }
	th, td { border:solid gray 1px; padding:10px;}	
	input { text-align:center;}
</style>

<script src="<c:url value='/js/jquery-3.6.0.min.js' />"></script>
<script src="<c:url value='/js/cartListView.js' />"></script>

</head>
<body>
	<div id="wrap">
			
		<!-- TOP -->
		<jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true' />
		
		<section>
			<h3>장바구니 목록</h3>
			<form method="post" action="<c:url value="/product/orderForm"/>">
				<table>
					<tr>
						<td><input type="checkbox" id="allCheck" name="allCheck">전체 선택</td>
						<td><input type="button" id="deleteCart" value="삭제"> </td>
						<td colspan="4" align="left">장바구니에서 상품 삭제를 원하시면 체크박스를 선택하고 삭제 버튼을 눌러 주세요</td>
					</tr>
					<tr>
						<th>삭제</th>
						<th>사진</th>
						<th>상품명</th>
						<th>가격</th>
					   <th>주문수량</th>
					   <th>구매예정금액</th>
				   </tr>
				    <c:forEach items="${cartList}" var="ct" >
				    	<tr>
				    			<td><input type="checkbox" class="chkDelete" data-cartNo="${ct.cartNo}"></td>
				    			<td><img src="<c:url value="/images/${ct.prdImg}"/>" width="50px" height="30px"></td>
				    			<td>${ct.prdName }</td>
				    			<td><fmt:formatNumber value="${ct.prdPrice }" pattern="#,###" /> 원</td>
				    			<td>
				    				<input type="text" name="cartQty" value="${ct.cartQty}" size="1">
				    				<input type="hidden" name="cartNo" value="${ct.cartNo}">
				    				<input type="hidden" name="prdNo" value="${ct.prdNo}">
				    				<input type="hidden" name="memId" value="${ct.memId}">
				    				<input type="hidden" name="prdPrice" value="${ct.prdPrice}">
				    			</td>
				    			<td align="right">
				    				<span class="amount">
					    				<c:set var="amount" value="${ct.prdPrice * ct.cartQty }" />
					    				<c:set var="sum" value="${sum + amount }" />
					    				<fmt:formatNumber value="${amount}" pattern="#,###" />  
					    			</span> 원
				    			</td>
				    	</tr>
				    </c:forEach>
				    <tr><td colspan="5">총구매예정금액</td>
				    		<td align="right"><fmt:formatNumber value="${sum}" pattern="#,###" /> 원</td></tr>				
				</table>			
				<input type="submit" value="주문하기">
			</form>		
		</section>
		
		<!-- BOTTOM -->
		<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true' />

	</div><!-- wrap 끝 -->
	
</body>
</html>