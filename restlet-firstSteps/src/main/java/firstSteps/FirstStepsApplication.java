package firstSteps;  
  
public class FirstStepsApplication extends org.restlet.Application {
  
    /** 
     * Creates a root Restlet that will receive all incoming calls. 
     */  
    @Override  
    public synchronized org.restlet.Restlet createInboundRoot() {  
        // Create a router Restlet that routes each call to a  
        // new instance of HelloWorldResource.  
        org.restlet.routing.Router router = new org.restlet.routing.Router(getContext());  

	org.restlet.ext.swagger.Swagger2SpecificationRestlet swagger2SpecificationRestlet = new org.restlet.ext.swagger.Swagger2SpecificationRestlet(this);
	try {
		String hostName = java.net.InetAddress.getLocalHost().getHostName();
		swagger2SpecificationRestlet.setBasePath( "http://" + hostName + ":9090/firstSteps/" );
	} catch ( Exception e ) {
		e.printStackTrace();
	}
	swagger2SpecificationRestlet.attach(router,"/api-docs");
  
        // Defines only one route  
        router.attach("/hello", HelloWorldResource.class);  
  
        return router;  
    }  
  
}  
