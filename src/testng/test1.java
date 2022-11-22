package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
	
	@Test (priority = -1)
	public void messages()
	{
		Reporter.log("hai", true);
	}
	
    @Test (priority = 1, invocationCount = 5)
    public void calls()
    {
    	Reporter.log("brother", true);
    }
    
    @Test (priority = -2, enabled = false)
    public void settings()
    {
        Reporter.log("display", true);
    }
    
}
