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
</body>
</html>


<!--  

MVC의 역할

Client -> Controller ->  -> View
		  Model

Controller는 Client로부터 요청을 받는다
Model은 최종페이지에 쓸 데이터를 View에게 전달한다
View는 최종 페이지를 만들어준다 

-->