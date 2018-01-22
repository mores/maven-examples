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
import io.swagger.annotations.Authorization;
import io.swagger.annotations.BasicAuthDefinition;
import io.swagger.annotations.Info;
import io.swagger.annotations.OAuth2Definition;
import io.swagger.annotations.SecurityDefinition;
import io.swagger.annotations.SwaggerDefinition;
import org.joda.time.DateTime;

@Path( "/time" )
@Api( value = "/time", description = "Get the time", tags = "time" )
@Produces( MediaType.APPLICATION_JSON )
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
	        response = String.class,
	        authorizations = @Authorization( value = "api_key" )
	        )
	@Produces( MediaType.APPLICATION_JSON )
	public javax.ws.rs.core.Response get( @Context javax.ws.rs.core.SecurityContext securityContext )
	{
		log.info( "get" );

		String userName = securityContext.getUserPrincipal().getName();

		SimpleBean simpleBean = new SimpleBean();
		simpleBean.setUserName( userName );

		return javax.ws.rs.core.Response.ok( simpleBean.toJson(), MediaType.APPLICATION_JSON ).build();
	}
}
