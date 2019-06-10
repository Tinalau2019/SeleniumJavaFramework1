import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		String ProjectPath=System.getProperty("user.dir");
		System.out.println("ProjectPath : "+ ProjectPath);
		
		//System.setProperty("webdriver.gecko.driver", ProjectPath +"/Drivers/geckodriver/geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\A-Tina folder\\Selenium\\eclipse\\JavaProject\\SeleniumFramework\\Drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver =new FirefoxDriver();
		//driver.get("https://www.seleniumhq.org");
		
		
		 //System.setProperty("webdriver.ie.driver", ProjectPath +"/Drivers/IEdriver/IEDriverServer.exe");
		 //WebDriver driver=new InternetExplorerDriver();
		 //driver.get("https://www.seleniumhq.org");
		// change browser zoom level to 100% from "setting", then the script will work successfully
		
		
		
		
		  System.setProperty("webdriver.chrome.driver", ProjectPath
		  +"/Drivers\\chromedriver\\chromedriver.exe"); WebDriver driver=new
		  ChromeDriver(); driver.get("https://google.ca");
		  driver.findElement(By.name("q")).sendKeys("automation step by step");
		 
		 
		
		
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("automation step by step");
		//WebElement.textBox = driver.findElement(By.name("q"));
		//textbox.sendkeys("automation step by step");
		
	     //Thread.sleep(3000);
		driver.close();
		driver.quit();
		
		
		
		
		
		
	}

}
