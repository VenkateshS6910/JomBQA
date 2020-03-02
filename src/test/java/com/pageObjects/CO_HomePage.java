package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CO_HomePage {
	
public WebDriver ldriver;
	
	//Constructor
	
		public CO_HomePage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		//Capture Post New Job link
				//@FindBy(xpath="//*[@id=\"employmentManagement\"]/div[2]/ul/li[1]/a")
				@FindBy(how=How.XPATH, using="//a[@href='/company/job/add']" )
				WebElement lnkPostjob;
				
				//Capture Job link
				@FindBy(how=How.XPATH, using="//a[@href='/company/jobs?sortBy=CREATED_DATE_DESC']")
				WebElement lnkJob;
				
				//Capture Welcome Message
				@FindBy(xpath="//h3[contains(text(),'Welcome!')]")
				WebElement msgWelcm;
				
				//Capture User management link
				@FindBy(how=How.XPATH, using="//a[@href='/company/user']")
				WebElement lnkUsrMng;
				 
				// Capture job tab
				@FindBy(xpath = "//a[@class='nav-link job-tab']")
				WebElement JobTabBtn;
			
				// Clicking the Job Tab
				public void clkjobbtn() {
					JobTabBtn.click();
				}
				
				
				//Capture User Management link icon
				@FindBy (xpath = "//div[@class='quick-links-emp']/ul/li[4]/a[1]")
				WebElement UserMgtIcon;
				 
				//Capture Last Logged In time 
				@FindBy (xpath = "//div[@class='login-time']")
				public WebElement LastLogin;
		

				//********************Action Method********************//
				
				//Click Post New Job Option	
				public void clklnkPostjob ()
				{
					WebDriverWait wait = new WebDriverWait(ldriver,25);
					wait.until(ExpectedConditions.visibilityOf(lnkPostjob));
					wait.until(ExpectedConditions.elementToBeClickable(lnkPostjob));
					lnkPostjob.click();
				}
				//Clicking User Management Icon 
				public void clkUserMgtIcon() {
					UserMgtIcon.click();
				}
               
             
				
				
				//Click Job Link	
				public void clklnkjob ()
				{
					WebDriverWait wait = new WebDriverWait(ldriver,25);
					wait.until(ExpectedConditions.visibilityOf(lnkJob));
					wait.until(ExpectedConditions.elementToBeClickable(lnkJob));
				    lnkJob.click();
				}
				
				//Verify Welcome Message is displayed
				public boolean msgWelcome()
				{
					return msgWelcm.isDisplayed();
				}
				
				//Click User Management Link
				public void clklnkUsr ()
				{
					WebDriverWait wait = new WebDriverWait(ldriver,25);
					wait.until(ExpectedConditions.visibilityOf(lnkUsrMng));
					wait.until(ExpectedConditions.elementToBeClickable(lnkUsrMng));
					lnkUsrMng.click();
				}
		}


