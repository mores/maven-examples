package org.test;

import java.io.Serializable;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@SessionScoped
@Named
public class Var1 implements Serializable {

    private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( Var1.class );

    private String var = "Page2";

    public Var1() {
	log.info( "init" );
    }

    public String getVar() {
	return var;
    }

    public void setVar( String v ) {
 	var = v;
    }
 
    public String navigate() {
        log.info( "navigate" );
        return "greeting.jsf";
    }
}
