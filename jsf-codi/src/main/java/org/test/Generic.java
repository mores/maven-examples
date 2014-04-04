package org.test;

import java.io.Serializable;

public class Generic implements Serializable {

    public void addPublicListener( javax.faces.event.ActionEvent ae )
    {
	System.out.println( "addPublicListener - works with weld 1.1.18.Final AND 2.1.2.Final" );
    }

    protected void addProtectedListener( javax.faces.event.ActionEvent ae )
    {
  	System.out.println( "addProtectedListener - works ONLY with weld 1.1.18.Final" );
    }
}
