package org.test;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.lifecycle.ClientWindowScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@SessionScoped
@Named
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
