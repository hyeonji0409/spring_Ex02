/**
 * tabMenu.js
 */



$(function(){
	var $tabContent = $('#tabContent div');
	
	// 첫 번째 항목 선택되어 있게 설정
	$('#tab li:first-child').addClass('selectedItem');
	
	$('#tab li').on('click', function(){
		// 클릭한 탭메뉴 항목 인엑스 알아 오기
		var index = $(this).index();
		
		//탭메뉴항목을 선택된 이미지로 변경
		// 모든 탭메뉴 항목에 선택시 적용된 css  효과 제거하고
		$('#tab li').removeClass('selectedItem');
		
		// 클릭한 항목에만 선택한 css 효과 설정
		$(this).addClass('selectedItem');
		
		// content 이미지 변경 
		// content의 모든 div 숨기고
		$tabContent.css('display', 'none');
		
		//클릭한 탭메뉴 항목의 index에 해당되는 div만 보임
		$tabContent.eq(index).css('display', 'block');
	});
	
	
});


/*$(function() {
    var $tabContent = $('#tabContent div');
    $('#tab li:first-child').addClass('selectedItem');

    $('#tab li').on('click', () => {   //  화살표 함수 적용 안됨
        var index = $(this).index();

        $('#tab li').removeClass('selectedItem');

        $(this).addClass('selectedItem');

        $tabContent.css('display', 'none');

        $tabContent.eq(index).css('display', 'block');
    });
});*/