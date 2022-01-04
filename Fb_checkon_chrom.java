package selenium_java_sapt21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_checkon_chrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\java\\chromedriver.exe");
		WebDriver drive=new  ChromeDriver();
		String url= "https://www.facebook.com";
		drive.get("https://www.facebook.com");
		drive.navigate().to("https://www.google.com");
		drive.get(url);
		
		drive.navigate().back();
		drive.navigate().forward();
		drive.navigate().refresh();
		drive.manage().window().maximize();
		drive.findElement(By.xpath("//input[@type='text']")).sendKeys("9764556406");
		drive.findElement(By.xpath("//input[@name='pass']")).sendKeys("Ashu@123");
		drive.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
