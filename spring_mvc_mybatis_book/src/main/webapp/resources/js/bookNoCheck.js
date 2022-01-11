/**
 * bookNoCheck.js
 중복 확인
 */
 
 $(document).ready(function(){
	$('#bookNoCheckBtn').on('click', function(){
		
		event.preventDefault();
		
		$.ajax({
			type:"post",
			url:"bookNoCheck",
			data:{"bookNo":$('#bookNo').val()},  /* 컨트롤러에서 받을 때 : id, pw로 받음*/
			dataType:'text',
			success:function(result){
				if(result == "no_use"){
					alert("사용할 수 없는 번호입니다.");
				}else{
					alert("사용 가능한 번호입니다.");
				}
			},
			error:function(data, textStatus){
				alert("전송 실패");
			}
		});
	});
});