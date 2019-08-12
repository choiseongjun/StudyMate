/*
 * @author choiseongjun
 * @story 회원가입 밸리데이션
 * @Date 19-08-12
 * */

var exp=/^[0-9]{3}-[0-9]{4}-[0-9]{4}$/;   //정규식
$(document).ready(function(){
	$("#send").click(function(){
		if($("#id").val()==""){
			alert("Typing id");
		$("#id").focus();
		return false;
		}
		if($("#pass1").val()==""){
			alert("Typing pass");
			$("#pass1").focus();
			return false;
		}
		if(!$("#tel").val().match(exp)){
			alert("Incorrect tel");
			$("#tel").focus();
			return false;
		}
		frm.submit();
	})
})