package selenium_java_sapt21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class launchedge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "E:\\java\\msedgedriver.exe");
		WebDriver drive=new EdgeDriver();
		drive.get("https://www.facebook.com");
		drive.findElement(By.partialLinkText("Facebook")).click();
		
		
	}

}
