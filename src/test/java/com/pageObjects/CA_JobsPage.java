package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CA_JobsPage {
	
public WebDriver ldriver;
	
	//Constructor
	
		public CA_JobsPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		// Capture the 'Companies I Follow' check box in left pane
		@FindBy(xpath = "//label[contains(text(),'Companies I Follow')]")
		WebElement CoIFollowCheckbox;

		// Click the 'Companies I Follow' check box
		public void clkComIfollow() {
			CoIFollowCheckbox.click();
		}
		
		// Capture the 'Search' submit button in left pane
		@FindBy(xpath = "//a[@id='searchsubmit']")
		WebElement SearchBtn;

		// Click 'Search' submit button
		public void clkSearchBtn() {
			SearchBtn.click();
		}
		
		//Capture Job Title after new job posted with the job title = Software Tester
		@FindBy (xpath = "//a[contains(text(),'Software Tester')]")
		WebElement NewJobpostTitle;
		
		//Capture 'Follow/Unfollow Company' after searching 'Companies I Follow' job list for RR logistics
		@FindBy (xpath = "//span[contains(text(),'RR logistics')]/parent::div/following-sibling::a[1]")
		public WebElement FollowCom;
		
		//Click Follow/Unfollow Company after searching 'Companies I Follow' job list for RR logistics
		public void clkFollowCom() {
			FollowCom.click();
		}
		
		//Capture job title of 1st Job posted from 'RR logistics' after searching 'Companies I Follow' job list for RR logistics
		@FindBy (xpath = "//span[contains(text(),'RR logistics')] /parent::div/a[1]")
		WebElement JobTitle;
		
		//Click job title of 1st Job posted from 'RR logistics' after searching 'Companies I Follow' job list for RR logistics
		public void clkJobTitle() {
			JobTitle.click();
		}
		
		//Capture 'Follow/Unfollow Company' for specific job detail page after clicking on jobTitle
		@FindBy (xpath = "//div[@class='followed-section']/a[1]")
		public WebElement jobFollowCom;
		
		//Click 'Follow/Unfollow Company' for specific job detail page after clicking on jobTitle
		public void clkjobFollowCom() {
			jobFollowCom.click();
		}

		
		



}

