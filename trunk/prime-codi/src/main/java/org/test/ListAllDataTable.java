package org.test;

import java.io.Serializable;
import javax.inject.Named;
import org.apache.myfaces.extensions.cdi.core.api.scope.conversation.WindowScoped;

@Named
@WindowScoped
public class ListAllDataTable implements Serializable
{
	private java.util.List attrs;

	public ListAllDataTable()
	{
		attrs = new java.util.Vector();
		attrs.add( new SimpleAttribute( "A 1 2 3" ) );
		attrs.add( new SimpleAttribute( "B 2 4 6" ) );
		System.out.println( "Number of attrs: " + attrs.size() );
	}

	public java.util.List getAttrs()
        {
		return( attrs );
        }
}	
