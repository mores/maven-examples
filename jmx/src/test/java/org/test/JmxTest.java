package org.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JmxTest
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( JmxTest.class );

	public static final String HOST = "";
	public static final String PORT = "";
	public static final String WAR = "";

	private static final String USER = "";
	private static final String PASS = "";

	private javax.management.MBeanServerConnection mbeanServerConnection;
	private javax.management.ObjectName objectName;

        @Before
        public void before()
        {
                log.trace( "before" );
        }

        @Test
        public void test() throws Exception
        {
		log.trace( "test" );
		javax.management.remote.JMXServiceURL url = new javax.management.remote.JMXServiceURL( "service:jmx:rmi:///jndi/rmi://" + HOST + ":" + PORT + "/jmxrmi" );

		java.util.Hashtable<String, String[]> env = new java.util.Hashtable<String, String[]>();
		String[] credentials = new String[] { USER, PASS };
		env.put( javax.management.remote.JMXConnector.CREDENTIALS, credentials);

		javax.management.remote.JMXConnector jmxConnector = javax.management.remote.JMXConnectorFactory.connect( url, env );
		mbeanServerConnection = jmxConnector.getMBeanServerConnection();
		objectName = new javax.management.ObjectName("Catalina:type=Manager,context=/" + WAR + ",host=localhost" );

		details( "activeSessions" );
		details( "maxActive" );
	}

	private void details( String attr ) throws Exception
	{
		log.trace( attr + "\t" + mbeanServerConnection.getAttribute( objectName, attr ) );
	}
}
