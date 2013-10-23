package peter.db;

/**
 * <p>Title: OracleBench</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Me, Myself and I</p>
 * <p>Description: </p>
 * I made a base interface and have the threaded
 * benchmark use the interface, so that others
 * can extend it. Even though this is just for
 * the book, it is useful for future use. I wasn't
 * able to get JMeter 1.8 to work correctly with
 * Oracle, so I wrote this quick test based on
 * code I already had for the recipe site.<br>
 * People who don't want a rolling data source
 * can create a new class and implement these
 * methods.
 * @author Peter Lin
 * @version 0.1
 */
public interface IDataSource {
	
	/**
	 * Get the next query
	 */
	public String nextQuery();

	/**
	 * return the current query string
	 */
	public String currentQuery();
}
