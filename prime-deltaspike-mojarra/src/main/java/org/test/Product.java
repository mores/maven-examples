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
		System.out.println("product init");
	}

	public java.math.BigDecimal getValue() {

		java.math.BigDecimal value = null;
		try {
			value = multiplier.getValue().multiply(multiplicand.getValue());

			if (value.compareTo(java.math.BigDecimal.valueOf(500)) > 0) {
				System.out.println("Over limit");
				javax.faces.application.FacesMessage errorMsg = new javax.faces.application.FacesMessage(
						"Over limit. Management approval required");
				javax.faces.context.FacesContext.getCurrentInstance()
						.addMessage(null, errorMsg);
			}

		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return value;
	}
}
