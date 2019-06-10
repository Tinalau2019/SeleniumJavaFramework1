package Demo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeadlessChromeDemo {
	
	public static void main(String[] args) {
		test();

	}

	public static void test() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\A-Tina folder\\Selenium\\eclipse\\JavaProject\\SeleniumFramework\\Drivers\\chromedriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		 
		options.addArguments("--headless");
		
		options.addArguments("window-size = 1920, 1080");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.walmart.ca/en");
		
		System.out.println(driver.getTitle());
		driver.findElement(By.id("global-search")).sendKeys("flowers");
		driver.findElement(By.id("global-search")).sendKeys(Keys.ENTER);
		driver.close();	
		driver.quit();
		System.out.println("Test is completed");
	}

	
}
