package peter.jmeter;

import java.io.*;
import java.net.*;

/**
 * <p>Title: Generator</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Me, Myself and I</p>
 * <p>Description: </p>
 * Generator is responsible for generating a node representing a HTTP request.
 * It takes query string representing request parameter name/value pairs and
 * converts it into an argument node, which is then used by JMeter. Generator
 * is used by URLConverter to parse access logs.<p>
 * <pre>
 * </pre>
 *
 * @author Peter Lin
 * @version 0.1
 *
 */

public class Generator extends Object {

	protected String HOSTNAME = null;
	protected int PORT = 80;
	protected String LOCALFILE = null;
	protected String FILE = null;
	protected String NAME = "http request";
	protected java.io.FileWriter WRITER = null;
	protected java.io.File OUTPUTFILE = null;
	protected String CR = System.getProperty("line.separator");
	protected NVPair[] PARAMS = null;
	public static final String DOMAIN = "domain";
	public static final String PROTOCOL = "PROTOCOL";
	public static final String PATH = "path";
	public static final String PORTNUMBER = "port";
	public static final String METHOD = "method";
	
	/**
	 * Empty constructor
	 */
	public Generator() {
		super();
	}
	
	/**
	 * Instantiate Generator with local file
	 * @param String localfile
	 */
	public Generator(String localfile) {
		setLocalFile(localfile);
	}
	
	/**
	 * init will initialize all the necessary objects
	 */
	protected void init() {
		if (this.LOCALFILE != null) {
			this.openFile();
			this.getFileWriter();
		} else {
			System.err.print("Exception: Please provide a filename for the output");
		}
	}

	/**
	 * close the writer.
	 */	
	public void close() {
		try {
			this.WRITER.close();
			this.WRITER = null;
			this.LOCALFILE = null;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * File is the URL file location. It may be a JSP page, servlet or CGI.
	 * @param String file
	 */
	public void setFile(String file) {
		FILE = file;
	}
	
	/**
	 * Hostname of the server must be reachable.
	 * @param String hostname
	 */
	public void setHost(String hostname) {
		HOSTNAME = hostname;
	}
	
	/**
	 * Port the webserver is listening to.
	 * @param int port
	 */
	public void setPort(int port) {
		PORT = port;
	}
	
	/**
	 * Name represents the description displayed in JMeter gui. By default it
	 * is set to "http request".<p>
	 * @param String name
	 */
	public void setName(String name) {
		NAME = name;
	}
	
	/**
	 * Local file is the location where you want the generated output to go. It
	 * is not the same as URL.setFile(), since that refers to the URL path
	 * representing a file/servlet/page.<p>
	 * @param String localfile
	 */
	public void setLocalFile(String localfile) {
		LOCALFILE = localfile;
		this.init();
	}
	
	/**
	 * Request Parameters must be converted to name/value pairs.
	 * @param NVPair[] params
	 */
	public void setParams(NVPair[] params) {
		this.PARAMS = params;
	}
	
	/**
	 * Resets the NVPair[] so that multiple requests can be written.
	 */
	public void resetParams() {
		this.PARAMS = null;
	}
	
	/**
	 * Method writes out the request.
	 */
	public void writeRequest() {
		this.startHttpRequest();
		this.writeParameters();
		this.writeHostInfo();
		this.endHttpRequest();
	}
	
	/**
	 * Write text with control linefeed at the end.
	 */
	public void writeln(String text) {
		this.write(text + this.CR);
	}
	
	/**
	 * Write text to the file.
	 */
	public void write(String text) {
		try {
			this.WRITER.write(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Writes the array of NVPair[]. It will only write the parameter and value,
	 * if the value is not null or zero length.<p>
	 */
	public void writeParameters() {
		this.startArguments();
		for (int idx = 0; idx < PARAMS.length; idx++) {
			if (this.PARAMS[idx].getValue().length() > 0) {
				this.writeArgument(
					this.PARAMS[idx].getName(),
					this.PARAMS[idx].getValue());
			}
		}
		this.endArguments();
	}
	
	/**
	 * Writes the host information
	 */
	public void writeHostInfo() {
		this.writeProperty(this.DOMAIN, this.HOSTNAME);
		this.writeProperty(this.PROTOCOL, "http");
		this.writeProperty(this.PATH, this.FILE);
		this.writeProperty(this.PORTNUMBER, String.valueOf(this.PORT));
		this.writeProperty(this.METHOD, "GET");
	}
	
	/**
	 * Writes one request parameter name/value pair.
	 */
	public void writeArgument(String name, String value) {
		try {
			this.writeln(
				"<argument name=\""
					+ name
					+ "\">"
					+ java.net.URLDecoder.decode(value, "ascii")
					+ "</argument>");
		} catch (Exception exception) {
			// we do nothing
		}
	}
	
	/**
	 * Writes one property.
	 */
	public void writeProperty(String name, String value) {
		this.writeln("<property name=\"" + name + "\">" + value + "</property>");
	}
	
	/**
	 * Writes out the necessary nodes before the request parameter arguments.
	 */
	public void startArguments() {
		this.writeln("<property name=\"arguments\"><Arguments>");
	}
	
	/**
	 * Writes the necessary nodes after the request parameter arguments.
	 */
	public void endArguments() {
		writeln("</Arguments>");
		writeln("</property>");
	}
	
	/**
	 * Writes out the beginning of a Http request sample.
	 */
	public void startHttpRequest() {
		this.createName();
		writeln(
			"<HttpTestSample type=\"org.apache.jmeter.protocol.http.control.HttpTestSample\" name=\""
				+ NAME
				+ "\" getImages=\"false\">");
		writeln("<defaultUrl>");
		writeln("<ConfigElement type=\"org.apache.jmeter.protocol.http.config.MultipartUrlConfig\">");
	}
	
	/**
	 * Writes out the end of a Http request sample.
	 */
	public void endHttpRequest() {
		writeln("</ConfigElement>");
		writeln("</defaultUrl>");
		writeln("<configElements>");
		writeln("</configElements>");
		writeln("<controllers>");
		writeln("</controllers>");
		writeln("</HttpTestSample>");
	}
	
	/**
	 * Builds a name from the request values
	 */
	protected void createName() {
		if (this.PARAMS != null & this.PARAMS.length > 0) {
			String temp = new String();
			for (int idx = 0; idx < this.PARAMS.length; idx++) {
				if (this.PARAMS[idx].getValue().length() > 1) {
					temp += this.PARAMS[idx].getValue() + ",";
				}
			}
			this.NAME = temp;
		}
	}
	
	/**
	 * Opens the file
	 */
	protected void openFile() {
		this.OUTPUTFILE = new File(this.LOCALFILE);
	}

	/**
	 * Get the file writer using the output file.
	 */	
	protected void getFileWriter() {
		try {
			this.WRITER = new FileWriter(this.OUTPUTFILE);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Main method for testing and running the class.
	 */
	public static void main(String[] args) {
		Generator testgen = new Generator("c:/temp/jm-test.txt");
		NVPair[] simple = new NVPair[3];
		NVPair one = new NVPair("param1", "one");
		simple[0] = one;
		NVPair two = new NVPair("param2", "two");
		simple[1] = two;
		NVPair three = new NVPair("param3", "three");
		simple[2] = three;
	
		testgen.setHost("tao.altern8.net");
		testgen.setPort(8080);
		testgen.setFile("/recipe/recipe.jsp");
		testgen.setName("smith,boston,ma");
		testgen.setParams(simple);
		testgen.writeRequest();
	
		simple = null;
		simple = new NVPair[4];
		one = new NVPair("p1", "1");
		simple[0] = one;
		two = new NVPair("p2", "2");
		simple[1] = two;
		three = new NVPair("p3", "3");
		simple[2] = three;
		NVPair four = new NVPair("p4", "4");
		simple[3] = four;
		testgen.setParams(simple);
		testgen.writeRequest();
	
		testgen.close();
	
	}
}

