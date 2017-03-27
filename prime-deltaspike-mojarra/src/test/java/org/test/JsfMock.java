package org.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.faces.application.Application;
import javax.faces.component.UIViewRoot;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mockito.Mockito;
import org.primefaces.context.RequestContext;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class JsfMock implements TestRule {

	public FacesContext mockFacesContext;
	public UIViewRoot mockViewRoot;
	public Application mockApplication;
	public ExternalContext mockExternalContext;
	public HttpSession mockHttpSession;
	public HttpServletRequest mockHttpServletRequest;
	public HttpServletResponse mockHttpServletResponse;
	public javax.servlet.ServletConfig mockServletConfig;
	public javax.servlet.ServletContext mockServletContext;

	@Override
	public Statement apply(final Statement base, final Description description) {
		return new Statement() {
			@Override
			public void evaluate() throws Throwable {
				init();
				try {
					base.evaluate();
				} finally {
					mockFacesContext.release();
				}
			}
		};
	}

	protected void init() {
		mockServletContext = new org.apache.myfaces.test.mock.MockServletContext();
		mockServletConfig = new org.apache.myfaces.test.mock.MockServletConfig(
				mockServletContext);

		mockFacesContext = FacesContextMocker.mockFacesContext();
		mockApplication = Mockito.mock(Application.class);
		mockViewRoot = Mockito.mock(UIViewRoot.class);
		mockHttpServletRequest = Mockito.mock(HttpServletRequest.class);
		mockHttpServletResponse = Mockito.mock(HttpServletResponse.class);
		mockExternalContext = new org.apache.myfaces.test.mock.MockExternalContext(
				mockServletContext, mockHttpServletRequest,
				mockHttpServletResponse);
		mockHttpSession = Mockito.mock(HttpSession.class);

		Mockito.when(mockFacesContext.getApplication()).thenReturn(
				mockApplication);
		Mockito.when(mockApplication.getSupportedLocales()).thenReturn(
				createLocales().iterator());

		Mockito.when(mockFacesContext.getViewRoot()).thenReturn(mockViewRoot);
		Mockito.when(mockViewRoot.getLocale()).thenReturn(new Locale("en"));

		Mockito.when(mockFacesContext.getExternalContext()).thenReturn(
				mockExternalContext);
		Mockito.when(mockHttpServletRequest.getSession()).thenReturn(
				mockHttpSession);

		Map<String, String> requestMap = new HashMap<String, String>();
	}

	private List<Locale> createLocales()
	{
		ArrayList<Locale> locales = new ArrayList<>();
		locales.add( new Locale( "en" ) );
		return locales;
	}
}
