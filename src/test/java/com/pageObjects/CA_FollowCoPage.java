 package com.pageObjects;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CA_FollowCoPage {
	
public WebDriver ldriver;
	
	//Constructor
	
		public CA_FollowCoPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		// Capture Me tab 
		@FindBy (id = "navbardrop")
		@CacheLookup
		WebElement MeTab;
		
		// Capture Followed Companies from Me Drop Down
		@FindBy (xpath="//a[@class='dropdown-item'][contains(text(),'Followed Companies')]")
		@CacheLookup
		WebElement Followcom;
		
		//Click Followed Companies
		public void clkFollowCom() {
			Actions a = new Actions (ldriver);
			a.moveToElement(MeTab).build().perform();
			a.moveToElement(Followcom).click().build().perform();
			}
	
		//Capture RRLogistics WebElement
		@FindBy (xpath = "//*[contains(text(),'RR logistics')]")
		@CacheLookup
		public WebElement RRlog;
		
		//Capture "Follow/Unfollow Company" for RR logistics 
		@FindBy (xpath = "//a[contains(text(),'RR logistics')] /parent::div/following-sibling::a[2]")
		@CacheLookup
		public WebElement FollowCom;
		 
		//Capture Company Name
		@FindBy(xpath = "//div[@class='campany_name_address']")
		WebElement companyName;

		//Capture Unfollow Company link
		@FindBy(xpath = "//a[@class='campany_follow unfollowEmp']")
		WebElement unfollowLink;

		//Capture Home link
		@FindBy(xpath = "//a[@class='nav-link home-tab']")
		WebElement homeMenu;

		//=====Action Methods====
		//Click on Unfollow button
		public String clkUnfollowBtn() {
			//	WebDriverWait wait = new WebDriverWait(ldriver, 25);
			List<WebElement> companies = ldriver.findElements(By.xpath("//div[@class='company_details']//div[@class='campany_name_address']/a"));
			int length = companies.size();
			System.out.println("Number of companies follwed: "+length);
			String companyFollwed = companies.get(0).getText();
			System.out.println("First Company Listed: "+companyFollwed);
			List<WebElement> unfollowBtn = ldriver.findElements(By.xpath("//a[@class='campany_follow unfollowEmp']"));
			unfollowBtn.get(0).click();
			return companyFollwed;
		}

		// Follow Company Text present or not
		public boolean isFollowCompanyDisplayed() {
			boolean bool = false;
			if(ldriver.findElement(By.xpath("//a[@class='campany_follow followEmp']")).getText().equals("Follow Company")) 
			{
				bool = true;
			}
			else
			{
				System.out.println("Follow Company is not displayed");
			}
			return bool;
		}

		//Verify the color
		public boolean isGreyColor() {
			boolean bool = false;
			WebElement link_Home = ldriver.findElement(By.xpath("//a[@class='nav-link home-tab']"));
			Actions builder = new Actions(ldriver);
			org.openqa.selenium.interactions.Action mouseOverHome = builder.moveToElement(link_Home).build();
			mouseOverHome.perform(); 
			WebElement followCmpnyBtn = ldriver.findElement(By.xpath("//a[@class='campany_follow followEmp']"));
			String color = followCmpnyBtn.getCssValue("color");
			System.out.println("Color of the button is: "+color);
			String[] hexValue = color.replace("rgba(","").replace(")", "").split(",");		                         
			hexValue[0] = hexValue[0].trim();
			int hexValue1 = Integer.parseInt(hexValue[0]);                   
			hexValue[1] = hexValue[1].trim();
			int hexValue2 = Integer.parseInt(hexValue[1]);                   
			hexValue[2] = hexValue[2].trim();
			int hexValue3 = Integer.parseInt(hexValue[2]);                   
			String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
			System.out.println(actualColor);
			if(actualColor.contains("#757575"))
			{
				bool=true;
			}
			return bool;
		}

		//Verify if the company is listed
		public boolean isUnfollowedCompanyNotDisplayed(String unfollowCompany) {
			boolean bool = true;
			List<WebElement> companies = ldriver.findElements(By.xpath("//div[@class='company_details']//div[@class='campany_name_address']/a"));
			int length = companies.size();
			System.out.println("Number of companies follwed: "+length);
			for(WebElement compFollowed : companies)
			{
				if(compFollowed.getText().equals(unfollowCompany))
				{
					bool = false;
					break;
				}
			}
			return bool;		
		}

		//Mouse hover action on Home Menu and click on it
		public void clkHomeMenu() {
			Actions action = new Actions(ldriver);
			action.moveToElement(homeMenu).build().perform();
			homeMenu.click();
		}

	 




		// Click Follow/Unfollow Company for RR logistics
		public void clkFollowCompany () {
			FollowCom.click();
			}
}
