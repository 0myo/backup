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
		String url = "calculator.jsp";
		
		request.getRequestDispatcher(url).forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "calculator.jsp";
		
		String s_num1 = request.getParameter("num1");
		String s_num2 = request.getParameter("num2");
		String operator = request.getParameter("operator");
		
		double d_num1= Double.parseDouble(s_num1);
		double d_num2= Double.parseDouble(s_num2);
		double result = operate(d_num1,d_num2,operator);
		
		String s_result = String.valueOf(result);
		if(((String)request.getParameter("formEqs")).equals("@@@@@@@@@@@@")) {
			request.setAttribute("operator","");
		}
		else {
			request.setAttribute("operator",operator);
		}
		if(request.getParameter("operator2")!=null) {
			String operator2 = request.getParameter("operator2");
			request.setAttribute("operator2",operator2);
		}
		request.setAttribute("result", s_result);
		request.getRequestDispatcher(url).forward(request, response);
	}
	
	private double operate(double num1,double num2,String operator) {
		double result = 0;
		switch (operator) {
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
