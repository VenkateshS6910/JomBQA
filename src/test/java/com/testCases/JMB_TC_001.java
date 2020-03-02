package com.testCases;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CA_HomePage;
import com.pageObjects.CA_LandingPage;
import com.pageObjects.CA_ProfilePage;
import com.pageObjects.LoginPage;
import com.utilities.ReadConfig;

public class JMB_TC_001 extends BaseClass{
	@Test(priority=1)
	public void JMB_TC_001() throws IOException, InterruptedException {
		//Started ---> My Profile - Personal Details Validation Test
		logger.info("Started My Profile - Personal Details Validation Test");
		//Create the object for LandingPage
		CA_LandingPage lp = new CA_LandingPage(driver);
		//Clicking on Login link
		lp.clkbtnLogin();
		driver.findElement(By.xpath("//*[@id=\"candidateLogin\"]/table/tbody/tr[4]/td[2]/label/a")).click();
		Thread.sleep(2000);
		WebElement terms= driver.findElement(By.cssSelector("#candidateForm > table > tbody > tr:nth-child(5) > td > div > label > a"));
		Actions act= new Actions(driver);
		act.click(terms).build().perform();
		//driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[5]/td[1]/div[1]/label[1]/a[1]")).click();
		Thread.sleep(2000);
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(1));

//		String acturl= driver.getCurrentUrl();
		
	//	String expurl="http://52.60.159.184/about-jombone#terms";
		//Assert.assertEquals(acturl, expurl);
	
		SoftAssert softassert = new SoftAssert();
		 
		if(driver.getCurrentUrl().contains("http://52.60.159.184/about-jombone#terms"))
		{
			softassert.assertTrue(true);
			logger.info("Terms and conditions page displayed");	
			captureScreen(driver,"JMB_TC_001");	
		}
		else
		{
			softassert.assertTrue(false);
			logger.info("Terms and conditions page not displayed");
			captureScreen(driver,"JMB_TC_001");			
		}
		softassert.assertAll();

	
	
	
	
	
	}}
