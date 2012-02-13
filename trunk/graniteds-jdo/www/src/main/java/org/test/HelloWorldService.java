package org.test;

public class HelloWorldService {

    public String sayHello(String name) {
	DBUtils dbu = new DBUtils();
	Welcome newUser = new Welcome( name );
	dbu.saveChanges( newUser );
	
        return "Hello " + name + "!";
    }

    public java.util.List<Welcome> findWelcomeHistory() {
	DBUtils dbu = new DBUtils();
	return( dbu.getWelcomeHistory() );
    }
}
