package newtestcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testingcase1 {
	
	@BeforeTest
    public void createDBconnection() {
		
		System.out.println("Connect DB Coonection");
      }
    
	@AfterTest
    public void closeDBconnection() {
		
		System.out.println("close DB Coonection");
      }
    
		/*
		 * @BeforeMethod public void launchBrower() {
		 * 
		 * System.out.println("Launching the Browser"); }
		 */
    
		/*
		 * @AfterMethod public void closeBrower() {
		 * 
		 * System.out.println("Close the Browser"); }
		 */
	
	 @Test(priority=2,dependsOnMethods="userRegistration")
	public void login() {
		
		System.out.println("Login to the Application");
      }
	
	   @Test(priority=1)
       public void userRegistration() {
		
		//Assert.fail("User not registered sucessfully!!");
		System.out.println("User Registration");
     }
	
}