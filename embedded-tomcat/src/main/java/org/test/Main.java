package org.test;

public class Main
{

	public static void main(String[] args) throws Exception
	{
		String webappDirLocation = "src/main/webapp/";
		org.apache.catalina.startup.Tomcat tomcat = new org.apache.catalina.startup.Tomcat();

		//The port that we should run on can be set into an environment variable
		//Look for that variable and default to 8080 if it isn't there.
		String webPort = System.getenv("PORT");
		if(webPort == null || webPort.isEmpty())
		{ 
			webPort = "8080";
		}

		tomcat.setPort(Integer.valueOf(webPort));
		tomcat.getConnector();

		org.apache.catalina.Service service = tomcat.getService();
		service.addConnector(getSslConnector());

		org.apache.catalina.core.StandardContext ctx = (org.apache.catalina.core.StandardContext)tomcat.addWebapp("/", new java.io.File(webappDirLocation).getAbsolutePath());
		System.out.println("configuring app with basedir: " + new java.io.File("./" + webappDirLocation).getAbsolutePath());

		// Declare an alternative location for your "WEB-INF/classes" dir
		// Servlet 3.0 annotation will work
		java.io.File additionWebInfClasses = new java.io.File("target/classes");
		org.apache.catalina.WebResourceRoot resources = new org.apache.catalina.webresources.StandardRoot(ctx);
		resources.addPreResources(new org.apache.catalina.webresources.DirResourceSet(resources, "/WEB-INF/classes", additionWebInfClasses.getAbsolutePath(), "/"));
		ctx.setResources(resources);

		tomcat.start();
		tomcat.getServer().await();
	}

	private static org.apache.catalina.connector.Connector getSslConnector()
	{
		org.apache.catalina.connector.Connector connector = new org.apache.catalina.connector.Connector();
		connector.setPort(443);
		connector.setSecure(true);
		connector.setScheme("https");
		connector.setProperty("keyAlias", "selfsigned");
		connector.setProperty("keystorePass", "password");
		connector.setProperty("keystoreType", "JKS");
		connector.setProperty("keystoreFile", "keystore.jks");
		connector.setProperty("clientAuth", "false");
		connector.setProperty("protocol", "HTTP/1.1");
		connector.setProperty("sslProtocol", "TLS");
		connector.setProperty("maxThreads", "200");
		connector.setProperty("protocol", "org.apache.coyote.http11.Http11AprProtocol");
		connector.setProperty("SSLEnabled", "true");
		return connector;
	}
}
