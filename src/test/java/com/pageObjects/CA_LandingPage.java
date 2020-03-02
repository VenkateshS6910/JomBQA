package com.pageObjects;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class CA_LandingPage {

	public WebDriver ldriver;

	//Constructor

	public CA_LandingPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//capture find company button
	@FindBy(xpath="//*[@id='navbarResponsive']/ul/li[2]/a")
	WebElement clkFindCompany;

	//Capture Find Jobs link
	@FindBy(xpath = "//a[contains(text(), 'Find Jobs')]")
	@CacheLookup
	WebElement lnkFindJobs;

	//Capture Find Companies link
	@FindBy(xpath = "//a[contains(text(), 'Find Companies')]")
	@CacheLookup
	WebElement lnkFindCompanies;

	//Capture Sign Up link
	@FindBy(xpath = "//a[contains(text(),'Sign Up')] ")
	//@FindBy(xpath = "//a[contains(text(), 'Sign up')]")
	//@CacheLookup
	WebElement lnkSignUp;

	//Capture login button 
	@FindBy//(xpath = "//a[contains(text(),'Login')]")
	          (xpath="//*[@id=\"navbar\"]/ul/li[6]/a[2]")
	@CacheLookup
	WebElement btnLogin;

	//Capture Companies button
	@FindBy(xpath = "//a[@href = '/company' and text() = 'Companies']")
	@CacheLookup
	WebElement btnCompanies;

	//Capture Workers button
	@FindBy(xpath = "//a[@href = '/candidate' and text() = 'Workers']")
	@CacheLookup
	WebElement btnWorkers;

	//Capture Jombone logo
	@FindBy(xpath="//*[@class = 'navbar navbar-expand-md navbar-dark']//img[@alt = 'logo']")
	//@FindBy(xpath="//a[@class='login_logo']//img")
	@CacheLookup
	WebElement logoJombone;

	//Capture Get Started button
	@FindBy(xpath = "//a[contains(text(), 'Get Started')]")
	@CacheLookup
	WebElement btnGetStarted;

	//Capture Show More button
	@FindBy(xpath = "//a[contains(text(), 'show more')]")
	@CacheLookup
	WebElement btnShowMore;

	//Capture Show Less button
	@FindBy(xpath = "//a[contains(text(), 'Show Less')]")
	@CacheLookup
	WebElement btnShowLess;

	//Capture About Jombone link
	@FindBy(xpath = "//ul[@class='list-unstyled']//a[contains(text(),'Company')]")
	@CacheLookup
	WebElement lnkAboutJombone;

	//Capture Mission Statement link
	@FindBy(xpath = "//a[contains(text(), 'Mission Statement')]")
	@CacheLookup
	WebElement lnkMissionStmt;

	//Capture Vision & Aspiration link
	@FindBy(linkText= "Vision & Aspiration")
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
	
	//Capture Google Play Store Button
	@FindBy(xpath="//div[@class='col-12']//a//img[@alt='google-play-icon']")
	WebElement btnGoogleStore;

	//Capture Toll Free link
	@FindBy(xpath = "//a[contains(text(), 'Toll Free')]")
	@CacheLookup
	WebElement lnkTollFree;

	//Capture Legal link
	@FindBy(xpath = "//a[contains(text(), 'Legal')]")
	@CacheLookup
	WebElement lnkLegal;
	//Capture Toll Free link
			@FindBy(xpath ="//a[contains(text(),'Toll Free')]")
			WebElement lnktollfree;

	//Capture Industries listed list 
	@FindBy(xpath = "//ul[@id='myList']")
	@CacheLookup
	List<WebElement> industryList;
	//Capture Contact us link
			@FindBy(xpath ="//a[contains(text(),'Contact Us')]")
			WebElement lnkcntctus;
			//Capture Facebook Link
			//@FindBy(xpath="//div[@id='atstbx']//a[@class='at-icon-wrapper at-share-btn at-svc-facebook']")
			@FindBy(how= How.XPATH, using = "//*[@id=\"wrapper\"]/footer/div/div[1]/div/div[2]/div/a[1]/i")
			WebElement lnkFacebook;
			//Capture Twitter Link
			//@FindBy(xpath="//div[@id='atstbx']//a[@class='at-icon-wrapper at-share-btn at-svc-twitter']")
			@FindBy(how= How.XPATH, using = "//li[@class='twitter']//a[contains(text(),'Tweet for quick replies to queries')]")
			WebElement lnkTwitter;
			//Capture Linkedin Link
			//@FindBy(xpath="//div[@id='atstbx']//a[@class='at-icon-wrapper at-share-btn at-svc-linkedin']")
			@FindBy(how= How.XPATH, using = "//li[@class='linked']//a[contains(text(),'Follow for regular updates')]")
			WebElement lnkLinkedin;
			//Capture Google Plus Link
			@FindBy(how= How.XPATH, using = "//li[@class='google-plus']//a[contains(text(),'Share on Google+')]")
			WebElement lnkGooglePlus;
			//Capture Company Webpage Button
			@FindBy(xpath="//li[@class='nav-item last']//a[@class='nav-link js-scroll-trigger']")
			public WebElement lnkbtnCompany;
			//capture the Leagel link from the Co landing page			
			@FindBy(xpath="//*[@id='page-top']/footer/div/div/div/div[1]/div/div[2]/ul/li[7]/a")
			WebElement clkLeagel;
			//capture the leagel link from the ABOUT JOMBONE PAGE		
			@FindBy(xpath="//*[@id='legalTab']")
			WebElement clk_Leagel;
			 

	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement btnSignUp;
	//Click on login button
	public void clkbtnLogin()
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(btnLogin));
		wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
		btnLogin.click();
	}

	//Click on Find Jobs link
	public void clklnkFindJobs() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(lnkFindJobs));
		wait.until(ExpectedConditions.elementToBeClickable(lnkFindJobs));
		lnkFindJobs.click();
	}
	@FindBy(xpath="//*[@id=\"wrapper\"]/footer/div/div[1]/div/div[3]/div/a[2]/img")
	WebElement applestore;
	public void clk_applestorelnk()
	{
		applestore.click();
	}
		String parenttab=null;
	//Retrieve title from Child Tab
			public String childtabtitle ()
			{
				parenttab= ldriver.getWindowHandle();
				String taburl ="";
				Set<String> handlevalues=ldriver.getWindowHandles();
				for(String h:handlevalues)
				{
					//System.out.println(h);
					ldriver.switchTo().window(h);
					String url=ldriver.getCurrentUrl();
					if(!url.contains("52.60.159.184"))
					taburl=url;
				}
				//System.out.println(taburl);
				return taburl;
			}
			//Click Twitter Option
			public void clklnkTwitter ()
			{
				WebDriverWait wait = new WebDriverWait(ldriver,30);
				wait.until(ExpectedConditions.visibilityOf(lnkTwitter));
				wait.until(ExpectedConditions.elementToBeClickable(lnkTwitter));
				lnkTwitter.click();
			}
			
			public void clkFindCompany() {
				WebDriverWait wait= new WebDriverWait(ldriver,25);
				wait.until(ExpectedConditions.elementToBeClickable(clkFindCompany));
				clkFindCompany.click();

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

			//Click on Company Button
			public void clkbtnCompany()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(lnkbtnCompany));
				wait.until(ExpectedConditions.elementToBeClickable(lnkbtnCompany));
				lnkbtnCompany.click();
			}
			

			//Click Linkedin Option
			public void clklnkLinkedin ()
			{
				WebDriverWait wait = new WebDriverWait(ldriver,30);
				wait.until(ExpectedConditions.visibilityOf(lnkLinkedin));
				wait.until(ExpectedConditions.elementToBeClickable(lnkLinkedin));
				lnkLinkedin.click();
			}
			//Click Google Plus Option
			public void clklnkGooglePlus ()
			{
				WebDriverWait wait = new WebDriverWait(ldriver,30);
				wait.until(ExpectedConditions.visibilityOf(lnkGooglePlus));
				wait.until(ExpectedConditions.elementToBeClickable(lnkGooglePlus));
				lnkGooglePlus.click();
			}
		
			//Click Facebook Option	
			public void clklnkFacebook ()
			{
				WebDriverWait wait = new WebDriverWait(ldriver,30);
				wait.until(ExpectedConditions.visibilityOf(lnkFacebook));
				wait.until(ExpectedConditions.elementToBeClickable(lnkFacebook));
				lnkFacebook.click();
			}		

			
			//Click on Apple App Store Button
			public void clkbtnApple()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(btnGoogleStore));
				wait.until(ExpectedConditions.elementToBeClickable(btnGoogleStore));
				btnGoogleStore.click();
			}

	//Click on Find Companies link
	public void clklnkFindCompanies() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(lnkFindCompanies));
		wait.until(ExpectedConditions.elementToBeClickable(lnkFindCompanies));
		lnkFindCompanies.click();
	}
	//Click on Google Play Store Button
			public void clkbtnGoogle()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(btnGoogleStore));
				wait.until(ExpectedConditions.elementToBeClickable(btnGoogleStore));
				btnGoogleStore.click();
			}
			//Return to Parent Window
			public void rtrnToparent()
			{
				ldriver.switchTo().window(parenttab);
			}

	//Click on Sign Up link
	public void clklnkSignUp() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		//wait.until(ExpectedConditions.visibilityOf(lnkSignUp));
		wait.until(ExpectedConditions.elementToBeClickable(lnkSignUp));
		lnkSignUp.click();
	}
	//Click Contact Us Link
			public void clklnktollfree()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(lnktollfree));
				wait.until(ExpectedConditions.elementToBeClickable(lnktollfree));
				lnktollfree.click();
			}
		
	//Click on Jombone logo
	public void clklogoJombone() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(logoJombone));
		wait.until(ExpectedConditions.elementToBeClickable(logoJombone));
		logoJombone.click();
	}
	public void clkSignUp() {
		WebDriverWait wait= new WebDriverWait(ldriver,25);
		wait.until(ExpectedConditions.elementToBeClickable(btnSignUp));
		btnSignUp.click();
	}
	//Click on Companies button
	public void clkbtnCompanies() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(btnCompanies));
		wait.until(ExpectedConditions.elementToBeClickable(btnCompanies));
		btnCompanies.click();
	}

	//Click on Get Started button
	public void clkbtnGetStarted() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(btnGetStarted));
		wait.until(ExpectedConditions.elementToBeClickable(btnGetStarted));
		btnGetStarted.click();
	}

	//Click on Show More button
	public void clkbtnShowMore() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(btnShowMore));
		wait.until(ExpectedConditions.elementToBeClickable(btnShowMore));
		btnShowMore.click();
	}

	//Click on Show Less button
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
	//Click Contact Us Link
			public void clklnkcntct()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(lnkcntctus));
				wait.until(ExpectedConditions.elementToBeClickable(lnkcntctus));
				lnkcntctus.click();
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







