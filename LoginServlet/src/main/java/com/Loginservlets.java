package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Loginservlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Loginservlets() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
	}

	public void destroy() {
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		System.out.println(" ashok reddy");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String name =request.getParameter("user");
		String upass = request.getParameter("upass");
		PersonDao pdao = new PersonDao();
		
		if(pdao.validate(user,upass)) {
			pw.println("<h1 style = color:green> valid user</h1>");
		}
		else
		{
			pw.println("<h1 style=color:red> Invalid User</h1>");
		}

	}

}
