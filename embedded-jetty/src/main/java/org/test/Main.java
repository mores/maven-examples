package org.test;

import org.eclipse.jetty.annotations.AnnotationConfiguration;
import org.eclipse.jetty.plus.webapp.EnvConfiguration;
import org.eclipse.jetty.plus.webapp.PlusConfiguration;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.*;

public class Main
{
        public static void main(String[] args) throws Exception
        {
		int port = 8080;
		org.eclipse.jetty.server.Server server = new org.eclipse.jetty.server.Server(port);

		org.eclipse.jetty.servlet.ServletContextHandler servletContext = new org.eclipse.jetty.servlet.ServletContextHandler( org.eclipse.jetty.servlet.ServletContextHandler.SESSIONS );
		servletContext.setBaseResource( org.eclipse.jetty.util.resource.Resource.newResource( "src/main/webapp" ) );
		servletContext.setContextPath( "/" );
		servletContext.setWelcomeFiles(new String[]{"index.html", "welcome.html"});

		org.eclipse.jetty.servlet.ServletHolder holder = new org.eclipse.jetty.servlet.ServletHolder( "default", org.eclipse.jetty.servlet.DefaultServlet.class ); 
		holder.setInitParameter( "dirAllowed","true");
		servletContext.addServlet( holder,"/");

		servletContext.addServlet( new org.eclipse.jetty.servlet.ServletHolder( new HelloServlet() ), "/hello" );
              
		server.setHandler( servletContext );

		server.start();
		server.join();	
	}
}
