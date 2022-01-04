package selenium_java_sapt21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class fb_launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","E:\\java\\msedgedriver.exe");
		WebDriver drive=new EdgeDriver();
		drive.get("https://www.facebook.com");
		drive.manage().window().maximize();
		drive.navigate().to("https:www.google.com");
		drive.navigate().back();
		drive.navigate().forward();
		drive.navigate().to("https:facebook.com");
		drive.findElement(By.xpath("//input[@type='text']")).sendKeys("sachindighole00@gmail.com");
		drive.findElement(By.xpath("//input[@name='pass']")).sendKeys("Ashu@123");
		drive.findElement(By.xpath("//button[@name='login']")).click();
		
		
		
		
	}

}
