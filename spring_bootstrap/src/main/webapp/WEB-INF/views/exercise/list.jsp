<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<body>
	<h1>HI</h1>
	<table border="1">
		<tr>
			<th>NUM</th>
			<th>Subject</th>
			<th>Writer</th>
			<th>mail</th>
			<th>password</th>
			<th>content</th>
			<th>hit</th>
			<th>wip</th>
			<th>wdate</th>
		</tr>
	<c:forEach items="${eList }" var="exercise">
	<tr>
		<td>${exercise.num }</td>
		<td>${exercise.subject }</td>
		<td>${exercise.writer }</td>
		<td>${exercise.mail }</td>
		<td>${exercise.password }</td>
		<td>${exercise.content }</td>
		<td>${exercise.hit }</td>
		<td>${exercise.wip }</td>
		<td><fmt:formatDate value="${exercise.wdate }" pattern="yyyy-MM-dd"/></td>
	</tr>
	</c:forEach>
	
	</table>
	<input type="button" value="등록하기" onclick="OpenWindow('registForm.do','글등록',800,700)"/>
<c:if test="${from eq 'regist' }" >
	<script>
		alert("등록되었습니다.");
		window.close();
		window.opener.location.reload();			
	</script>
</c:if>
</body>
