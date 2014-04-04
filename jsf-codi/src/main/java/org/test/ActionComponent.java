package org.test;

import javax.faces.component.FacesComponent;

/*
	Used to allow a listener to exist in a composite component
*/
@FacesComponent(value="ActionComponent")
public class ActionComponent extends javax.faces.component.UIComponentBase implements javax.faces.component.NamingContainer
{
	@Override
	public String getFamily()
	{
		return( "javax.faces.NamingContainer" );
	}

	public void addActionListener( javax.faces.event.ActionEvent event )
	{
		javax.faces.context.FacesContext context = javax.faces.context.FacesContext.getCurrentInstance();

		java.util.Map<java.lang.String,java.lang.Object> attrs = getAttributes();
		javax.el.MethodExpression handleChanges = (javax.el.MethodExpression)attrs.get( "addActionListener" );
		handleChanges.invoke( context.getELContext(), new Object[] {event});
	}
}
