package org.test;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.deltaspike.core.api.scope.ViewAccessScoped;

@Named( "BackingBean" )
@ViewAccessScoped
public class BackingBean implements java.io.Serializable
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( BackingBean.class );

	private String name;

	public BackingBean()
	{
		log.info( "init" );
		name = "init";
	}

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}
}
