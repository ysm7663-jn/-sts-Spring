<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<script type="text/javascript">
		var afterUpdate = '${afterUpdate}';
		if (afterUpdate == 'true') {
			var updateResult = '${updateResult}';
			if (updateResult > 0) {
				alert('수정되었습니다.');
			} else {
				alert('수정에 실패했습니다.');
			}
		}
		
		var afterDelete = '${afterDelete}';
		if (afterDelete == 'true') {
			var deleteResult = '${deleteResult}';
			if (deleteResult > 0) {
				alert('삭제되었습니다.');
			} else {
				alert('삭제에 실패했습니다.');
			}
		}
	</script>
		
		<h3>${simpleDto.no}번 게시글입니다.</h3>
		
		작성자 : ${simpleDto.writer}<br/>
		
		제목 : ${simpleDto.title}<br/>
		
		내용 : ${simpleDto.content}<br/>
		
		작성일 : ${simpleDto.regDate}<br/>
		
	<form method="post">
		<input type="hidden" name="no" value="${simpleDto.no}" />
		<input type="hidden" name="title" value="${simpleDto.title}" />
		<input type="hidden" name="content" value="${simpleDto.content}" />
		
		<input type="button" value="수정하기" onclick="fn_update(this.form)"/>
		<input type="button" value="삭제하기" onclick="fn_delete(this.form)"/>
		<input type="button" value="목록으로 이동" onclick="location.href='simpleListPage.do'"/>
		
	</form>

	<script type="text/javascript">
		function fn_update(f) {
			f.action = 'simpleUpdatePage.do';
			f.submit();
		}	
		
		function fn_delete(f) {
			if (confirm('삭제할까요?')) {
				f.action = 'simpleDelete.do';
				f.submit();
			}
		}
	</script>

</body>
</html>