package peter.addrbook;

/**
 * <p>Title: DataGenerator</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Me, Myself and I</p>
 * <p>Description: </p>
 * 
 * @author Peter Lin
 * @version 0.1
 */
public class SimpleModel extends DataGenerator {
	
	public final static String COL_START = "<col>";
	public final static String COL_END = "</col>";
	
	/**
	 * Constructor which takes the number of iterations
	 * and the target file.
	 * @param int interations
	 * @param String save 
	 */
	public SimpleModel(int iterations, String save) {
		this.ITERATIONS = iterations;
		this.SAVEFILE = this.openFile(save);
		this.WRITER = this.getWriter(SAVEFILE);
		init();
	}
	
	/**
	 * 
	 */
	public SimpleModel(String file1, String file2, String file3,
		String file4, String file5, String file6, String save,
		int iterations) {
		this.ITERATIONS = iterations;
		this.SAVEFILE = this.openFile(save);
		this.WRITER = this.getWriter(this.SAVEFILE);
		this.FIRSTNAME = file1;
		this.LASTNAME = file2;
		this.STREETLIST = file3;
		this.CITYLIST = file4;
		this.STATELIST = file5;
		this.POSTALLIST = file6;
		init();
	}
	
	/**
	 * 
	 */
	public void init() {
		this.FIRST_NAMES = this.parseToArray(this.openFile(this.FIRSTNAME));
		this.LAST_NAMES = this.parseToArray(this.openFile(this.LASTNAME));
		this.STREET = this.parseToArray(this.openFile(this.STREETLIST));
		this.CITY = this.parseToArray(this.openFile(this.CITYLIST));
		this.STATE = this.parseToArray(this.openFile(this.STATELIST));
		this.POSTALCODE = this.parseToArray(this.openFile(this.POSTALLIST));
	}

	/**
	 * Generate the file
	 */
	public void generate() {
		this.startDoc();
		// we iterate for n iterations
		for (int idx=0; idx < this.ITERATIONS; idx ++) {
			this.startRow();
			this.writeCR();
			this.writeFirstName();
			this.writeCR();
			this.writeLastName();
			this.writeCR();
			this.writeStreet();
			this.writeCR();
			this.writeCity();
			this.writeCR();
			this.writeState();
			this.writeCR();
			this.writePostal();
			this.writeCR();
			this.writePhone();
			this.writeCR();
			this.writeEmail();
			this.writeCR();
			this.writeNotes();
			this.writeCR();
			this.endRow();
		}
		this.endDoc();
		this.close();
	}
	
	public void startDoc() {
		this.write(this.XMLHEAD);
		this.writeCR();
		this.write(this.ROWSET_START);
		this.writeCR();
		this.TAB_COUNT++;
	}
	
	public void endDoc() {
		--this.TAB_COUNT;
		this.write(this.ROWSET_END);
		this.writeCR();
	}
	
	public void startRow() {
		this.write(this.ROW_START);
		this.writeCR();
		this.TAB_COUNT++;
	}
	
	public void endRow() {
		--this.TAB_COUNT;
		this.write(this.ROW_END);
		this.writeCR();
	}
	
	public void writeFirstName() {
		this.write(this.COL_START + this.FIRST_NAMES[this.random(FIRST_NAMES.length)] + this.COL_END);
	}
	
	public void writeLastName() {
		this.write(this.COL_START + this.LAST_NAMES[this.random(LAST_NAMES.length)] + this.COL_END);
	}
	
	public void writeStreet() {
		this.write(this.COL_START + this.checkStreet(this.STREET[this.random(this.STREET.length)]) + this.COL_END);
		this.writeCR();
		this.write(this.COL_START + "" + this.COL_END);
	}
	
	public void writeCity() {
		this.write(this.COL_START + this.CITY[this.random(this.CITY.length)] + this.COL_END);
	}
	
	public void writeState() {
		this.write(this.COL_START + this.STATE[this.random(this.STATE.length)] + this.COL_END);
	}
	
	public void writePostal() {
		this.write(this.COL_START + this.POSTALCODE[this.random(this.POSTALCODE.length)] + this.COL_END);
	}

	public void writePhone() {
		this.write(this.COL_START + this.random(999) + "-" + this.random(999) + "-" + this.random(9999) + this.COL_END);
	}
	
	public void writeFax() {
		this.write(this.COL_START + "fax is a dead technology, throw it in the trash!" + this.COL_END);
	}
	
	public void writeEmail() {
		this.write(this.COL_START + this.FIRST_NAMES[this.random(this.FIRST_NAMES.length)] + "@test.com" + this.COL_END);
	}
	
	public void writeNotes() {
		this.write(this.COL_START + "are you hungry?" + this.COL_END);
	}
	
	/**
	 *
	 */
	public static void main(String[] args) {
		int count = 100;
		String base = "d:/web_projects/eclipse/workspace/jmeterUtil/";
		String f = base + "firstname.txt";
		String l = base + "lastname.txt";
		String s = base + "streetlist.txt";
		String c = base + "citylist.txt";
		String st = base + "statelist.txt";
		String p = base + "postallist.txt";
		String target = base + "test.txt";
		
		if (args != null && args.length > 0) {
			count = Integer.parseInt(args[0]);
			target = args[1];
		}
		System.out.println("start test");
		SimpleModel sm = new SimpleModel(f,l,s,c,st,p,target,count);
		sm.generate();
		System.out.println("end test");

	}
}
