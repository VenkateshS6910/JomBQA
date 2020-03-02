package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CA_JobOffersPage {
	
public WebDriver ldriver;
	
	//Constructor
	
		public CA_JobOffersPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		//Capture job offers
				@FindBy(xpath="//a[contains(text(),'Job Offers')]")
				WebElement joboffr;
				
				public void click_joboffer() {
				     Actions action=new Actions(ldriver);	  
					 action.click(joboffr).build().perform();
				}

                // Capture past employments
				@FindBy(xpath="//ul[@class='left_link']//a[contains(text(),'Past Jombone Employments')]")
				WebElement pastjobs;

               public void click_pastjobs()
               {
            	  pastjobs.click();
               }

                














}
