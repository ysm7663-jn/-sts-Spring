<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="userInsert.do" method="post">
	
		이름<br/>
		<input type="text" name="name" autofocus /><br/><br/>
		
		전화<br/>
		<input type="text" name="phone" /><br/><br/>
		
		<button>작성완료</button>
		
		<input type="button" value="목록으로 이동" onclick="location.href='userListPage.do'" />

	</form>	

</body>
</html>