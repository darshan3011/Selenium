public class DriversRun{

	public static void main(String[] args) {
	String browser="Firefox";
	String url="http://toolsqa.com/automation-practice-form/";
	initDriver ini= new initDriver();
	ini.run(browser,url);
	
	ini.typeFirstname("abcd");
	ini.typeLastname("def");
	ini.selectExp();
	ini.selectprofession();
	}

}
