package org.example;

public class Animal {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( Animal.class );

	public Animal() {
		log.info( "Roar !!" );
	}
}
