 package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CA_LikedJobsPage {
	
public WebDriver ldriver;
	
	//Constructor
	
		public CA_LikedJobsPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		//Navigating to Liked Jobs page	
		
		// Capture Me tab 
			@FindBy (xpath = "//a[@id='navbardrop']")
			WebElement MeTab;
			
		// Capture Liked Jobs from Me Drop Down
			@FindBy (xpath="//a[@class='dropdown-item'][contains(text(),'Liked Jobs')]")
			WebElement LikedJobs;
	
		//Clicking on Liked Jobs from Me Drop down
			public void clkLikedJobs()  {
				Actions a = new Actions (ldriver);
				a.moveToElement(MeTab);
				a.moveToElement(LikedJobs).click().build().perform();
			}	

		// Capture Home tab
			@FindBy(xpath = "//a[@class='nav-link home-tab']")
			WebElement HomeTabBtn;

		// Clicking the Home Tab
			public void clkHometab() {
				HomeTabBtn.click();
			}
			
		//method to determine the color value from a WebElement
			public String FindTextcolor (WebElement click ) {
				String color= click.getCssValue("color"); 						
				
				String[] hexValue = color.replace("rgba(", "").replace(")", "").split(",");

				int hexValue1=Integer.parseInt(hexValue[0]);
				hexValue[1] = hexValue[1].trim();
				int hexValue2=Integer.parseInt(hexValue[1]);
				hexValue[2] = hexValue[2].trim();
				int hexValue3=Integer.parseInt(hexValue[2]);

				String TextColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
				return TextColor;
			}
			
		
}
