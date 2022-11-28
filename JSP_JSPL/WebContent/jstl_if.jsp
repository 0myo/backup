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
	
	<%
		int c=5;
		if(c>3){
			out.print("true");
		}
	%>
	
	<hr/>
	
	
	<c:set var="c" value="<%=c %>" />
	<c:if test="${c>3 }">
		true
	</c:if>
</body>
</html>