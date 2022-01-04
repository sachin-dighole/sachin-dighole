package selenium_java_sapt21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebookll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.gecko.driver", "E://java//geckodriver.exe");
  WebDriver drive=new FirefoxDriver();
  drive.get("https:www.facebook.com");
// drive.findElement(By.xpath("//input[contains(@class,'inputtext _55r1')]")).sendKeys("Ashwini sachin dighole");
//drive.findElement(By.xpath("//input[starts-with(@data-testid,'royal_p')]")).sendKeys("fagahah");
//drive.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy[value='1']")).click();
	
	
	
	}
}
