package selenium_java_sapt21;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Iterators;

public class getwndw_handl {

	public static void main(String[] args) {
	// main window=string/parrant window
		// set of string= child window
		
		System.setProperty("webdriver.chrome.driver", "E://java//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String mainwindow=driver.getWindowHandle();
	
		Set<String>childwindows =driver.getWindowHandles();
		
	java.util.Iterator<String> itr=childwindows.iterator();
	while(itr.hasNext()) {
		String childwindo=itr.next();
		
		if(!mainwindow.equalsIgnoreCase(childwindo)) {
			driver.switchTo().window(childwindo);
			System.out.println(driver.getTitle());
			//driver.close();
			
		}
	}
	
	driver.switchTo().window(mainwindow);
	//driver.close();
		
	}

}
