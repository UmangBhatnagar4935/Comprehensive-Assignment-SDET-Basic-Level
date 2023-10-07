
//		author                                    Umang Bhatnagar     @umangbhatnagar@virtusa.com
//		*************************************     Here the whole script is written keeping MACOS		    *************************************
//		*************************************	  in mind. "MMTUtilityMethods" class has been written	    *************************************			
//		*************************************	  for the low level implementation by segregating into 	    *************************************
//		*************************************	  different methods. These methods are later called   	    *************************************
//		*************************************	  as in need in class "MMTChromeAndFireFox"	to come		    *************************************
//		*************************************	  up with a meaningful script as asked for.					*************************************



package com.avirtusaa;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainTestRunner extends MMTChromeAndFireFox{

		
	
	@BeforeMethod
	public void fetchLogoStatus() throws InterruptedException
	{
		
		firefoxMMTCrawler();
		chromeMMtCrawler();
	}
	
	
	@Test
	public void name()
	{
		assertEquals(isLogoPresent(), true);
		
		Reporter.log("The test is found to have passed !!");
	}
	
	

}
