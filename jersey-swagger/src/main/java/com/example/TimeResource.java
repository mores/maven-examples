package com.example;

/*
 * For example see: https://github.com/swagger-api/swagger-core/blob/master/modules/swagger-servlet/src/test/java/io/swagger/servlet/resources/ResourceWithAnnotations.java
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Context;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiKeyAuthDefinition;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.BasicAuthDefinition;
import io.swagger.annotations.Info;
import io.swagger.annotations.OAuth2Definition;
import io.swagger.annotations.SecurityDefinition;
import io.swagger.annotations.SwaggerDefinition;
import org.joda.time.DateTime;

@Path( "/time" )
@Api( value = "/time", description = "Get the time", tags = "time" )
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@SwaggerDefinition(
        info = @Info(
                title = "Time API",
                version = "so alpha"
        ),
        securityDefinition = @SecurityDefinition(
                apiKeyAuthDefinitions = {
                        @ApiKeyAuthDefinition( key = "api_key", name = "api_key", in = ApiKeyAuthDefinition.ApiKeyLocation.HEADER ) }
        ) )
public class TimeResource
{
	private static org.jboss.logging.Logger log = org.jboss.logging.Logger.getLogger( TimeResource.class );

	@GET
	@Secured
	@Path( "/now" )
	@ApiOperation( value = "Get the current time",
	        notes = "Returns the time as a string",
	        response = SimpleBean.class,
	        authorizations = @Authorization( value = "api_key" )
	        )
	@ApiResponses(value = {
		@ApiResponse(response = SimpleBean.class, code = java.net.HttpURLConnection.HTTP_OK, message = "Returns a certain user"),
		@ApiResponse(response = ErrorBean.class, code = java.net.HttpURLConnection.HTTP_UNAUTHORIZED, message = "Unauthorized"),
		@ApiResponse(response = ErrorBean.class, code = java.net.HttpURLConnection.HTTP_NOT_FOUND, message = "Not found"),
		@ApiResponse(response = ErrorBean.class, code = java.net.HttpURLConnection.HTTP_INTERNAL_ERROR, message = "Internal server problems")
	})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public javax.ws.rs.core.Response get( @Context javax.ws.rs.core.SecurityContext securityContext )
	{
		log.info( "get" );
		String userName = securityContext.getUserPrincipal().getName();

		SimpleBean simpleBean = new SimpleBean();
		simpleBean.setUserName( userName );

		javax.ws.rs.core.CacheControl cacheControl = new javax.ws.rs.core.CacheControl();
		cacheControl.setPrivate( true );

		return javax.ws.rs.core.Response.ok( simpleBean ).cacheControl( cacheControl ).build();
	}
}
