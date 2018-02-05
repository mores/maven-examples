package com.example;

/*
 * For example see: https://github.com/swagger-api/swagger-core/blob/master/modules/swagger-servlet/src/test/java/io/swagger/servlet/resources/ResourceWithAnnotations.java
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Context;

@Path( "/swagger-ui" )
public class SwaggerUiResource
{
	private static org.jboss.logging.Logger log = org.jboss.logging.Logger.getLogger( SwaggerUiResource.class );

	@Context
	private javax.servlet.ServletContext servletContext;

	@GET
	@Path( "/" )
	public java.io.InputStream get()
	{
		return this.get( "index.html" );
	}

	@GET
	@Path( "{filename}" )
	public java.io.InputStream get( @PathParam( "filename" ) String fileName )
	{
		log.debug( "get: " + fileName );
		String realPath = servletContext.getRealPath( "/" );
		String fqfn = realPath + "/swagger-ui/" + fileName;
		log.debug( "fqfn: " + fqfn );

		java.io.File index = new java.io.File( fqfn );
		try
		{
			return new java.io.FileInputStream( index );
		}
		catch( java.io.FileNotFoundException e )
		{
			String errorMessage = "ERROR: " + e;
			log.error( "File error: " + errorMessage ); 
			return new java.io.ByteArrayInputStream( errorMessage.getBytes( java.nio.charset.StandardCharsets.UTF_8 ) );
		}  
	}
}
