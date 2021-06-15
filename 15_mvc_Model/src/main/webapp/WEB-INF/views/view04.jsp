<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>view04.jsp</h3>
	
	<ul>
		<c:forEach var="personDto" items="${list}">
			<li>이름 : ${personDto.name}</li>
			<li>나이 : ${personDto.age}</li>
		</c:forEach>
	</ul>

</body>
</html>