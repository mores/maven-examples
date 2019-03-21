package org.test;

import javax.servlet.annotation.WebServlet;

@WebServlet("/hello/*")
public class Hello extends javax.servlet.http.HttpServlet
{
	@Override
	protected void doGet( final javax.servlet.http.HttpServletRequest req, final javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException
	{
		resp.getWriter().print( "Hello" );
	}
}
