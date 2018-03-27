package org.test;

import org.junit.Test;

public class ProtobufTest
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( ProtobufTest.class );

	@Test
	public void testOne() throws Exception
	{
		log.debug( "testOne" );

		AddressBookProtos.AddressBook.Builder addressBook = AddressBookProtos.AddressBook.newBuilder();

		AddressBookProtos.Person.Builder person = AddressBookProtos.Person.newBuilder();
		person.setId( 456 );
		person.setName( "Joe Tester" );
		AddressBookProtos.Person.PhoneNumber.Builder phoneNumber = AddressBookProtos.Person.PhoneNumber.newBuilder().setNumber( "1234567890" );
		person.addPhones( phoneNumber );

		addressBook.addPeople( person.build() ); 

		java.io.File tempFile = java.io.File.createTempFile( "addressBook", "buf" );
		tempFile.deleteOnExit();	 
		java.io.FileOutputStream output = new java.io.FileOutputStream( tempFile );
		addressBook.build().writeTo( output );
		output.close();

		AddressBookProtos.AddressBook bookFromFile = AddressBookProtos.AddressBook.parseFrom( new java.io.FileInputStream( tempFile ));
		for( AddressBookProtos.Person personFromFile : bookFromFile.getPeopleList() )
		{
			log.info( person.getId() + "\t" + person.getName() ); 
		}
	}
}
