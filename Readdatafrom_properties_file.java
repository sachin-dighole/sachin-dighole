package selenium_java_sapt21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Readdatafrom_properties_file {

	public static void main(String[] args) throws IOException {
	FileInputStream file= new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\selenium_java_sapt21\\src\\sachin_info.properties");
	Properties prop =new Properties();
	prop.load(file);

	    System.setProperty(prop.getProperty("webdriver"),prop.getProperty("path"));
		WebDriver driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@title='Ad.Plus Advertising']")).click();
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(prop.getProperty("name"));
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(prop.getProperty("email"));
		WebElement address= driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
			address	.sendKeys(prop.getProperty("addres"));
	
		
		Actions actions=new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		actions.sendKeys(Keys.TAB).perform();
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		actions.click(driver.findElement(By.xpath("//button[@id='submit']"))).perform();
		
	}

}
