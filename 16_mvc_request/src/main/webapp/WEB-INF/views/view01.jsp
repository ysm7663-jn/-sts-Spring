<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>view01.jsp</h3>
	
	<%-- request에 포함된 파라미터(Controller로 전달한 값) --%>
	<ul>
		<li>이름 : ${param.name}</li>
		<li>나이 : ${param.age }</li>
	</ul>
	
	<%-- model에 저장한 속성(Controller에서 전달된 값 --%>
	<ul>
		<li>이름 : ${name2}</li>
		<li>나이 : ${age2}</li>
	</ul>

</body>
</html>