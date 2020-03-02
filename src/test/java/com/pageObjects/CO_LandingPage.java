package com.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CO_LandingPage {

	public WebDriver ldriver;

	//Constructor

	public CO_LandingPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
  
	//capture the companies link
		@FindBy(xpath="//*[@id='navbarResponsive']/ul/li[5]/a")
		public static WebElement lnkCompanies;
	@FindBy(xpath = "//a[contains(text(), 'Find Jobs')]")
	@CacheLookup
	WebElement lnkFindJobs;

	//Capture Find Companies link
	@FindBy(xpath = "//a[contains(text(), 'Find Companies')]")
	@CacheLookup
	WebElement lnkFindCompanies;

	//Capture Sign Up link
	@FindBy(xpath = "//a[contains(text(), 'Sign up')]")
	@CacheLookup
	WebElement lnkSignUp;

	//Capture login button 
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	@CacheLookup
	WebElement btnLogin;

	//Capture Workers button
	@FindBy(xpath = "//a[contains(text(), 'Workers')]")
	@CacheLookup
	WebElement btnWorkers;


	//Capture Get Started button
	@FindBy(xpath = "//a[contains(text(), 'get started')]")
	@CacheLookup
	WebElement btnGetStarted;

	//Capture Get Started buttons in pricing model
	@FindBy(xpath = "//*[@class= 'select-plan' and text() = 'GET STARTED']")
	@CacheLookup
	List<WebElement> btnsPMGetStrtd;

	//Capture Show More button
	@FindBy(xpath = "//a[contains(text(), 'show more')]")
	@CacheLookup
	WebElement btnShowMore;

	//Capture Show Less button
	@FindBy(xpath = "//a[contains(text(), 'Show Less')]")
	@CacheLookup
	WebElement btnShowLess;

	//Capture About Jombone link
	@FindBy(xpath = "//a[contains(text(), 'About Jombone')]")
	@CacheLookup
	WebElement lnkAboutJombone;
	//capture the JOMBONE Partial Self Service SUBSCRIPTION get started link
	@FindBy(xpath="//*[@id='pricing-table']/div/div/div/div/div[3]/div/button")
	public static WebElement clkPartialSelfSerSub_GetStarted;

	//Capture Mission Statement link
	@FindBy(xpath = "//a[contains(text(), 'Mission Statement')]")
	@CacheLookup
	WebElement lnkMissionStmt;
	//capture the JOMBONE Self Service SUBSCRIPTION get started link
	@FindBy(xpath="//*[@id='pricing-table']/div/div/div/div/div[2]/div/button")
	public static WebElement clkSelfSerSub_GetStarted;

	//Capture Vision & Aspiration link
	@FindBy(xpath = "//a[contains(text(), 'Vision & Aspiration')]")
	@CacheLookup
	WebElement lnkVisionAspiration;

	//Capture Office Locations link
	@FindBy(xpath = "//a[contains(text(), 'Office Locations')]")
	@CacheLookup
	WebElement lnkOfficeLoctn;

	//Capture Contact Us link
	@FindBy(xpath = "//a[contains(text(), 'Contact Us')]")
	@CacheLookup
	WebElement lnkContactUs;

	//Capture Toll Free link
	@FindBy(xpath = "//a[contains(text(), 'Toll Free')]")
	@CacheLookup
	WebElement lnkTollFree;

	//Capture Legal link
	@FindBy(xpath = "//a[contains(text(), 'Legal')]")
	@CacheLookup
	WebElement lnkLegal;
	//Capture Find Job button 
	@FindBy(xpath = "//a[contains(text(),'Find Jobs')]")
	WebElement btnFindjb;
	//capture the JOMBONE MANAGED SUBSCRIPTION get started link
		@FindBy(xpath="//*[@id='pricing-table']/div/div/div/div/div[1]/div/button")
		public static WebElement clkManagedSub_GetStarted;
		//capture the JOMBONE Partial Self Service SUBSCRIPTION get started link
		@FindBy(xpath="//*[@id='pricing-table']/div/div/div/div/div[3]/div/button")
		public static WebElement clkPartialSelfSerSub_GetSt;
	
	//capture link candidate on the sign up page
		@FindBy(xpath="//li[@class='nav-item']/a[contains(text(),'Candidate')]")
		public static WebElement lnkCandidate;
		//capture the pricing models
		@FindBy(xpath="//*[@id='pricing-table']/div/div/div/h2")
		WebElement imgPrincingModels;
		//capture the vision and aspiration link
		@FindBy(xpath="//*[@id='page-top']/footer/div/div/div/div[1]/div/div[2]/ul/li[3]/a")
		WebElement clkVisionAspiration;

		//capture link get started on the company landing page
				@FindBy(xpath="//*[@id='myCarousel']/div/div/div/a")
				WebElement lnkGetStarted;
				//capture the vision and aspiration link from the ABOUT JOMBONE PAGE		
				@FindBy(xpath="//*[@id='visionTab']")
				WebElement clkVision_Aspiration;
				//capture the office location link from the Co landing page		
				@FindBy(xpath="//*[@id='page-top']/footer/div/div/div/div[1]/div/div[2]/ul/li[4]/a")
				WebElement clkOfficeLocation;
				//capture the contact us link from the ABOUT JOMBONE PAGE		
				@FindBy(xpath="//*[@id='contactTab']")
				WebElement clkContact_Us;
				@FindBy(xpath="//*[@id='page-top']/footer/div/div/div/div[1]/div/div[2]/ul/li[5]/a")
				WebElement clkContactUs;
				//capture the Leagel link from the Co landing page			
				@FindBy(xpath="//*[@id='page-top']/footer/div/div/div/div[1]/div/div[2]/ul/li[7]/a")
				WebElement clkLeagel;
				//capture the leagel link from the ABOUT JOMBONE PAGE		
				@FindBy(xpath="//*[@id='legalTab']")
				WebElement clk_Leagel;
                // capture applestore 
				@FindBy(xpath="//li[2]//a[1]//img[1]")
				WebElement applestore;
		//capture the Login link
		@FindBy(xpath="//*[@id='navbarResponsive']/ul/li[4]/a")
		WebElement lnkLogin;
		//capture the office location link from the ABOUT JOMBONE PAGE		
		@FindBy(xpath="//*[@id='locationTab']")
		WebElement clkOffice_Location;
		//capture the contact us link from the ABOUT JOMBONE PAGE		
		@FindBy(xpath="//*[@id='contactTab']")
		WebElement clkToll_Free;
		@FindBy(xpath="//*[@id='page-top']/footer/div/div/div/div[1]/div/div[2]/ul/li[6]/a")
		WebElement clkTollFree;
        //capture link google playstore
		@FindBy(xpath="//li[1]//a[1]//img[1]")
		WebElement googleplaystore;
		// capture faceboklink
		@FindBy(xpath="//*[@id=\"wrapper\"]/footer/div/div[1]/div/div[2]/div/a[1]/i")
		WebElement lnkfacebook;
		//capture link twitter
		@FindBy(xpath="//i[@class='fa fa-twitter']")
				WebElement lnktwitter;
		// capture linkdin
		@FindBy (xpath=/*"//a[contains(text(),'Follow for regular updates')]"*/"//i[@class='fa fa-linkedin']")
		public
				WebElement lnklinkdin;
		// capture googleplus
		@FindBy(xpath="//a[contains(text(),'Share on Google+')]")
		WebElement googleplus;
		
		
		public void clk_GetStartedLink() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.elementToBeClickable(lnkGetStarted));
			lnkGetStarted.click();
		}
		public void clkLinkGooglePlus()
		{
			googleplus.click();
		}
		public void clklinklinkedin()
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.elementToBeClickable(lnklinkdin));
			lnklinkdin.click();
		}
		public void clkLinkFacebook()
		{
			lnkfacebook.click();
		}
		public void clkLinkTwitter()
		{
			lnktwitter.click();
		}
		public void clk_ManagedSub_GetStarted() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.elementToBeClickable(clkManagedSub_GetStarted));
			clkManagedSub_GetStarted.click();
		}
		public void clklinkgoogleplaystore() {
			googleplaystore.click();
		}
		public void clkLinkAppleStore()
		{
			applestore.click();
		}
		public void clk_PartialSelfSerSub_GetStarted() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.elementToBeClickable(clkPartialSelfSerSub_GetStarted));
			clkPartialSelfSerSub_GetStarted.click();
		}
		public void scrollPageDown(WebDriver driver){
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}
		public void clk_VisionAspiration() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.elementToBeClickable(clkVisionAspiration));
			clkVisionAspiration.click();
		}
		//click from the About jombone page
		public void clk_Office_Location() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.elementToBeClickable(clkOffice_Location));
			clkOffice_Location.click();
		}
		public void clk_ContactUs() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.elementToBeClickable(clkContactUs));
			clkContactUs.click();
		}
		//click from the About jombone page
		public void clk_Contact_Us() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.elementToBeClickable(clkContact_Us));
			clkContact_Us.click();
		}
		public void clk_TollFree() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.elementToBeClickable(clkTollFree));
			clkTollFree.click();
		}
		//click from the About jombone page
		public void clk_Toll_Free() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.elementToBeClickable(clkToll_Free));
			clkToll_Free.click();
		}
		public void clk_legel() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.elementToBeClickable(clkLeagel));
			clkLeagel.click();
		}
		//click from the About jombone page
		public void clk_CO_Leagel() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.elementToBeClickable(clk_Leagel));
			clk_Leagel.click();
		}

		public void scrollIntoView( WebDriver driver){
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].scrollIntoView(true);",imgPrincingModels );

		}
		public void clk_SelfSerSub_GetStarted() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.elementToBeClickable(clkSelfSerSub_GetStarted));
			clkSelfSerSub_GetStarted.click();
		}
		//click from the About jombone page
		public void clk_Vision_Aspiration() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.elementToBeClickable(clkVision_Aspiration));
			clkVision_Aspiration.click();
		}

		//Click on login button
	public void clkbtnLogin()
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(btnLogin));
		wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
		btnLogin.click();
	}
	public void clk_OfficeLocation() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.elementToBeClickable(clkOfficeLocation));
		clkOfficeLocation.click();
	}

	//Click on Find Jobs link
	public void clklnkFindJobs() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(lnkFindJobs));
		wait.until(ExpectedConditions.elementToBeClickable(lnkFindJobs));
		lnkFindJobs.click();
	}
	public void drawBorder(WebElement element, WebDriver driver){
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	public void clk_LoginLink() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.elementToBeClickable(lnkLogin));
		lnkLogin.click();
	}

	//Click on Find Companies link
	public void clklnkFindCompanies() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(lnkFindCompanies));
		wait.until(ExpectedConditions.elementToBeClickable(lnkFindCompanies));
		lnkFindCompanies.click();
	}
	public void clk_CompanyLink() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.elementToBeClickable(lnkCompanies));
		lnkCompanies.click();
	}

	public void clk_SignUpLink() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.elementToBeClickable(lnkSignUp));
		lnkSignUp.click();
	}

	//Click on Sign Up link
	public void clklnkSignUp() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(lnkSignUp));
		wait.until(ExpectedConditions.elementToBeClickable(lnkSignUp));
		lnkSignUp.click();
	}

	//Click on Workers button
	public void clkbtnWorkers()
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(btnWorkers));
		wait.until(ExpectedConditions.elementToBeClickable(btnWorkers));
		btnWorkers.click();
	}



	//Click on Get Started button
	public void clkbtnGetStarted() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(btnGetStarted));
		wait.until(ExpectedConditions.elementToBeClickable(btnGetStarted));
		btnGetStarted.click();
	}

	//Validating presence of Get Started buttons in Pricing Model
	public int validateBtnsGetStarted() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		int btnCount = 0;
		for (WebElement GtStrtd:btnsPMGetStrtd) {
			wait.until(ExpectedConditions.and(ExpectedConditions.visibilityOf(GtStrtd),
					(ExpectedConditions.elementToBeClickable(GtStrtd))));
			btnCount++;
		}
		return btnCount;
	}

	//Click on Show More button
	public void clkbtnShowMore() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(btnShowMore));
		wait.until(ExpectedConditions.elementToBeClickable(btnShowMore));
		btnShowMore.click();
	}

	//Click on Get Started button
	public void clkbtnShowLess() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(btnShowLess));
		wait.until(ExpectedConditions.elementToBeClickable(btnShowLess));
		btnShowLess.click();
	}

	//Click on About Jombone link
	public void clklnkAboutJombone() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(lnkAboutJombone));
		wait.until(ExpectedConditions.elementToBeClickable(lnkAboutJombone));
		lnkAboutJombone.click();
	}

	//Click on Mission Statement link
	public void clklnkMissionStmt() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(lnkMissionStmt));
		wait.until(ExpectedConditions.elementToBeClickable(lnkMissionStmt));
		lnkMissionStmt.click();
	}
	//Click on Vision & Aspiration link
	public void clklnkVisionAspiration() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(lnkVisionAspiration));
		wait.until(ExpectedConditions.elementToBeClickable(lnkVisionAspiration));
		lnkVisionAspiration.click();
	}

	//Click on Office Locations link
	public void clklnkOfficeLoctn() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(lnkOfficeLoctn));
		wait.until(ExpectedConditions.elementToBeClickable(lnkOfficeLoctn));
		lnkOfficeLoctn.click();
	}

	//Click on Contact Us link
	public void clklnkContactUs() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(lnkContactUs));
		wait.until(ExpectedConditions.elementToBeClickable(lnkContactUs));
		lnkContactUs.click();
	}

	//Click on Toll Free link
	public void clklnkTollFree() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(lnkTollFree));
		wait.until(ExpectedConditions.elementToBeClickable(lnkTollFree));
		lnkTollFree.click();
	}

	//Click on Legal link
	public void clklnkLegal() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(lnkLegal));
		wait.until(ExpectedConditions.elementToBeClickable(lnkLegal));
		lnkLegal.click();
	}

	//Clicking Show More button and validation
	public boolean btnShowMoreValidation() {
		/*Getting the number of elements displayed in 
		 *the industries list before clicking the 
		 *Show More button
		 */
		List<WebElement> industriesInitialList = ldriver.findElements(By.xpath("//*[@id='industries']//ul[1]/li"));
		int len1 = industriesInitialList.size();

		//Verifying whether Show More button is displayed and is clickable 
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(btnShowMore));
		wait.until(ExpectedConditions.elementToBeClickable(btnShowMore));
		btnShowMore.click();


		/*Getting the number of elements displayed in 
		 *the industries list after clicking the 
		 *Show More button
		 */
		List<WebElement> industries = ldriver.findElements(By.xpath("//*[@id='industries']//ul/li"));
		int len2 = industries.size();

		//Validating if the industry list count has increased or not
		boolean bool = false;
		if(len2>len1)
		{	
			bool = true;
			System.out.println("More Industries are listed!");
		}
		else
		{
			System.out.println("More Industries are not listed!");	
		}
		return bool;
	}
	
	//Click on Find Job Button
	public void clkbtnFindjb()
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(btnFindjb));
		wait.until(ExpectedConditions.elementToBeClickable(btnFindjb));
		btnFindjb.click();
	}


	//Clicking Show Less button and validation
	public boolean btnShowLessValidation() {
		/*Getting the number of elements displayed in 
		 *the industries list before clicking the 
		 *Show Less button
		 */
		List<WebElement> industries2 = ldriver.findElements(By.xpath("//*[@id='industries']//ul/li"));
		int length1 = industries2.size();

		//Verifying whether Show Less button is displayed and is clickable 
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(btnShowLess));
		wait.until(ExpectedConditions.elementToBeClickable(btnShowLess));
		btnShowLess.click();

		/*Getting the number of elements displayed in 
		 *the industries list after clicking the 
		 *Show Less button
		 */
		List<WebElement> industriesSecondList = ldriver.findElements(By.xpath("//*[@id='industries']//ul[1]/li"));
		int length2 = industriesSecondList.size();

		//Validating if the industry list count has reduced or not
		boolean bool = false;
		if(length2<length1)
		{
			bool = true;
			System.out.println("Industry list is reduced!");
		}
		else
		{
			System.out.println("Industry list is not reduced!");	
		}
		return bool;
	}

}


