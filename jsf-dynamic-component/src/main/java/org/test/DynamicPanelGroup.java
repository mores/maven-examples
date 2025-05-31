package org.test;

import java.io.Serializable;

import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;

@Named
@ViewScoped
public class DynamicPanelGroup implements Serializable
{
	private jakarta.faces.component.html.HtmlPanelGroup panelGroup;

	private jakarta.faces.context.FacesContext context;
	private jakarta.faces.application.Application application;

	public jakarta.faces.component.html.HtmlPanelGroup getStuff()
	{
		System.out.println( "getStuff" );

		context = jakarta.faces.context.FacesContext.getCurrentInstance();
		application = context.getApplication();

		panelGroup = new jakarta.faces.component.html.HtmlPanelGroup();

		jakarta.faces.application.ResourceHandler handler = application.getResourceHandler();

		dynamicallyAdd( handler, "whatever1.xhtml", "components/form", "compositeID1" );	
		dynamicallyAdd( handler, "whatever2.xhtml", "components/form", "compositeID2" );

		return( panelGroup );
	}

	private void dynamicallyAdd( jakarta.faces.application.ResourceHandler handler, String name, String library, String compositeId )
	{	
                jakarta.faces.application.Resource componentResource = handler.createResource( name, library ) ;
                if( componentResource != null )
                {
			jakarta.faces.component.UIComponent composite = application.createComponent( context, componentResource );

			composite.pushComponentToEL( context, composite );
			boolean compcompPushed = false;
			com.sun.faces.component.CompositeComponentStackManager ccStackManager = com.sun.faces.component.CompositeComponentStackManager.getManager( context );
			compcompPushed = ccStackManager.push( composite, com.sun.faces.component.CompositeComponentStackManager.StackType.TreeCreation );

			jakarta.faces.component.UIComponent compositeRoot = application.createComponent( jakarta.faces.component.UIPanel.COMPONENT_TYPE );
			composite.getAttributes().put( jakarta.faces.application.Resource.COMPONENT_RESOURCE_KEY, componentResource );
			compositeRoot.setRendererType( "jakarta.faces.Group" );
			composite.setId( compositeId );

			try
			{
				com.sun.faces.facelets.impl.DefaultFaceletFactory factory = (com.sun.faces.facelets.impl.DefaultFaceletFactory)com.sun.faces.util.RequestStateManager.get( context, com.sun.faces.util.RequestStateManager.FACELET_FACTORY);
				jakarta.faces.view.facelets.Facelet f = factory.getFacelet( context, componentResource.getURL() );
				f.apply( context, compositeRoot );
			}
			catch( Exception e )
			{
				e.printStackTrace();
    			}
				
			composite.getFacets().put( jakarta.faces.component.UIComponent.COMPOSITE_FACET_NAME, compositeRoot );

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
	}

	public void setStuff( jakarta.faces.component.html.HtmlPanelGroup pg )
	{
		System.out.println( "setStuff" );

		this.panelGroup = pg;
	}
}
