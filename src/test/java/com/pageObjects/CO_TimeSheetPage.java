package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CO_TimeSheetPage {

public WebDriver ldriver;
	
	//Constructor
	
		public CO_TimeSheetPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
	
}
