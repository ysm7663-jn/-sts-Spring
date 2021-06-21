<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%-- jquery CDN --%>
<%-- 제이쿼리는 자바스크립트 언어를 간편하게 사용할 수 있도록 단순화시킨 오픈 소스 기반의 자바스크립트 라이브러리입니다. --%>
<%--
	제이쿼리를 이용하면 문서 객체 모델(DOM)과 이벤트에 관한 처리를 손쉽게 구현할 수 있습니다.
	또한, Ajax 응용 프로그램 및 플러그인도 제이쿼리를 활용하여 빠르게 개발할 수 있습니다.
 --%>
<script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>

<script type="text/javascript">
	
	// 페이지 로드 이벤트
	$(function() {
		fn_send1();
		fn_send2();
	});
	
	function fn_send1() {
		$('#btn1').click(function() {
			$.ajax({
				url: 'getText',	// RequestMapping의 value를 작성
				type: 'get',		// RequestMapping의 method를 작성
				data: 'send=' + $('#send').val(),	// controller로 보내는 값(파라미터)
				dataType: 'text',	// controller에게서 받아오는 값의 타입
				success: function(responseText) {	// responseText: controller에게서 받아오는 값, return text; 에서 text를 받는 변수가 responseText다.
					$('#content1').text(responseText.trim());	// trim() : 불필요한 공백 제거
				},
				/*
					$('#content1') == <div id="content1"></div>
					$('#content1').text(responseText) == <div id="content1">responseText</div>
					$('#content1').text() == responseText
				*/
				error: function() {
					alert('실패');
				}
			});
		});
	}
	
	function fn_send2() {
		$('#btn2').click(function(){
			$.ajax({
				url: 'getJson',
				type: 'post',
				data: 'send=' + $('#send').val(),
				dataType: 'json',
				success: function(responseObj) {
					// responseObj는 json 데이터이므로,
					// 자바스크립트는 객체로 처리하면 된다.
					// 객체, 프로퍼티 또는 객체['프로퍼티'] 방법이 가능
					$('#content2').empty();
					$('#content2').append('<ul><li>' + responseObj.send + '</li>');
					$('#content2').append('<li>' + responseObj.exist + '</li></ul>');
				},
				error: function() {
					alert('실패');
				}
			});
		});
	}
</script>

<title>Insert title here</title>
</head>
<body>

	<form>
		
		보내는 값<br/>
		<input type="text" id="send" name="send" /><br/><br/>
		
		<input type="button" id="btn1" value="일반텍스트" /><br/>
		<div id="content1"></div><br/>
		
		<input type="button" id="btn2" value="JSON" /><br/>
		<div id="content2"></div><br/>
		
	</form>

</body>
</html>