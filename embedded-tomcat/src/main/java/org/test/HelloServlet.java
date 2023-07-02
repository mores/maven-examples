package org.test;

import javax.servlet.annotation.WebServlet;

@WebServlet( name = "MyServlet", urlPatterns = {"/hello"} )
public class HelloServlet extends javax.servlet.http.HttpServlet
{
	@Override
	protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException
	{
		javax.servlet.ServletOutputStream out = resp.getOutputStream();
		out.write( "oh hello there ".getBytes() );
		out.write( java.time.LocalDateTime.now().toString().getBytes() );
		out.flush();
		out.close();
	}
}
