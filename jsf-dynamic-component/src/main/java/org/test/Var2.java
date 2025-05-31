package org.test;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named
@SessionScoped
public class Var2 implements Serializable {

    private String var;

    public Var2() {
	System.out.println( "init" );
    }

    public String getVar() {
	return var;
    }

    public void setVar( String v ) {
 	var = v;
    }
}
