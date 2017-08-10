package firstSteps;  
  
public class FirstStepsApplication extends org.restlet.ext.swagger.SwaggerApplication {
  
    /** 
     * Creates a root Restlet that will receive all incoming calls. 
     */  
    @Override  
    public synchronized org.restlet.Restlet createInboundRoot() {  
        // Create a router Restlet that routes each call to a  
        // new instance of HelloWorldResource.  
        org.restlet.routing.Router router = new org.restlet.routing.Router(getContext());  
  
        // Defines only one route  
        router.attach("/hello", HelloWorldResource.class);  
  
        return router;  
    }  
  
}  
