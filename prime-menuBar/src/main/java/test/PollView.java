package org.test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean( name = "PollView" )
@SessionScoped
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
