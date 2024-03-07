package com.reqdis;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		 String n=request.getParameter("myname");
		 String p=request.getParameter("mypass");
		  
		 User u=new User();//encapsulated--bean class
		 u.setUsername(n);
		 u.setPassword(p);
		 
		 boolean result=u.validate();
		 
		 if(result)
		 {
			 RequestDispatcher rd=request.getRequestDispatcher("welcome.html");
			 rd.forward(request, response);
		 }
		 else
		 {
			 RequestDispatcher rd=request.getRequestDispatcher("error.html");
			 rd.include(request, response);
		 }
		 
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		doGet(request, response);
	}

}
