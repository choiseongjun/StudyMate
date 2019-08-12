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
<style>
 #form1 {
		width:600px;
		margin-top:200px;
		margin-left:500px;
	}
</style>

<script>
$(document).ready(function(){

	$("#register_process").click(function(){
		var portuser = {
				"userid" : $("#userid").val,
				"userpwd" : $('#userpwd').val
		};
		console.log(userid)
		$.ajax({
            type : "post",
            url : "/user/signup",
            data : portuser,
            success : function(data) {
                
            },
            error : function(error) {
                alert("오류 발생"+ error);
            }
        });


	})
	
});

</script>
<form name="form1" method="post" onsubmit="emailCheck();" name="duplicate" enctype="multipart/form-data"
	>
 <div id="container">
  <table id="form1" width="400" border="0" class="table table-bordered" bordercolor="gray" align="center" >
					<tr height="40">
						<td width="150"><font face="궁서체">아이디</font><button type="button"  class="btn btn-default" id="checkbtn"  >중복확인</button>
						</td>
						<td width="250">
								<input class="form-control" type="text" name="userid" id="userid" >	
						</td><input type="hidden" name="idDuplication" value="IdUncheck">
					</tr>
						<tr height="40">
						<td width="150"><font face="궁서체">패스워드</font></td>
						<td width="250"><input class="form-control" type="password" name="userpwd"  id="userpwd"  onkeyup="passwordCheckFunction();" ></td>
					</tr>
					<!-- 	<tr height="40">
						<td width="150"><font face="궁서체">패스워드확인</font></td>
						<td width="250"><input class="form-control" type="password" name="passwd1" id="passwd1"  onkeyup="passwordCheckFunction();" ></td>
					</tr> -->
						<tr height="40">
						<td width="150"><font face="궁서체">이름</font></td>
						<td width="250"><input class="form-control" type="text" name="username" id="username"></td>
					</tr>
						<!-- <tr height="40">
						<td width="150"><font face="궁서체">이메일</font></td>
						<td width="250"><input class="form-control" type="text" name="email" id="email"><p><font face="궁서체" color="blue">정확한 이메일을 작성하세요</font></p></td>
					</tr> -->
						</tr>
						<tr height="40">
						<td width="150"><font face="궁서체">사진</font></td>
						<td width="250"><input class="form-control" type="file" name="userpicture" id="userpicture"></td>
					</tr>
						<tr height="40">
						<td colspan="2">	
						<!-- <input type="submit" class="btn btn-primary" id="checkbtn" value="가입하기"> -->
						<button id="register_process">회원가입</button>
					</td>
					</tr>
					<tr>
				<div id = "showdata" style = "text-align: center"></div>
			</tr>
						<td style="text-align:left" colspan="3"><h5 style="color:red;" id="passwordCheckMessage"></h5></td>
				</table>
  </div>
 </form>
</body>
</html>