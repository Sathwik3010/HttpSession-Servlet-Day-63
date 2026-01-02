package com.codegnan.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String email = request.getParameter("eemail");
		String mobile = request.getParameter("emobile");

		HttpSession hs = request.getSession();
		int number = (int) hs.getAttribute("number");
		String name = (String) hs.getAttribute("name");
		double salary = (double) hs.getAttribute("salary");
		String address = (String) hs.getAttribute("address");
		out.println("<html><body bgcolor='lightgreen'>");
		out.println("<center><br><br>");
		out.println("<table bgcolor='lightyellow'>");
		out.println("<tr><td colspace='2'><center><b><font size='5' color='red'>");
		out.println("<u><br>Registration Details</u></font></b></center></td></tr>");
		out.println("<tr><td>Employee Number</td><td>"+number+"</td></tr>");
		out.println("<tr><td>Employee Name</td><td>"+name+"</td></tr>");
		out.println("<tr><td>Employee Salary</td><td>"+salary+"</td></tr>");
		out.println("<tr><td>Employee Address</td><td>"+address+"</td></tr>");
		out.println("<tr><td>Employee Email</td><td>"+email+"</td></tr>");
		out.println("<tr><td>Employee Mobile</td><td>"+mobile+"</td></tr>");
		out.println("<tr><td>Status</td><td>Success</td></tr>");
		out.println("</table></center></body></html>");
	}

}
