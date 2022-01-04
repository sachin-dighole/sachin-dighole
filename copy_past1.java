package selenium_java_sapt21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class copy_past1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E://java//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@title='Ad.Plus Advertising']")).click();
		
		WebElement name=driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement addres=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		WebElement prmnnt=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		
		Actions actions=new Actions(driver);
		
		actions.sendKeys(name, "sachin ravsaheb dighole").perform();
		actions.sendKeys(email, "sachindighole00@gmail.com").perform();
		actions.sendKeys(addres,"At malhivra tal parli dist beed").perform();
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		actions.sendKeys(Keys.TAB).perform();
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		actions.click(driver.findElement(By.xpath("//button[@id='submit']"))).perform();

		
	}

}
