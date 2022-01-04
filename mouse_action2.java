package selenium_java_sapt21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_action2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E://java//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement dclick=driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		WebElement rclick=driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		WebElement nclick=driver.findElement(By.xpath("//button[text()='Click Me']"));
		Actions actions=new Actions(driver);
		actions.doubleClick(dclick).perform();
		actions.contextClick(rclick).perform();
		actions.click(nclick).perform();
		
		
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag=driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div[@id='droppable']"));
		actions.dragAndDrop(drag, drop).perform();
		
		
		
	}

}
