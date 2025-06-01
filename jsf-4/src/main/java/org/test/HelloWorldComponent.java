package org.test;

import jakarta.faces.component.FacesComponent;

@FacesComponent(tagName = "helloWorldComponent", createTag = true, namespace = "http://test.org/component")
public class HelloWorldComponent extends jakarta.faces.component.UICommand
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( HelloWorldComponent.class );

	public HelloWorldComponent() {
		super();
	}

        @Override
        public String getFamily()
        {
                return "hello.world.component";
        }

        @Override
        public void encodeBegin( jakarta.faces.context.FacesContext context) throws java.io.IOException
        {
		super.encodeBegin(context);

                jakarta.faces.application.Application application = context.getApplication();
                jakarta.el.ExpressionFactory ef = application.getExpressionFactory();

                jakarta.faces.context.ResponseWriter writer = context.getResponseWriter();
                writer.write("Hello World!");
		writer.write("</br>");

		org.primefaces.component.panel.Panel panel = new org.primefaces.component.panel.Panel();
                panel.setHeader( "Header" );
                panel.setFooter( "footer" );
		this.getChildren().add(panel);

		jakarta.faces.component.html.HtmlCommandLink page2 = (jakarta.faces.component.html.HtmlCommandLink)application.createComponent(jakarta.faces.component.html.HtmlCommandLink.COMPONENT_TYPE);

		jakarta.el.MethodExpression ae = getActionExpression();
		log.info( "AE: " +ae );
		page2.setActionExpression( ae );

		jakarta.el.ValueExpression ve = getValueExpression("value");
		log.info( "VE: " + ve );
		page2.setValue( ve.getValue( context.getELContext() ) );

		panel.getChildren().add(page2);
        }
}
