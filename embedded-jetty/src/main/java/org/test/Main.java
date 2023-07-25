package org.test;

public class Main
{
        public static void main(String[] args) throws Exception
        {
		int httpsPort = 8443;

		org.eclipse.jetty.server.Server server = new org.eclipse.jetty.server.Server();

		org.eclipse.jetty.server.HttpConfiguration httpConfiguration = new org.eclipse.jetty.server.HttpConfiguration();
		httpConfiguration.setSecureScheme( "https" );
		httpConfiguration.setSecurePort( httpsPort );

		org.eclipse.jetty.util.ssl.SslContextFactory.Server sslContextFactory = new org.eclipse.jetty.util.ssl.SslContextFactory.Server();
		sslContextFactory.setKeyStorePath( "keystore.jks" );
		sslContextFactory.setKeyStorePassword( "password" );
		org.eclipse.jetty.server.HttpConfiguration httpsConfiguration = new org.eclipse.jetty.server.HttpConfiguration(httpConfiguration);

		org.eclipse.jetty.server.SecureRequestCustomizer secureRequestCustomizer = new org.eclipse.jetty.server.SecureRequestCustomizer();
		secureRequestCustomizer.setSniHostCheck( false );
		httpsConfiguration.addCustomizer( secureRequestCustomizer );
		org.eclipse.jetty.server.ServerConnector httpsConnector = new org.eclipse.jetty.server.ServerConnector(server, new org.eclipse.jetty.server.SslConnectionFactory(sslContextFactory, org.eclipse.jetty.http.HttpVersion.HTTP_1_1.asString()), new org.eclipse.jetty.server.HttpConnectionFactory(httpsConfiguration));
		httpsConnector.setPort(httpsPort);
		server.addConnector(httpsConnector);

		org.eclipse.jetty.servlet.ServletContextHandler servletContext = new org.eclipse.jetty.servlet.ServletContextHandler( org.eclipse.jetty.servlet.ServletContextHandler.SESSIONS );
		servletContext.setBaseResource( org.eclipse.jetty.util.resource.Resource.newResource( "src/main/webapp" ) );
		servletContext.setContextPath( "/" );
		servletContext.setWelcomeFiles(new String[]{"index.html", "welcome.html"});

		servletContext.setAttribute( "fromMain", "passed in from Main" );

		org.eclipse.jetty.servlet.ServletHolder holder = new org.eclipse.jetty.servlet.ServletHolder( "default", org.eclipse.jetty.servlet.DefaultServlet.class ); 
		holder.setInitParameter( "dirAllowed","true");
		servletContext.addServlet( holder,"/");

		servletContext.addServlet( new org.eclipse.jetty.servlet.ServletHolder( new HelloServlet() ), "/hello" );
              
		server.setHandler( servletContext );

		server.start();
		server.join();	
	}
}
