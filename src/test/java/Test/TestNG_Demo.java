package Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Demo.Log4jDemo;
import Pages.GoogleSearchPage;
import config.PropertiesFile;

public class TestNG_Demo {
	
	 WebDriver driver = null;
	 public static String browserName = null;
	 private static Logger logger = LogManager.getFormatterLogger(Log4jDemo.class);
			
   @BeforeTest
	public  void setupTest() {
	   String projectPath=System.getProperty("user.dir");
	   PropertiesFile.getProperties();
	   
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", projectPath +"/Drivers/chromedriver/chromedriver.exe");
			 driver = new ChromeDriver();	 	
		}
		else if (browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", projectPath +"/Drivers/geckodriver/geckodriver.exe");
			 driver = new FirefoxDriver();
		}	
		      logger.info("Browser started");
   }
	
   @Test
   public void GoogleSearch(){ 
	   
		//goto Google.ca
		driver.get("http://google.ca");
		
		//enter text in textbox
		//driver.findElement(By.name("q")).sendKeys("automation step by step");
		GoogleSearchPage.textbox_search(driver).sendKeys("automation step by step");
		
		//click on search button
		//driver.findElement(By.name("btnk")).click();
		// driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		 GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
   }
   
   @AfterTest
   public void tearDown() {
		//Close browser
		driver.close();
		
		System.out.println("Test completely successfully");
		PropertiesFile.getProperties();
		
   }	
		
		
	}
	
	


