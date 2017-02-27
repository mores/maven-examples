package org.test;

import java.io.Serializable;
import javax.inject.Inject;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named
@SessionScoped
public class Product implements Serializable {

	@Inject
	private Multiplicand multiplicand;

	@Inject
	private Multiplier multiplier;

	public Product() {
		System.out.println("init");
	}

	public java.math.BigDecimal getValue() {

		java.math.BigDecimal value = null;
		try {
			value = multiplier.getValue().multiply(multiplicand.getValue());
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return value;
	}
}
