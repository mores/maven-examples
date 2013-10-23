package peter.jmeter;

import java.lang.*;
import java.net.*;
import java.io.*;
import java.util.*;
import gnu.regexp.*;

/**
 * <p>Title: URLParser</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Me, Myself and I</p>
 * <p>Description: </p>
 * Because I am lazy and don't like to do simple repetative tasks, I wrote this
 * simple little utility to generate JMeter URL's. This allows me to generate
 * large test cases with thousands of URL's. It's designed for those who have
 * a ton of weblogs they want to convert for JMeter. Although using production
 * logs is better than randomly generated requests, it's still not equivalent
 * to production traffic. This is about as close to simulating production 
 * traffic as one can get.<p>
 * By no means do I consider this production quality code, since the import
 * statements use ".*". If ever I get the itch to fix it, it will get cleaned
 * up. Until then, the code works and should do the job.
 * @author Peter Lin
 * @version 0.1
 *
 */

public class URLParser {

	protected File SOURCE = null;
	protected String FILENAME = null;
	protected BufferedReader READER = null;
	protected String URL_PATH = null;
	protected Generator GENERATOR = null;
	protected boolean useFILE = false;
	protected boolean changeFILEEXTENSION = false;
	protected String oldFILEEXTENSION = null;
	protected String newFILEEXTENSION = null;
	protected String defaultFILEEXTENSION = "jsp";
	protected int COUNT = 0;
	
	/**
	 * default empty constructor
	 */
	public URLParser() {
	}
	
	/**
	 * constructs an instance with a source file containing URL's. Each url must
	 * be one line. The URL must be the following format:<p>
	 * /myJspExample.jsp?param1=bubba&param2=shrmip&param3=tom&param4=hanks
	 * <p>
	 * @param String sourcefile
	 */
	public URLParser(String source_file) {
		setSourceFileName(source_file);
	}
	
	/**
	 * Set the Generator
	 */
	public void setGenerator(Generator generator) {
		this.GENERATOR = generator;
	}
	
	/**
	 * Sets whether or not to use the file in the URL
	 * @param boolean
	 */
	public void setUseParsedFile(boolean file) {
		this.useFILE = file;
	}
	
	/**
	 * If you want to change the file extension, pass the given file extension
	 * without the period. For example: to change from home.html to home.jsp,
	 * call the method with "jsp".
	 * @param String extension
	 */
	public void setFileExtension(String oldextension, String newextension) {
		this.changeFILEEXTENSION = true;
		this.oldFILEEXTENSION = "." + oldextension;
		this.newFILEEXTENSION = "." + newextension;
	}
	
	/**
	 * Sets the source file.
	 */
	public void setSourceFileName(String source_file) {
		this.FILENAME = source_file;
	}
	
	/**
	 * Creates a new File object with the path provided.
	 */
	public File openFile(String source_path) {
		return new File(source_path);
	}
	
	/**
	 * Parses the source file and generates JMeter nodes representing HTTP
	 * requests.
	 * @return boolean success/failure
	 */
	public boolean parse() {
		this.SOURCE = this.openFile(this.FILENAME);
		try {
			this.READER = new BufferedReader(new FileReader(this.SOURCE));
			parse(this.READER);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return true;
	}
	
	/**
	 * Takes the BufferedReader and parses each line. The method is only
	 * responsible for parsing each line. Other methods are responsible for
	 * parsing the line and building the xml.
	 * @param BufferedReader breader
	 */
	protected void parse(BufferedReader breader) {
		String line = null;
		try {
			while ((line = breader.readLine()) != null) {
				if (line != null && line.length() > 0) {
					line = this.cleanURL(line);
					if (this.checkURL(line)) {
						String paramString = this.stripFile(line);
						if (this.useFILE) {
							this.GENERATOR.setFile(URL_PATH);
						}
						// now that we have stripped the file, we can parse the parameters
						this.convertStringToJMRequest(paramString);
					} else {
						if (this.checkParamFormat(line)) {
							// try to parse the parameters
							this.convertStringToJMRequest(line);
						}
					}
				}
				// System.out.println(this.COUNT++);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	/**
	 * Convert one line into one JMeter request
	 * @param String text
	 */
	public void convertStringToJMRequest(String text) {
		this.GENERATOR.setParams(this.convertStringtoNVPair(text));
		this.GENERATOR.writeRequest();
	}
	
	/**
	 * Transforms the string of parameters to NVPairs
	 * @param String stringparams
	 */
	public NVPair[] convertStringtoNVPair(String stringparams) {
		Vector vparams = this.parseParameters(stringparams);
		NVPair[] nvparams = new NVPair[vparams.size()];
		// now that we have created an Array of NVPair, we can convert them
		for (int idx = 0; idx < nvparams.length; idx++) {
			nvparams[idx] = this.parseOneParameter((String) vparams.get(idx));
		}
		return nvparams;
	}
	
	/**
	 * Parses name=value and returns a new NVPair. If the value was null, it
	 * will be set to zero length string. If the string has more than one
	 * equal sign, only the first two tokens are used. Equal signs that are
	 * part of the value should be URLEncoded, therefore we assume there is
	 * only one equal sign.<p>
	 * @param String text
	 * @return NVPair
	 */
	protected NVPair parseOneParameter(String parameter) {
		String name = null;
		String value = null;
		try {
			StringTokenizer param = this.tokenize(parameter, "=");
			name = param.nextToken();
			value = param.nextToken();
		} catch (Exception e) {
			// e.printStackTrace();
		}
		if (value == null) {
			value = new String();
		}
		return new NVPair(name.trim(), value.trim());
	}
	
	/**
	 * Tokenizes the string by "&" adds them to a Vector. It takes multiple
	 * request parameters and break them into name=value. The method is used
	 * by convertStringtoNVPair(string). This is done so that we can create
	 * an array of the correct size.<p>
	 * @param String parameters
	 * @return Vector
	 */
	protected Vector parseParameters(String parameters) {
		Vector parsedParams = new Vector();
		StringTokenizer paramtokens = this.tokenize(parameters, "&");
		while (paramtokens.hasMoreElements()) {
			parsedParams.add(paramtokens.nextElement());
		}
		return parsedParams;
	}
	
	/**
	 * Replaces the file extension in the URL to the one provided by the user.
	 */
	protected void setRequestFileExtension() {
		try {
			String regpattern = "/\\" + this.oldFILEEXTENSION + "/";
			RE regx = new RE(regpattern);
			regx.substitute(this.URL_PATH, this.newFILEEXTENSION);
			this.GENERATOR.setFile(this.URL_PATH);
		} catch (REException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Checks the string to make sure it has /path/file?name=value format. If
	 * the string doesn't have "?", it will return false.
	 * @param String url
	 * @return boolean
	 */
	public boolean checkURL(String url) {
		if (url.indexOf("?") > -1) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Checks the string to see if it contains "&" and "=". If it does, return
	 * true, so that it can be parsed.
	 * @param String text
	 * @return boolean
	 */
	public boolean checkParamFormat(String text) {
		if (text.indexOf("&") > -1 && text.indexOf("=") > -1) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Tokenize the URL into two tokens. If the URL has more than one "?", the
	 * parse may fail. Only the first two tokens are used. The first token is
	 * automatically parsed and set at URL_PATH.
	 * @return String parameters
	 */
	public String stripFile(String url) {
		StringTokenizer tokens = this.tokenize(url, "?");
		this.URL_PATH = tokens.nextToken();
		return tokens.nextToken();
	}
	
	/**
	 * Method is intended to look for the first string which begins with "GET"
	 * character and use it for the URL. This is based on the assumption the
	 * original source file is an access log which follows the standard log
	 * format. If it doesn't, this method will need to be modified to handle
	 * the format.<p>
	 * For all intents and purposes, we tokenize on quote and assume the
	 * second token should begin with capital GET. If it doesn't we return a
	 * zero length string. If it does, we then tokenize on space and take the
	 * second token again and pass the clean URL on.<p>
	 * Example of access log entry: 127.0.0.1 - - [08/Jan/2003:07:03:54 -0500] "GET /addrbook/ HTTP/1.1" 200 1981
	 * 
	 * @param String entry
	 * @return String url
	 */
	public String cleanURL(String entry) {
		String url = entry;
		if (entry.indexOf("\"") > -1 && entry.indexOf("GET") > -1) {
			StringTokenizer tokens = null;
			tokens = this.tokenize(entry, "\"");
			while (tokens.hasMoreTokens()) {
				String toke = (String) tokens.nextToken();
				if (toke.indexOf("GET") > -1) {
					StringTokenizer token2 = this.tokenize(toke, " ");
					while (token2.hasMoreTokens()) {
						String t = (String) token2.nextElement();
						if (t.startsWith("/")) {
							url = t;
						}
					}
				}
			}
			return url;
		} else {
			return url;
		}
	}
	
	/**
	 * Parses the line using java.util.StringTokenizer.
	 * @return StringTokenizer
	 */
	public StringTokenizer tokenize(String line, String delim) {
		return new StringTokenizer(line, delim);
	}
	
	public void close() {
		try {
			this.READER.close();
			this.READER = null;
			this.SOURCE = null;
		} catch (IOException e) {
			// do nothing
		}
	}
	
	/**
	 * Main method for running and testing the class. This isn't meant to be
	 * the access point for the tool.<p>
	 */
	public static void main(String[] args) {
		Generator gen = new Generator("d:/temp/rs.txt");
		gen.setHost("tao.altern8.net");
		gen.setPort(8080);
		gen.setFile("/addrbook");
	
		URLParser parser =
			new URLParser("d:/tomcat4.1.16/logs/localhost_access_log.2003-01-08.txt");
		parser.setUseParsedFile(true);
		parser.setGenerator(gen);
		parser.parse();
		// gen.close();
	
		System.out.println(
			"the URL is: "
				+ parser.cleanURL(
					"127.0.0.1 - - [08/Jan/2003:07:03:54 -0500] \"GET /addrbook/simple_data.jsp HTTP/1.1\" 200 1981"));
		parser.close();
		gen.close();
	}
}

