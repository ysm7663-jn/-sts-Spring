<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<!-- resources 디렉토리 아래의 image -->
<img style="width:500px;" alt="image1" src="/mvc01/resources/img.jpg">
<img style="width:500px;" alt="image1" src="/mvc01/resources/person.jpg">

<!-- assets/images 디렉토리 아래의 image -->
<!-- assets/images는 servelt-context.xml에 정의되어 있지 않기 때문에 그냥 사용하면 출력되지 않음 -->
<img style="width:500px;" alt="image2" src="/mvc01/assets/images/img.jpg">
<img style="width:500px;" alt="image2" src="/mvc01/assets/images/person.jpg">

</body>
</html>
