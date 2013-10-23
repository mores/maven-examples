
/**
 * <p>Title: IDBManager</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Me, Myself and I</p>
 * <p>Description: </p>
 * Generator is responsible for generating a node representing a HTTP request.
 * It takes query string representing request parameter name/value pairs and
 * converts it into an argument node, which is then used by JMeter.<p>
 * <pre>
 * </pre>
 *
 * @author Peter Lin
 * @version 0.1
 */

 package peter.db;

import java.sql.*;

/**
 * Database interface for the DBManager<p>
 *
 * This is here to help prevent application from waiting
 * for database resources. It should make it easier to
 * manage the database connections and keep the system
 * going.<p>
 */

public interface IDBManager {

	/**
	 * executes sql statement and returns resultset
	 * @param p_sSQLStatement
	 * @return ResultSet
	 */
	public ResultSet execSQLQuery(String p_sSQLStatement) throws SQLException;

	/**
	 * executes sql statement and returns resultset
	 * @param p_sSQLStatement
	 * @param int p_iType
	 * @param int p_iConcurrency
	 * @return ResultSet
	 */
	public ResultSet execSQLQuery(
		String p_sSQLStatement,
		int p_iType,
		int p_iConcurrency)
		throws SQLException;

	/**
	 * executes an update sql statement and returns resultset
	 * @param p_sSQLStatement
	 * @return ResultSet
	 */
	public ResultSet updateSQLQuery(String p_sSQLStatement)
		throws SQLException;

	/**
	 * executes an update sql statement and returns resultset
	 * @param p_sSQLStatement
	 * @param int p_iType
	 * @param int p_iConcurrency
	 * @return ResultSet
	 */
	public ResultSet updateSQLQuery(
		String p_sSQLStatement,
		int p_iType,
		int p_iConcurrency)
		throws SQLException;

	/**
	 * returns an object with multiple recordsets
	 * @param p_sSQLStatement
	 * @return object
	 */
	public Object execSQL(String p_sSQLStatement) throws SQLException;

	/**
	 * returns an object with multiple recordsets
	 * @param p_sSQLStatement
	 * @param p_iType
	 * @param p_iConcurrency
	 * @return object
	 */
	public Object execSQL(
		String p_sSQLStatement,
		int p_iType,
		int p_iConcurrency)
		throws SQLException;

	/**
	 * updates the data and returns rows affected
	 * @param p_sSQLStatement
	 * @return int
	 */
	public int execSQLUpdate(String p_sSQLStatement) throws SQLException;

	/**
	 * updates the data and returns rows affected
	 * @param p_sSQLStatement
	 * @param int p_iType
	 * @param int p_iConcurrency
	 * @return int
	 */
	public int execSQLUpdate(
		String p_sSQLStatement,
		int p_iType,
		int p_iConcurrency)
		throws SQLException;

	/**
	 * creates a prepared statement from the sql passed in
	 * @param p_sPrepareStatement
	 * @return PreparedStatement
	 */
	public PreparedStatement prepareStatement(String p_sPrepareStatement)
		throws SQLException;

	/**
	 * creates a prepared statement from the sql passed in
	 * @param p_sPrepareStatement
	 * @param p_iType
	 * @param p_iConcurrency
	 * @return PreparedStatement
	 */
	public PreparedStatement prepareStatement(
		String p_sPrepareStatement,
		int p_iType,
		int p_iConcurrency)
		throws SQLException;

	/**
	 * creates a callable statement from the sql statement passed
	 * @param p_sCallableStatement
	 * @return callable procedure object
	 */
	public CallableStatement prepareCall(String p_sCallableStatement)
		throws SQLException;

	/**
	 * creates a callable statement from the sql statement passed
	 * @param p_sCallableStatement
	 * @param p_iType
	 * @param p_iConcurrency
	 * @return callable procedure object
	 */
	public CallableStatement prepareCall(
		String p_sCallableStatement,
		int p_iType,
		int p_iConcurrency)
		throws SQLException;

	/**
	 * returns the next resultset from a object of multiple resultsets
	 * @param p_oResultObject
	 * @return ResultSet
	 */
	public ResultSet getNextResultSet(Object p_oResultObject);

	/**
	 * close the connection
	 */
	public void close() throws SQLException;

	/**
	 * are you connected?
	 * @return boolean
	 */
	public boolean isConnected() throws SQLException;

	/**
	 * is the connection closed
	 * @return boolean
	 */
	public boolean isConnectionClosed() throws SQLException;

	/**
	 * commit the update/insert sql
	 */
	public void commit() throws SQLException;
}
