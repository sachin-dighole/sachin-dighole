package selenium_java_sapt21;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindow_handles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E://java//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		String mainwindow=driver.getWindowHandle();
		
		Set<String> childwindow=driver.getWindowHandles();
		Iterator <String> itr=childwindow.iterator();
		while(itr.hasNext()) {
			String childwindows=itr.next();
			if(!mainwindow.equalsIgnoreCase(childwindows)) {
				driver.switchTo().window(childwindows);
				System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
				driver.close();
			}
			
			
		}
		
	driver.switchTo().window(mainwindow);
	//driver.close();
	
	}

}
