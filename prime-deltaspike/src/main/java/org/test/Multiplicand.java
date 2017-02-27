package org.test;

import java.io.Serializable;
import javax.inject.Named;
import org.apache.deltaspike.core.api.scope.WindowScoped;

@Named
@WindowScoped
public class Multiplicand implements Serializable {

	private java.math.BigDecimal value;

	public Multiplicand() {
		System.out.println("init");
	}

	public java.math.BigDecimal getValue() {
		System.out.println("Multiplicand - getValue: " + value);
		return value;
	}

	public void setValue(java.math.BigDecimal v) {
		System.out.println("Multiplicand - setValue: " + v);
		value = v;
	}
}
