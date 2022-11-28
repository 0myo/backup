<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/calculator.css" rel="stylesheet">

</head>


<body>

	<table border=1>
		<tr>
			<td colspan=3><input type="text" id="view"/></td>
			<td><input type="button" value="+" class="btn oper"/></td>
		</tr>
		<tr>
			<td><input type="button" value="7" class="btn"/></td>
			<td><input type="button" value="8" class="btn"/></td>
			<td><input type="button" value="9" class="btn"/></td>
			<td><input type="button" value="-" class="btn oper"/></td>
		</tr>
		<tr>
			<td><input type="button" value="4" class="btn"/></td>
			<td><input type="button" value="5" class="btn"/></td>
			<td><input type="button" value="6" class="btn"/></td>
			<td><input type="button" value="*" class="btn oper"/></td>
		</tr>
		<tr>
			<td><input type="button" value="1" class="btn"/></td>
			<td><input type="button" value="2" class="btn"/></td>
			<td><input type="button" value="3" class="btn"/></td>
			<td><input type="button" value="/" class="btn oper"/></td>
		</tr>
		<tr>
			<td colspan=2><input type="button" value="0" class="btn"></td>
			<td><input type="button" value="리셋" onclick="re()" class="oper"></td>
			<td><input type="button" onclick="execute()" value="=" class="oper"></td></tr>
	</table>

</body>

<script>
var btn = document.getElementsByClassName('btn');
let view = document.getElementById('view');
let result="";

for(var i = 0;i<btn.length;i++){
	btn[i].addEventListener('click',function(e){
		let num = e.target.value;
		result+=num;
		view.value=result;
	})
}
function execute(){
	var view_v = view.value;
	view_v=view_v.replace("+","$");
	location.href="calculator_output?view="+view_v;
}
function re(){
	var view_v = document.getElementById("view").value;
	view.value="";
	result="";
}
</script>
</html>