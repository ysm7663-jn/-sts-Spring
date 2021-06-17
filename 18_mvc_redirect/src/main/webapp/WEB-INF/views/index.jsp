<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%--
		<form action="v01"> 이 부분은
		MyController의 @RequsetMapping(value="v01")과 연결된다.
	--%>
	
	<form action="v01" method="get">
		이름<br/>
		<input type="text" name="name" /><br/><br/>
		
		나이<br/>
		<input type="text" name="age" /><br/><br/>
		
		<button>전송</button>
	</form>
	
	<br/>
	
	<form action="v02" method="get">
		이름<br/>
		<input type="text" name="name" /><br/><br/>
		
		나이<br/>
		<input type="text" name="age" /><br/><br/>
		
		<button>전송</button>
	</form>
	
	<br/>
	
	<form action="v04" method="get">
		이름<br/>
		<input type="text" name="name" /><br/><br/>
		
		나이<br/>
		<input type="text" name="age" /><br/><br/>
		
		<button>전송</button>
	</form>

</body>
</html>