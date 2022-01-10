<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 정보 등록 폼</title>
</head>
<body>
	<h2>도서 정보 등록</h2>

	<form method="post" action="/book/book/insertBook">
		<table>
			<tr><td>도서번호</td><td><input type="text" name="bookNo"></td></tr>
			<tr><td>도서명</td><td><input type="text" name="bookName"></td></tr>
			<tr><td>저자</td><td><input type="text" name="bookAuthor"></td></tr>
			<tr><td>가격</td><td><input type="text" name="bookPrice"></td></tr>
			<tr><td>출판일</td><td><input type="text" name="bookDate"></td></tr>
			<tr><td>재고</td><td><input type="text" name="qtyNo"></td></tr>
			<tr><td colspan="2"><input type="submit" value="등록"><input type="reset" value="취소"></td></tr>
		</table>
	</form>
</body>
</html>