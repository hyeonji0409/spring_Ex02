/**
 * login.js
 */
 
 $(document).ready(function(){
	$('#frmLogin2').on('submit', function(){
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
				if(result == "success"){
					alert("로그인 성공 \n 상품 조회 화면으로 이동합니다.");
					location.href="/mybatis/product/listAllProduct";
				}else{
					alert("로그인 실패");
				}
			},
			error:function(data, textStatus){
				alert("전송 실패");
			}
		});
	});	
});