package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CO_ProfilePage {

	public WebDriver ldriver;

	//Constructor

	public CO_ProfilePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//Capture the dropdown for 'Me' menu tab
	@FindBy(xpath = "//*[@id='navbardrop']")
	WebElement meMenudrpdwn;

	//Capture Settings menu from the Me menu drop-down
	@FindBy(xpath = "//a[@href='/company/settings']")
	WebElement settingsMenu;


	//Capture Logged in details from the drop-down
	@FindBy(xpath = "//div[@class='hr-detail']/label")
	WebElement hrDetails;
	//Capture Logged in details from the drop-down
	@FindBy(xpath = "//div[@class='hr-detail']/span")
	WebElement title;
	//Capture Welcome message
	@FindBy(xpath = "//div[@class='welcome-section']//h3")
	WebElement welcomeSection;

	//Capture User Management icon
	@FindBy(xpath = "//a[@href='/company/user']/span")
	WebElement umIcon;
	


	//--------Action Methods-------

	//Mouse hover action on Me Menu to view the drop-down list
	public void moveToMeMenu() {
		Actions action = new Actions(ldriver);
		action.moveToElement(meMenudrpdwn).build().perform();
	}
	//Verify if Welcome message is displayed
		public boolean isWelcomeDisplayed() {
			String actMsg = welcomeSection.getText();
			boolean bool = false;
			System.out.println("Actual message: "+actMsg);
			if(actMsg.contains("Welcome!"))
			{
				bool = true;
			}
			return bool;
		}
		//Click on User Management icon
		public void clkUMIcon() throws InterruptedException {
			Thread.sleep(1000);
			WebDriverWait wait = new WebDriverWait(ldriver, 60);
			wait.until(ExpectedConditions.visibilityOf(umIcon));
			Actions action = new Actions(ldriver);
			action.moveToElement(umIcon).build().perform();
			umIcon.click();
		}
	//Retrieve the title in details
	public String getTitleDetails() {
		String loggedTitle = title.getText();
		return loggedTitle;
	}

	//Mouse hover action and selecting on Settings Menu on the Me menu drop-down list
	public void clkSettingsMenu() {
		Actions action = new Actions(ldriver);
		action.moveToElement(settingsMenu).build().perform();
		settingsMenu.click();
	}

	//Retrieve the logged in details
	public String getHrDetails() {
		String loggedMail = hrDetails.getText();
		return loggedMail;
	}
}
