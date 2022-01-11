/**
 * productSearch.js
 상품 검색
 */
 
 $(document).ready(function(){
	$('#prdSearchForm').on('submit', function(){
		event.preventDefault();
		
		// serialize : 폼에 입력한 값을 쿼리스트링 방식의 데이터로 변환
		// type=prdName&keyword = 노트북
		var formData = $(this).serialize();
		
		
		$.ajax({
			type:"post",
			url:"productSearch2",
			data:formData,
			success:function(result){
				$('#searchResultbox').html(result);
			},
			error:function(data, textStatus){
				alert("전송 실패");
			}
		});
	});	
});