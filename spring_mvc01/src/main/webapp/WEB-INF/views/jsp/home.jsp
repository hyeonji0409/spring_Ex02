<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<img src="resources/image/apple.png" style="width:100px; height:100px;"> <p>

<a href="student/studentForm">학생 등록</a>
<br> <hr>
<a href="product/productForm">상품 등록</a>

</body>
</html>
