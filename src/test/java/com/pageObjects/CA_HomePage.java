package com.pageObjects;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CA_HomePage {

	public WebDriver ldriver;

	//Constructor

	public CA_HomePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//Capture Home Link
	@FindBy(xpath = "//li[@class='nav-item']//a[@href = '/candidate/dashboard']")
	WebElement homeLink;

	//Capture Jobs Link
	@FindBy(xpath = "//li[@class='nav-item']//a[@href = '/candidate/jobs']")
	WebElement jobsLink;

	//Capture Companies Link
	@FindBy(xpath = "//li[@class='nav-item']//a[@href = '/candidate/companies']")
	WebElement companiesLink;

	//Capture Notifications Link
	@FindBy(xpath = "//li[@class='nav-item']//a[@href = '/candidate/notifications']")
	WebElement notificationsLink;

	//Capture profile update prompt
	@FindBy(xpath = "//*[@id='update-profile-prompt']//div[@class='modal-content']")
	WebElement profileUpdate;

	//Capture profile update prompt close button
	@FindBy(xpath = "//*[@id='update-profile-prompt']//button[@class='close']")
	WebElement btnClose;

	//Capture the dropdown for 'Me' menu tab
	@FindBy(xpath = "//*[@id='navbardrop']/span[@class='icon-account2']")
	WebElement meMenudrpdwn;
	//Capture Update Popup
			@FindBy(xpath="//*[@id=\"update-profile-prompt\"]/div/div/div[1]/button/img")
			WebElement lnkyes;
			
			// Capture Jobs tab
			@FindBy(xpath = "//a[@class='nav-link job-tab']")
			WebElement JobTabBtn;
			
			// caprute close button on home page pop up
			@FindBy(xpath="//div[@id='update-profile-prompt']//img")
			WebElement closebutton;


	//Capture My Profile menu from the Me menu drop-down
	//@FindBy(xpath = "//a[@href='/candidate/profile']")
	@FindBy(xpath="//a[@class='dropdown-item'][contains(text(),'My Profile')]")
			WebElement myProfileMenu;
	//Capture Share Link
			//@FindBy(xpath="//*[@id='jobListingContainer']/div[1]/div[1]/a[4]")
			@FindBy(how= How.XPATH, using = "//a[@class='shareBtn open-popup-link']")
			List<WebElement> lnkShare;
			
			//Capture Share Popup
			//@FindBy(xpath="//*[@id="share-popup_1100001"]")
			@FindBy(how= How.XPATH, using = "//div[@class='white-popup-block share-popup']")
			WebElement popupShare;
			
			//Capture Share Popup Close button
			@FindBy(how= How.XPATH, using = "//button[@class='mfp-close']")
			WebElement bttnClosepopup;
			
			//Capture Whatsapp Link
			//@FindBy(xpath="//div[@id='atstbx']//a[@class='at-icon-wrapper at-share-btn at-svc-whatsapp']")
			@FindBy(how= How.XPATH, using = "//a[@class='at-icon-wrapper at-share-btn at-svc-whatsapp']")
			WebElement lnkWhatsapp;
			
			//Capture Facebook Link
			//@FindBy(xpath="//div[@id='atstbx']//a[@class='at-icon-wrapper at-share-btn at-svc-facebook']")
			@FindBy(how= How.XPATH, using = "//a[@class='at-icon-wrapper at-share-btn at-svc-facebook']")
			WebElement lnkFacebook;
			
			//Capture Twitter Link
			//@FindBy(xpath="//div[@id='atstbx']//a[@class='at-icon-wrapper at-share-btn at-svc-twitter']")
			@FindBy(how= How.XPATH, using = "//a[@class='at-icon-wrapper at-share-btn at-svc-twitter']")
			WebElement lnkTwitter;
			
			//Capture Linkedin Link
			//@FindBy(xpath="//div[@id='atstbx']//a[@class='at-icon-wrapper at-share-btn at-svc-linkedin']")
			@FindBy(how= How.XPATH, using = "//a[@class='at-icon-wrapper at-share-btn at-svc-linkedin']")
			WebElement lnkLinkedin;
			
			//Capture Email Link
			//@FindBy(xpath="//div[@id='atstbx']//a[@class='at-icon-wrapper at-share-btn at-svc-email']")
			@FindBy(how= How.XPATH, using = "//a[@class='at-icon-wrapper at-share-btn at-svc-email']")
			WebElement lnkEmail;

			//Capture Apply Buttons on Home-page
			@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary apply-job']")
			List<WebElement> eleApply;
			
			//Capture Applied Buttons On Home-page
			@FindBy(how = How.XPATH, using = "//a[@class='btn applied']")
			List<WebElement> eleApplied;
			
			//Capture Success Message Alert 
			@FindBy(xpath="//*[@id=\"successFlashMessage\"]")
			WebElement successMsg;
			
			//Capture the Me Dropdown menu
			@FindBy(xpath = "//*[@id='navbardrop']")
			WebElement drpdwnMe;
					
			//Capture My Profile link
			@FindBy(xpath ="//a[@class='dropdown-item'][contains(text(),'My Profile')]")
			WebElement lnkMyprofile;
			
			//Capture Log Out link 
			@FindBy(xpath = "//a[@href='sign-out.html']")
			WebElement lnkLogout;

			//Capture Yes button from Logout Popup
			@FindBy(xpath="//div[@class='modal-body']//a[@href='/logout']")
			WebElement lnklogoutYes;
			
			 
			//Capture View Direction Link
			@FindBy(how = How.XPATH, using = "//a[@class='viewBtn']")
			List<WebElement> eleView;
			
			//Capture View Direction DropDown Window
			@FindBy(how =How.XPATH, using ="//div[@class='directions_address']")
			WebElement drpdwnViewDir;
			
			//Capture FROM tab from View Direction Window
			@FindBy(xpath="//input[@class='editable form-control']")
			WebElement inputFromtab;
			
			//Capture TO tab from View Direction Window
			@FindBy(xpath="//input[contains(@id,'destination-input')]")
			List<WebElement> inputTotab;
			
			//Capture Arrive by Time
			@FindBy(xpath="//span[contains(@id,'arrive-')]")
			List<WebElement> arriveby;
			
			//Capture Drive mode of transportation
			@FindBy(xpath="//input[contains(@id,'mode-driving')]")
			List<WebElement> drivemode;
			
			//Capture Transit mode of transportation
			@FindBy(xpath="//input[contains(@id,'mode-transit')]")
			List<WebElement> transitmode;
			
			//Capture Walk mode of transportation 
			@FindBy(xpath="//input[contains(@id,'mode-walking')]")
			List<WebElement> walkmode;
			
			//Capture map showing direction from candidate address to company address
			@FindBy(xpath="//div[contains(@id,'Map-')]")
			List<WebElement> adrsmap;
			// Capture Me tab 
			@FindBy (id = "navbardrop")
				@CacheLookup
				WebElement MeTab;
			//capture me link
			@FindBy(xpath="//a[@id='navbardrop']")	
			public static WebElement lnkMe;	
				
			//capture work link	
			@FindBy(xpath="//a[@class='nav-link dropdown-toggle myEmploymentSection-Tab ']")	
			WebElement lnkWork;		

//capture home link
@FindBy(xpath="//a[@class='nav-link home-tab']")
WebElement lnkHome;
//capture search box field
	@FindBy(id="typeahead1")
	WebElement txtSearch;
	//capture setting btn
		@FindBy(xpath="//a[@id='navbardrop']/following-sibling::div/a[5]")
		WebElement clkSettings;
		//Capture Preference Page link
		@FindBy(xpath="//a[@class='dropdown-item'][contains(text(),'Preferences')]")
		WebElement lnkPrefpg;
		//capture company tab
		@FindBy(xpath = "//a[@class='nav-link company-tab']")
		WebElement Co_tab;
		
     @FindBy(xpath="//input[@class='btn btn-primary']")
      WebElement savebutton;
		

 	//capture the profile completeness
 	@FindBy(xpath="//div[@class='profileCompleteness']")
 	WebElement disProfileCompletness;
	//capture the JScore
	@FindBy(xpath="//div[@class='myScore']")
	WebElement disJScore;
	//Capture Message displayed on Log Out pop-up
			@FindBy(xpath = "//*[@id='signOut']//label")
			WebElement logoutLabel;
	//Capture Job Offers button
	@FindBy(xpath = "//div[@class='left-employment-link']//a[@href='/candidate/job/offer']")
	WebElement jobOffersBtn;
	//Capture Job Application button
	@FindBy(xpath = "//div[@class='left-employment-link']//a[@href='/candidate/job/applications']")
	WebElement jobApplicationBtn;
	//Capture Followed Companies menu
		@FindBy(xpath = "//li[@class='nav-item dropdown']//a[contains(@href,'/candidate/companies?')]")
		//@FindBy(xpath = "//div[@class='dropdown-menu']/a[@href='/candidate/companies?followed=true']")
		WebElement followedCompaniesMenu; 
		//capture cancel button after logpout
		@FindBy(xpath="//*[@id=\"signOut\"]/div/div/div[2]/table/tbody/tr/td[2]/a")
		WebElement cancelbtn;
		// capture work drop down menu
	@FindBy(xpath="//a[@id='navbardrop1']")
		WebElement wrkdrpdwn;
		
	//============  Action Methods  =============================
	//click the setting button in the home page
		public void click_settings() {
			WebDriverWait wait = new WebDriverWait(ldriver,25);
			wait.until(ExpectedConditions.visibilityOf(lnkMe));
			Actions action= new Actions(ldriver);
			action.moveToElement(lnkMe).build().perform();
			wait.until(ExpectedConditions.elementToBeClickable(clkSettings));
			clkSettings.click();
		}
		
		// clisk on work dropdownmenu
		public void openwrkdrpdwn() throws InterruptedException
		{
			Actions action=new Actions(ldriver);
			action.click(wrkdrpdwn).build().perform();
		}
			   
		public void clkJobApplication() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(jobApplicationBtn));
			wait.until(ExpectedConditions.elementToBeClickable(jobApplicationBtn));
			jobApplicationBtn.click();
		}

public boolean isDisplayed_JScore() {
	WebDriverWait wait = new WebDriverWait(ldriver,25);
	wait.until(ExpectedConditions.visibilityOf(disJScore));
	boolean status=disJScore.isDisplayed();
	return status;
}
public void is_DicplayedCurrentEmployment() {
	
}
public boolean isConfirmationMsgDisplayed(String ExpMessage) {
	boolean bool = false;
	String actMsg = logoutLabel.getText();
	if(actMsg.equals(ExpMessage))
	{
		bool = true;
	}
	return bool;
}

		// Clicking the company tab button
		public void clkCoTab () {
			Co_tab.click();
		}
	     //click on home link on the home page
			public void click_homeIcon() {
				WebDriverWait wait = new WebDriverWait(ldriver,25);
				wait.until(ExpectedConditions.elementToBeClickable(lnkHome));
				lnkHome.click();
			}
			// Clicking the Jobs Tab
			public void clkjobtab() {
				JobTabBtn.click();
			}

			public void click_WorkLink() {
				WebDriverWait wait = new WebDriverWait(ldriver,25);
				wait.until(ExpectedConditions.elementToBeClickable(lnkWork));
				lnkWork.click();
			}
			public boolean isDisplayed_ProfileCompletness() {
				WebDriverWait wait = new WebDriverWait(ldriver,25);
				wait.until(ExpectedConditions.visibilityOf(disProfileCompletness));
				boolean status=disProfileCompletness.isDisplayed();
				return status;
			}

			//retrieve elements on me link and clicking
			public List<WebElement> list_MeLink()  {
				WebDriverWait wait = new WebDriverWait(ldriver,25);
				wait.until(ExpectedConditions.visibilityOf(lnkMe));
				Actions action= new Actions(ldriver);
				action.moveToElement(lnkMe).build().perform();
				//capture drop down of me link
				List<WebElement> elements=ldriver.findElements(By.xpath("//a[@id='navbardrop']/following-sibling::div/a"));
				return elements;
			}
			//Click Preference Page  link
			public void clklnkPrefpage ()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 30);
				wait.until(ExpectedConditions.visibilityOf(lnkPrefpg));
				wait.until(ExpectedConditions.elementToBeClickable(lnkPrefpg));
				Actions action = new Actions(ldriver);
				action.moveToElement(lnkPrefpg).click().build().perform();	
			}

			public void clkMyProfile() {
				MeTab.click();
				}

			public void clkbttnApply (String jid) throws InterruptedException
			{         
				for(WebElement bttnApply : eleApply) 
				{	
					//System.out.println(bttnApply.getAttribute("data-jid"));
				    String datajid= bttnApply.getAttribute("data-jid");
				    if (datajid.equals(jid))
				    {
				    	 	//bttnApply=ldriver.findElement(By.xpath("//a[@data-jid='"+jid+"']"));
				    		bttnApply.click();
				   }
				} 
			}
			//Verify if the company name passed through excel file is present or not on the Dashboard page
			public boolean isCompanyNameDisplayed(String cmpnyName) {
				boolean bool = false;
				List <WebElement> companyNames = ldriver.findElements(By.xpath("//div[@class='campany_name_address']/span[1]"));
				int length = companyNames.size();
				System.out.println("Number of companies listed: "+length);
				for(WebElement cName:companyNames)
				{
					if(cName.getText().equals(cmpnyName)) 
					{
						bool = true;
						break;
					}
				}
				return bool;
			}

					
			//Capture job specific Applied button & return text
			public String bttnApplied (String jid)
			{
				String txt = null;
				for(WebElement bttnApplied : eleApplied)
				{
					String datajid =bttnApplied.getAttribute("data-jid"); 
					if (datajid.equals(jid))
					{
						txt=bttnApplied.getText();
						//System.out.println(status+" "+txt);
					}
				}
				return txt;
			}
			//enter value to search box and click the drop down 
			public void input_Search(String passValue,String expResult) throws InterruptedException {
				WebDriverWait wait = new WebDriverWait(ldriver,50);
				wait.until(ExpectedConditions.visibilityOf(txtSearch));
				txtSearch.sendKeys(passValue);//value from the test class
				ldriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
				//capture drop down of search box
				List<WebElement>element = ldriver.findElements(By.xpath("//p[@class='item-heading']"));
				int i = 0;
				for (WebElement webElement : element) {
					String name = webElement.getText();	
					System.out.println(name);
					if(name.equalsIgnoreCase(expResult)) {
						element.get(i).click();
						break;
					}
					i++;
				}
			}	

			//Checking is Applied Button is clickable 
			public String isClickable(String jid) 
		    {
				WebElement btnApplied= null;
				String clss=null;
				for(WebElement bttnApplied : eleApplied)
				{
					String datajid =bttnApplied.getAttribute("data-jid");
					if (datajid.equals(jid))
					{
						 btnApplied= bttnApplied;		 
					}
				}
				clss=btnApplied.getAttribute("class");
				return clss;
				/*try
				{   
					 
					((JavascriptExecutor)ldriver).executeScript("document.getElementBydata-jid('"+jid+"').click();");
					 
			        return true;
			    }   
				catch (Exception e)
				{
			         return false;
			    } 
		        */
		    }
			public void mouseOverToElement() {
				WebDriverWait wait = new WebDriverWait(ldriver,25);
				wait.until(ExpectedConditions.visibilityOf(lnkMe));
				Actions action= new Actions(ldriver);
				action.moveToElement(lnkMe).build().perform();
			}
           // close the pop up on the homescreen
			public void closebtn()
			{
				ldriver.switchTo().activeElement();
				 closebutton.click();
			}
			
			
			//Capture job specific share link & Click Apply
			public void clklnkShare (String jbid) throws InterruptedException
			{ 
				for(WebElement sharelnk : lnkShare) 
				{	
					 //System.out.println(sharelnk.getAttribute("href"));
					 String currjbid= sharelnk.getAttribute("href");
					 if (currjbid.contains(jbid))
				    {	    	    
						 sharelnk.click();	    	
					}
				} 		  
			  }
			
			//Capture Share Popup Close Button
			public void clkbttnClose()
			{
				bttnClosepopup.click();
			}
			//Retrieve text from Share Popup
			public String txtpopup ()
			{
				WebDriverWait wait = new WebDriverWait(ldriver,25);
				wait.until(ExpectedConditions.visibilityOf(popupShare));
				String popupSharetxt=popupShare.getText();
				return popupSharetxt;		
			}
			
			//Click Whatsapp Option	
			public void clklnkWhatsapp ()
			{
				WebDriverWait wait = new WebDriverWait(ldriver,25);
				wait.until(ExpectedConditions.visibilityOf(lnkWhatsapp));
				wait.until(ExpectedConditions.elementToBeClickable(lnkWhatsapp));
				lnkWhatsapp.click();
			}
			//Click on Followed Companies menu 
			public void clkFollowedCompaniesMenu(){
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(followedCompaniesMenu));
				Actions action = new Actions(ldriver);
				action.moveToElement(followedCompaniesMenu).build().perform();
				followedCompaniesMenu.click();
			}		
			 //click on cancel button after logout
			public void clkcncl()
			{
				cancelbtn.click();
			}
			//Click Follow Company button and retrieve the company name
			public void clkFollowBtn()
			{
				List<WebElement> followBtns = ldriver.findElements(By.xpath("//div[@class='company_details']//a[@class='campany_follow followEmp']"));
				int len = followBtns.size();
				System.out.println("Number of Companies to Follow: "+len);
				if(len>0) 
				{
					followBtns.get(0).click();	
				}
				else
				{
					System.out.println("Most of the Companies are followed!");
				}
			}

			//Click Facebook Option	
			public void clklnkFacebook ()
			{
				WebDriverWait wait = new WebDriverWait(ldriver,25);
				wait.until(ExpectedConditions.visibilityOf(lnkFacebook));
				wait.until(ExpectedConditions.elementToBeClickable(lnkFacebook));
				lnkFacebook.click();
			}		
		
			//Click Twitter Option
			public void clklnkTwitter ()
			{
				WebDriverWait wait = new WebDriverWait(ldriver,25);
				wait.until(ExpectedConditions.visibilityOf(lnkTwitter));
				wait.until(ExpectedConditions.elementToBeClickable(lnkTwitter));
				lnkTwitter.click();
			}
			
			//Click Linkedin Option
			public void clklnkLinkedin ()
			{
				WebDriverWait wait = new WebDriverWait(ldriver,25);
				wait.until(ExpectedConditions.visibilityOf(lnkLinkedin));
				wait.until(ExpectedConditions.elementToBeClickable(lnkLinkedin));
				lnkLinkedin.click();
			}
			
			//Click Email Option
			public void clklnkEmail ()
			{
				WebDriverWait wait = new WebDriverWait(ldriver,25);
				wait.until(ExpectedConditions.visibilityOf(lnkEmail));
				wait.until(ExpectedConditions.elementToBeClickable(lnkEmail));
				lnkEmail.click();
			}
			String parenttab=null;
			//Retrieve title from Child Tab
			public String childtabtitle ()
			{
				parenttab= ldriver.getWindowHandle();
				String tabtitle = null;
				Set<String> handlevalues=ldriver.getWindowHandles();
				for(String h:handlevalues)
				{
					ldriver.switchTo().window(h);
					String title=ldriver.getTitle();
					if(!title.equals("Dashboard"))
					tabtitle=title;
				}
				return tabtitle;
			}
			//Return to Parent Window
			public void rtrnToparent()
			{
				ldriver.switchTo().window(parenttab);
			}
			//Handle Update Profile popup
			public void popupProfile()
			{
				WebDriverWait wait = new WebDriverWait(ldriver,25);
				wait.until(ExpectedConditions.visibilityOf(lnkyes));
				wait.until(ExpectedConditions.elementToBeClickable(lnkyes));
				lnkyes.click();
			}
			
			//Retrieve text from Success Flash Message Alert
			public String successFlashMsg() 
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 30);
				wait.until(ExpectedConditions.visibilityOf(successMsg));
				String succMsg = successMsg.getText();
				System.out.println(succMsg);
				return succMsg;
				
			}
			
			//Move mouse to Me dropdwon menu
			public void clkdrpdwnmenuMe() 
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 30);
				wait.until(ExpectedConditions.visibilityOf(drpdwnMe));
				Actions action = new Actions(ldriver);
				action.moveToElement(drpdwnMe).build().perform();
			}

			//Click Logout Link
			public void clklnkLogout() 
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 30);
				wait.until(ExpectedConditions.visibilityOf(lnkLogout));
				wait.until(ExpectedConditions.elementToBeClickable(lnkLogout));
				Actions action = new Actions(ldriver);
				action.moveToElement(lnkLogout).click().build().perform();
			}

			//Click on Yes button from logout pop-up
			public void clklnklYes() 
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(lnklogoutYes));
				lnklogoutYes.click();		
			}
			
			//Scroll to newly added job
			public void scrolltobottom() throws InterruptedException
			{
				Object lastHeight = ((JavascriptExecutor) ldriver).executeScript("return document.body.scrollHeight");
				 //System.out.println(lastHeight);
			        while (true) 
			        {
			            ((JavascriptExecutor) ldriver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
			            Thread.sleep(2000);
			            
			            Object newHeight = ((JavascriptExecutor) ldriver).executeScript("return document.body.scrollHeight");
			            //System.out.println(newHeight);
			            if (newHeight.equals(lastHeight)) 
			            {
			                
			            	((JavascriptExecutor) ldriver).executeScript("window.scrollTo(document.body.scrollHeight,0);");
			            	break;
			            }
			            lastHeight = newHeight;
			        }
			        
			}
			
			//Capture job specific view direction button & Click Apply
			public void clklnkView (String jid) throws InterruptedException
			{  		       
				for(WebElement lnkView : eleView) 
				{		
					//System.out.println(lnkView.getAttribute("id"));
				    String id= lnkView.getAttribute("id");
				    if (id.contains(jid))
					{		
					  	lnkView.click();    	
					}
				} 			  
			}		 
			
			//Retrieving the status the Drop Down view direction window
			public boolean drpdDirwin()
			{
				boolean status= drpdwnViewDir.isEnabled();
				//System.out.println(status);
				return  status;    
			}
			
			//Retrieving the address from FROM tab
			public String inputFromtab()
			{
				String frmaddrs= inputFromtab.getAttribute("value");
				System.out.println("From Address: "+frmaddrs);
				return frmaddrs;	
			}
			
			//Edit address in the FROM Tab 
			public String editFromtab()
			{
				String editable=inputFromtab.getAttribute("readonly");
				return editable;
			}
			
			//Retrieving the address from TO tab
			public String inputTotab(String jid)
			{ String toaddrs=null;
				for(WebElement inputTo : inputTotab) 
				{	
					//System.out.println(bttnApply.getAttribute("data-jid"));
				    String datajid= inputTo.getAttribute("id");
				    if (datajid.contains(jid))
				    {
				    	toaddrs= inputTo.getAttribute("value");
						System.out.println("To Address: "+toaddrs);	
				   }
				}
				return toaddrs;
			}
			
			//Edit address in the TO Tab 
			public String editTotab(String jid)
			{
				String editable=null;
				for(WebElement inputTo : inputTotab) 
				{	
					//System.out.println(bttnApply.getAttribute("data-jid"));
				    String datajid= inputTo.getAttribute("id");
				    if (datajid.contains(jid))
				    {
				    	editable=inputTo.getAttribute("readonly");	
				   } 
				}
				return editable;					
			}
			
			//Retrieve Arrive By Time
			public String arriveby(String jid)
			{
				String arrivetime=null;
				for(WebElement arriveTime : arriveby) 
				{	
					//System.out.println(bttnApply.getAttribute("data-jid"));
				    String datajid= arriveTime.getAttribute("id");
				    if (datajid.contains(jid))
				    {
				    	arrivetime=arriveTime.getText();	
				   } 
				}
				System.out.println("Arrive Time is: "+arrivetime);
				return arrivetime;
				
			}
			//Retrieve Status of Drive Mode
			public boolean drvmode(String jid)
			{ Boolean status=null;
				for(WebElement drivmode : drivemode) 
				{	
					//System.out.println(bttnApply.getAttribute("data-jid"));
				    String datajid= drivmode.getAttribute("id");
				    if (datajid.contains(jid))
				    {
				    	status= drivmode.isEnabled();	
				    } 
				}
				//System.out.println(status);
				return status;
			}
			
			//Retrieve Status of Transit mode
			public boolean trnstmode(String jid)
			{ Boolean status=null;
				for(WebElement trnstmode : transitmode) 
				{	
					//System.out.println(bttnApply.getAttribute("data-jid"));
				    String datajid= trnstmode.getAttribute("id");
				    if (datajid.contains(jid))
				    {
				    	status= trnstmode.isEnabled();	
				    } 
				}
				//System.out.println(status);
				return status;
			}
			
			//Retrieve Status of Walk Mode
			public boolean wlkmode(String jid)
			{ Boolean status=null;
				for(WebElement wlkmode : walkmode) 
				{	
					//System.out.println(bttnApply.getAttribute("data-jid"));
				    String datajid= wlkmode.getAttribute("id");
				    if (datajid.contains(jid))
				    {
				    	status= wlkmode.isEnabled();	
				    } 
				}
				//System.out.println(status);
				return status;
			}
			
			//Retrieve status of Address map
			public boolean addrsmap(String jid)
			{ Boolean status=null;
				for(WebElement map : adrsmap) 
				{	
					//System.out.println(bttnApply.getAttribute("data-jid"));
				    String datajid= map.getAttribute("id");
				    if (datajid.contains(jid))
				    {
				    	status= map.isEnabled();	
				    } 
				}
				//System.out.println(status);
				return status;	
			}
			
			//Click My profile link
			public void clklnkMyprofile ()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 30);
				wait.until(ExpectedConditions.visibilityOf(lnkMyprofile));
				wait.until(ExpectedConditions.elementToBeClickable(lnkMyprofile));
				Actions action = new Actions(ldriver);
				action.moveToElement(lnkMyprofile).click().build().perform();	
			}
	

	//Click on Home Link
	public void clkHomeLink() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(homeLink));
		wait.until(ExpectedConditions.elementToBeClickable(homeLink));
		homeLink.click();
	}

	//Click on Jobs Link
	public void clkJobsLink() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(jobsLink));
		wait.until(ExpectedConditions.elementToBeClickable(jobsLink));
		jobsLink.click();
	}
	//Handle Update Profile popup
	 

	//Click on Companies Link
	public void clkCompaniesLink() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(companiesLink));
		wait.until(ExpectedConditions.elementToBeClickable(companiesLink));
		companiesLink.click();
	}

	//Click on Notifications Link
	public void clkNotificationsLink() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(notificationsLink));
		wait.until(ExpectedConditions.elementToBeClickable(notificationsLink));
		notificationsLink.click();
	}

	//Visibility of profile update prompt
	public boolean isProfileUpdatePromptVisible() {
		boolean bool = false;
		if(profileUpdate.isDisplayed()) 
		{
			bool = true;
			System.out.println("Profile Update Prompt is displayed!");
		}
		else
		{
			System.out.println("Profile Update Prompt is not displayed!");	
		}
		return bool;
	}

	//Click Prompt Close button
	public void clkBtnClose() {
		WebDriverWait wait = new WebDriverWait(ldriver, 25);
		wait.until(ExpectedConditions.visibilityOf(btnClose));
		wait.until(ExpectedConditions.elementToBeClickable(btnClose));
		btnClose.click();
	}
	//Mouse hover action on Me Menu to view the drop-down list
	public void moveToMeMenu() {
		Actions action = new Actions(ldriver);
		action.moveToElement(meMenudrpdwn).build().perform();
	}
	//Click on Job Offers Button
		public void clkJobOffers() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(jobOffersBtn));
			wait.until(ExpectedConditions.elementToBeClickable(jobOffersBtn));
			jobOffersBtn.click();
		}

	//Mouse hover action and selecting on Settings Menu on the Me menu drop-down list
	public void clkMyProfileMenu() {
		Actions action = new Actions(ldriver);
		action.moveToElement(myProfileMenu).build().perform();
		myProfileMenu.click();
		
	} 

	}

