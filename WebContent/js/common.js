$(window).on('load', function() {
	// 왼쪽 네비게이션
	var win = $(this);
	$("nav > div > ul > li > a").click(function() {
		if ($(this).hasClass('active')) {
			$(this).removeClass('active');
			$(this).siblings("ul").stop(true, false).slideUp("fast");
		} else {
			$("nav > div > ul > li > ul").slideUp("fast");
			$("nav > div > ul > li > a").removeClass("active");
			$(this).siblings("ul").stop(true, false).slideDown("fast");
			$(this).addClass('active');
		};
	});
	
	//로그인 다이얼로그 설정
	$( "#loginDialog" ).dialog({ 
		autoOpen: false, 
		width: 400, 
		modal: true, 
		buttons: [ 
			{ text: "로그인",	click: function() { $('#loginForm').submit(); } }, 
			{ text: "닫기", click: function() { $( this ).dialog( "close" ); }	} 
		]
	});
	
	//로그인 다이얼로그 오픈 버튼
	$("#btn-open-dialog").click(function() {
		$("#loginDialog").dialog("open");
	});
	
});

$(function() {
	// 모바일 네비게이션
	$(".A_SIDE").on("click", function() {
		$(this).hide();
		$("body").css('overflow', 'hidden')
		$(".A_CLOSE").show();
		$(".DIV_SHADOW").show();
		$(".DIV_MB_WRAP").stop(true, false).slideDown("fast");
	});
	// 모바일 네비게이션 (close)
	$(".A_CLOSE, .DIV_SHADOW").on("click", function() {
		$("body").css('overflow', 'visible')
		$(".A_SIDE").show();
		$(".A_CLOSE").hide();
		$(".DIV_MB_WRAP").stop(true, false).slideUp("fast");
		$(".DIV_SHADOW").hide();
	});
});
