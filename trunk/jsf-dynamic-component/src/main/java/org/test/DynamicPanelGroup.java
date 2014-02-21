package org.test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="DynamicPanelGroup")
@ViewScoped
public class DynamicPanelGroup
{
	private javax.faces.component.html.HtmlPanelGroup panelGroup;

	public javax.faces.component.html.HtmlPanelGroup getStuff()
	{
		System.out.println( "getStuff" );

		javax.faces.context.FacesContext context = javax.faces.context.FacesContext.getCurrentInstance();
		javax.faces.application.Application application = context.getApplication();

		panelGroup = new javax.faces.component.html.HtmlPanelGroup();

		javax.faces.application.ResourceHandler handler = application.getResourceHandler();
                javax.faces.application.Resource componentResource = handler.createResource( "whatever.xhtml", "components/form" ) ;
                if( componentResource != null )
                {
			javax.faces.component.UIComponent composite = application.createComponent( context, componentResource );

			composite.pushComponentToEL( context, composite );
			boolean compcompPushed = false;
			com.sun.faces.component.CompositeComponentStackManager ccStackManager = com.sun.faces.component.CompositeComponentStackManager.getManager( context );
			compcompPushed = ccStackManager.push( composite, com.sun.faces.component.CompositeComponentStackManager.StackType.TreeCreation );

			javax.faces.component.UIComponent compositeRoot = application.createComponent( javax.faces.component.UIPanel.COMPONENT_TYPE );
			composite.getAttributes().put( javax.faces.application.Resource.COMPONENT_RESOURCE_KEY, componentResource );
			compositeRoot.setRendererType( "javax.faces.Group" );
			composite.setId( "compositeID" );

			try
			{
				com.sun.faces.facelets.impl.DefaultFaceletFactory factory = (com.sun.faces.facelets.impl.DefaultFaceletFactory)com.sun.faces.util.RequestStateManager.get( context, com.sun.faces.util.RequestStateManager.FACELET_FACTORY);
				javax.faces.view.facelets.Facelet f = factory.getFacelet( context, componentResource.getURL() );
				f.apply( context, compositeRoot );
			}
			catch( Exception e )
			{
				e.printStackTrace();
    			}
				
			composite.getFacets().put( javax.faces.component.UIComponent.COMPOSITE_FACET_NAME, compositeRoot );

			panelGroup.getChildren().add(composite);

			composite.popComponentFromEL( context );
			if( compcompPushed )
			{
				ccStackManager.pop( com.sun.faces.component.CompositeComponentStackManager.StackType.TreeCreation );
			}
                }
                else
                {
                        System.err.println( "Resource was null" );
                }	

		return( panelGroup );
	}

	public void setStuff( javax.faces.component.html.HtmlPanelGroup pg )
	{
		System.out.println( "setStuff" );

		this.panelGroup = pg;
	}
}
