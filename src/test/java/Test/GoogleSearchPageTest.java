package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPage;
import Pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[]args) {
		
		GoogleSearchTest();	
	}
	
	public static void GoogleSearchTest() {
		
		String ProjectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "D:\\A-Tina folder\\Selenium\\eclipse\\JavaProject\\SeleniumFramework\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
    GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
    
    driver.get("http://google.ca");
    searchPageObj.setTextInSearchBox("Automation step by step");
    searchPageObj.clickSearchButton();
    driver.close();
		
	}
	
	

}
