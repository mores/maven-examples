package com.example;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class MyApplication extends javax.ws.rs.core.Application
{
	private static org.jboss.logging.Logger log = org.jboss.logging.Logger.getLogger( MyApplication.class );

	protected final java.util.Set<Object> singletons = new java.util.HashSet<>();
	protected final java.util.Set<Class<?>> classes = new java.util.HashSet<>();

	public MyApplication()
	{
		log.debug( "init" );

		classes.add( TimeResource.class );

		classes.add( io.swagger.jaxrs.listing.ApiListingResource.class );
		classes.add( io.swagger.jaxrs.listing.SwaggerSerializers.class );

		io.swagger.jaxrs.config.BeanConfig beanConfig = new io.swagger.jaxrs.config.BeanConfig();
		beanConfig.setBasePath( "/" );
		beanConfig.setVersion( "So alpha" );
		beanConfig.setTitle( "API" );
		beanConfig.setDescription( "desc" );
		beanConfig.setResourcePackage( "com.example" );
		beanConfig.setScan( true );
	}

	@Override
	public java.util.Set<Class<?>> getClasses()
	{
		return classes;
	}

	@Override
        public java.util.Set<Object> getSingletons()
	{
		return singletons;
        }
}
