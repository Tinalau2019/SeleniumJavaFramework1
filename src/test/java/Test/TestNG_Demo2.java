package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.GoogleSearchPage;

public class TestNG_Demo2 {
	
	private static WebDriver driver = null;
	
		
   @BeforeTest
	public  void setUp() {
		
		String ProjectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "D:\\A-Tina folder\\Selenium\\eclipse\\JavaProject\\SeleniumFramework\\Drivers\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
   }
	
   @Test
   
   public void GoogleSearch2(){ 
	   
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
   
   public void GoogleSearch3(){ 
	   
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
		
   }	
		
		
	}
	
	


