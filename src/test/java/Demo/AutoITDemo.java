package Demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {
	
	public static void main(String[] args) throws Exception {
		test();
	}
	
	public static void test() throws Exception {	
		
		System.setProperty("webdriver.chrome.driver", "D:\\A-Tina folder\\Selenium\\eclipse\\JavaProject\\SeleniumFramework\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://www.tinyupload.com/");
	
		driver.findElement(By.name("uploaded_file")).click();
        
		Runtime.getRuntime().exec("D://fileuploadScript.exe");
		//if file is saved on folder within D (eg. D://tina-file/fileuploadScript.exe ) which is not work.
		
		Thread.sleep(3000);
	    driver.close();	
		driver.quit();
		System.out.println("Test is completed");
	}
		
}

