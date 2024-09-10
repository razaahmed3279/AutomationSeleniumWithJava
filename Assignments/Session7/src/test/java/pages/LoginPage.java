package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
WebDriver driver;
	
	// Constructor - to initialize object
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}

	// locators - objects
	
	By usernamefield = By.name("username");
	
	By passwordfield = By.name("password");
	
	By loginButton = By.className("oxd-button");
	
	// Action - methods
	
	public void enterusername(String username) {
		
		driver.findElement(usernamefield).sendKeys(username);
		
	}
	
	public void enterpassword(String password) {
		
		driver.findElement(passwordfield).sendKeys(password);
		
	}
	
	public void clickLogin() {
		
		driver.findElement(loginButton);
		
	}
}
