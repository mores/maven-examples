package com.example;

import javax.servlet.annotation.WebServlet;

@WebServlet( "/keys" )
public class KeysServlet extends javax.servlet.http.HttpServlet
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( KeysServlet.class );

	@Override
        protected void doGet( javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response ) throws javax.servlet.ServletException, java.io.IOException
        {
		log.info( "doGet: " + request.getServerName() + request.getContextPath() );
		java.io.PrintWriter out = response.getWriter();

		/*
		 * What can be done so this will work
		*/
	}

	@Override
        protected void doPost( javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response ) throws javax.servlet.ServletException, java.io.IOException
        {
                log.info( "doPost" );
        }
}
