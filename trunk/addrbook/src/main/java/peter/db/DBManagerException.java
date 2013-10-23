
/**
 * <p>Title: DBManagerException</p>
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

/**
 * DBManagerException is used to catch and throw exceptions in DBManager
 */
public class DBManagerException extends Exception
{

  /**
   * default constructor
   */
  public DBManagerException()
    {
      super();
    }

  /**
   * @param p_sMessage - the error message
   */
  public DBManagerException( String p_sMessage )
    {
      super ( p_sMessage );
    }

}
