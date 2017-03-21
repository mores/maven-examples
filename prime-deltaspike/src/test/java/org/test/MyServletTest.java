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
		javax.servlet.ServletContext servletContext = new org.apache.myfaces.test.mock.MockServletContext();
		javax.servlet.ServletConfig servletConfig = new org.apache.myfaces.test.mock.MockServletConfig(
				servletContext);
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

		String fileContents = org.apache.commons.io.FileUtils.readFileToString(
				new java.io.File("somefile.txt"), "UTF-8");
		System.out.println("\n -- \n" + fileContents + "\n -- \n");

		org.junit.Assert.assertTrue(fileContents.contains("4565.8"));
		org.junit.Assert
				.assertTrue(fileContents
						.contains("Faces Error: Over limit. Management approval required"));
	}
}
