package org.test;

import javax.faces.component.FacesComponent;

@FacesComponent(tagName = "helloWorldComponent", createTag = true, namespace = "http://test.org/component")
public class HelloWorldComponent extends javax.faces.component.UIComponentBase
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( HelloWorldComponent.class );

	@Override
	public String getFamily()
	{
		return "hello.world.component";
	}

	@Override
	public void encodeBegin( javax.faces.context.FacesContext context) throws java.io.IOException
	{
		javax.faces.application.Application application = context.getApplication();
                javax.el.ExpressionFactory ef = application.getExpressionFactory();

		javax.faces.context.ResponseWriter writer = context.getResponseWriter();
		writer.write("Hello World!");

		String value = (String)getAttributes().get( "value" );
		log.info( "Value: " + value );

		org.primefaces.component.panel.Panel panel = new org.primefaces.component.panel.Panel();
		panel.setHeader( value );
		panel.setFooter( "footer" );
		panel.setParent( this );

		org.primefaces.component.commandlink.CommandLink page2 = new org.primefaces.component.commandlink.CommandLink();
		page2.setActionExpression( ef.createMethodExpression( context.getELContext(), "page2.jsf", null, new Class[0] ) );
		page2.setAjax( false );
		page2.setValue( "Page 2" );
		panel.getChildren().add( page2 );

		panel.encodeBegin( context );
		panel.encodeEnd( context );
	}
}
