package org.test;

public class HelloWorldService {

    private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( HelloWorldService.class );

    public String sayHello(String name) {

	DBUtils dbu = new DBUtils();
        Welcome newUser = new Welcome( name );

	org.granite.context.GraniteContext gc = org.granite.context.GraniteContext.getCurrentInstance();
	if( gc instanceof org.granite.messaging.webapp.HttpGraniteContext ) {
		log.debug( "This is HTTP Granite !" );
		org.granite.messaging.webapp.HttpGraniteContext hgc = (org.granite.messaging.webapp.HttpGraniteContext)gc;

		javax.servlet.http.HttpServletRequest request = hgc.getRequest();

		for( java.util.Enumeration names = request.getHeaderNames(); names.hasMoreElements(); ) {
			String headerName = (String)names.nextElement();
			String headerValue = request.getHeader( headerName );
			log.debug( headerName + ": " + headerValue );
			Header header = new Header( headerName, headerValue );
			header.setWelcome( newUser );
			newUser.getHeaders().add( header );
		}
	}

	dbu.saveChanges( newUser );
	
        return "Hello " + name + "!";
    }

    public java.util.List<Welcome> findWelcomeHistory() {
	DBUtils dbu = new DBUtils();
	return( dbu.getWelcomeHistory() );
    }
}
