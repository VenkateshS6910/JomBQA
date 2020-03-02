package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CO_ApproveTimeSheetPage {
	
public WebDriver ldriver;
	
	//Constructor
	
		public CO_ApproveTimeSheetPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}

}
