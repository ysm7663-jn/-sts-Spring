<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>사용자 목록</h3>
	<table border="1">
		<thead>
			<tr>
				<td>번호</td>
				<td>이름</td>
				<td>연락처</td>
			</tr>
		</thead>
		
		<tbody>
			<c:if test="${empty list}">
				<tr>
					<td colspan="3">사용자가 없습니다.</td>
				</tr>
			</c:if>
			
			<c:if test="${not empty list}">
				<c:forEach var="userDto" items="${list}">
					<tr>
						<td>${userDto.no}</td>
						<td><a href="userViewPage.do?no=${userDto.no}">${userDto.name}</a></td>
						<td>${userDto.phone}</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
		
		<tfoot>
			<tr>
				<td colspan="3">
					<a href="userInsertPage.do">새 사용자 등록하거 가기</a>
				</td>
			</tr>
		</tfoot>
	</table>

</body>
</html>