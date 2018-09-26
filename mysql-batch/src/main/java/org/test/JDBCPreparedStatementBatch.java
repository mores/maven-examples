package org.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCPreparedStatementBatch {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( JDBCPreparedStatementBatch.class );

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps = null;
		String query = "insert into Employee (empId, name) values (?,?)";
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);

			int size = 10000;
			
			long start = System.currentTimeMillis();

			for(int i =0; i < size; i++){
				ps.setInt(1, i);
				ps.setString(2, "Name"+i);
				
				ps.addBatch();
				
				if(i%1000 == 0) ps.executeBatch();
			}
			ps.executeBatch();

			long end = System.currentTimeMillis();
			long diff = end - start;
			
			log.trace( "JDBCPreparedStatementBatch Time Taken = " + diff );

			java.math.BigDecimal seconds = new java.math.BigDecimal( diff ).divide( new java.math.BigDecimal( "1000" ), 2, java.math.RoundingMode.HALF_UP );
			java.math.BigDecimal perSecond = new java.math.BigDecimal( size ).divide( seconds, 2, java.math.RoundingMode.HALF_UP );

			log.trace( perSecond + " inserts per second" );
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
