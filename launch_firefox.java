package selenium_java_sapt21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launch_firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.gecko.driver", "E:\\java\\geckodriver.exe");
 WebDriver drive=new FirefoxDriver();
	}

}