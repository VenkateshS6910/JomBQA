package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CA_JobApplicationPage {

public WebDriver ldriver;
	
	//Constructor
	
		public CA_JobApplicationPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
	
}
