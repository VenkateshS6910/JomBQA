package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CA_LandingPage;
import com.pageObjects.LoginPage;

public class JMB_TC_005 extends BaseClass {
	
	@Test(priority=5)
	public void JMB_TC_005() throws IOException
	{
	//Started the Forget Password test
	logger.info("Started Forget Password link Test");
	//Create object of LandingPage
	CA_LandingPage lp=new CA_LandingPage(driver);
	//Click on Login Link
	lp.clkbtnLogin();
	logger.info("Clicked on Login");
	//Create object of LoginPage
	LoginPage l=new LoginPage(driver);
	//Click on Forget Password
	l.clklnkfrgtpwd();
	logger.info("Clicked on Forget Password");
	//Validate whether Forget Password is successful
			SoftAssert softassert = new SoftAssert();
			if(driver.getTitle().equals("Forgot Password"))
			{
				softassert.assertTrue(true);
				logger.info("Test Passed! Forget Password link Successfully click");
				captureScreen(driver,"JMB_TC_005");
			}
			else
			{
				softassert.assertTrue(false);
				logger.error("Test Failed! Forget Password link not clicked ");
				captureScreen(driver,"JMB_TC_005");
			}
			softassert.assertAll();
			logger.info("Completed Forget Password link Test");
	}

}
