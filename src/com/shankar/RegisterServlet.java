package com.shankar;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String first=request.getParameter("firstname");
String last=request.getParameter("lastname");
String uname=request.getParameter("uname");
String password=request.getParameter("password");
System.out.println("Step1 Done");

	Register.register(first, last, uname, password);
	System.out.println("register function called");


response.getWriter().println("Thank You for registering!");


	}

}
