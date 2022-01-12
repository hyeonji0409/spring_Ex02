/**
 * login.js
 */
 
 $(document).ready(function(){
	$('#frmLogin').on('submit', function(){
		event.preventDefault();
		
		var userId = $('#user_id').val();
		var userPw = $('#user_pw').val();
		
		$.ajax({
			type:"post",
			url:"login",
			data:{"id": userId,
					  "pw": userPw},  /* 컨트롤러에서 받을 때 : id, pw로 받음*/
			dataType:'text',
			success:function(result){
				alert(result);
			},
			error:function(data, textStatus){
				alert("전송 실패");
			},
			complete:function(data, textStatus){
				alert("작업을 완료했습니다");
			}
		});
	});	
});