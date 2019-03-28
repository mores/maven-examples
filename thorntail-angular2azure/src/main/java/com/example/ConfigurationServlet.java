package com.example;

import javax.servlet.annotation.WebServlet;

@WebServlet( "/openid-configuration" )
public class ConfigurationServlet extends javax.servlet.http.HttpServlet
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( ConfigurationServlet.class );

	@Override
        protected void doGet( javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse resp ) throws javax.servlet.ServletException, java.io.IOException
        {
                log.info( "doGet" );
	}

	@Override
        protected void doPost( javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse resp ) throws javax.servlet.ServletException, java.io.IOException
        {
                log.info( "doPost" );
        }
}
