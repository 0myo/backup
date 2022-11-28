<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>index.jsp</h1>
	<h1>${loginUser.name }님 환영합니다.</h1>
	
	<hr/>
	<ul>
		<li><a href="<c:url value='/home/main' />" >/home/main</a></li>	
		<li><a href="<c:url value='/member/main' />">/member/main</a></li>
		<li><a href="<c:url value='/manager/main' />">/manager/main</a></li>
		<li><a href="<c:url value='/admin/main' />">/admin/main</a></li>
	</ul>
	
	
</body>
</html>