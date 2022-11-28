package com.calculator.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculator")
public class Calculator extends HttpServlet {

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String url = "/calculator.jsp";
      String result = "";
      String sik ="";
      
      request.setAttribute("result", result);
      request.setAttribute("sik", sik);
      request.getRequestDispatcher(url).forward(request, response);
      
   }

   
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String url = "/calculator.jsp";
      
      int num1 = Integer.parseInt(request.getParameter("firstNum"));
      String operation = request.getParameter("operation");
      int num2 = Integer.parseInt(request.getParameter("secondNum"));
      
      int result = operate(num1, num2, operation);
      String sik = num1+operation+num2;
      request.setAttribute("result", result);
      request.setAttribute("sik", sik);
      request.getRequestDispatcher(url).forward(request, response);
      
   }
   
   private int operate(int num1,int num2,String operation) {
      int result = 0;
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