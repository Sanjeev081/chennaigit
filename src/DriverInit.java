import Seleniumsessions.chromedriver;
import sun.security.jca.GetInstance;

public class DriverInit {
	private static DriverInit instanceDriver=null;
	private Webdriver driver;
	private DriverInit() {
		
	}
	public Webdriver openBrowser(){
		System.setProperty("webriver.chrome.driver ", "C:\\Users\\Laptop\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new chromedriver();
	    return driver;
		
	}
	public static DriverInit GetInstance() {
		if(instanceDriver==null) {
			instanceDriver=new DriverInit();
			return instanceDriver;
		}
		
	}


}
