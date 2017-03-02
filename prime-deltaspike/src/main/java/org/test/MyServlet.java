package org.test;

import javax.servlet.annotation.WebServlet;

import javax.inject.Inject;

@WebServlet(name = "MyServlet", urlPatterns = {"/MyServlet"})
public class MyServlet extends javax.servlet.http.HttpServlet {

	@Inject
	private org.apache.deltaspike.core.spi.scope.window.WindowContext windowContext;

	@Inject
	private Multiplicand multiplicand;

	@Inject
	private Multiplier multiplier;

	@Inject
	private Product product;

	@Override
	protected void doGet(javax.servlet.http.HttpServletRequest request,
			javax.servlet.http.HttpServletResponse response)
			throws javax.servlet.ServletException {
		System.out.println("doGet");

		windowContext.activateWindow("abc123");

		System.out.println("multiplicand: " + multiplicand);
		multiplicand.setValue(new java.math.BigDecimal(request
				.getParameter("multiplicand")));
		System.out.println("multiplier: " + multiplier);
		multiplier.setValue(new java.math.BigDecimal(request
				.getParameter("multiplier")));
		System.out.println("product: " + product);
		System.out.println("survey says: " + product.getValue());

		try {
			java.io.PrintWriter out = response.getWriter();
			out.println(product.getValue());
		} catch (Exception e) {
			System.out.println("Exception is :" + e);
		}
	}
}
