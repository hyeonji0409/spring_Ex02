/**
 *  cartListView.js
 */
 
 $(document).ready(function(){
	// [전체선택] 체크박스 체크했을 때 
	$('#allCheck').on('click', function(){
		var chk =$("#allCheck").prop("checked")
		if(chk){
			$('.chkDelete').prop("checked", true);
		} else {
			$('.chkDelete').prop("checked", false);
		}
	});
	
	//개별 체크박스 해제할 경우 [전체선택] 체크박스 해제
	$('.chkDelete').on("click", function(){
		$("#allCheck").prop("checked", false);
	});
	
	// 장바구니 삭제
	$("#deleteCart").on("click", function(){
		var checked = $(".chkDelete").is(':checked');
		if(checked){
			var answer = confirm("선택된 상품을 삭제하시겠습니다?");
			if(answer){
				var checkArr = new Array();
				$(".chkDelete:checked").each(function(){
					checkArr.push($(this).attr("data-cartNo"));
				});
				
				
				$.ajax({
					url:"deleteCart",
					type:"post",
					data:{chbox : checkArr},
					success:function(result){
						if(result == 1){
							location.href = "/product/cartList";
						}
					},
					error:function(){
						alert("오류가 발생했습니다.")
					}
				});
			}						
		} else {
			alert("선택된 상품이 없습니다.");
		}
	});
});