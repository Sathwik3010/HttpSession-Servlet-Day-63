package com.codegnan.web;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class SecondServlet_02
 */
@WebServlet("/SecondServlet")
public class SecondServlet_02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double salary = Double.parseDouble(request.getParameter("esal"));
		String addr = request.getParameter("eaddr");
		HttpSession hs = request.getSession();
		hs.setAttribute("salary", salary);
		hs.setAttribute("addr", addr);
		RequestDispatcher rd = request.getRequestDispatcher("form3.html");
		rd.forward(request, response);
	}

}
