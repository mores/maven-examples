package test;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.lifecycle.ClientWindowScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped
@Named
public class SystemBean implements java.io.Serializable 
{
	private String jsf;
	private String prime;

	public SystemBean()
	{
		jsf = Package.getPackage("com.sun.faces").getImplementationVersion();
		org.primefaces.config.PrimeEnvironment pe = new org.primefaces.config.PrimeEnvironment( jakarta.faces.context.FacesContext.getCurrentInstance() );
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
