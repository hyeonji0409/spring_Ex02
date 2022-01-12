<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 다운로드 목록</title>
</head>
<body>
	<c:forEach items="${fileList }" var="file">
		<a href="<c:url value='/fileDownload/${file }' />">${file } 파일 다운로드</a> <br>
	</c:forEach>
	
</body>
</html>