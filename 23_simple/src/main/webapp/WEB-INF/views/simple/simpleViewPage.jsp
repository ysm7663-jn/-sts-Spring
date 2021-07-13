<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>${simpleDto.no}번 게시글입니다.</h3>
	
	작성자 : ${simpleDto.writer}<br/>
	제목 : ${simpleDto.title}<br/>
	내용 : ${simpleDto.content}<br/>
	작성일 : ${simpleDto.regDate}<br/>
	
	<form method="post">
		<input type="hidden" name="no" value="${simpleDto.no}" />
		<input type="hidden" name="writer" value="${simpleDto.writer}" />
		<input type="hidden" name="title" value="${simpleDto.title}" />
		<input type="hidden" name="content" value="${simpleDto.content}" />
		<input type="button" value="수정하러 가기" onclick="fn_simpleUpdatePage(this.form)" />
		<input type="button" value="삭제하기" onclick="fn_simpleDelete(this.form)" />
		<input type="button" value="목록으로 이동하기" onclick="fn_simpleListPage(this.form)" />
	</form>
	
	<script type="text/javascript">
		function fn_simpleUpdatePage(f) {
			f.action = 'simpleUpdatePage.do';
			f.submit();
		}
		
		function fn_simpleDelete(f) {
			if (confirm('삭제할까요?')) {
				f.action = 'simpleDelete.do';
				f.submit();
			}
		}
		
		function fn_simpleListPage(f) {
			f.action = 'simpleListPage.do';
			f.submit();
		}
	</script>

</body>
</html>