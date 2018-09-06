package org.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCStatementBatch {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( JDBCStatementBatch.class );

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;

		try {
			con = DBConnection.getConnection();
			stmt = con.createStatement();

			long start = System.currentTimeMillis();
			for(int i =0; i<10000;i++){
				String query = "insert into Employee values ("+i+",'Name"+i+"')";
				stmt.addBatch(query);

				//execute and commit batch of 1000 queries
				if(i%1000 ==0) stmt.executeBatch();
			}
			//commit remaining queries in the batch
			stmt.executeBatch();

			log.trace( "JDBCStatementBatch Time Taken = "+(System.currentTimeMillis()-start));

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
