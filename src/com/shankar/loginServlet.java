package com.shankar;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class loginServlet extends HttpServlet {
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uname=request.getParameter("uname");
		String password=request.getParameter("password");
		
	
		if(password.equals(Register.checkPassword(uname)))
		{
			HttpSession session=request.getSession();
			session.setAttribute("uname", uname);
			response.sendRedirect("welcome.jsp");
			
		
		}
	
		else
			{
			
			response.sendRedirect("shankar.html");
			}
			}

}
//String a=request.getParameter("name");
//String b=request.getParameter("password");
//response.getWriter().println(a+b);
