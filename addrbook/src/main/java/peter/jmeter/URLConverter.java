package peter.jmeter;

/**
 * <p>Title: URLConverter</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Me, Myself and I</p>
 * <p>Description: </p>
 * @author Peter Lin
 * @version 0.1
 *
 */

public class URLConverter {

	public static final String HELP =
		"Please provide the following commandline options:";
	public static final String HELP2 =
		"source file: example win( c:/temp/source.txt ) unix( /home/source.txt )";
	public static final String HELP3 =
		"destination file: example win( c:/temp/dest.txt) unix( /home/dest.txt )";
	public static final String HELP4 = "hostname: example bubbashrimp.com";
	public static final String HELP5 = "port: example 8080";
	public static final String HELP6 = "url file: example ( /myJspExample.jsp )";
	public static final String HELP7 =
		"peter.jmeter.URLConverter c:/temp/source.txt c:/temp/target.txt";
	
	/**
	 * URLConverter is meant to be a commandline tool for converting
	 * URL's to JMeter requests. It is designed to take five arguments:<p>
	 * <ol>
	 *   <li> source file - win: c:/temp/source.txt  unix: /home/export/me/source.txt
	 *   <li> destination - win: c:/temp/dest.txt  unix: /home/export/me/dest.txt
	 *   <li> hostname - j2.superpages.com
	 *   <li> port - 9080
	 *   <li> url file - /wp/results.jsp
	 * </ol>
	 * <p>
	 * The tool requires Gnuregexp. Make sure you set -classpath to include it.<p>
	 * <p>
	 * example: java -classpath ./gnuregexp.jar:jmeterutil.jar peter.jmeter.URLConverter c:/temp/source.txt c:/temp/dest.txt bubbashrimp.com 8080 /myJspExample.jsp
	 * <p>
	 * The URL's should be in Tomcat's access log format.<p>
	 * <p>
	 *
	 */
	public static void main(String[] args) {
		if (args == null || args.length < 2) {
			System.err.println(HELP);
			System.err.println(HELP2);
			System.err.println(HELP3);
			System.err.println(HELP4);
			System.err.println(HELP5);
			System.err.println(HELP6);
			System.err.println(HELP7);
		} else {
			Generator gen = new Generator(args[1]);
			System.out.println("destination file: " + args[1]);
			gen.setHost(args[2]);
			gen.setPort(Integer.parseInt(args[3]));
			gen.setFile(args[4]);
			System.out.println("source file: " + args[0]);
			URLParser parser = new URLParser(args[0]);
			parser.setGenerator(gen);
			if (args[5] != null && args[5].length() > 0) {
				parser.setUseParsedFile(false);
				gen.setFile(args[5]);
			}
			System.out.println("begin parsing ...");
			parser.parse();
			System.out.println("parsing complete.");
			gen.close();
			parser.close();
			System.out.println("File successfully converted");
			System.exit(0);
		}
	}
}

