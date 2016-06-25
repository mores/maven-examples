package org.test;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named
@SessionScoped
public class Multiplier implements Serializable {

    private java.math.BigDecimal value;

    public Multiplier() {
	System.out.println( "init" );
    }

    public java.math.BigDecimal getValue() {
        System.out.println( "Multiplier - getValue: " + value );
	return value;
    }

    public void setValue( java.math.BigDecimal v ) {
	System.out.println( "Multiplier - setValue: " + v );
 	value = v;
    }
}
