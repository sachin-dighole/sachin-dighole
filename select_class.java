package selenium_java_sapt21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class select_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "E://java//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		//WebElement selectvalue= driver.findElement(By.xpath(null))
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//a[@id.'close-fixedban')]")).click();
	//	WebElement selecy_value=driver.findElement(By.xpath("//div[(@id='withOptGroup')]")).click();
		driver.findElement(By.xpath("//div[text()='Select Option']")).click();
		
		driver.findElement(By.xpath("//div[text()='Group 2, option 1']")).click();
		//driver.findElement(By.xpath("//img[contains(@title,'Ad.Plus')]")).click();
		driver.findElement(By.xpath("//div[text()='Select Title']")).click();
		
        driver.findElement(By.xpath("//div[text()='Mrs.']")).click();
        WebElement colour=driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
        Select clr=new Select(colour);
       // clr.selectByValue("5");
      //  clr.selectByIndex(5);
       clr.selectByVisibleText("Green");
        
        driver.findElement(By.xpath("//div[text()='Select...']")).click();
        
        driver.findElement(By.xpath("//div[text()='Green']")).click();
        driver.findElement(By.xpath("//div[text()='Blue']")).click();
        driver.findElement(By.xpath("//select//option[text()='Saab']")).click();
	//	WebElement select_element=driver.findElement(By.xpath("//a))
	
     

		
	}

}
