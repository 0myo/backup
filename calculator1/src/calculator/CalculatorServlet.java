package calculator;

import java.io.IOException;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/CalculatorForm.jsp";
		
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/CalculatorForm.jsp";
		
		String num1 = request.getParameter("num2");
		
		String num = request.getParameter("num"); 
		
		String op = request.getParameter("op");
		
		String firstNum;
		
		
		/*
		 * if (op.equals("+")||) { firstNum += num; } else if (op.equals("-")) {
		 * firstNum += num; }
		 * 
		 * String secondNum = 0;
		 * 
		 * if (op.equals("+")) { firstNum + secndNum; } else if (op.equals("-")) {
		 * firstNum - secndNum; } // String plus = request.getParameter("plus"); //
		 * String minus = request.getParameter("minus"); // String multi =
		 * request.getParameter("multi"); // String plus = request.getParameter("plus");
		 * 
		 * if (plus != null) {
		 * 
		 * } //
		 * 
		 */
		
		
		request.getRequestDispatcher(url).forward(request, response);
	
	}

	private ArrayList<String> ArrayList(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private String firstNum(String num1, String num2) {
		return "";
	}
       

}
