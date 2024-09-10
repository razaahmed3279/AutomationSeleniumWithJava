package test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SQA\\Selenium Automation Course\\Pre-requisites Softwares\\browser\\Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		// TextBox
		// Enter Value
		// Clear
		// Enable
		
		WebElement textbox = driver.findElement(By.xpath("//input[@id='my-text-id']"));
		
		// textbox.isDisplayed();
		//textbox.isEnabled();
		
		System.out.println("TextBox action is: " + textbox.isDisplayed());
		System.out.println("TextBox action is: " + textbox.isEnabled());
		
		textbox.clear();
		textbox.sendKeys("University of Karachi");
		
		
	}

}
