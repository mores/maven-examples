package org.test;

import javax.faces.component.FacesComponent;

@FacesComponent(tagName = "helloWorldComponent", createTag = true, namespace = "http://test.org/component")
public class HelloWorldComponent extends javax.faces.component.UIComponentBase
{
	@Override
	public String getFamily()
	{
		return "hello.world.component";
	}

	@Override
	public void encodeBegin( javax.faces.context.FacesContext context) throws java.io.IOException
	{
		javax.faces.context.ResponseWriter writer = context.getResponseWriter();
		writer.write("Hello World!");
	}
}
