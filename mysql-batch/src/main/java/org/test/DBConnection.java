package org.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

	public static Connection getConnection() {
		Properties props = new Properties();
		Connection con = null;
		try {
			java.lang.ClassLoader cl = Thread.currentThread().getContextClassLoader();
			java.io.InputStream istream = cl.getResourceAsStream( "db.properties" );

			if( istream == null )
			{
				ClassLoader applicationClassLoader = DBConnection.class.getClassLoader();
				istream = applicationClassLoader.getResourceAsStream( "db.properties" );
			}

			props.load(istream);

			// load the Driver Class
			Class.forName(props.getProperty("DB_DRIVER_CLASS"));

			// create the connection now
			con = DriverManager.getConnection(props.getProperty("DB_URL"),
					props.getProperty("DB_USERNAME"),
					props.getProperty("DB_PASSWORD"));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
