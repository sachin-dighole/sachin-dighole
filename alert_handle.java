package selenium_java_sapt21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_handle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://java//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("input[name='cusid']")).sendKeys("1235");
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.cssSelector("input[name='res']")).click();
		driver.findElement(By.cssSelector("input[name='cusid']")).sendKeys("0025");
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println(driver.switchTo().alert().getText());
	
		driver.switchTo().alert().accept();
	}

}
