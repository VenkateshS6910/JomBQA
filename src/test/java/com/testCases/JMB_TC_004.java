package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CA_LandingPage;
import com.pageObjects.LoginPage;

public class JMB_TC_004 extends BaseClass  {
	
	@Test(priority=3)
	public void JMB_TC_004() throws IOException
	{
		//Started the login test
		logger.info("Started Click on Sign Up Link Test");
		//Create object of LandingPage
		CA_LandingPage lp=new CA_LandingPage(driver);
		//Click on Login Link
		lp.clkbtnLogin();
		logger.info("Clicked on Login");
		//Create object of LoginPage
		LoginPage l=new LoginPage(driver);
		//Click on Sign Up link
		l.clklnksignup();
		logger.info("Clicked on SignUp");
		//Validate whether Sign up Link is successful
			SoftAssert softassert = new SoftAssert();
			if(driver.getTitle().equals("Signup"))
			{
				softassert.assertTrue(true);
				logger.info("Test Passed! Sign up Link Successful!");
				captureScreen(driver,"JMB_TC_004");
			}
			else
			{
				softassert.assertTrue(false);
				logger.error("Test Failed! could not click on sign up link");
				captureScreen(driver,"JMB_TC_004");
			}
			softassert.assertAll();
			logger.info("Completed Sign up Link");
	}
	
}
