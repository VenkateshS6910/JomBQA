package com.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CA_SignupPage {

	public WebDriver ldriver;

	//Constructor

	public CA_SignupPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//Capture Candidate tab
	@FindBy(xpath = "//a[contains(text(),'Candidate')]")
	@CacheLookup
	WebElement tbCandidate;

	//Capture First Name field
	@FindBy(xpath = "//input[@id='firstname']")
	@CacheLookup
	WebElement txtFName;

	//Capture Last Name field
	@FindBy(xpath = "//input[@id='lastname']")
	@CacheLookup
	WebElement txtLName;

	//Capture Email field
	@FindBy(xpath = "//input[@id='email']")
	@CacheLookup
	WebElement txtEmail;

	//Capture Phone Number field
	@FindBy(xpath = "//*[@id='phone']")
	@CacheLookup
	WebElement phNum;

	//Capture Password field
	@FindBy(xpath = "//*[@id='password-field']")
	@CacheLookup
	WebElement passWord;

	//Capture Country Code combo-box
	//@FindBy(xpath = "//*[@id='candidateForm']//div[@class='selected-flag']")
	@FindBy(xpath = "//*[@id=\"candidateForm\"]//div[@role='combobox']")
	@CacheLookup
	WebElement CountryCode;


	//Capture Captcha check-box
	@FindBy(xpath = "//*[@id='password-field']")
	@CacheLookup
	WebElement captcha;
	

	@FindBy(xpath="//input[@id='phone']")
	WebElement txtPhone;
	//capture error msg from the phone field
			@FindBy(xpath="//input[@id='phone']/following-sibling::span")
			public static WebElement errorMsg;
			//capture error msg from the password field
			@FindBy(xpath="//input[@id='password-field']/following-sibling::span[2]")
			public static WebElement errorMsgPassword;
			@FindBy(xpath="//input[@id='password-field']")
			WebElement txtPassword;
			 @FindBy(xpath="//input[@id='sbBt']")
			 public static WebElement btnsignup;
			//capture first name field 
			@FindBy(xpath="//input[@id='firstname']")
			WebElement txtFirstName;
			//capture last name field 
			@FindBy(xpath="//input[@id='lastname']")
			WebElement txtLastName;
			//capture email field 
			@FindBy(xpath="//input[@id='email']")
			WebElement txtemail;
			//capture login link
			@FindBy(xpath="//*[@id=\"candidateForm\"]/table[1]/tbody/tr[7]/td/label/a")
			WebElement btnLogin;
			//capture user agreement link
			@FindBy(xpath="//*[@id=\"candidateForm\"]/table[2]/tbody/tr/td/p/a[1]")
			WebElement btnUserAgreement;
			//capture privacy policy link
			@FindBy(xpath="//*[@id=\"candidateForm\"]/table[2]/tbody/tr/td/p/a[2]")
			WebElement btnPrivacyPolicy;
			//capture cookies link
			@FindBy(xpath="//form[@id=\"candidateForm\"]/table[2]/tbody/tr/td/p/a[3]")
			WebElement btnCookies;

	//==================Action methods===========================//

	//Verifying if candidate tab is enabled
	public boolean IsTbCandidateClicked() {
		boolean bool = false;
		if(tbCandidate.getAttribute("class").contains("active show")) {
			bool = true;
			System.out.println("Candidate Signup page is displayed");

		}
		else {
			System.out.println("Candidate sign up page is not displayed");
		}
		return bool;
	}
	
	public String getErrorMsg_Phone(String num) {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(txtPhone));
		txtPhone.sendKeys(num);
		txtPhone.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(errorMsg));
		String text=errorMsg.getText();
		return text;
	}
 
	//click cookies
	public void clickCookies() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.elementToBeClickable(btnCookies));
		btnCookies.click();
	}

	//click login page
			public void clickLoginPage() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
				btnLogin.click();	
			}
			 
			//click privacy policy
			public void clickPrivacyPolicy() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.elementToBeClickable(btnPrivacyPolicy));
				btnPrivacyPolicy.click();
			}

	public void setAllFieldsWithValidData(String FName,String LName,String email,String phone,String password) {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(txtFirstName));
		txtFirstName.sendKeys(FName);
		wait.until(ExpectedConditions.visibilityOf(txtLastName));
		txtLastName.sendKeys(LName);
		wait.until(ExpectedConditions.visibilityOf(txtemail));
		txtemail.sendKeys(email);
		wait.until(ExpectedConditions.visibilityOf(txtPhone));
		txtPhone.sendKeys(phone);
		wait.until(ExpectedConditions.visibilityOf(txtPassword));
		txtPassword.sendKeys(password);
		ldriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[6]/td[1]/input[1]")).click();
//		System.out.println(count);
//		for(int i =0;i<count;i++) {
//			if(i==2)
//			ldriver.findElements(By.xpath("//span[@id='recaptcha-anchor']")).get(i).click();
//			break;
//		}
	}

	//click user agreement
			public void clickUserAgreement() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.elementToBeClickable(btnUserAgreement));
				btnUserAgreement.click();
			}


	//Sending values to First Name field
	public void setFirstName(String fName) {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(txtFName));
		txtFName.clear();
		txtFName.sendKeys(fName);
	}

	//Tab key pressing
	public void clkFNEnterKey()
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(txtFName));		
		txtFName.sendKeys(Keys.ENTER);	
	}

	//Value retrieval from First Name
	public String valueRetrieveFN() {
		String valueEntered = txtFName.getAttribute("value");
		return valueEntered; 

	}

	//Sending values to Last Name field
	public void setLastName(String lName) {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(txtLName));
		txtLName.sendKeys(lName);
	}

	//Enter key pressing
	public void clkLNEnterKey()
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(txtLName));
		txtLName.sendKeys(Keys.ENTER);	
	}

	//Value retrieval from Last Name field
	public String valueRetrieveLN() {
		String valueEntered = txtLName.getAttribute("value");
		return valueEntered;

	}
	 
	//Error Message for First Name field
	public String getFNErrorMessage() {
		String errMsgFN = txtFName.getAttribute("data-validation-current-error");
		return errMsgFN;
	}

	//Error Message for Last Name field
	public String getLNErrorMessage() {
		String errMsgLN = txtLName.getAttribute("data-validation-current-error");
		return errMsgLN;
	}

	//Sending values to Email field
	public void setEmail(String eMail) {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(txtEmail));
		txtEmail.clear();
		txtEmail.sendKeys(eMail);
	}

	//Enter key pressing
	public void clkEmailEnterKey()
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(txtEmail));
		txtEmail.sendKeys(Keys.ENTER);	
	}

	public void setPhoneNumber(long num) {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(txtPhone));
		txtPhone.sendKeys(Long.toString(num));
		txtPhone.sendKeys(Keys.ENTER);
	}
	

	//Error Message for Email field
	public String getEmailErrorMessage() {
		String actErrMsg = txtEmail.getAttribute("data-validation-current-error");
		return actErrMsg;
	}

	//Value retrieval from Email field
	public String valueRetrieveEmail() {
		String valueEntered = txtEmail.getAttribute("value");
		return valueEntered;

	}

	//Sending values to Phone Number field
	public void setPhoneNumber(String phNo) {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(phNum));
		phNum.clear();
		phNum.sendKeys(phNo);
	}

	//Sending values to Password field
	public void setPassword(String pswrd) {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(passWord));
		passWord.clear();
		passWord.sendKeys(pswrd);
	      txtPassword.sendKeys(Keys.ENTER);
}

	//Selecting values in Country Code drop-down
	/*public void setCountryCode(String ccValue) {
		Select dropdwn = new Select(CountryCode);
		dropdwn.selectByValue(ccValue);
	}*/

	//Clicking Country Code combo-box
	public void clkCountryComboBox() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(CountryCode));
		CountryCode.click();		
	}

	//Selecting the required country code
	public void setCountryCode(String countryValue) {
		List<WebElement> list = ldriver.findElements(By.xpath("//*[@class='country standard']"));
		System.out.println(list.size());
		for (WebElement ele : list)
		{
			System.out.println("Values " + ele.getAttribute("data-dial-code"));
			if (ele.getAttribute("data-dial-code").equals(countryValue)) 
			{
				ele.click();
				break;
			}

		}



	}



}
