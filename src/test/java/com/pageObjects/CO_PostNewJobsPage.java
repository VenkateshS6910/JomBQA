 package com.pageObjects;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CO_PostNewJobsPage {
	
public WebDriver ldriver;
	
	//Constructor
	
		public CO_PostNewJobsPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}

		//Capture Job title field
		@FindBy(id="job-title")
		@CacheLookup
		WebElement txtjobtitle;
		
		//Capture Job type field
		@FindBy(id="job-type")
		@CacheLookup
		WebElement drpdwnjobtype;
		
		//Capture Job location field 
		@FindBy(id="autocomplete")
		@CacheLookup
		WebElement txtjobloc;
		
		//Capture Autocomplete location suggestion
		@FindBy(how= How.XPATH, using = "//div[@class='pac-item']")
		WebElement jobloca;
		
		//Capture Pay Rate field
		@FindBy(id="rate")
		@CacheLookup
		WebElement txtrate;
				
		//Capture Start Date Field
		@FindBy(xpath="//*[@id=\"startDate\"]/div[1]/input")
		WebElement txtStartdate;
		
		//Capture Start Date Day Field
		@FindBy(xpath="//td[@class='today']")
		WebElement eleStartDay;
		
		//Capture End Date Field
		@FindBy(xpath="//*[@id=\"endDate\"]/div[1]/input")
		WebElement txtEnddate;
		
		//Capture End Date Month Next Button
		@FindBy(xpath="//div[@id='endDate']//th[@class='month']//a[@class='next']")
		WebElement btnMnthnxt;
		
		//Capture End Date Day Field
		@FindBy(xpath="//*[@id='endDate']/div[2]/table/tbody/tr/td")
		List <WebElement> eleEndDay;
		
		//Capture Job description frame
		//@FindBy(xpath="//iframe[@id='job-description_ifr']")
		@FindBy(how = How.XPATH, using = "//iframe[@class='tox-edit-area__iframe']")
		@CacheLookup
		WebElement frame;
		
		//Capture Job description input field 
		@FindBy(xpath="//*[@id='tinymce']")
		@CacheLookup
		WebElement txtjobdescrip;
		
		//Capture Post Job Button
		@FindBy(xpath="//*[@id=\"addJobForm\"]/input[12]")
		@CacheLookup
		WebElement bttnpostjob;
		 
			// Capturing fields on Post new job page
		
			// Job Title Auto suggestive drop down
			@FindBy(xpath = "//input[@id='job-title']")
			WebElement JobTitle;
			
			//Send text to the Job Title field
			public void setjobTitle(String jobTitle)
			{
				JobTitle.sendKeys(jobTitle);
				JobTitle.sendKeys(Keys.ARROW_DOWN);
				JobTitle.sendKeys(Keys.ENTER);
			}

			// Capture Job type Drop down
			@FindBy(xpath = "//select[@id='job-type']")
			WebElement JobTypeDD;
			
			// Setting the job type drop down
			public void setJobType () {
				Select s = new Select (JobTypeDD);
				s.selectByIndex(1); 	// selecting full time by default
			}
		
			// Capture Job Location Auto suggestive drop down
			@FindBy(xpath = "//input[@id='autocomplete']")
			WebElement JLocation;
			
			//Setting the Job Location from Auto suggestive Drop down
			public void setJobLoc() throws InterruptedException {
				JLocation.sendKeys("Robert Speck"); 	    				// setting location as Robert Speck Parkway, Mississauga, ON Canada
				Thread.sleep(2000);
				JLocation.sendKeys(Keys.ARROW_DOWN);
				JLocation.sendKeys(Keys.ENTER);
				
			}
		
			// Capture Pay Rate Input box
			@FindBy(xpath = "//input[@id='rate']")
			WebElement PayRate;
			
			//Send text to the Pay Rate field
			public void setPayRate() {
				PayRate.sendKeys("50"); //setting pay rate as 50
			}
			
			// Capture Start Date from Calendar
			@FindBy(xpath = "//input[@name='startDate']")
			@CacheLookup
			WebElement StartDtCalUI;
			
			@FindBy(xpath = "//span[contains(text(),'November')]")
			@CacheLookup
			WebElement Stmonth;
			
			@FindBy(xpath = "//div[@id='startDate']//span[contains(text(),'2019')]")
			@CacheLookup
			WebElement Styear;
			
			@FindBy(xpath = "//div[@id='startDate']//th[@class='month']//a[@class='next']")
			@CacheLookup
			WebElement Stnextclk;
			
			@FindBy(xpath = "//div[@id='startDate']//td[contains(text(),'4')]")
			@CacheLookup
			WebElement Stday;
			
			//Setting the Start date month as December
			public void setStartDt() {
				StartDtCalUI.click();
				while (!(Stmonth.getText().equalsIgnoreCase("November"))&&(Styear.getText().equalsIgnoreCase("2019"))) {
					Stnextclk.click();
				}
				 Stday.click();
			}
			
			// Capture End Date from Calendar
			@FindBy(xpath = "//input[@name='endDate']")
			@CacheLookup
			WebElement EndDtCalUI;
			
			@FindBy(xpath = "//span[contains(text(),'November')]")
			@CacheLookup
			WebElement EndMonth;
			
			@FindBy(xpath = "//div[@id='endDate']//span[contains(text(),'2019')]")
			@CacheLookup
			WebElement EndYear;
			
			@FindBy(xpath = "//div[@id='endDate']//th[@class='month']//a[@class='next']")
			@CacheLookup
			WebElement Endnextclk;
			
			@FindBy(xpath = "//div[@id='endDate']//td[contains(text(),'27')]")
			@CacheLookup
			WebElement Endday;
			
			//Setting the End date month as December
			public void setEndDt() {
				EndDtCalUI.click();
				while (!(EndMonth.getText().equalsIgnoreCase("December"))&&(EndYear.getText().equalsIgnoreCase("2019"))) {
					Endnextclk.click();
				}
				 Endday.click();
			}
			
			//Capture iFrame
			@FindBy (xpath = "//*[@id='job-description_ifr']")
			WebElement JDiFrame;
			
			//switching to frame and set job description in the input box
			public void JobDesc(WebDriver driver) {
				driver.switchTo().frame(JDiFrame);
				driver.findElement(By.id("tinymce")).sendKeys("Job Description Details...");
				driver.switchTo().defaultContent();
			}
			
			//Capture Post Job Button
			@FindBy(xpath = "//input[@class='post-job submitBtn']")
			WebElement Postjobbtn;
			
			//Click on submit button
			public void clkbtnSubmit() {
				Postjobbtn.click();
			}
			

 

		//********************Action Method********************//
	
		//Set Job Title Field Value
		public void setjobtitle(String jobtitle) 
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(txtjobtitle));
			txtjobtitle.sendKeys(jobtitle);
		}
		
		//Set Job Location Field Value
		public void setjobloc(String jobloc) 
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(txtjobloc));
			txtjobloc.sendKeys(jobloc);
			wait.until(ExpectedConditions.visibilityOf(jobloca));
			jobloca.click(); //Selecting Auto Complete Option
			
		}
		
		//Set Job Pay Rate Value
		public void setpayrate(String rate) 
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(txtrate));
			txtrate.sendKeys(rate);
		}
		
		//Set End Date Day
		public void setendday()
		{   int strtday= 0;
			txtStartdate.click();
			
			strtday= Integer.valueOf(eleStartDay.getText());
			txtEnddate.click();
			if(strtday>=30) 
			{
			btnMnthnxt.click();	
			strtday=1;
			}
			else
			strtday++;
			String endday = String.valueOf(strtday);
			
			
			for(WebElement endDay : eleEndDay) 
			{  
			    String day= endDay.getText();
			    if (day.equals(endday))
			    endDay.click();    	
			 }
		 }
		
		//Set Job Description Value
		public void setjobdesc(String jobdesc)
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
			wait.until(ExpectedConditions.elementToBeClickable(txtjobdescrip)).click();
			txtjobdescrip.sendKeys(jobdesc);
			ldriver.switchTo().defaultContent();
		}
		
		//Click Post Job button
		public void clkbttnpost ()
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.elementToBeClickable(bttnpostjob));
			bttnpostjob.click();
		}
		
}
