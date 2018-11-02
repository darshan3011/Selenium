public class DriversRun{

	public static void main(String[] args) {
	String browser="Chrome";
	String url="http://toolsqa.com/automation-practice-form/";
	initDriver ini= new initDriver();
	ini.run(browser,url);
	ini.clickbtn();
	/*ini.displaytxt();
	ini.typeFirstname("abcd");
	ini.typeLastname("def");
	ini.selectExp();
	ini.selectprofession();
	ini.selectcountry();
	ini.mutliplevalues();
	ini.clickLink();*/
	}

}
