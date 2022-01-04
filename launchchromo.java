package selenium_java_sapt21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchchromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\java\\chromedriver.exe");
		WebDriver driverer=new ChromeDriver();
		driverer.get("https://kite.zerodha.com");
		//driverer.close();
		driverer.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("OQ6362") ;                       
	
	}

}
