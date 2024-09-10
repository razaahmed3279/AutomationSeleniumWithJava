package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class loginTest {
	
	private WebDriver driver;
	
	LoginPage loginpage;
	HomePage homepage;
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		loginpage = new LoginPage(driver);
		
		homepage = new HomePage(driver);
		
		Thread.sleep(2000);
		
	}
	
	@Test
	public void getheading() {
		
		homepage.getlinkheading();
	}
	
	
    public void testValidatelogin() {
		
		loginpage.enterusername("Admin");
		loginpage.enterpassword("admin123");
		loginpage.clickLogin();
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		driver.quit();
	}

}
