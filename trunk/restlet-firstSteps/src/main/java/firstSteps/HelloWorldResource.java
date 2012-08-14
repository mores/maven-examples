package firstSteps;  
  
import org.restlet.resource.Get;  
  
/** 
 * Resource which has only one representation. 
 *  
 */  
public class HelloWorldResource extends org.restlet.resource.ServerResource {  
  
    @Get  
    public String represent() {  
        return "hello, world";  
    }  
  
}  
