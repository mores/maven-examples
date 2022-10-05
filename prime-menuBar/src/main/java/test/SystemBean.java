package test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;

@ManagedBean(name="SystemBean")
@ApplicationScoped
public class SystemBean implements java.io.Serializable 
{
	private String jsf;
	private String prime;

	public SystemBean()
	{
		jsf = Package.getPackage("com.sun.faces").getImplementationVersion();
		org.primefaces.config.PrimeEnvironment pe = new org.primefaces.config.PrimeEnvironment( javax.faces.context.FacesContext.getCurrentInstance() );
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
