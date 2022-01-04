package selenium_java_sapt21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tool_tip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		System.setProperty("webdriver.chrome.driver", "E://java//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement moveovermouse=driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		Actions action =new Actions(driver);
		action.moveToElement(moveovermouse).perform();
		System.out.println(driver.findElement(By.xpath("//div[@id='buttonToolTip']")).getText());
		 WebElement cotry=driver.findElement(By.xpath("//a[text()='Contrary']"));
		 action.moveToElement(cotry).perform();
		 System.out.println(driver.findElement(By.xpath("//div[@id='contraryTexToolTip']")).getText());
		 
		 WebElement input=driver.findElement(By.xpath("//input"));
		 action.keyDown(input, Keys.SHIFT).sendKeys("sachin ravsaheb dighole").keyUp(Keys.SHIFT).build().perform();
		
		
	}

}
