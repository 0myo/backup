<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/calculator.css" />

</head>
<body>
   <table border="1px">
      <tr>
         <td colspan="3"><input type="text" name="allView" id="allView"
            value="${sik}" /></td>
         <td><input type="button" name="allClear" value="AC" class="allClear"
            onclick="re()"></td>
      </tr>
      <tr>
         <td colspan="3"><input type="text" name="view" id="view" 
            value="${result}"></td>
         <td><input type="button" name="delete" value="←" class="del" onclick="del()"></td>
      </tr>
      
      <tr>
         <td><input type="button" value="1" class="btnNum"></td>
         <td><input type="button" value="2" class="btnNum"></td>
         <td><input type="button" value="3" class="btnNum"></td>
         <td><input type="button" value="+" class="oper"></td>
      </tr>
      <tr>
         <td><input type="button" value="4" class="btnNum"></td>
         <td><input type="button" value="5" class="btnNum"></td>
         <td><input type="button" value="6" class="btnNum"></td>
         <td><input type="button" value="-" class="oper"></td>
      </tr>
      <tr>
         <td><input type="button" value="7" class="btnNum"></td>
         <td><input type="button" value="8" class="btnNum"></td>
         <td><input type="button" value="9" class="btnNum"></td>
         <td><input type="button" value="*" class="oper"></td>
      </tr>
      <tr>
         <td><input type="button" value="0" class="btnNum"></td>
         <td><input type="button" value="." class="point" onclick="point()"></td>
         <td><input type="submit" value="=" class="sms" name="sms" onclick="sik()"></td>
         <td><input type="button" value="/" class="oper"></td>
      </tr>
   </table>
   <form method="post" id="myForm">
      <input type="text" id="firstNum" name="firstNum" value="${ result}"> 
      <input type="text" id="operation" name="operation"  > 
         <input type="text" id="secondNum" name="secondNum"> 
         <input type="text" id="sms"  value="${  result}"> 
         <input type="text" id="sik" name="sik"value="${sik}">
         <input type="text" id="operationC" name="operationC"  value="${ operationC}">
   </form>

</body>
<script>
   var form = document.getElementById('myForm');
   var btn_num = document.querySelectorAll('.btnNum');
   var first_input_num = document.getElementById('firstNum');
   var second_input_num = document.getElementById('secondNum');
   var oper_btn = document.querySelectorAll('.oper')
   var operation_input = document.getElementById('operation');
   var sms_iuput = document.getElementById('sms');
   var all_view_input = document.getElementById('allView');
   var point_btn = document.getElementById('point');
   var view_input = document.getElementById('view');
   var array = [];
   var operationC = document.getElementById('operationC');

   for (var i = 0; i < btn_num.length; i++) {
      btn_num[i].addEventListener("click", function(e) {

         inputNum(e)
      });
   };
   for (var i = 0; i < oper_btn.length; i++) {
      oper_btn[i].addEventListener("click", function(e) {
         operation(e)
      });
   };
   
   if (operationC.value == "null") {
   } else if (operationC.value != "null"){
      operation_input.value += operationC.value;
      all_view_input.value +=  operationC.value;
      view.value += operationC.value;
   }

   function point() {
      if (first_input_num.value == "" && operation_input.value == "") {
         // 못찾으면 -1
         if (first_input_num.value.indexOf("0.") == -1) {
            first_input_num.value += "0.";
            all_view_input.value += "0.";
            view_input.value += "0.";
            console.log("000")
         }
      }
      if (first_input_num.value != "" && operation_input.value == "") {
         // 못찾으면 -1
         if (first_input_num.value.indexOf(".") == -1) {
            first_input_num.value += ".";
            all_view_input.value += ".";
            view_input.value += ".";
            console.log("1111")
         }
      }
      if (second_input_num.value != "" && operation_input.value != "") {
         // 못찾으면 -1
         if (second_input_num.value.indexOf(".") == -1) {
            second_input_num.value += ".";
            all_view_input.value += ".";
            view_input.value += ".";
            console.log("22222")
         }
      }
   }
   
   

   function inputNum(e) {

//       if (document.getElementById('sms').value != "") {
//          document.getElementById('view').value = "";
//          document.getElementById('allView').value = "";
//          document.getElementById('sms').value = "";
//          console.log("3")
//       }
      if (operation_input.value == "") {
         first_input_num.value += e.target.value;
         all_view_input.value += e.target.value;
         view.value += e.target.value;
         console.log("4")

      } else if (operation_input.value != "") {
//          document.getElementById('view').value = "";
         second_input_num.value += e.target.value;
         all_view_input.value += e.target.value;
         view.value += e.target.value;
         console.log("5")
      }
   }

   function operation(e) {
      if (operation_input.value == "" && first_input_num.value != "" ) {
         operation_input.value = e.target.value
         all_view_input.value += operation_input.value
         view.value = operation_input.value
         console.log("6")

      } else if (sms_iuput.value != "" && operation_input.value == "") {
         operation_input.value = "";
         operation_input.value += e.target.value
         first_input_num.value += sms_iuput.value
         all_view_input.value = sms_iuput.value + operation_input.value
         view.value = operation_input.value
         console.log("7")

      } else if (operation_input.value != "" && first_input_num.value != "" ) {
         operation_input.value = e.target.value
         view.value = operation_input.value
         all_view_input.value = first_input_num.value + operation_input.value
         sik()
         console.log("8")
      }
   }

   function sik() {
      if (first_input_num.value != "" && operation_input.value == ""
            && second_input_num.value == "") {
         first_input_num.value = "";
         all_view_input.value = "";
         view_input.value = "";
         console.log("9")
      }
      if (first_input_num.value != "" && operation_input.value != ""
            && second_input_num.value != "") {
            form.submit();
   
         console.log("10")
      }
   }

   function re() {
      location.href = "calculator";
   }

   function del() {
      if (document.getElementById('view').value != ""
            && document.getElementById('allView').value != "" && first_input_num.value !="") {
         first_input_num.value = first_input_num.value.substring(0,
               first_input_num.value.length - 1);
      }
      document.getElementById('view').value = first_input_num.value;
      document.getElementById('allView').value = first_input_num.value;
   
//       if (document.getElementById('view').value != ""
//          && document.getElementById('allView').value != "" && second_input_num.value !="") {
//          second_input_num.value = second_input_num.value.substring(0,
//                second_input_num.value.length - 1);
//       }
//       document.getElementById('view').value = all_view_input.value + second_input_num.value;
//       document.getElementById('allView').value = view_input.value + second_input_num.value;
   }
   
   function outDel(key) {
      if (document.getElementById('oper').value != "") {
         out = out.substring(0, out.length - 1);
      }
      document.getElementById('out').value = out;
   }
</script>
</html>