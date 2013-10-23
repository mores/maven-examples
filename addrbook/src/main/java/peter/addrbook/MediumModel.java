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
public class MediumModel extends DataGenerator {
	
	public static final String PERSON_START = "<person>";
	public static final String PERSON_END = "</person>";
	public static final String FIRST_START = "<first>";
	public static final String FIRST_END = "</first>";
	public static final String LAST_START = "<last>";
	public static final String LAST_END = "</last>";
	public static final String MIDDLE_START = "<middle>";
	public static final String MIDDLE_END = "</middle>";
	public static final String ADDRESS_START = "<address>";
	public static final String ADDRESS_END = "</address>";
	public static final String STREET1_START = "<street1>";
	public static final String STREET1_END = "</street1>";
	public static final String STREET2_START = "<street2>";
	public static final String STREET2_END = "</street2>";
	public static final String CITY_START = "<city>";
	public static final String CITY_END = "</city>";
	public static final String STATE_START = "<state>";
	public static final String STATE_END = "</state>";
	public static final String ZIP_START = "<zip>";
	public static final String ZIP_END = "</zip>";
	public static final String LABEL_START = "<label>";
	public static final String LABEL_END = "</label>";
	public static final String FAX_START = "<fax>";
	public static final String FAX_END = "</fax>";
	public static final String NOTES_START = "<notes>";
	public static final String NOTES_END = "</notes>";
	public static final String PHONE_START = "<phone>";
	public static final String PHONE_END = "</phone>";
	public static final String EMAIL_START = "<email>";
	public static final String EMAIL_END = "</email>";
	public static final String NUMBER_START = "<number>";
	public static final String NUMBER_END = "</number>";
	public static final String NIC_START = "<nic>";
	public static final String NIC_END = "</nic>";
	
	/**
	 * Constructor which takes the number of iterations
	 * and the target file.
	 * @param int interations
	 * @param String save 
	 */
	public MediumModel(int iterations, String save) {
		this.ITERATIONS = iterations;
		this.SAVEFILE = this.openFile(save);
		this.WRITER = this.getWriter(SAVEFILE);
		init();
	}
	
	/**
	 * 
	 */
	public MediumModel(String file1, String file2, String file3,
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
			this.writeOtherPhone();
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
		this.write(this.PERSON_START);
		this.TAB_COUNT++;
		this.writeCR();
		this.writeFirstName();
		this.writeCR();
		this.writeLastName();
		this.writeCR();
		this.writeMiddleName();
		this.writeCR();
		this.TAB_COUNT--;
		this.write(this.PERSON_END);
		this.writeCR();
	}
		
	public void writeFirstName() {
		this.write(FIRST_START + this.FIRST_NAMES[this.random(FIRST_NAMES.length)] + FIRST_END);
	}
	
	public void writeLastName() {
		this.write(LAST_START + this.LAST_NAMES[this.random(LAST_NAMES.length)] + LAST_END);
	}

	public void writeMiddleName() {
		this.write(MIDDLE_START + "" + MIDDLE_END);
	}

	public void writeAddress() {
		this.write(ADDRESS_START);
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
		this.writeHomePhone();
		this.writeCR();
		this.writeFax();
		this.writeCR();
		this.writeNotes();
		this.writeCR();
		this.TAB_COUNT--;
		this.write(ADDRESS_END);
		this.writeCR();
	}
		
	public void writeStreet() {
		this.write(STREET1_START + this.checkStreet(this.STREET[this.random(this.STREET.length)]) + STREET1_END);
		this.writeCR();
		this.write(STREET2_START + "" + STREET2_END);
	}
	
	public void writeCity() {
		this.write(CITY_START + this.CITY[this.random(this.CITY.length)] + CITY_END);
	}
	
	public void writeState() {
		this.write(STATE_START + this.STATE[this.random(this.STATE.length)] + STATE_END);
	}
	
	public void writePostal() {
		this.write(ZIP_START + this.POSTALCODE[this.random(this.POSTALCODE.length)] + ZIP_END);
	}

	public void writeOtherPhone() {
		this.write(PHONE_START);
		this.TAB_COUNT++;
		this.writeCR();
		this.writeLabel("cell");
		this.writeCR();
		this.write(NUMBER_START + this.createPhone() + NUMBER_END);
		this.writeCR();
		this.TAB_COUNT--;
		this.write(PHONE_END);
		this.writeCR();
	}

	public void writeHomePhone() {
		this.write(PHONE_START + this.createPhone() + PHONE_END);
	}
	
	public String createPhone() {
		return this.random(999) + "-" + this.random(999) + "-" + this.random(9999);
	}

	public void writeLabel(String label) {
		this.write(LABEL_START + label + LABEL_END);
	}
	
	public void writeFax() {
		this.write(FAX_START + this.createPhone() + FAX_END);
	}
	
	public void writeEmail() {
		this.write(EMAIL_START);
		this.TAB_COUNT++;
		this.writeCR();
		this.writeLabel("email");
		this.writeCR();
		this.write(ADDRESS_START + this.FIRST_NAMES[this.random(this.FIRST_NAMES.length)] + "@test.com" + ADDRESS_END);
		this.writeCR();
		this.writeNIC();
		this.writeCR();
		this.TAB_COUNT--;
		this.write(EMAIL_END);
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
		MediumModel sm = new MediumModel(f,l,s,c,st,p,target,count);
		sm.generate();
		System.out.println("end test");

	}
}
