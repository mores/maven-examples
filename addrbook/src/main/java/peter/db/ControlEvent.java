package peter.db;

import java.util.EventObject;

/**
 * @author pete
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ControlEvent extends EventObject {

	/**
	 * Start
	 */
	public static final int START = 0;
	
	/**
	 * Stop
	 */
	public static final int STOP = 1;

	/**
	 * Pause
	 */
	public static final int PAUSE = 2;
		
	/**
	 * Status of the event
	 */
	private int STATUS = -1;
	
	/**
	 * Constructor for ControlEvent.
	 * @param arg0
	 */
	public ControlEvent(Object source) {
		super(source);
	}

	/**
	 * Instantiate an event with a set status.
	 */
	public ControlEvent(Object source, int status) {
		super(source);
		STATUS = status;
	}
	
	/**
	 * return the status
	 */
	public int getStatus() {
		return STATUS;
	}

	/**
	 * Main method for testing
	 */	
	public static void main(String[] args) {
		ControlEvent ev = new ControlEvent("test",ControlEvent.STOP);
		System.out.println("status:" + ev.getStatus());
		
	}
}
