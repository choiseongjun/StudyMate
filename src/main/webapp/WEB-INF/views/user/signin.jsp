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
<body>
<center>
<%@include file="../Header.jsp"%>
	<form id="form1" method="post">
	<table border="1" width="400px">
		<tr>
			<td>아이디</td>
			<td><input name="u_id" id="u_id" ></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="u_password" id="u_password"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="button" id="btnLogin" value="로그인">
				</td>
		</tr>
	</table>
	</form>
</center>
</body>
</html>