package org.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JDBCStatementTest
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( JDBCStatementTest.class );

	@Before
	public void before()
	{
		log.trace( "before" );

		Connection con = null;
                Statement stmt = null;

                try {
                        con = DBConnection.getConnection();
                        stmt = con.createStatement();

			String query = "CREATE TABLE `Employee` ( `empId` int(10) unsigned NOT NULL, `name` varchar(10) DEFAULT NULL, PRIMARY KEY (`empId`)) ENGINE=InnoDB DEFAULT CHARSET=utf8;";
			stmt.execute(query);

                } catch (SQLException e) {
                        e.printStackTrace();
                }finally{
                        try {
                                stmt.close();
                                con.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                }
	}

	@Test
	public void testJDBCStatement()
	{
		log.trace( "testJDBCStatement" );

		String[] args = new String[0];
		JDBCStatement.main( args );
	}

	@Test
        public void testJDBCStatementBatch()
	{
		log.trace( "testJDBCStatementBatch" );

                String[] args = new String[0];
                JDBCStatementBatch.main( args );
        }

	@Test
        public void testJDBCPreparedStatement()
	{
		log.trace( "testJDBCPreparedStatement" );

                String[] args = new String[0];
		JDBCPreparedStatement.main( args );
	}

	@Test
        public void testJDBCPreparedStatementBatch()
	{
		log.trace( "testJDBCPreparedStatementBatch" );

		String[] args = new String[0];
		JDBCPreparedStatementBatch.main( args );
	}

	@After
	public void after()
	{
		log.trace( "after" );

		Connection con = null;
                Statement stmt = null;

                try {
                        con = DBConnection.getConnection();
                        stmt = con.createStatement();

                        String query = "DROP TABLE `Employee`";
                        stmt.execute(query);

                } catch (SQLException e) {
                        e.printStackTrace();
                }finally{
                        try {
                                stmt.close();
                                con.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                }
	}
}
