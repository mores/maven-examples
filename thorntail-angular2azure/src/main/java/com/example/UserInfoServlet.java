package com.example;

import javax.servlet.annotation.WebServlet;

@WebServlet( "/userinfo" )
public class UserInfoServlet extends javax.servlet.http.HttpServlet
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( UserInfoServlet.class );

	@Override
        protected void doGet( javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response ) throws javax.servlet.ServletException, java.io.IOException
        {
                log.info( "doGet" );

		java.io.PrintWriter out = response.getWriter();

		response.setHeader( "Access-Control-Allow-Origin", "*" );
		response.setHeader( "Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS" );
		response.setHeader( "Access-Control-Max-Age", "-1" );
		response.setHeader( "Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept" );

		org.apache.http.impl.client.HttpClientBuilder clientBuilder = org.apache.http.impl.client.HttpClientBuilder.create();
		org.apache.http.impl.client.CloseableHttpClient httpClient = clientBuilder.build();

		String accessToken = request.getHeader( "Authorization" );

		String url = "https://graph.microsoft.com/oidc/userinfo";
		log.trace( "URL: " + url );
		org.apache.http.client.methods.HttpGet httpget = new org.apache.http.client.methods.HttpGet( url );
		httpget.addHeader( "Content-Type", "application/json; charset=utf-8" );
		httpget.addHeader( "Accept", "application/json" );
		httpget.addHeader( "Authorization", accessToken );

		org.apache.http.client.methods.CloseableHttpResponse httpResponse = null;
		try
		{
			httpResponse = httpClient.execute( httpget );

			org.apache.http.StatusLine statusLine = httpResponse.getStatusLine();
			log.debug( "status code: " + statusLine.getStatusCode() );

			org.apache.http.HttpEntity entity = httpResponse.getEntity();
                        String content = org.apache.http.util.EntityUtils.toString( entity );

			log.trace( "content: " + content );

			out.println( content );
			out.flush();
		}
		finally
		{
			try
			{
				httpResponse.close();
			}
			catch( Exception exception )
			{
				log.error( "finally error:", exception );
			}
		}
	}

	@Override
        protected void doPost( javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse resp ) throws javax.servlet.ServletException, java.io.IOException
        {
                log.info( "doPost" );
        }
}
