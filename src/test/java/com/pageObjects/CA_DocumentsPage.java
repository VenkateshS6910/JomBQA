package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CA_DocumentsPage {
	
public WebDriver ldriver;
	
	//Constructor
	
		public CA_DocumentsPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}

}
