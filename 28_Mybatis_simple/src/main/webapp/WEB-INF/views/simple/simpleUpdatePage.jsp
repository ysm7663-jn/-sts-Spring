<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="simpleUpdate.do" method="post">
		
		번호 : ${simpleDto.no}<br/><br/>
		
		제목<br/>
		<input type="text" name="title" value="${simpleDto.title}" /><br/><br/>
		
		내용<br/>
		<input type="text" name="content" value="${simpleDto.content}" /><br/><br/>
		
		<input type="hidden" name="no" value="${simpleDto.no}" />
		
		<button>수정완료</button>
		
	</form>

</body>
</html>