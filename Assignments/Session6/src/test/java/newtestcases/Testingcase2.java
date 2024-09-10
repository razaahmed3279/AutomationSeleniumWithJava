package newtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testingcase2 {
	
	    @Test
	    public void validateTitle() {
		
		String actual_title = "facebook";
		String expected_title = "facebook";
		
		Assert.assertEquals(expected_title, actual_title);
	}

}
