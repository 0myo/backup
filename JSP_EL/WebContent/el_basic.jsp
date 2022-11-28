<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="com.semi.dto.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%
  	pageContext.setAttribute("message", "pageContext message");
  	request.setAttribute("message", "request message");
  	session.setAttribute("message", "session message");
   	application.setAttribute("message", "application message");
   
   	pageContext.setAttribute("num", 1);
   

	pageContext.setAttribute("str","1,2,3");
	
	MemberVO member = new MemberVO();
	member.setId("ID");
	member.setPwd("PWD");
	
	request.setAttribute("member",member);
	
	Map<String, String> dataMap = new HashMap<String,String>();
	dataMap.put("key","123");
	pageContext.setAttribute("map", dataMap);
	
	
	List<String> dataList = new ArrayList<String>();
	dataList.add("1234");
	pageContext.setAttribute("list", dataList);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>attribute message : ${sessionScope.message }</h1> <!-- get Attribute -->
   <h1>parameter message : ${param.message }</h1> <!-- get parameter -->
   
   <ul>//연산자
      <%-- <% out.print(Integer.parseInt((String)pageContext.getAttribute("num"))+1); %> --%>
      <li> 산술연산 : ${num+1} </li>
      <li> 문자열 더하기 : ${num}${message} </li>
      <li> 비교연산 : ${num ge 3 } </li>
      <li> 유무연산 : ${empty num },${not empty requestScope.member }
   </ul>
   
   <ul>//메서드 호출
	<li>${str }</li> <%-- out.println(pageContext.getAttribute("str")); --%>
	<li>일반메소드 호출 :${str.split(",")[2] }</li>
   	<li>아이디 : ${member.getIdnPwd() } </li>
   	
   	<li>Map : ${map.key } </li>

	<li>List : ${list[0] } </li>
   </ul>
</body>
</html>