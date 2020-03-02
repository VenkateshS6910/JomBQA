 package com.pageObjects;



import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CO_JobsPage {
	
public WebDriver ldriver;
	
	//Constructor
	
		public CO_JobsPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}

		//Capture Newly Created Job Link
		@FindBy(xpath="//*[@id=\"job-list\"]/div[1]/div[1]/table/tbody/tr/td[2]/div/a")
		WebElement lnktestjob;
		
		//Capture the Me Dropdown menu
		@FindBy(xpath = "//*[@id='navbardrop']")
		WebElement drpdwnMe;
		
		//Capture Log Out link 
		@FindBy(xpath = "//a[contains(text(),'Log Out')]")
		WebElement lnkLogout;
 
		//Capture Yes button from Logout Popup
		@FindBy(xpath="//div[@class='modal-body']//a[@href='/logout']")
		WebElement lnklogoutYes;
		
		//Capture Show more option
		//@FindBy(xpath="//*[@id=\"exTab1\"]/div[1]/div[1]/table/tbody/tr/td[3]/ul/li[8]")
		//@FindBy(xpath ="//li[@class='show-more']")
		@FindBy(how =How.XPATH, using ="//li[@class='show-more']")
		WebElement showmore;
		
		//Capture Delete Link
		@FindBy(xpath="//a[@class='creat-job-bt deleteJob']")
		WebElement lnkDelete;
		
		//Capture Yes button from Delete Popup
		@FindBy(xpath="//a[@id='deleteConfirm']")
		WebElement lnkdeleteYes;
		
		//Capture Confirmation message
		@FindBy(xpath="//*[@id=\"successFlashMessage\"]")
		WebElement msg;
		
		
		//Capture Application Received option
		//@FindBy(how = How.XPATH, using = "//a[contains(text(),' Application received')]")
		//List <WebElement> eleApplication;
		@FindBy(xpath="//div[2]//div[1]//table[1]//tbody[1]//tr[1]//td[3]//ul[1]//li[1]//a[1]")
		WebElement lnkApplication;
		
		//Capture Candidate who Applied for the job
		@FindBy(xpath="//div[@id='application_received']//a[contains(@href,'candidate')]")
		WebElement lnkcadapp;
		
	 

		// Capture "Post New Job" btn
			@FindBy(xpath = "//a[@class='creat-job-bt']")
			@CacheLookup
			WebElement NewJobBtn;

		// Clicking the Post new job button
			public void clknewjobbtn() {
				NewJobBtn.click();
			}

		// Capture 'Show More' button for newest job posted on the page
			@FindBy(css = "li.show-more")
			WebElement ShowMoreBtn;

		// Click on 'Show More' button for newest job posted on the page
			public void clkShowMore() {
				ShowMoreBtn.click();
			}
		
		//Capture delete Button for newest job posted
			@FindBy(xpath = "//a[@class='creat-job-bt deleteJob']")
			public WebElement DeleteBtn;

		// Click on 'Delete' button for newest job posted on the page
			public void clkDelete() {
				DeleteBtn.click();
			}
		
		//Capture Confirm delete Button 
			@FindBy(xpath = "//a[@id='deleteConfirm']")
			WebElement ConfDeleteBtn;

		// Click on 'Delete' button for newest job posted on the page
			public void clkConfDelete() {
				ConfDeleteBtn.click();
			}
		
 

		//********************Action Method********************//
		
		//Retrieving Data JID from Url
		public String lnktstjob ()
		{
			WebDriverWait wait = new WebDriverWait(ldriver,25);
			wait.until(ExpectedConditions.visibilityOf(lnktestjob));
			wait.until(ExpectedConditions.elementToBeClickable(lnktestjob));
			String url=lnktestjob.getAttribute("href"); //Retrieving new job url
			return StringUtils.substringBetween(url, "jobEncId=", "&empEncId"); //Retrieving Data-JID attribute
			
		}
		
		//Retrieving Job ID text from URL
		public String jobID ()
		{
			WebDriverWait wait = new WebDriverWait(ldriver,25);
			wait.until(ExpectedConditions.visibilityOf(lnktestjob));
			wait.until(ExpectedConditions.elementToBeClickable(lnktestjob));
			String text=lnktestjob.getText(); //Retrieving new text from element
			String jbid=  StringUtils.substringBetween(text, "JJ", "|");
			return jbid.trim();
		}
		
		//Move mouse to Me dropdwon menu
		public void drpdwnmenuMe() 
		{
			WebDriverWait wait = new WebDriverWait(ldriver,25);
			wait.until(ExpectedConditions.visibilityOf(drpdwnMe));
			wait.until(ExpectedConditions.elementToBeClickable(drpdwnMe));
			Actions action = new Actions(ldriver);
			action.moveToElement(drpdwnMe).build().perform();
		}

		//Click Logout Link
		public void clklnkLogout() 
		{
			WebDriverWait wait = new WebDriverWait(ldriver,25);
			wait.until(ExpectedConditions.visibilityOf(lnkLogout));
			wait.until(ExpectedConditions.elementToBeClickable(lnkLogout));
			Actions action = new Actions(ldriver);
			action.moveToElement(lnkLogout).click().build().perform();
		}

		//Click on Yes button from logout pop-up
		public void clklnklYes() 
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(lnklogoutYes));
			lnklogoutYes.click();		
		}
		
		//Click on Show more option
		public void clkShowmore()
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(showmore));
			wait.until(ExpectedConditions.elementToBeClickable(showmore));
			JavascriptExecutor executor = (JavascriptExecutor)ldriver;
			executor.executeScript("arguments[0].click();", showmore);
			//showmore.click();
		}
		
		//Click on Delete Link
		public void clklnkDelete()
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(lnkDelete));
			lnkDelete.click();
		}
		
		//Click on Yes button from logout pop-up
		public void clklnkdYes() 
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(lnkdeleteYes));
			lnkdeleteYes.click();		
		}
		
		/*
		public String successmsg()
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(msg));
			return msg.getText();
		}
		*/
		//Click on view Application link
		public void clklnkapp(String jid)
		{
			//for(WebElement lnkApplication : eleApplication) 
			{
				//String url= lnkApplication.getAttribute("href");
			    //if (url.contains(jid))
			    {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
			    wait.until(ExpectedConditions.visibilityOf(lnkApplication));
			    JavascriptExecutor executor = (JavascriptExecutor)ldriver;
				executor.executeScript("arguments[0].click();", lnkApplication);
			    }
			}
			
		}
		
		//Click on specific job from Jobs Page
		/*public void clklnkjob(String jbid)
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
		    wait.until(ExpectedConditions.visibilityOfAllElements(elejobs));
			for(WebElement lnkjob: elejobs)
			{
				String url=lnkjob.getAttribute("href");
				if (url.contains(jbid))
				{   
					JavascriptExecutor executor = (JavascriptExecutor)ldriver;
					executor.executeScript("arguments[0].click();", lnkjob);
					//Actions action = new Actions(ldriver);
					//action.moveToElement(lnkjob).click().build().perform();
				    //lnkjob.click();
				}*/
			 
		
		//Retrieving the name of candidate who applied
		public String candidate ()
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
		    wait.until(ExpectedConditions.visibilityOf(lnkcadapp));
			return lnkcadapp.getText();
		}
}
