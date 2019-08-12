<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	#form1 {
		width:600px;
		margin-top:200px;
		margin-left:500px;
	}
</style>
<script>
$(function() {
	$("#btnLogin").click(function() {
		var userid = $("#userid").val(); //태그의 value 속성값
		var passwd = $("#userpwd").val();
		if (userid == "") {
			alert("아이디를 입력하세요.");
			$("#userid").focus(); //입력 포커스 이동
			return; //함수 종료
		}
		if (passwd == "") {
			alert("비밀번호를 입력하세요.");
			$("#passwd").focus();
			return;
		}
		//폼 데이터를 서버로 제출
		document.form1.action = "member/login_check.do";
		document.form1.submit();
	});
});
</script>
<body>
<center>
<%@include file="../Header.jsp"%>
	<form id="form1" method="post">
	<table border="1" width="400px">
		<tr>
			<td>아이디</td>
			<td><input name="userid" id="userid" ></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="userpwd" id="userpwd"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" id="btnLogin" value="로그인">
				</td>
		</tr>
	</table>
	</form>
</center>
</body>
</html>