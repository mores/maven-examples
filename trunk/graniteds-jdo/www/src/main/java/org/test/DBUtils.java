package org.test;

public class DBUtils {

        public DBUtils() {
        }

        public Object saveChanges( Object obj ) {

                Object oid = null;
                javax.jdo.PersistenceManager pm = JDOManager.getPersistenceManager( "datanucleus.properties" );
                try {
                        javax.jdo.Transaction tx = pm.currentTransaction();
                        tx.begin();

                        pm.makePersistent( obj );
                        oid = pm.getObjectId( obj );

                        tx.commit();
                }
                finally {
                        if( pm.currentTransaction().isActive() ) {
                                pm.currentTransaction().rollback();
                        }
                        pm.close();
                }
                return( oid );
        }
	
	public java.util.List getWelcomeHistory() {
		javax.jdo.PersistenceManager pm = JDOManager.getPersistenceManager( "datanucleus.properties" );
		javax.jdo.FetchPlan fetchPlan = pm.getFetchPlan();
                fetchPlan.addGroup( "withHeaders" );
		fetchPlan.addGroup( "withWelcome" );
		fetchPlan.setMaxFetchDepth( -1 );

                javax.jdo.Transaction tx = pm.currentTransaction();
                tx.begin();

                javax.jdo.Query query = pm.newQuery( org.test.Welcome.class );
		

                java.util.List result = (java.util.List)query.execute();
                if( result.size() > 0 ) {
                        result = (java.util.List)pm.detachCopyAll( result );
                }

                tx.commit();
                return( result );
        }
}
