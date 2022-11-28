<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/calculator.css" rel="stylesheet"/>
</head>
<body>
	<form>
	<table border=1>
		<tr>
			<td colspan=3><input type="text" disabled value="<%out.println(request.getAttribute("result"));%>"></td>
			<td><input type="button" value="+" class="btn oper"></td>
		</tr>
		<tr>
			<td><input type="button" value="7" class="btn"></td>
			<td><input type="button" value="8" class="btn"></td>
			<td><input type="button" value="9" class="btn"></td>
			<td><input type="button" value="-" class="btn oper"></td>
		</tr>
		<tr>
			<td><input type="button" value="4" class="btn"></td>
			<td><input type="button" value="5" class="btn"></td>
			<td><input type="button" value="6" class="btn"></td>
			<td><input type="button" value="*" class="btn oper"></td>
		</tr>
		<tr>
			<td><input type="button" value="1" class="btn"></td>
			<td><input type="button" value="2" class="btn"></td>
			<td><input type="button" value="3" class="btn"></td>
			<td><input type="button" value="/" class="btn oper"></td>
		</tr>
		<tr>
			<td colspan=3><input type="button" value="0" class="btn"></td>
			<td><input type="button" onclick="redo()" class="oper" value="다시"></td>
		</tr>
	</table>
	</form>
<script>
function redo(){
	location.href="calculator"
}

</script>
</body>
</html>