package com.example;

@jakarta.ws.rs.ApplicationPath("/api")
public class Application extends jakarta.ws.rs.core.Application {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( Application.class );

	public Application()
	{
		log.info( "init" );
	}

	@Override
	public java.util.Set<Class<?>> getClasses() {
		java.util.Set<Class<?>> set = new java.util.HashSet<>();
		set.add(AddressesApi.class);
		set.add(CustomersApi.class);
		return set;
	}
}
