package com.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CA_HomePage;
import com.pageObjects.CA_LandingPage;
import com.pageObjects.CA_ProfilePage;
import com.pageObjects.LoginPage;

public class JMB_TC_002 extends BaseClass {
	@Test(priority=2)
	public void JMB_TC_002 () throws IOException {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);		//Implicit Wait
		CA_LandingPage lp = new CA_LandingPage(driver);
		lp.clkbtnLogin();
		
		//------------------------------LogIn----------------
		
		LoginPage loginpg = new LoginPage(driver);
		loginpg.settxtemail(username1);		//Pass username1 declared in config file
		loginpg.settxtpassword(password);	//Pass password declared in config file
		loginpg.clkbtnSubmit();     
		loginpg.clkCancelPrompt();	 		// Canceling the update profile prompt if it's displayed
		
		//---------------------LogIn Successful or not check------------
		
		SoftAssert softassert = new SoftAssert();
		if (driver.getTitle().equals("Dashboard")) {
			softassert.assertTrue(true);
			logger.info("Login Successful!");
			
		} else {
			softassert.assertFalse(false);
			logger.info("Login Failed!");
		} 
		
		//Creating object for candidate home page
		CA_HomePage hp = new CA_HomePage(driver);
		hp.clkMyProfile();					//clicking on me tab to open My profile page
		
		//Creating object for candidate Profile page
		CA_ProfilePage pp = new CA_ProfilePage(driver);
		pp.ClickSalarydeposit();				//Clicking to salary deposit edit field
		 
		  
		 if(!pp.SalaryDepositWindow.isEnabled()) {
			softassert.assertTrue(false);
			logger.info("Test Passed! Window is opened as expected");
			captureScreen(driver,"JMB_TC_002");
		} else {
			softassert.assertFalse(true);
			logger.info("Test Failed! Widnow didnt opened as expected");
			captureScreen(driver,"JMB_TC_002");
		}
		softassert.assertAll(); 
		logger.info("Salary_Deposit_Edit_Button test Completed");
	}
}


