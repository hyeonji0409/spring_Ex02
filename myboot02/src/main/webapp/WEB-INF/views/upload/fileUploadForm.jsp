<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드 폼</title>
</head>
<body>
	<h2>파일 업로드</h2>
	<form id="fileUploadForm" method="post" action="<c:url value='/fileUpload' />" enctype="multipart/form-data">
		파일: <input type="file" id="uploadFile" name="uploadFile"><br><br>
		<input type="submit" value="업로드">
	</form> <br><br>
	
	<hr> <br><br>
	
	<h2>여러 개의 파일 업로드</h2>
	<form id="fileUploadFormMulti" method="post" action="<c:url value='/fileUploadMultiple' />" enctype="multipart/form-data">
		파일: <input type="file" id="uploadFileMulti" name="uploadFileMulti" multiple="multiple"><br><br>
		<input type="submit" value="업로드">
	</form>
	
	<hr> <br><br>
	
	<h2>파일명 변경하지 않고 파일 업로드</h2>
	<form id="fileOriginalNameUploadForm" method="post" action="<c:url value='/fileOriginalNameUpload' />" enctype="multipart/form-data">
		파일: <input type="file" id="uploadFile" name="uploadFile"><br><br>
		<input type="submit" value="업로드">
	</form>
	
</body>
</html>