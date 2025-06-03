package test;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.enterprise.context.ApplicationScoped;

@Named( "SystemBean" )
@ApplicationScoped
public class SystemBean implements java.io.Serializable 
{
	private String jsf;
	private String prime;

	public SystemBean()
	{
		jsf = Package.getPackage("com.sun.faces").getImplementationVersion();

		jakarta.faces.context.FacesContext context = jakarta.faces.context.FacesContext.getCurrentInstance();
		org.primefaces.context.PrimeRequestContext requestContext = org.primefaces.context.PrimeRequestContext.getCurrentInstance(context);
		org.primefaces.context.PrimeApplicationContext applicationContext = requestContext.getApplicationContext();

		org.primefaces.config.PrimeEnvironment pe = applicationContext.getEnvironment();

		prime = pe.getBuildVersion();
	}

	public String getJsfVersion()
	{
		return jsf;
	}

	public String getPrimeVersion()
	{
		return prime;
	}
}
