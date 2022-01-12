<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 정보 수정</title>
</head>
<body>
	<h1>상품 정보 수정</h1>
	<form method="post" action="<c:url value='/product/updateProduct' />">
		<table>
			<tr><td>상품 번호</td><td><input type="text" name="prdNo" value="${prd.prdNo }"></td></tr>
			<tr><td>상품명</td><td><input type="text" name="prdName" value="${prd.prdName }"></td></tr>
			<tr><td>가격 </td><td> <input type="text" name="prdPrice" value="${prd.prdPrice }"></td></tr>
			<tr><td>제조회사</td><td><input type="text" name="prdCompany" value="${prd.prdCompany }"></td></tr>
			<tr><td>재고 </td> <td><input type="text" name="prdStock" value="${prd.prdStock }"></td></tr>
			<tr><td colspan="2"><input type="submit" value="수정"><input type="reset" value="취소"></td></tr>
		</table>
	</form>
</body>
</html>