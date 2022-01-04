package selenium_java_sapt21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public abstract class mouse_action1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E://java//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		  driver.get("https://www.naukri.com");
		  driver.manage().window().maximize();
		  WebElement rec= driver.findElement(By.xpath("//div[text()='Recruiters']"));
          Actions actions=new Actions(driver);
         actions.moveToElement(rec).perform();
		
		
		
		
	//	driver.get("https://demoqa.com/tool-tips");
		
		
	}
}
