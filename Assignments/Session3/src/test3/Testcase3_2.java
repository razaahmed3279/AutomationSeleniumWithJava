package test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase3_2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SQA\\Selenium Automation Course\\Pre-requisites Softwares\\browser\\Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		
		// Dropdown
		
		// driver.findElement(By.name("my-select"));
		
		Select obj = new Select(driver.findElement(By.name("my-select")));
		
	   // First Way
       // obj.selectByVisibleText("Two");
		
	   // Cannot locate option with index: 4	
       // obj.selectByIndex(4);
		  obj.selectByIndex(3);
		
	}

}
