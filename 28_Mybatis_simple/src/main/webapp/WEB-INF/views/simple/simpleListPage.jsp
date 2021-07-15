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

	<table border="1">
		<thead>
			<tr>
				<td>순번</td>
				<td>작성자</td>
				<td>제목</td>
				<td>작성일</td>
			</tr>
		</thead>
		
		<tbody>
			<c:if test="${empty list}">
				<tr>
					<td colspan="4">게시글이 없습니다.</td>
				</tr>
			</c:if>		
			
			<c:if test="${not empty list}">
				<c:forEach var="simpleDto" items="${list}">
					<tr>
						<td>${simpleDto.no}</td>					
						<td>${simpleDto.writer}</td>					
						<td><a href="simpleViewPage.do">${simpleDto.title}</a></td>					
						<td>${simpleDto.regDate}</td>					
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
		
		<tfoot>
			<tr>
				<td colspan="4"><input type="button" value="새 글 작성하기" onclick="location.href='simpleInsertPage.do'" /></td>
			</tr>
		</tfoot>
	</table>

</body>
</html>