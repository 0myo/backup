package com.jsp.calculator;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculator")
public class Calculator extends HttpServlet {

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String url = "/Calculator_form.jsp";
      String result = "";
      String sik ="";
      
      request.setAttribute("result", result);
      request.setAttribute("sik", sik);
      request.getRequestDispatcher(url).forward(request, response);
      
   }

   
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String url = "/Calculator_form.jsp";
      
      double num1 = Double.parseDouble(request.getParameter("firstNum"));
//      = 을 눌렀을때 오퍼레이션 값이 넘어가지 않게.
      String operation = request.getParameter("operation");
      
      String sms = request.getParameter("sms");
//      System.out.println(sms);
//      if (sms.equals("=")) {
//		operation = "";
//	}
      double num2 = Double.parseDouble(request.getParameter("secondNum"));
//      오퍼레이션을 값을 가지고 와서 새로운 창에 오퍼레이션을 저장해줄 수 있도록한다
//      서밋을 하면 초기화되기때문에
      
      double result = operate(num1, num2, operation);
      String resultS = "";
      String sik = num1+operation+num2;
      
      if (result % 1.0 != 0) {
    	  resultS = String.format("%s", result);
	}else {
		resultS = String.format("%.0f", result);
	}
      request.setAttribute("operationC", operation);
      request.setAttribute("result", resultS);
      request.setAttribute("sik", sik);
      request.getRequestDispatcher(url).forward(request, response);
      
   }
   
   private double operate(double num1, double num2,String operation) {
	   double result = 0;
      switch (operation) {
      case "+":
         result = num1+num2;
         break;
      case "-":
         result = num1-num2;
         break;
      case "/":
         result=num1/num2;
         break;
      case "*":
         result=num1*num2;
         break; 
      default:
         break;
      }
      return result;
   }

}