package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportTestDemo {

public static WebDriver driver = null;
	public static  void main(String[] args) {
    
    ExtentHtmlReporter htmlReport = new ExtentHtmlReporter("extentreports.html");
    
    //create ExtentReporters and attach reporters
    ExtentReports extent = new ExtentReports();
    extent.attachReporter(htmlReport);

    //create a toggle for the given test, adds all log evernts
    ExtentTest test = extent.createTest("Google Search Test One"," This is a test to validate google search functionality");
    
    String ProjectPath=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", "D:\\A-Tina folder\\Selenium\\eclipse\\JavaProject\\SeleniumFramework\\Drivers\\chromedriver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 
	 
	 
	 test.log(Status.INFO, "Starting Test Case");
	 driver.get("https://google.ca");
	 
	 test.pass("Navigated to google.ca");
	 driver.findElement(By.name("q")).sendKeys("Automation");
	  test.pass("Entered text in Searchbox");
	  
	 driver.findElement(By.name("btnk")). click();
	 test.pass("Press keyboard enter key");
	 
	  driver.close();
      driver.quit();
     test.pass("Closed the browser");
     
     test.info("Test completed");
     
     //calling flush writes everything to the log file
     extent.flush();
     
	}

}
