package selenium_java_sapt21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluent_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "E://java//chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com");
 
 
 
 driver.findElement(By.xpath("//a[contains(@rel,'async')]")).click();
 
 FluentWait wait=new FluentWait(driver);
 wait.withTimeout(15, TimeUnit.SECONDS);
 wait.pollingEvery(1, TimeUnit.SECONDS);
 wait.ignoring(NoSuchElementException);
 wait.until.
 
 
	}

}
