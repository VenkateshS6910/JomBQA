package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CO_EmpTimePolicyPage {

public WebDriver ldriver;
	
	//Constructor
	
		public CO_EmpTimePolicyPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
	
}
