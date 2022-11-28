<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<body>
	hi
	<form method="post" action="regist.do" name="registForm">
		<table border="1">
		<tr>
			<td>Num</td>
			<td><input type="text" name="num"/></td>
		</tr>
	    <tr>
			<td>Subject</td>
			<td><input type="text" name="subject"/></td>
		</tr>
	     <tr>
			<td>writer</td>
			<td><input type="text" name="writer"/></td>
		</tr>
	     <tr>
			<td>mail</td>
			<td><input type="text" name="mail"/></td>
		</tr>
	     <tr>
			<td>password</td>
			<td><input type="text" name="password"/></td>
		</tr>
	     <tr>
			<td>content</td>
			<td><input type="text" name="content"/></td>
		</tr>
			<tr>
			<td>hit</td>
			<td><input type="text" name="hit"/></td>
		</tr>
	     <tr>
			<td>wip</td>
			<td><input type="text" name="wip"/></td>
		</tr>
		
		</table>
	</form>
	<button onclick="regist_go()">등록</button>
<script>
function regist_go(){
	var form = document.registForm;
	
	form.submit();
}
</script>
</body>
