 package com.pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CA_SettingsPage {
	
public WebDriver ldriver;
	
	//Constructor
	
		public CA_SettingsPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		//Capture Notification ON / OFF
		@FindBy(xpath = "//span[@class='ios-switch-control-indicator']")
		WebElement notificationBar;
		
		//Capture Notification Status Message pop-up
		@FindBy(xpath = "//div[@class='notif_update notifUpdate']")
		WebElement notificationStatus;

		//Capture Current Password text-box
		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[2]/div[1]/form[1]/div[1]/input[1]")
		WebElement currentPassword;

		//Capture New Password text-box
		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[2]/div[1]/form[1]/div[2]/input[1]")
		WebElement newPassword;

		//Capture Confirm Password text-box
		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[2]/div[1]/form[1]/div[3]/input[1]")
		WebElement confirmPassword;

		//Capture Save Changes button
		@FindBy(xpath = "//input[@class='btn btn-primary change_password']")
		WebElement btnSave;
		
		//Click on notification bar
				public String clkNotificationBar() throws InterruptedException {
					WebDriverWait wait = new WebDriverWait(ldriver,30);
					wait.until(ExpectedConditions.visibilityOf(notificationBar));		
					notificationBar.click();
					wait.until(ExpectedConditions.visibilityOf(notificationStatus));
					String labelNodeText = (String) ((JavascriptExecutor)ldriver).executeScript("return arguments[0].innerHTML",notificationStatus);
					System.out.println(labelNodeText);
					return labelNodeText;
				}

				 
			

		public void setcurrentpassword(String curntpwd)
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(currentPassword));
			currentPassword.sendKeys(curntpwd);
		}

		//Send text to new password field
		public void setnewpassword(String newpwd)
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(newPassword));
			newPassword.sendKeys(newpwd);
		}

		//Send text to confirm password field
		public void setconfirmpassword(String confirmpwd)
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(confirmPassword));
			confirmPassword.sendKeys(confirmpwd);
		}

		//Click on Save Changes button
		public void clkBtnSave() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(btnSave));
			btnSave.click();
			 
		}
		
}

