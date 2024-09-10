package demo5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing51 {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void SetUp(){
		driver = new ChromeDriver();
	}
	
	@Test
	public void testmethod() throws InterruptedException {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
	}
	
	
	@AfterClass
	public static void teardown(){
		driver.quit();
	}

}
