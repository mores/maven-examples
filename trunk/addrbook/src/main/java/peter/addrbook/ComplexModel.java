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
public class ComplexModel extends DataGenerator {
	
	public static final String ATTR_ID = "id";
	protected int NID = 0;
	public static final String LT = "<";
	public static final String GT = ">";
	public static final String CLLT = "</";
	public static final String PERSON = "person";
	public static final String FIRST = "first";
	public static final String LAST = "last";
	public static final String MIDDLE = "middle";
	public static final String ADDRESS = "address";
	public static final String STREET1_START = "<street1>";
	public static final String STREET1_END = "</street1>";
	public static final String STREET2_START = "<street2>";
	public static final String STREET2_END = "</street2>";
	public static final String ECITY = "city";
	public static final String ESTATE = "state";
	public static final String ZIP = "zip";
	public static final String LABEL = "label";
	public static final String FAX = "fax";
	public static final String NOTES_START = "<notes>";
	public static final String NOTES_END = "</notes>";
	public static final String PHONE = "phone";
	public static final String EMAIL = "email";
	public static final String NIC_START = "<nic>";
	public static final String NIC_END = "</nic>";
	public static final String GEOCODE = "geocode";
	public static final String LONG = "long";
	public static final String LAT = "lat";
	public static final String ACC = "accuracy";
	public static final String ID = "id";
	public static final String AREA = "area";
	public static final String PREFIX = "prefix";
	public static final String EX = "ex";
	public static final String RELATION = "relations";
	public static final String PTYPE = "type";
	
	/**
	 * Constructor which takes the number of iterations
	 * and the target file.
	 * @param int interations
	 * @param String save 
	 */
	public ComplexModel(int iterations, String save) {
		this.ITERATIONS = iterations;
		this.SAVEFILE = this.openFile(save);
		this.WRITER = this.getWriter(SAVEFILE);
		init();
	}
	
	/**
	 * 
	 */
	public ComplexModel(String file1, String file2, String file3,
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
			this.writePerson();
			this.writeAddress();
			this.writePhone();
			this.writeEmail();
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
	
	public void writePerson() {
		this.write(LT + PERSON + " " + ID + "=\"" + random(990) + "\"" + GT);
		this.TAB_COUNT++;
		this.writeCR();
		this.writeFirstName();
		this.writeCR();
		this.writeLastName();
		this.writeCR();
		this.writeMiddleName();
		this.writeCR();
		this.TAB_COUNT--;
		this.write(CLLT + PERSON + GT);
		this.writeCR();
	}
		
	public void writeFirstName() {
		this.write(LT + FIRST + GT + this.FIRST_NAMES[this.random(FIRST_NAMES.length)] + CLLT + FIRST + GT);
	}
	
	public void writeLastName() {
		this.write(LT + LAST + GT + this.LAST_NAMES[this.random(LAST_NAMES.length)] + CLLT + LAST + GT);
	}

	public void writeMiddleName() {
		this.write(LT + MIDDLE + GT + this.LAST_NAMES[this.random(LAST_NAMES.length)].substring(0,1) + CLLT + MIDDLE + GT);
	}

	public void writeAddress() {
		this.write(LT + ADDRESS + " " + ID + "=\"" + random(9999) + "\"" + GT);
		this.TAB_COUNT++;
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
		this.writePhone();
		this.writeCR();
		this.writeNotes();
		this.writeCR();
		this.write(LT + GEOCODE + GT);
		this.TAB_COUNT++;
		this.writeCR();
		this.write(LT + LAT + GT + random(99999999) + CLLT + LAT + GT);
		this.writeCR();
		this.write(LT + LONG + GT + random(99999999) + CLLT + LONG + GT);
		this.writeCR();
		this.write(LT + ACC + GT + random(9) + CLLT + ACC + GT);
		this.writeCR();
		this.write(LT + ID + GT + random(88888888) + CLLT + ID + GT);
		this.writeCR();
		this.TAB_COUNT--;
		this.write(CLLT + GEOCODE + GT);
		this.writeCR();
		this.TAB_COUNT--;
		this.write(CLLT + ADDRESS + GT);
		this.writeCR();
	}
		
	public void writeStreet() {
		this.write(STREET1_START + this.checkStreet(this.STREET[this.random(this.STREET.length)]) + STREET1_END);
		this.writeCR();
		this.write(STREET2_START + "" + STREET2_END);
	}
	
	public void writeCity() {
		this.write(LT + ECITY + " " + ID + "=\"" + random(99999) + "\"" + GT);
		this.writeCR();
		this.TAB_COUNT++;
		this.write(LT + LABEL + GT + this.CITY[this.random(this.CITY.length)] + CLLT + LABEL + GT);
		this.writeCR();
		this.write(LT + GEOCODE + GT);
		this.TAB_COUNT++;
		this.writeCR();
		this.write(LT + LAT + GT + random(99999999) + CLLT + LAT + GT);
		this.writeCR();
		this.write(LT + LONG + GT + random(99999999) + CLLT + LONG + GT);
		this.writeCR();
		this.write(LT + ACC + GT + random(9) + CLLT + ACC + GT);
		this.writeCR();
		this.write(LT + ID + GT + random(88888888) + CLLT + ID + GT);
		this.writeCR();
		this.TAB_COUNT--;
		this.write(CLLT + GEOCODE + GT);
		this.writeCR();
		this.TAB_COUNT--;
		this.write(CLLT + ECITY + GT);
	}
	
	public void writeState() {
		this.write(LT + ESTATE + " " + ID + "=\"" + random(99999) + "\"" + GT);
		this.writeCR();
		this.TAB_COUNT++;
		this.write(LT + LABEL + GT + this.STATE[this.random(this.STATE.length)] + CLLT + LABEL + GT);
		this.writeCR();
		this.write(LT + GEOCODE + GT);
		this.TAB_COUNT++;
		this.writeCR();
		this.write(LT + LAT + GT + random(99999999) + CLLT + LAT + GT);
		this.writeCR();
		this.write(LT + LONG + GT + random(99999999) + CLLT + LONG + GT);
		this.writeCR();
		this.write(LT + ACC + GT + random(9) + CLLT + ACC + GT);
		this.writeCR();
		this.write(LT + ID + GT + random(88888888) + CLLT + ID + GT);
		this.writeCR();
		this.TAB_COUNT--;
		this.write(CLLT + GEOCODE + GT);
		this.writeCR();
		this.TAB_COUNT--;
		this.write(CLLT + ESTATE + GT);
	}
	
	public void writePostal() {
		this.write(LT + ZIP + " " + ID + "=\"" + random(99999) + "\"" + GT);
		this.writeCR();
		this.TAB_COUNT++;
		this.write(LT + LABEL + GT + this.POSTALCODE[this.random(this.POSTALCODE.length)] + CLLT + LABEL + GT);
		this.writeCR();
		this.write(LT + GEOCODE + GT);
		this.TAB_COUNT++;
		this.writeCR();
		this.write(LT + LAT + GT + random(99999999) + CLLT + LAT + GT);
		this.writeCR();
		this.write(LT + LONG + GT + random(99999999) + CLLT + LONG + GT);
		this.writeCR();
		this.write(LT + ACC + GT + random(9) + CLLT + ACC + GT);
		this.writeCR();
		this.write(LT + ID + GT + random(88888888) + CLLT + ID + GT);
		this.writeCR();
		this.TAB_COUNT--;
		this.write(CLLT + GEOCODE + GT);
		this.writeCR();
		this.TAB_COUNT--;
		this.write(CLLT + ZIP + GT);
	}

	public void writePhone() {
		this.write(LT + PHONE + " " + ID + "=\"" + random(99999) + "\"" + GT);
		this.writeCR();
		this.TAB_COUNT++;
		this.write(LT + PTYPE + GT + random(2) + CLLT + PTYPE + GT);
		this.writeCR();
		this.write(LT + LABEL + GT + "home" + CLLT + LABEL + GT);
		this.writeCR();
		this.write(LT + AREA + GT + random(999) + CLLT + AREA + GT);
		this.writeCR();
		this.write(LT + PREFIX + GT + random(999) + CLLT + PREFIX + GT);
		this.writeCR();
		this.write(LT + EX + GT + random(9999) + CLLT + EX + GT);
		this.writeCR();
		this.TAB_COUNT--;
		this.write(CLLT + PHONE + GT);
		this.writeCR();
	}
	
	public void writeEmail() {
		this.write(LT + EMAIL + " " + ID + "=\"" + random(99999) + "\"" + GT);
		this.TAB_COUNT++;
		this.writeCR();
		this.write(LT + LABEL + GT + "email" + CLLT + LABEL + GT);
		this.writeCR();
		this.write(LT + ADDRESS + GT + this.FIRST_NAMES[this.random(this.FIRST_NAMES.length)] + "@test.com" + CLLT + ADDRESS + GT);
		this.writeCR();
		this.writeNIC();
		this.writeCR();
		this.TAB_COUNT--;
		this.write(CLLT + EMAIL + GT);
		this.writeCR();
	}

	public void writeNIC() {
		this.write(NIC_START + "me" + NIC_END);
	}
	
	public void writeNotes() {
		this.write(NOTES_START + "are you hungry?" + NOTES_END);
	}
		
	public static void main(String[] args) {
		int count = 100;
		String base = "d:/web_projects/eclipse/workspace/jmeterUtil/";
		String f = base + "firstname.txt";
		String l = base + "lastname.txt";
		String s = base + "streetlist.txt";
		String c = base + "citylist.txt";
		String st = base + "statelist.txt";
		String p = base + "postallist.txt";
		String target = base + "test2.txt";
		if (args != null && args.length > 0) {
			count = Integer.parseInt(args[0]);
			target = args[1];
		}
		System.out.println("start test");
		ComplexModel sm = new ComplexModel(f,l,s,c,st,p,target,count);
		sm.generate();
		System.out.println("end test");

	}
}
