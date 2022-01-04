package selenium_java_sapt21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchfire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "E:\\java\\geckodriver.exe");
		WebDriver drive= new FirefoxDriver();
		drive.get("https://www.facebook.com");
		/*WebElement username =drive.findElement(By.xpath("//input[@id='email']"));
		
		//username.clear();
		WebElement password=drive.findElement(By.xpath("//input[@id='pass']"));
		
		
		WebElement loginbutton= drive.findElement(By.xpath("//button[@name='login']"));
		
		username.sendKeys("9764556406");
		password.sendKeys("Ashu@123");
		loginbutton.click();
		
		//drive.navigate().refresh();
		drive.navigate().back();
		username.clear();
		
		 */
		WebElement password=drive.findElement(By.id("pass"));
		WebElement login= drive.findElement(By.name("login"));
		
		username.sendKeys("sachindighole00@gmail.com");
		password.sendKeys("Ashu@123");
		login.click();
		drive.findElement(By.xpath("//span[@style='colour']")).click();
		
		//(By.xpath("//input[@id='email']")).sendkeys("9764556406");
		
		drive.findElement(By.xpath(")*/)
		
	}

}