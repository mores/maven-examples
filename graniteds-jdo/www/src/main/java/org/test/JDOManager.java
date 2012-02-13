package org.test;

public class JDOManager {

    private static javax.jdo.PersistenceManagerFactory pmf;

    public static javax.jdo.PersistenceManager getPersistenceManager( String config ) {
        if( pmf == null ) {
            pmf = javax.jdo.JDOHelper.getPersistenceManagerFactory( config );    
        }

        return pmf.getPersistenceManager();
    }

    public static javax.jdo.PersistenceManagerFactory getPersistenceManagerFactory( String config ) {
	if( pmf == null ) {
	    pmf = javax.jdo.JDOHelper.getPersistenceManagerFactory( config );
        }

	return pmf;
    }
}
