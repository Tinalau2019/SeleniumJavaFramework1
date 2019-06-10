package listeners1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners1.TestNGListeners1.class)
public class TestNGListenersDemo1 {
	
	@Test
	public void test1() {
		System.out.println("I am inside Test1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside Test2");
	
		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
		 System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers\\chromedriver\\chromedriver.exe"); 
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://google.ca");
		 driver.findElement(By.name("q")).sendKeys("automation step by step");
		 driver.findElement(By.name("abc")).sendKeys("abc");
	     driver.close();	 
	}
	
	@Test
	public void test3() {
		System.out.println("I am inside Test3");
		throw new SkipException ("This test is skipped");
	}
	

}
