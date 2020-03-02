package com.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CO_LoginPage {

	public WebDriver ldriver;

	//Constructor
	public CO_LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//Capture email field
	@FindBy(id="email")
	public WebElement txtemail;

	//Capture password field
	@FindBy(id="password-field")
	WebElement txtpassword;

	//Capture Submit button
	@FindBy(id="sbBt")
	WebElement btnSubmit;

	@FindBy(xpath=" //*[@id='candidateLogin']/table/tbody/tr[4]/td[1]/a")
	WebElement btnForgotPassword;

	@FindBy(xpath ="//*[@id='linked-expired-msz']/div")
	WebElement message;
	//==================Action methods===========================//

	//Send text to the email field
	public void settxtemail(String email)
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(txtemail));
		txtemail.clear();
		txtemail.sendKeys(email);
	}

	//Send text to password field
	public void settxtpassword(String pwd)
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(txtpassword));
		txtpassword.clear();
		txtpassword.sendKeys(pwd);
	}

	//Click on submit button
	public void clkbtnSubmit()
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(btnSubmit));
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
		btnSubmit.click();
	}
	// retrieve invalid credential message
	public String getInvalidCredentials(String user,String psw) {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		settxtemail(user);
		settxtpassword(psw);
		clkbtnSubmit();
		wait.until(ExpectedConditions.visibilityOf(message));
		String text=message.getText();
		return text;
	}
	// retrieve blank email error message 	
	public String blankEmailErrorMessage(String user,String psw) {
		settxtemail(user);
		txtemail.sendKeys(Keys.TAB);
		String text =txtemail.getAttribute("data-validation-error-msg");
		return text;
	}
	// retrieve blank password message
	public String blankPasswordErrorMessage(String user,String psw) {
		settxtemail(user);
		settxtpassword(psw);
		txtpassword.sendKeys(Keys.TAB);
		String text = txtpassword.getAttribute("data-validation-error-msg");
		return text;
	}

}
