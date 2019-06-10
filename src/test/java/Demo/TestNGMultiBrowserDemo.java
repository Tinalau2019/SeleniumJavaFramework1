package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {
	
	WebDriver driver = null;
	String ProjectPath=System.getProperty("user.dir");
	
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		System.out.println("Browser name is : " + browserName);
		System.out.println("Thread id : " + Thread.currentThread().getId());
		
		if(browserName.equalsIgnoreCase("chrome")) {
		
			System.setProperty("webdriver.chrome.driver", ProjectPath +"/Drivers\\chromedriver\\chromedriver.exe"); 
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
		
			System.setProperty("webdriver.gecko.driver", "D:\\A-Tina folder\\Selenium\\eclipse\\JavaProject\\SeleniumFramework\\Drivers\\geckodriver\\geckodriver.exe");
			driver =new FirefoxDriver();	
		}
			
		else if(browserName.equalsIgnoreCase("ie")) {
		
	    	System.setProperty("webdriver.ie.driver", ProjectPath +"/Drivers/IEdriver/IEDriverServer.exe");
	    	driver=new InternetExplorerDriver();
	}
	}
	
	@Test
	public void test1() throws Exception {
		driver.get("Https://google.,com");
		Thread.sleep(2000);
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Test is completed");
		
	}

}
