package peter.jmeter;

/**
 * <p>Title: NVPair</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Me, Myself and I</p>
 * <p>Description: </p>
 * NVPair is a simple class for name value pair.
 * It's a simple class, so I won't bother going
 * into detailed explanation!
 * @author Peter Lin
 * @version 0.1
 *
 */

public class NVPair extends Object{

	protected String NAME = new String();
	protected String VALUE = new String();
	
	public NVPair() {
	}
	
	/**
	 * Constructor takes name and value
	 * @param String name
	 * @param String value
	 */
	public NVPair(String name, String value) {
		this.NAME = name;
		this.VALUE = value;
	}

	/**
	 * Set the name
	 * @param String name
	 */	
	public void setName(String name) {
		this.NAME = name;
	}

	/**
	 * Set the value
	 * @param String value
	 */	
	public void setValue(String value) {
		this.VALUE = value;
	}

	/**
	 * Return the name
	 * @return String name
	 */	
	public String getName() {
		return this.NAME;
	}

	/**
	 * Return the value
	 * @return String value
	 */	
	public String getValue() {
		return this.VALUE;
	}
}

