package Demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {
	
	public static void main(String[] args) throws Exception {
		test();
	}
	
	public static void test() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\A-Tina folder\\Selenium\\eclipse\\JavaProject\\SeleniumFramework\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.ca");
		 driver.findElement(By.name("q")).sendKeys("udemy");
		 //driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Udemy'])[4]/following::h3[1]")).click();
		
		 // Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				   .withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);
	
		       
		       WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		    	  public WebElement apply(WebDriver driver) {
		    	  return driver.findElement(By.id("foo"));
		    	     }
		    	   });   
		       
		 
		 Thread.sleep(3000);
		 driver.close();
		 driver.quit();
		
	}
}

	


