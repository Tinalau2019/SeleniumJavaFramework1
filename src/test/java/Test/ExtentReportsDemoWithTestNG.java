package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemoWithTestNG {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver = null;
	
	@BeforeSuite
	public void setUp() {
		 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentreports.html");
		 //create ExtentReporters and attach reporters
		 ExtentReports extent = new ExtentReports();
		 extent.attachReporter(htmlReporter);	
		    
	}   
			 
	@BeforeTest
	public void setUpTest() {
				 
		String ProjectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "D:\\A-Tina folder\\Selenium\\eclipse\\JavaProject\\SeleniumFramework\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver(); 	 
				 
			 }
	
	@Test
	public void test1() throws Exception {
		//create test
		 ExtentTest test = extent.createTest("Google Search Test One"," This is a test to validate google search functionality");
		 driver.get("https://google.ca");
		 test.pass("Navigated to google.ca");
		 
		 test.log(Status.INFO, "Starting Test Case");
		 test.info("This step shows usage of info");
		 test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		 test.addScreenCaptureFromPath("screenshot.png");
		 	
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
	    driver.quit();
	    System.out.println("Test Completed Successfully");
	
	}
	
	@AfterSuite
	public void tearDown() {
		extent.flush();
		
	}

}
