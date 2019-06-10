package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Test1_GoogleSearch {
	
	public static void main(String[]args){
		GoogleSearch();
		}
			
   
	public static void GoogleSearch() {
		
		String ProjectPath=System.getProperty("user.dir");
		System.out.println("ProjectPath : "+ ProjectPath);
		System.setProperty("webdriver.chrome.driver", "D:\\A-Tina folder\\Selenium\\eclipse\\JavaProject\\SeleniumFramework\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//goto Google.ca
		driver.get("http://google.ca");
		
		//enter text in textbox
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		
		
		//click on search button
		//driver.findElement(By.name("btnk")).click();
		  driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
		//Close browser
		driver.close();
		
		System.out.println("Test completely successfully");
		
		
		
		
	}
	
	

}
