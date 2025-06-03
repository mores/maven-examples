package org.test;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.faces.lifecycle.ClientWindowScoped;

@Named( "PollView" )
@ClientWindowScoped
public class PollView implements java.io.Serializable {

    private int number;

    public PollView()
    {
        System.out.println( "init" );
    }

    public void increment() {
        System.out.println( "increment" );
        number++;
    }

    public int getNumber() {
        System.out.println( "getNumber" );
        return number;
    }
}
