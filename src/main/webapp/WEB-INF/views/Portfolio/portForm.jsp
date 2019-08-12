<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
 .fileDrop {
	width: 80%;
	height: 100px;
	border: 1px dotted gray;
	background-color: lightslategrey;
	margin: auto;
} 
</style>


 

<style>
	#form1 {
		width:600px;
		margin-top:200px;
		margin-left:500px;
	}
</style>
<%@include file="../Header.jsp"%>
<body>

		<h2>글쓰기</h2>
		<form id="form1" name="form1" method="post" action="/portFolio/insertBoard">
			<div> <input name="brdtitle" id="brdtitle" size="80"
							placeholder="제목을 입력하세요">
			</div>
			<div style="width:800px;">
				 <textarea id="brdmemo" name="brdmemo"
		rows="3" cols="80" placeholder="내용을 입력하세요"></textarea>
	<!-- 	<script>
		// ckeditor 적용
		CKEDITOR.replace("content",{
			filebrowserUploadUrl: "${path}/imageUpload.do"
		});
		</script> -->
			</div>
			<div> 첨부파일을 등록하세요
				<div class="fileDrop"></div>
				<div id="uploadedList"></div>
			</div>
			<!-- <div style="width:700px; text-align:center;">
				<button type="button" id="btnSave">확인</button>
			</div> -->
			<input type="submit" />
		</form>

<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="/js/jQuery/jQuery.form.min.js"></script>  
<script>


</script>
</body>
</html>