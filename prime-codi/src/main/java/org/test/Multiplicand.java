package org.test;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named
@SessionScoped
public class Multiplicand implements Serializable {

    private java.math.BigDecimal value;

    public Multiplicand() {
	System.out.println( "init" );
    }

    public java.math.BigDecimal getValue() {
        System.out.println( "Multiplicand - getValue: " + value );
	return value;
    }

    public void setValue( java.math.BigDecimal v ) {
	System.out.println( "Multiplicand - setValue: " + v );
 	value = v;
    }
}
