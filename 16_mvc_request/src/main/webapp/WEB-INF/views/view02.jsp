<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>view02/jsp</h3>
	
	 <!-- http://localhost:9090/mvc06/board/v02?title=노인과바다&hit=12 입력시 -->
	
	<ul>
		<li>제목 : ${param.title}</li>
		<li>조회수 : ${param.hit}</li>
		<li>작성일 : ${param.date}</li>
	</ul>
	<!-- 
		제목 : 노인과바다
		조회수 : 12
		작성일 :
	 -->
	<ul>
		<li>제목 : ${title}</li>
		<li>조회수 : ${hit}</li>
		<li>작성일 : ${date}</li>
	</ul>
	<!-- 
		제목 : 노인과바다
		조회수 : 12
		작성일 : 2021-06-16
	 -->

</body>
</html>