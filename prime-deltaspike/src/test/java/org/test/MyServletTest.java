package org.test;

import javax.inject.Inject;

import org.apache.deltaspike.cdise.api.ContextControl;
import org.apache.deltaspike.core.spi.scope.window.WindowContext;
import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.Test;

import org.mockito.InjectMocks;
import org.mockito.Mock;

@RunWith(CdiTestRunner.class)
public class MyServletTest {

	@Inject
	private org.apache.deltaspike.cdise.api.ContextControl contextControl;

	@Inject
	private MyServlet myServlet;

	@After
	public void teardown() {
		contextControl
				.stopContext(javax.enterprise.context.ConversationScoped.class);
	}

	@Before
	public void init() {
		org.mockito.MockitoAnnotations.initMocks(this);

		contextControl
				.startContext(javax.enterprise.context.ConversationScoped.class);
	}

	@Test
	public void testServlet() throws Exception {
		final javax.servlet.ServletConfig servletConfig = org.mockito.Mockito
				.mock(javax.servlet.ServletConfig.class);
		myServlet.init(servletConfig);

		javax.servlet.http.HttpServletRequest request = org.mockito.Mockito
				.mock(javax.servlet.http.HttpServletRequest.class);
		javax.servlet.http.HttpServletResponse response = org.mockito.Mockito
				.mock(javax.servlet.http.HttpServletResponse.class);

		org.mockito.Mockito.when(request.getParameter("multiplicand"))
				.thenReturn("1234");
		org.mockito.Mockito.when(request.getParameter("multiplier"))
				.thenReturn("3.7");

		java.io.PrintWriter writer = new java.io.PrintWriter("somefile.txt");
		org.mockito.Mockito.when(response.getWriter()).thenReturn(writer);

		myServlet.doGet(request, response);
		writer.flush();
		org.junit.Assert.assertTrue(org.apache.commons.io.FileUtils
				.readFileToString(new java.io.File("somefile.txt"), "UTF-8")
				.contains("4565.8"));
	}
}
