package org.test;

/*

	JSF resource injection issue

	Working scenarios will display jquery like this:
		<head> ...  <script type="text/javascript" src="/pro/javax.faces.resource/jquery/jquery.js.jsf?ln=primefaces"></script> ...   </head>

	Broken scenarios will display jquery at the very end of the html output like this:

		</body></html>    <script type="text/javascript" src="/pro/javax.faces.resource/jquery/jquery.js.jsf?ln=primefaces"></script>

	The component contains:
	@ResourceDependencies({
		@ResourceDependency(library="primefaces", name="jquery/jquery.js"),
		@ResourceDependency(library="primefaces", name="primefaces.js")
	})

	Working stacks:
		Mojarra 2.0.9 + weld + CODI
		Mojarra 2.1.6 + weld + CODI
		Mojarra 2.1.7 + weld + CODI
		Mojarra 2.1.13

	Broken stacks:
		Mojarra 2.1.8 + weld + CODI
		Mojarra 2.1.10 + weld + CODI
		Mojarra 2.1.13 + weld + CODI
		Mojarra 2.1.13 + OpenWebBeans + CODI


	This class will make the broken stacks work 

	*/

public class CdiClassDeactivator extends org.apache.myfaces.extensions.cdi.core.api.activation.AbstractClassDeactivator 
{
	@Override
        protected void deactivateClasses()
        {
                addDeactivatedClass( org.apache.myfaces.extensions.cdi.jsf2.impl.scope.conversation.CodiRenderKitFactory.class );
        }
}
