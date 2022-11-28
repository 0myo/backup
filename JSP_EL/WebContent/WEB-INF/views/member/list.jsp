<%@page import="java.util.List"%>
<%@page import="com.semi.dto.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>아이디</th>
			<th>패스워드</th>
		</tr>
		
		<% 
			List<MemberVO> memberList = (List<MemberVO>)request.getAttribute("memberList");
			for(MemberVO member : memberList){
				pageContext.setAttribute("member", member);
		%>
			<tr>
				<td>${member.id }</td>
				<td>${member.pwd }</td>				
			</tr>
		<%
			}
		%>
	</table>
</body>
</html>