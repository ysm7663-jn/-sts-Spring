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
		function fn_userUpdate(f) {
			if ('수정할까요?') {
				f.action = 'userUpdate.do';
				f.submit();
			}
		}
		
		function fn_userDelete(f) {
			if ('삭제할까요?') {
				f.action = 'userDelete.do';
				f.submit();
			}
		}
	</script>

	<form method="post">
		이름<br/>
		<input type="text" name="name" value="${userDto.name}" /><br/><br/>
		
		연락처<br/>
		<input type="text" name="phone" value="${userDto.phone}" /><br/><br/>
		
		<%-- hidden --%>
		<input type="hidden" name="no" value="${userDto.no}"/>
		
		<input type="button" value="수정하기" onclick="fn_userUpdate(this.form)" />
		<input type="button" value="삭제하기" onclick="fn_userDelete(this.form)" />
		<input type="button" value="목록으로 이동" onclick="location.href='userListPage.do'" />
		
	</form>

</body>
</html>