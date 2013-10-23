package peter.db;

import java.io.*;
import java.net.*;

/**
 * <p>Title: RollingDataSource</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Me, Myself and I</p>
 * <p>Description: </p>
 * RollingDataSource will open a file containing a list
 * of queries. getNextQuery() will return the next line
 * and getCurrentQuery() will return the current line.
 * @author Peter Lin
 * @version 0.1
 */
public class RollingDataSource implements IDataSource {

	private BufferedReader READER = null;
	private File QUERIES = null;

	public String QUERY_FILE = "query_file.dat";
	public String STATIC_QUERY = "select table_names from user_tables";

	/**
	 * Constructor for RollingDataSource.
	 */
	public RollingDataSource(String file) {
		if (file != null) {
			this.QUERY_FILE = file;
		}
		this.loadQueries();
	}

	/**
	 * nextQuery will read the next line in the file. If there isn't
	 * another line, it will attempt to go back to the beginning of
	 * the file and continue returning lines. This way, a person can
	 * provide as many unique queries as they like and run the test
	 * for n iterations.
	 * @return String sql query statement
	 */
	public String nextQuery() {
		try {
			String nquery = this.READER.readLine();
			if (nquery == null) {
				this.READER.close();
				this.loadQueries();
				nquery = this.READER.readLine();
			}
			return nquery;
		} catch (Exception exception) {
			return this.STATIC_QUERY;
		}
	}

	/**
	 * @see peter.db.IDataSource#currentQuery()
	 */
	public String currentQuery() {
		return null;
	}

	/**
	 * Load the queries
	 */
	public void loadQueries(){
		try {
			if (this.QUERIES == null) {
				this.QUERIES = new File(this.QUERY_FILE);
			}
			this.READER = new BufferedReader(new FileReader(this.QUERIES));
		} catch (Exception exception) {
			System.out.println("Invalid Query File. Please double check the path and try again");
			System.exit(0);
		}
	}

	/**
	 * Get the writer for the log file
	 * @param File file
	 * @return FileWriter writer
	 */
	public FileWriter getWriter(File file) {
		try {
			return new FileWriter(file,true);
		} catch (Exception e) {
			return null;
		}
	}
		
	/**
	 * Main method for testing
	 */
	public static void main(String[] args) {
		RollingDataSource dsource = new RollingDataSource("query_file.dat");
		for(int idx=0; idx < 20; idx++) {
			System.out.println("next query:" + dsource.nextQuery());
		}
	}
}
