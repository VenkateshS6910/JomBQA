package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CA_AppStatusPage {

public WebDriver ldriver;
	
	//Constructor
	
		public CA_AppStatusPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}

	
	
}
