package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CO_NotificationsPage {
	
public WebDriver ldriver;
	
	//Constructor
	
		public CO_NotificationsPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}

}
