package basic;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Addition")
public class Addition extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		
	     String s1=request.getParameter("num1");
	     String s2=request.getParameter("num2");
		
		 out.print(s1+s2);
		
		 int n1=Integer.parseInt(s1);
		 int n2=Integer.parseInt(s2);
		
		 out.print("<br><h1>Addition Is :"+(n1+n2));
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	
		doGet(request, response);
	}

}
