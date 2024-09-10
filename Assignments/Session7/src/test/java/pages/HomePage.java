package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	// Constructor - to initialize object
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
	}

	// locators - objects
	
	By linkcap = By.linkText("OrangeHRM, Inc");
	
	// Action - methods
	
	public String getlinkheading() {
		
		String head = driver.findElement(linkcap).getText();
		
		return head;
	}
}
