package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CO_TimeEntryPage {

public WebDriver ldriver;
	
	//Constructor
	
		public CO_TimeEntryPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
	
}
