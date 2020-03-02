package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
public class LoginPage {


	public WebDriver ldriver;

	//Constructor

	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//Capture email field
	@FindBy(id="email")
	//@CacheLookup
	WebElement txtemail;

	//Capture password field
	@FindBy(id="password-field")
	//@CacheLookup
	WebElement txtpassword;

	//Capture Submit button
	@FindBy(id="sbBt")
	//@CacheLookup
	WebElement btnSubmit;//Capture Update Profile prompt
	@FindBy (xpath = "//div[@id='update-profile-prompt']//div[@class='modal-content']")
	WebElement Prompt;
	
	//Capture Cancel img to close the update profile prompt
	@FindBy (xpath = "//div[@id='update-profile-prompt']//img")
	WebElement cancelPrompt;
	
	// Click on Cancel the Update profile Prompt 

	//Capture Jombone  login logo
	@FindBy (xpath = "//a[@class='login_logo']//img")
	WebElement loginlogo;		
	
	
	//Capture Flash Red Error Message
			@FindBy(xpath="//div[@id='linked-expired-msz']//div[@class='flash-msg-red']")
			WebElement msgInv;


			//Capture Help Error Message
			@FindBy(xpath="//span[@class='help-block errorMsg']")
			WebElement errmsg;
			//Capture Forgot Password Link
			@FindBy(xpath="//form[@id='candidateLogin']//a[contains(text(),'Forgot Password?')]")
			WebElement lnkfrgtpwd;
			//Capture Signup Link
			@FindBy(xpath="//a[contains(text(),'Sign Up')]")
			WebElement lnksignup;

			@FindBy(xpath ="//*[@id='linked-expired-msz']/div")
			WebElement message;


			//Capture confirm log out button
			@FindBy (xpath = "//div[@id='signOut']//a[@class='yesBtn'][contains(text(),'yes')]")
			WebElement ConfLogout;
			
			// Capture Me tab 
			@FindBy (xpath = "//a[@id='navbardrop']")
			WebElement MeTab;
			
			// Capture Log out from Me Drop Down
			@FindBy (xpath="//a[@class='dropdown-item'][contains(text(),'Log Out')]")
			WebElement LogOut;
			

			

	//==================Action methods===========================//
	
	//Retrieve flash error message
			public String flsherrmsg()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(msgInv));
				return msgInv.getText();
			}
			//Logging Out 
			public void logout() throws InterruptedException {
				Thread.sleep(2000);
				Actions a = new Actions (ldriver);
				a.moveToElement(MeTab).build().perform();
				a.moveToElement(LogOut).click().build().perform();
				ConfLogout.click();
			}
			//Verify if Invalid Credential pop-up message is displayed
			public boolean isValidationErrorMsgDisplayed() {
				boolean bool = false;
				WebElement errorMsg = ldriver.findElement(By.xpath("//div[@class='flash-msg-td-login']/div[@class='flash-msg-red']"));
				String actMessage = errorMsg.getText();
				if(actMessage.equals("Invalid credentials.")) {
					bool = true;
				}
				return bool;
			}
			 
			
			//Capture login button 
			@FindBy(xpath = "//a[contains(text(),'Login')]")
			@CacheLookup
			WebElement btnLogin;
			
			
			//Click on login button
			public void clkbtnLogin()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(btnLogin));
				wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
				btnLogin.click();
			}
		
			
			
		
	


			//Click on login logo
	
	//00public void clkLoginLogo() {
		//	loginlogo.click();
		//}
	public void invldlogin(String user,String pwd)
	{
		System.out.println("Login with '"+user+"' & '"+pwd+"' as Username and Password.");
		settxtemail(user);
		settxtpassword(pwd);
		clkbtnSubmit();
	}

	public void blnkpwdlogin(String user) 
	{	
		ldriver.navigate().refresh();
		System.out.println("Login with '"+user+"' & '' as Username and Password.");
		settxtemail(user);
		clkbtnSubmit();
	}



	public void clkCancelPrompt()
	{
		if (Prompt.isDisplayed()) {
			cancelPrompt.click();}
	}
	//Click on SignUp Link
			public void clklnksignup()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(lnksignup));
				wait.until(ExpectedConditions.elementToBeClickable(lnksignup));
				lnksignup.click();
			}

	//Retrieve Help Error Message
			public String hlperrmsg()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(errmsg));
				return errmsg.getText();
			}

	
	//Send text to the email field
	public void settxtemail(String email)
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(txtemail));
		txtemail.sendKeys(email);
	}

	//Send text to password field
	public void settxtpassword(String pwd)
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(txtpassword));
		txtpassword.sendKeys(pwd);
	}
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

	//Click on submit button
	public void clkbtnSubmit()
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(btnSubmit));
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
		btnSubmit.click();
	}
	//Click on Forgot Password Link
			public void clklnkfrgtpwd()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(lnkfrgtpwd));
				wait.until(ExpectedConditions.elementToBeClickable(lnkfrgtpwd));
				lnkfrgtpwd.click();
			}
			public String getInvalidCredentials(String user,String psw) {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				//ldriver.navigate().refresh();
				settxtemail(user);
				settxtpassword(psw);
				clkbtnSubmit();
				wait.until(ExpectedConditions.visibilityOf(message));
				String text=message.getText();
				return text;
			}

			//Verify if error message is displayed when inactive credential is given
				public boolean isErrorMsgDisplayed() {
					boolean bool = false;
					WebElement errorMsg = ldriver.findElement(By.xpath("//div[@class='flash-msg-td-login']/div[@class='flash-msg-red']"));
					String actMessage = errorMsg.getText();
					System.out.println("Actual Error Message: "+actMessage);
					if(!actMessage.isEmpty()) {
						bool = true;
					}
					return bool;
				}

			//Retrieve Error message displayed under Email field
			public String getEmailErrorMsg() {
				WebElement emailError = ldriver.findElement(By.xpath("//*[@id='candidateLogin']/table/tbody/tr[1]/td/div/span"));
				String actMsg = emailError.getText();
				return actMsg;
			}

			//Retrieve Error message displayed under Password field
			public String getPasswordErrorMsg() {
				WebElement emailError = ldriver.findElement(By.xpath("//*[@id='candidateLogin']/table/tbody/tr[2]/td/div/div/span"));
				String actMsg = emailError.getText();
				return actMsg;
			}

			//Capture email field
			@FindBy(id="email")
			 
			WebElement Txtemail;
			
			//Capture password field
			@FindBy(id="password-field")
			 
			WebElement Txtpassword;
			
			//Capture Submit button
			@FindBy(id="sbBt")
			 
			WebElement BtnSubmit;
			
			
			
			//==================Action methods===========================//
			
			//Send text to the email field
			public void settxtemail()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(txtemail));
				txtemail.sendKeys("warehouse@mailinator.com");
			}
			
			//Send text to password field
			public void settxtpassword()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(txtpassword));
				txtpassword.sendKeys("jombone2Test");
			}
			
			//Click on submit button
			public void clkBtnSubmit()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(btnSubmit));
				wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
				btnSubmit.click();

			}
			
			

			//Send text to the email field
			public void settxtemailCa()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(txtemail));
				txtemail.sendKeys("anjali.09mishra93@gmail.com");
			}
			
			//Send text to password field
			public void settxtpasswordCa()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(txtpassword));
				txtpassword.sendKeys("Mishra1!");
			}
			
			public void settxtemailCAA()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(txtemail));
				txtemail.sendKeys("mishrajobs43@gmail.com");
			}
			
			//Send text to password field
			public void settxtpasswordCAA()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(txtpassword));
				txtpassword.sendKeys("Mishra1!");
			}
			


			public void settxtemailCO()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(txtemail));
				txtemail.sendKeys("rrlog@mailinator.com");
			}
			

			public void settxtpasswordCO()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(txtpassword));
				txtpassword.sendKeys("jombone2Test");
			}
			




	}









 
