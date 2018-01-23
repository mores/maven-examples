package com.example;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class MyApplication extends javax.ws.rs.core.Application
{
	private static org.jboss.logging.Logger log = org.jboss.logging.Logger.getLogger( MyApplication.class );

	public MyApplication()
	{
		log.debug( "init" );
	}

	@Override
        public java.util.Set<Object> getSingletons()
	{
		java.util.Set<Object> singletons = new java.util.HashSet<>();
		return singletons;
        }
}
