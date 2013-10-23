package peter.db;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * <p>Title: DBConfig</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Me, Myself and I</p>
 * <p>Description: </p>
 * DBConfig was generated with eclipse using externalize
 * strings tool. It is convenant so that database changes
 * don't require recompiling DBManager.
 * 
 * @author Peter Lin
 * @version 0.1
 */
public class DBConfig {

	private static final String BUNDLE_NAME = "peter.db.database"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private DBConfig() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
