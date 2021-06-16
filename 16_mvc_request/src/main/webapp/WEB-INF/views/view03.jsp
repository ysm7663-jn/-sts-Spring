<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>view03.jsp</h3>
	
	<%-- model이 저장한 속성(Controller에서 전달된 값) --%>
	<ul>
		<li>이름 : ${name}</li>
		<li>나이 : ${age}</li>
	</ul>

</body>
</html>