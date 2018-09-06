package org.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCPreparedStatement {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( JDBCPreparedStatement.class );

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps = null;
		String query = "insert into Employee (empId, name) values (?,?)";
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			
			long start = System.currentTimeMillis();
			for(int i =0; i<10000;i++){
				ps.setInt(1, i);
				ps.setString(2, "Name"+i);
				ps.executeUpdate();
			}
			log.trace( "JDBCPreparedStatement Time Taken = "+(System.currentTimeMillis()-start));
			
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
