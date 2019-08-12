<!--

 @author choiseongjun 
 @Story 회원가입 폼  
 @date 19-08-12
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script src="signup"></script>
</head>
<body>
<%@include file="../Header.jsp"%>
 <div id="container">
	<center>
		<h2 style="margin-top: 200px">회원 가입 </h2>
		<form action="${path}/user/joinuser.do" method="post" id="frm">
			<table width="400" border="1" bordercolor="gray">
					<tr height="40">
						<td width="150">아이디<button type="button" id="checkbtn" class="btn btn-default">중복확인</button>
						<input type="hidden" name="idDuplication" value="IdUncheck" ></td>
						<td width="250">
						<input class="form-control" type="text" name="u_id" id="id" onkeydown="checkId()">
						</td>
					</tr>
						<tr height="40">
						<td width="150">패스워드</td>
						<td width="250"><input class="form-control" type="password" name="u_password"  id="userPassword1"  onkeyup="passwordCheckFunction();" ></td>
					</tr>
						<tr height="40">
						<td width="150">패스워드확인</td>
						<td width="250"><input class="form-control" type="password" name="u_password1" id="userPassword2"  onkeyup="passwordCheckFunction();" ></td>
					</tr>
						<tr height="40">
						<td width="150">이름</td>
						<td width="250"><input class="form-control" type="text" name="u_name" id="name"></td>
					</tr>
						<tr height="40">
						<td colspan="2"><input type="submit" value="회원가입" id="send"><input type="submit" value="뒤로가기" id="send"></td>
					</tr>
						<td style="text-align:left" colspan="3"><h5 style="color:black;" id="passwordCheckMessage"></h5></td>
				</table>
		</form>
	</center>
	</div>
</body>
</html>