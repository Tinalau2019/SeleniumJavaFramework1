import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {

	public static void main(String[] args) {
		
		String ProjectPath=System.getProperty("user.dir");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability ("ignoreProtectedModeSettings", true);
		caps.setCapability("ignoreZoomSetting", true);
		
		System.setProperty("webdriver.ie.driver", ProjectPath +"/Drivers/IEdriver/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver(caps);
		
		driver.get("https://google.ca");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("automation step by step");
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		driver.close();
		driver.quit();
		
		
	}

}
