package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Context;

import org.joda.time.DateTime;

@Path( "/time" )
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class TimeResource
{
	private static org.jboss.logging.Logger log = org.jboss.logging.Logger.getLogger( TimeResource.class );

	@GET
	@Path( "/now" )
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public javax.ws.rs.core.Response get()
	{
		log.info( "get" );

		SimpleBean simpleBean = new SimpleBean();
		simpleBean.setUserName( "anonymous" );

		javax.ws.rs.core.CacheControl cacheControl = new javax.ws.rs.core.CacheControl();
		cacheControl.setPrivate( true );

		return javax.ws.rs.core.Response.ok( simpleBean ).cacheControl( cacheControl ).build();
	}
}
