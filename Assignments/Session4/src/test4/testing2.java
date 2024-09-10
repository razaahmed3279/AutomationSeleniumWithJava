package test4;

import org.junit.After;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

public class testing2 {

	
	@Before
	public void setUp() {
		
		System.out.println("Open the Chrome Browser");
	}
	
	@Test
	public void loginTest() {
		
		System.out.println("Login with valid credentials");
		
	}
	
	@Test
	public void loginTestInvalid() {
		
		System.out.println("Login with Invalid credentials");
		Assume.assumeFalse(false);
		
	}
	
	@Test
    public void emptyTest() {
		
		System.out.println("Login with Empty fields");
		Assume.assumeTrue("Please Enter Valid username and password", false);
	}
	
	@After
	public void tearDown() {
		
		System.out.println("Close the Chrome Browser");
		
	}
}
