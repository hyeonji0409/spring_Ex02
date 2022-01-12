<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록 폼</title>
<script src="<c:url value='/js/jquery-3.6.0.min.js' />"></script>
<script src="<c:url value='/js/prdNoCheck.js' />"></script>
</head>
<body>
	<h1>상품 등록</h1>

	<form method="post" action="<c:url value='/product/insertProduct' />">
		<table>
			<tr><td>상품 번호</td><td><input type="text" id="prdNo" name="prdNo">
			<button id="prdNoCheckBtn">중복확인</button></td></tr>
			<tr><td>상품명</td><td><input type="text" name="prdName"></td></tr>
			<tr><td>가격 </td><td> <input type="text" name="prdPrice"></td></tr>
			<tr><td>제조회사</td><td><input type="text" name="prdCompany"></td></tr>
			<tr><td>재고 </td> <td><input type="text" name="prdStock"></td></tr>
			<tr><td colspan="2"><input type="submit" value="등록"><input type="reset" value="취소"></td></tr>
		</table>
	</form>
</body>
</html>