package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;

public class GoogleSearchPageObjects {
	
	WebDriver driver = null;
	
	By textBox_search = By.name("q");
	By button_search = By.name("btnk");
	
	public  GoogleSearchPageObjects(WebDriver driver) {
		this. driver = driver;
		
	}
	

	public void setTextInSearchBox(String text) {
		
		  driver.findElements(textBox_search).sendKeys(text);
		
	}
	
	public void clickSearchButton() {
		
		driver.findElements(button_search).Click();
	}

}
