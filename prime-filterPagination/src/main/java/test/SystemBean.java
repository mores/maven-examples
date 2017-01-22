package test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;

import org.primefaces.context.RequestContext;

@ManagedBean(name="SystemBean")
@ApplicationScoped
public class SystemBean implements java.io.Serializable 
{
	private String jsf;
	private String prime;

	public SystemBean()
	{
		jsf = Package.getPackage("com.sun.faces").getImplementationVersion();
		prime = RequestContext.getCurrentInstance().getApplicationContext().getConfig().getBuildVersion();
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
