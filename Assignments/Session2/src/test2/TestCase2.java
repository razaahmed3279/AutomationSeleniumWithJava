package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "E:\\SQA\\Selenium Automation Course\\Pre-requisites Softwares\\browser\\Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		// Enter username
		
		//driver.findElement(By.name("username")).isEnabled();
		//driver.findElement(By.name("username")).isDisplayed();
		
		
		WebElement usernamefield = driver.findElement(By.name("username"));
		System.out.println("Field is present " + usernamefield.isDisplayed());
		System.out.println("Field is enable for entering data" + usernamefield.isEnabled());
		usernamefield.sendKeys("Admin");
		
		// Enter password
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		// click on button
		
		driver.findElement(By.tagName("button")).click();
		
		
		
		//driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		//driver.findElement(By.partialLinkText("OrangeHRM")).click();
	}

}
