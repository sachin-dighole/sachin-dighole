package selenium_java_sapt21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicity_wait_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "E://java//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click();
	//implicitalywait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//explicitaly wait
	// WebDriverWait wait=new WebDriverWait(driver, 5);
	// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[contains(@name,'firstname')]"))).sendKeys("kranti");
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("sachin");
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("sahsufh");
		
	}

}
