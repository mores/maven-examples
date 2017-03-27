package org.test;

import javax.servlet.annotation.WebServlet;

import javax.inject.Inject;

@WebServlet(name = "MyServlet", urlPatterns = {"/MyServlet"})
public class MyServlet extends javax.servlet.http.HttpServlet {

	@Inject
	private javax.faces.lifecycle.Lifecycle lifecycle;

	@Inject
	private javax.faces.context.FacesContextFactory fcFactory;

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

		javax.faces.context.FacesContext context = fcFactory.getFacesContext(
				getServletContext(), request, response, lifecycle);

		windowContext.activateWindow("abc123");

		System.out.println("multiplicand: " + multiplicand);
		multiplicand.setValue(new java.math.BigDecimal(request
				.getParameter("multiplicand")));
		System.out.println("multiplier: " + multiplier);
		multiplier.setValue(new java.math.BigDecimal(request
				.getParameter("multiplier")));
		System.out.println("product: " + product);
		java.math.BigDecimal productValue = product.getValue();
		System.out.println("survey says: " + productValue);

		try {
			java.io.PrintWriter out = response.getWriter();
			out.println(productValue);

			for (javax.faces.application.FacesMessage msg : context
					.getMessageList()) {

				String errMsg = msg.getSummary();
				out.println("Faces Error: " + errMsg);
			}
			out.flush();
		} catch (Exception e) {
			java.io.StringWriter sw = new java.io.StringWriter();
			java.io.PrintWriter pw = new java.io.PrintWriter(sw);
			e.printStackTrace(pw);

			System.out.println("Exception is :" + sw.toString());
		}
	}
}
