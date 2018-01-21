package org.test;

import javax.servlet.annotation.WebServlet;

@WebServlet( "/rest/*" )
public class TestServlet extends javax.servlet.http.HttpServlet
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( TestServlet.class );

	protected void service(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException
	{
		log.trace( "service" );

		String openIdToken = req.getHeader( "OpenIdToken" );
		log.trace( "openIdToken: " + openIdToken );

		try
		{
			com.nimbusds.jwt.SignedJWT signedJWT = com.nimbusds.jwt.SignedJWT.parse( openIdToken );
			com.nimbusds.jwt.JWTClaimsSet claimSet = signedJWT.getJWTClaimsSet();
			java.util.Map<String, Object> claims = claimSet.getClaims();

			for( String claim : claims.keySet() )
			{
				log.trace( claim + "\t" + claims.get( claim ) );
			}
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}
