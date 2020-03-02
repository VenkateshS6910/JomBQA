package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CO_SettingsPage {

	public WebDriver ldriver;

	//Constructor

	public CO_SettingsPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//Capture Notification ON / OFF
	@FindBy(xpath = "//span[@class = 'ios-switch-control-indicator']")
	WebElement notificationBar;

	//Capture Notification Status Message pop-up
	@FindBy(xpath = "//div[@class='notif_update notifUpdate']")
	WebElement notificationStatus;

	//Capture Current Password text-box
	@FindBy(xpath = "//*[@id='currentPassword']")
	WebElement currentPassword;

	//Capture New Password text-box
	@FindBy(xpath = "//*[@id='newPassword']")
	WebElement newPassword;

	//Capture Confirm Password text-box
	@FindBy(xpath = "//*[@id='confirmPassword']")
	WebElement confirmPassword;

	//Capture Save Changes button
	@FindBy(xpath = "//input[@class='btn btn-primary change_password']")
	WebElement btnSave;

	//Capture Password Change success pop-up
	@FindBy(xpath = "//div[@class='sucPassword success_password']")
	WebElement pswdMessage;

	//Capture the dropdown for 'Me' menu tab
	@FindBy(xpath = "//*[@id='navbardrop']")
	WebElement meMenudrpdwn;

	//Capture Log Out menu from the Me menu drop-down
	@FindBy(xpath = "//a[@href='/candidate/logout']")
	WebElement logoutMenu;

	//Capture Yes button
	@FindBy(xpath="//div[@class='modal-body']//a[@href='/logout']")
	WebElement btnYes;

	//Capture Password Error Message Pop-up
	@FindBy(xpath = "//div[@class='errPassword error_password']")
	WebElement pswdPopup;

	//Capture CurrentPassword field error message
	@FindBy(xpath = "//*[@id='employerChangePassword']/div[1]/span")
	WebElement curntPswdError;

	//Capture NewPassword field error message
	@FindBy(xpath ="//*[@id='employerChangePassword']/div[2]/span")
	WebElement newPswdError;

	//Capture ConfirmPassword field error message
	@FindBy(xpath ="//*[@id='employerChangePassword']/div[3]/span")
	WebElement confirmPswdError;

	//Action Methods

	//Click on notification bar
	public void clkNotificationBar() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(notificationBar));		
		notificationBar.click();
	}

	//Retrieve message displayed in Notification Status Message pop-up
	public String notificationMsg() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(notificationStatus));
		String actMsg = notificationStatus.getText();
		System.out.println(actMsg);
		return actMsg;
	}

	//Send text to current password field
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

	//Retrieve message displayed in Password Status Message pop-up
	public String passwordMsg() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(pswdMessage));
		String pwdMsg = pswdMessage.getText();
		System.out.println(pwdMsg);
		return pwdMsg;
	}

	//Mouse hover action on Me Menu to view the drop-down list
	public void moveToMeMenu() {
		Actions action = new Actions(ldriver);
		action.moveToElement(meMenudrpdwn).build().perform();
	}

	//Mouse hover action and selecting on Log Out Menu on the Me menu drop-down list
	public void clkLogoutMenu() {
		Actions action = new Actions(ldriver);
		action.moveToElement(logoutMenu).build().perform();
		logoutMenu.click();

	}

	//Click on Yes button on pop-up
	public void clkBtnYes() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(btnYes));
		btnYes.click();		
	}

	//Retrieve error message displayed in Password Status Message pop-up
	public String passwordErrorMsg() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(pswdPopup));
		String pwdErrorMsg = pswdPopup.getText();
		System.out.println(pwdErrorMsg);
		return pwdErrorMsg;
	}

	//Retrieve error message displayed in New Password field
	public String newpswrdErrorMsg() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(newPswdError));
		String newPwdErrorMsg = newPswdError.getText();
		System.out.println(newPwdErrorMsg);
		return newPwdErrorMsg;
	}

	//Retrieve error message displayed in Current Password field
	public String curntpswrdErrorMsg() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(curntPswdError));
		String curntPwdErrorMsg = curntPswdError.getText();
		System.out.println(curntPwdErrorMsg);
		return curntPwdErrorMsg;
	}


	//Retrieve error message displayed in Confirm Password field
	public String confirmpswrdErrorMsg() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(confirmPswdError));
		String confirmPwdErrorMsg = confirmPswdError.getText();
		System.out.println(confirmPwdErrorMsg);
		return confirmPwdErrorMsg;
	}







}
