package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CO_DeletedJobsPage {

public WebDriver ldriver;
	
	//Constructor
	
		public CO_DeletedJobsPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
}
