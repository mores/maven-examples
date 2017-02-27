package org.test;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.apache.deltaspike.cdise.api.ContextControl;
import org.apache.deltaspike.core.spi.scope.window.WindowContext;
import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CdiTestRunner.class)
public class TestMultiplication {

	@Inject
	private WindowContext windowContext;

	@Inject
	private ContextControl contextControl;

	@Inject
	Multiplicand multiplicand;

	@Inject
	Multiplier multiplier;

	@Inject
	Product product;

	@Test
	public void testMultiply() {

		contextControl.startContext(RequestScoped.class);
		windowContext.activateWindow("testWindow");

		multiplicand.setValue(new java.math.BigDecimal("3"));

		multiplier.setValue(new java.math.BigDecimal("7"));

		java.math.BigDecimal value = product.getValue();
		System.out.println("value: " + value);

		Assert.assertTrue(value.compareTo(new java.math.BigDecimal("21")) == 0);

		contextControl.stopContext(RequestScoped.class);

	}
}
