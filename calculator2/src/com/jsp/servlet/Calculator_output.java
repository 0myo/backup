package com.jsp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calculator_output")
public class Calculator_output extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "calculator_output.jsp";
		
		String view = request.getParameter("view");
		System.out.println(view);
		int num1= Integer.parseInt(view.substring(0,2));
		System.out.println(num1);
		String operator = String.valueOf(view.charAt(2));
		System.out.println(operator);
		int num2= Integer.parseInt(view.substring(3,5));
		int result = operate(num1,num2,operator);
		
		
		request.setAttribute("result", result);
		request.getRequestDispatcher(url).forward(request, response);;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	private int operate(int num1,int num2,String operator) {
		int result = 0;
		switch (operator) {
		case "$":
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
