package com.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CA_HomePage;
import com.pageObjects.CA_JobOffersPage;
import com.pageObjects.CA_LandingPage;
import com.pageObjects.CA_PastJomboneEmpPage;
import com.pageObjects.LoginPage;

public class JMB_TC_003 extends BaseClass{

	@Test(priority=3)
	public void JMB_TC_003() throws IOException, Exception {
		//create the object for landing page
		CA_LandingPage lp= new CA_LandingPage(driver);
		//create the object for home page
		CA_HomePage hp= new CA_HomePage(driver);
		//create the object for past jobs employment 
		CA_PastJomboneEmpPage pastemppg=new CA_PastJomboneEmpPage(driver);
		CA_JobOffersPage jp= new CA_JobOffersPage(driver);
		lp.clkbtnLogin();
		
		////create the object for login page
		LoginPage loginpg = new LoginPage(driver);
		loginpg.settxtemail(username1);		//Pass username1 declared in config file
		loginpg.settxtpassword(password);	//Pass password declared in config file
		Thread.sleep(2000);
		loginpg.clkbtnSubmit();             //Click on submit button
		hp.closebtn(); //method for closing the welcome button
		hp.click_WorkLink();; //method for clicking the work profile
		jp.click_pastjobs(); //method for clicking the past jombone employment from left hadn size
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		Boolean result=pastemppg.reason();
		 SoftAssert softassert1 = new SoftAssert(); 
	
	/*	if(result==true)
		{
			 softassert1.assertTrue(true);
			  logger.info("Test Passed!Reason for leaving the employment is displayed"); 
			  captureScreen(driver,"JMB_TC_003");	  
		} 
			  else {
			  softassert1.assertTrue(false); 
			  logger.error("Test Failed!Reason for leaving the employment is not displayed");
			  captureScreen(driver,"JMB_TC_003");
			  } softassert1.assertAll();
		
		}*/
	 softassert1.assertNotSame(result, false);
	 captureScreen(driver,"JMB_TC_003");
	
	
	}
}