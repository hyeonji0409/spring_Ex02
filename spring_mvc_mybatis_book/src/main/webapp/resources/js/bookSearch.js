/**
 * bookSearch.js
 */
 
 $(document).ready(function(){
	$('#bookSearchForm').on('submit', function(){
		
		event.preventDefault();
		
		// serialize : 폼에 입력한 값을 쿼리스트링 방식의 데이터로 변환
		// type=prdName&keyword = 노트북
		var formData = $(this).serialize();
		
		
		$.ajax({
			type:"post",
			url:"bookSearch",
			data:formData,
			success:function(result){
				$('#searchResultBox').empty();
				$('#searchResultBox').append('<table id="resultTable" border="1" width="600">' +
						'<tr><th>도서번호</th><th>도서명</th><th>저자</th>' +
						'<th>가격</th><th>출간일</th><th>재고</th></tr>');
				if(result == ""){
					$('#resultTable').append('<tr align="center"><td colspan="6">찾는 도서가 없습니다.</td></tr>');
				}else{
					for(let i = 0; i<result.length; i++){
						$('#resultTable').append('<tr><td>' + result[i].bookNo + '</td><td>' +
															result[i].bookName + '</td><td>' +
															result[i].bookAuthor + '</td><td>' +
															result[i].bookPrice + '</td><td>' +
															result[i].bookDate + '</td><td>' +
															result[i].qtyNo + '</td></td>'/* +
						'<img src="/mybatis/images/' + result[i].prdNo + '.jpg" width="30" height="20"></td></tr>'*/);

					}
				}
			},
			error:function(data, textStatus){
				alert("전송 실패");
			}
		});
	});	
});