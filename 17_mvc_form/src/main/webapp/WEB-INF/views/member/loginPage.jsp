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
		<form action="<%=request.getContextPath()%>/member/login.do" method="post">
	 --%>
	 
	 <%--
	 	주의사항
	 	form 태그의 매핑값은 아래와 같이 슬래시(/)로 시작하면 안 된다.
	 	<form action="/member/login.do" method="post">
	  --%>
	  
	  <form action="<%=request.getContextPath()%>/member/login.do" method="post">
	  	아이디<br/>
	  	<input type="text" name="id" /><br/><br/>
	  	
	  	비밀번호<br/>
	  	<input type="password" name="pw" /><br/><br/>
	  	
	  	<button>로그인</button>
	  </form>

</body>
</html>