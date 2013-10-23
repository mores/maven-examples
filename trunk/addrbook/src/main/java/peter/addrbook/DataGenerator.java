package peter.addrbook;

import java.io.*;
import java.util.Random;
import java.util.Vector;

/**
 * <p>Title: DataGenerator</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Me, Myself and I</p>
 * <p>Description: </p>
 * This abstract class is designed so that others can
 * extend it. I don't know how practical it is, since
 * it is specific to generating address entries. A
 * person could use it to generate fake people to
 * stress test a registration webapp.<p>
 * The code is free, so others can do what ever they
 * want. MalcomX might say, "We didn't land on high
 * performance, high performance landed on us." Or
 * MLK jr might say "I have a dream, a dream that one
 * day people of all colors, races and creeds can
 * exchange code freely, without oppression from
 * large multi-national corporations."<p>
 * @author Peter Lin
 * @version 0.1
 *
 */
public abstract class DataGenerator {

	/**
	 * Array for first names
	 */
	protected String[] FIRST_NAMES = null;
	
	/**
	 * Array for last names
	 */
	protected String[] LAST_NAMES = null;

	/**
	 * 
	 */
	protected String[] STREET = null;
	/**
	 * Like everything else, city is also read in
	 * from a source file.
	 */
	protected String[] CITY = null;

	/**
	 * I could put all the states in, but what if
	 * some one doesn't live in the US. This makes
	 * it easier for people living out side of the
	 * us to provide a file of the state/province
	 * and generate test data.
	 */
	protected String[] STATE = null;

	/**
	 * String array for postal codes. Although we
	 * could generate it randomly, Some one might
	 * want to use actual postal codes, if their
	 * application happens to geocode or validate
	 * postal codes before it is accepted.
	 */
	protected String[] POSTALCODE = null;
	
	/**
	 * The file to save it to.
	 */
	protected File SAVEFILE = null;
	
	/**
	 * If a street entry has %number%, replace it
	 * with a random 4 digit number.
	 */
	protected static final String GETRAND = "%number%";
	
	/**
	 * The number of rows to generate
	 */
	protected int ITERATIONS = 0;
	
	/**
	 * Here are all the lists for the source files.
	 */
	public static String FIRSTNAME = "firstname.txt";
	public static String LASTNAME = "lastname.txt";
	public static String STREETLIST = "streetlist.txt";
	public static String CITYLIST = "citylist.txt";
	public static String STATELIST = "statelist.txt";
	public static String POSTALLIST = "postallist.txt";
	
	public static final String TAB = "\t";
	
	public static final String CR = "\r\n";
	
	public static final String FILESEPARATOR = System.getProperty("file.separator");
	
	public static final String XMLHEAD = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
	
	public static final String ROWSET_START = "<rowset>";
	
	public static final String ROW_START = "<row>";
	
	public static final String ROWSET_END = "</rowset>";
	
	public static final String ROW_END = "</row>";

	protected FileWriter WRITER = null;
	
	protected boolean isRow = false;
	
	protected int TAB_COUNT = 0;
	/**
	 * Random for generating random integers
	 */
	public static Random RANDOM = new Random(System.currentTimeMillis());
	
	/** --------------------------------------------
	 * methods begin
	 *  --------------------------------------------
	 */
	
	/**
	 * Child methods can implement logic for initializing
	 * the class. Things like loading the source files.
	 */
	public void init() {}
	
	/**
	 * Creates a new File object with the path provided.
	 * @param String filepath
	 * @return File 
	 */
	public static File openFile(String source_path) {
	  return new File(source_path);
	}
	
	/**
	 * 
	 */
	public FileWriter getWriter(File file) {
		try {
			return new FileWriter(file);
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
	}
	
	public void write(String text) {
		try {
			this.writeTab(this.TAB_COUNT);
			this.WRITER.write(text);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	public void writeTab(int count) {
		try {
			for (int idx=0; idx < count; idx++) {
				this.WRITER.write(this.TAB);
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	public void writeCR() {
		try {
			this.WRITER.write(this.CR);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	/**
	 * Method is responsible for parsing the given
	 * file and returning an array. It assumes the
	 * source file will have one entry per line.
	 * @param File file
	 * @return String[]
	 */
	public static String[] parseToArray(File file) {
		if (file != null) {
			return parse(getReader(file));
		} else {
			return null;
		}
	}
	
	/**
	 * Method takes a File object and passes it ot a 
	 * FileReader, which is pass to a BufferedReader
	 * so it can read line by line.
	 * @param File file
	 * @return BufferedReader
	 */
	public static BufferedReader getReader(File file) {
		try {
			return new BufferedReader(new FileReader(file));
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
	}

	/**
	 * Parse takes a BufferedReader to read one line
	 * as a time.
	 * @param BufferedReader reader
	 * @return Stirng[] array the given file
	 */	
	public static String[] parse(BufferedReader reader) {
		String line = null;
		Vector input = new Vector();
		String[] strarray = null;
		try {
			while( (line = reader.readLine()) != null ) {
				input.add(line);
			}
			strarray = new String[input.size()];
			for(int idx=0; idx < input.size(); idx++) {
				strarray[idx] = (String)input.elementAt(idx);
			}
			return strarray;
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return null;
	}

	/**
	 * When ever an int index is needed, the method is
	 * called to return a random int between 0 and the
	 * size of the array.
	 * @param int size
	 * @return int
	 */
	public static int random(int size) {
		return RANDOM.nextInt(size);
	}

	/**
	 * Check the street to see if it uses %number%, if so
	 * replace it with a randomly generated street number
	 * so that each line is different.
	 * @param String street
	 * @return String street
	 */
	public String checkStreet(String street) {
		if (street.lastIndexOf(DataGenerator.GETRAND) > -1) {
			int strnum = random(9999);
			String nstr = strnum + street.substring(8);
			return nstr;
		} else {
			return street;
		}
	}	

	/**
	 * The Main method should call this method to check if
	 * the args were correctly passed.
	 */
	public static boolean checkArgs(String[] args) {
		if ( args == null ) {
			// some error message should be printed out
			System.out.println("No arguments were given, therefore the default files");
			System.out.println("are used to generate data. If you want to use custom");
			System.out.println("source files, please provide them in the following");
			System.out.println("order. The order is important.");
			System.out.println("Example:");
			System.out.println("firstname.txt lastname.txt streetlist.txt citylist.txt statelist.txt ziplist.txt");
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * 
	 */
	public void close() {
		try {
			this.WRITER.close();
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}
	
	/**
	 * The main method is used to run the the class and 
	 * generate n number of data entries.
	 */
	public static void main(String[] args) {

	}
}
