package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CA_CompaniesPage {

public WebDriver ldriver;
	
	//Constructor
	
		public CA_CompaniesPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
	
		//Capture "Follow Company" for RR logistics 
		@FindBy (xpath = "//a[contains(text(),'RR logistics')] /parent::div/following-sibling::a[2]")
		@CacheLookup
		public WebElement FollowCom;
		
		// Click follow Company for RR logistics
		public void clkFollowCompany () {
			FollowCom.click();
			}
}



