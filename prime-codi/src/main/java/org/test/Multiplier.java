package org.test;

import java.io.Serializable;
import javax.inject.Named;
import org.apache.deltaspike.core.api.scope.ViewAccessScoped;

@Named
@ViewAccessScoped
public class Multiplier implements Serializable {

	private java.math.BigDecimal value;

	public Multiplier() {
		System.out.println("init");
	}

	public java.math.BigDecimal getValue() {
		System.out.println("Multiplier - getValue: " + value);
		return value;
	}

	public void setValue(java.math.BigDecimal v) {
		System.out.println("Multiplier - setValue: " + v);
		value = v;
	}
}
