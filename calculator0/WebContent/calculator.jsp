<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   fo
   <table border="1px" >
   <tr>
      <td colspan="3"><input type="text" name="allView"></td>
      <td><input type="button" name="allClear" value="AC"></td>
   </tr>
   <tr>
      <td colspan="3"><input type="text" name="view"></td>
      <td><input type="button" name="delete" value="←"></td>
   </tr>
   <tr>
      <td> <input type="button" value="1" class="btnNum"></td>
      <td> <input type="button" value="2" class="btnNum"></td>
      <td> <input type="button" value="3" class="btnNum"></td>
      <td> <input type="button" value="+" class="oper"></td>
   </tr>
   <tr>
      <td> <input type="button" value="4" class="btnNum"></td>
      <td> <input type="button" value="5" class="btnNum"></td>
      <td> <input type="button" value="6" class="btnNum"></td>
      <td> <input type="button" value="-" class="oper"></td>
   </tr>
   <tr>
      <td> <input type="button" value="7" class="btnNum"></td>
      <td> <input type="button" value="8" class="btnNum"></td>
      <td> <input type="button" value="9" class="btnNum"></td>
      <td> <input type="button" value="*" class="oper"></td>
   </tr>
   <tr>
      <td> <input type="button" value="0" class="btnNum"></td>
      <td> <input type="button" value="." class="point"></td>
      <td> <input type="submit" value="=" class="sms" onclick="gkq()"></td>
      <td> <input type="button" value="/" class="oper"></td>
   </tr>
   </table>
     <form method = "post" id="myForm">
      <input type="text" id="firstNum" name="firstNum">
      <input type="text" id="operation" name="operation">
      <input type="text" id="secondNum" name="secondNum">
      <input type="text" id="sms" name="sms" >
      <input type="text" id="gkq" name="gkq" value="<% out.println(request.getAttribute("result")); %>">
   </form>

</body>
<script>
var form = document.getElementById('myForm');
   var btn_num = document.querySelectorAll('.btnNum');
   var first_input_num = document.getElementById('firstNum');
   var second_input_num = document.getElementById('secondNum');
   var oper_btn = document.querySelectorAll('.oper')
   var operation_input =  document.getElementById('operation');
   
   for (var i = 0; i < btn_num.length; i++) {
      btn_num[i].addEventListener("click",function(e){
          inputNum(e)
          console.log(e.target.value)
      });
   };
   for (var i = 0; i < oper_btn.length; i++) {
      oper_btn[i].addEventListener("click",function(e){
         operation(e)
             console.log(e.target.value)  
      });
   };
   
function inputNum(e){
   if (operation_input.value =="") {
      first_input_num.value += e.target.value;
      console.log(first_input_num)
   } else if (operation_input.value !="") {
      second_input_num.value += e.target.value;
      console.log(second_input_num)
   }
}

function operation(e){
   if (operation_input.value == "" && first_input_num.value !="") {
      operation_input.value += e.target.value
   }   
   
}

function gkq() {
   form.submit();
}


</script>
</html>