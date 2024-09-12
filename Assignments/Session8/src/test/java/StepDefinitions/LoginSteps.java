package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	private WebDriver driver;
	
	@Given("User is on Orange HRM login page") 
	public void loginpage() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SQA\\Selenium Automation Course\\Pre-requisites Softwares\\browser\\Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.automationexercise.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
	}
	
	@When("User enter valid username and password")
	public void credentials() {
		
		WebElement usernamefield = driver.findElement(By.name("username"));

		usernamefield.sendKeys("Admin");
		
		// Enter password
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		
		//driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		//driver.findElement(By.partialLinkText("OrangeHRM")).click();
		
	}
	
	@And("user click on login button")
	public void clickBtn() {
		
		// click on button
		
		driver.findElement(By.tagName("button")).click();
				
		
	}
	
	@When("user should redirect to the dashboard page")
	public void dashboardPage() {
		
		System.out.println("user redirect to the dashboard");
		
	}

}
