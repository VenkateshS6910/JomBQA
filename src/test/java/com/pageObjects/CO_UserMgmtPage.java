package com.pageObjects;

 

import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
public class CO_UserMgmtPage {
	
public WebDriver ldriver;
	
	//Constructor
	
		public CO_UserMgmtPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		//Capture Role drop-down button
		@FindBy(xpath = "//*[@id='userRoleId']//span[@class='caret selectbox-caret']")
		WebElement roleBtn;

		//Capture Invite User button
		@FindBy(xpath = "//a[@class='creat-job-bt ajax-popup-mag']")
		WebElement btnInviteUser;

		//Capture Status Field 
		@FindBy(xpath="//div[@data-name='status']//a[@class='bfh-selectbox-toggle form-control']")
		WebElement fldStatus;
		
		//Capture Role Field
		@FindBy(xpath="//div[@data-name='role']//a[@class='bfh-selectbox-toggle form-control']")
		WebElement fldRole;

		//Capture Approve Time Field
		@FindBy(xpath="//div[@data-name='approveTime']//a[@class='bfh-selectbox-toggle form-control']")
		WebElement fldAppTime;
		
		//Capture Search Button
		@FindBy(xpath="//input[@value='Search']")
		WebElement btnSrch;
		//Capture Invite User Button
		@FindBy (xpath = "//a[@class='creat-job-bt ajax-popup-mag']")
		WebElement InviteUserBtn;

		//Capture Invite User Pop-up Link
		@FindBy(how=How.XPATH, using="//a[@href='/company/user/add']" )
		WebElement lnkAddUsr;
		
		//Capture Status Field DropDwon List option
		@FindBy(xpath="//div[@data-name='status']//li//a")
		List <WebElement> drpdwnstat;
		//Capture Email Field 
				@FindBy(xpath="//input[@id='emailID']")
				WebElement inptEmail;
				//Capture Invite User PopUp
				@FindBy(xpath="//h4[contains(text(),'Invite User')]")
				WebElement popupInv;
				//Capture Invalid Email Error Message
				@FindBy(xpath="//span[@class='help-block errorMsg']")
				WebElement errMsg;
				
				//Capture Message Box Filed 
				@FindBy(xpath="//textarea[@id='job-description']")
				WebElement txtMsg;
				
				//Capture Role DrpDwn Field form Invite User Popup
				@FindBy(xpath="//div[@id='userRoleId']")
				WebElement drpdwnRole;
				//Capture Role DropDown Field Items 
				@FindBy(xpath="//div[@id='userRoleId']//div[@class='bfh-selectbox-options']//div//a")
				List <WebElement> eleRole;
				@FindBy(xpath="//tr[@class='approveTimeTrClass']//div[@class='bfh-selectbox']")
				WebElement drpdwnAprvTime;
				
				////Capture Approve Time DropDown Field Items 
				@FindBy(xpath="//div[@class='bfh-selectbox open']//div[@class='bfh-selectbox-options']//div//a")
				List <WebElement> eleAprvTime;
				//Capture New Invite User window header after clicking Invite user button
				@FindBy (xpath = "//h4[contains(text(),'Invite User')]") 
				public WebElement InviteUserWindowHeader;  
				//Capture Message Box from Invite User window
				@FindBy (xpath = "//textarea[@id='job-description']")
				WebElement MsgBox;
				
				//Capture "Email ID" Field from Invite User window
				@FindBy (xpath = "//input[@id='emailID']")
				WebElement InviteUserEmail;
				
				// Capture "Invite User" Submit Button from Invite User window
				@FindBy(xpath = "//input[@class='btn btn-primary']")
				WebElement InviteUserSubmitBtn;

				//Capture Error block for over limit Characters set to Message Box
				@FindBy (xpath = "//textarea[@id='job-description']/parent::div/span")
				public WebElement ErrorMsgBlock;
				// Capture 'Yes' field from the "Approve Time" drop down

				@FindBy(xpath = "//div[@class='bfh-selectbox open']//div[@class='bfh-selectbox-options']//div//a[contains(text(),'Yes')]")
				WebElement YesAppTime;	

		
				//Capture "Approve Time" Dropdown 
				@FindBy (xpath = "//tr[@class='approveTimeTrClass']//div[@class='bfh-selectbox']")
				WebElement AppTimeDD;

				//Capture Approve Time drop-down button
				@FindBy(xpath = "//div[@data-id='approveTimeId']//span[@class='caret selectbox-caret']")
				WebElement btnApproveTime;
				//Capture Edit icon
				@FindBy(xpath = "//a[@class='ajax-popup-mag editUser']/span")
				WebElement editIcon;

				//Capture Save Changes button in Edit User pop-up
				@FindBy(xpath = "//input[@value='Save Changes']")
				WebElement btnSaveChanges;
				//Capture Yes button on Delete User Confirmation pop-up
				//"div[@id='deleteUser']//a[@class='yesBtn'][contains(text(),'yes')]")
				//@FindBy(xpath = "*[@id='deleteUser']//a[@class='yesBtn']")
				@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")
				WebElement btnYesDelete;

			
		//********************Action Method********************//
				//Click Role from Invite User PopUp
				public void drpdwnRole ()
				{
					WebDriverWait wait = new WebDriverWait(ldriver,25);
					wait.until(ExpectedConditions.visibilityOf(drpdwnRole));
					wait.until(ExpectedConditions.elementToBeClickable(drpdwnRole));
					drpdwnRole.click();
				}
				public void selectApproveTime(String apprTime) {
					List<WebElement> dropApproveTime = ldriver.findElements(By.xpath("//tr[@class='approveTimeTrClass']//div[@class='bfh-selectbox-options']//li"));
					for(WebElement time : dropApproveTime)
					{
						if(time.getText().equals(apprTime))
							time.click();
					}
				}
				//Click on Save Changes button in Edit pop-up
				public void clkBtnSaveChanges() {
					WebDriverWait wait = new WebDriverWait(ldriver, 60);
					wait.until(ExpectedConditions.visibilityOf(btnSaveChanges));
					Actions action= new Actions(ldriver);
					action.moveToElement(btnSaveChanges).build().perform();			
					btnSaveChanges.click();			
				}

				//Click Delete User icon
				public void clkBtnDeleteUser(String username) throws InterruptedException  {
					Thread.sleep(1000);
					//ldriver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
					List<WebElement> tableRows = ldriver.findElements(By.xpath("//div[@class='whiteBgSection']/table/tbody/tr"));
					int RowNo = tableRows.size();
					//System.out.println("Row number: "+RowNo);
					String before_xpath = "//div[@class='whiteBgSection']/table/tbody/tr[";
					String after_xpath = "]/td[1]";
					for(int i=2;i<=RowNo;i++)
					{
						String name = ldriver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
						//System.out.println(name);
						if(name.contains(username)) 
						{
							ldriver.findElement(By.xpath("//div[@class='whiteBgSection']/table/tbody/tr["+i+"]/td[5]/span/a[2]/span")).click();
							break;
						}
					}
				}

				//Click on Delete User Yes button
				public void clkBtnYesDeleteUser() {
					//		WebDriverWait wait = new WebDriverWait(ldriver, 60);
					//		wait.until(ExpectedConditions.visibilityOf(btnInviteUser));
					Actions action= new Actions(ldriver);
					action.moveToElement(btnYesDelete).build().perform();
					btnYesDelete.click();			
				}

				//Verify if the user is displayed in the table
				public boolean isUserNotDisplayed(String username) {
					boolean bool = false;
					List<WebElement> tableRows = ldriver.findElements(By.xpath("//div[@class='whiteBgSection']/table/tbody/tr"));
					int RowNo = tableRows.size();
					//System.out.println("Row number: "+RowNo);
					String before_xpath = "//div[@class='whiteBgSection']/table/tbody/tr[";
					String after_xpath = "]/td[1]";
					for(int i=2;i<=RowNo;i++)
					{
						String name = ldriver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
						System.out.println(name);
						if(!name.contains(username)) 
						{
							bool = true;
						}
						else
						{
							bool = false;
						}
					}
					return bool;
				}

				// Selecting the Value "yes" from the "Approve Time" Drop down
				public void SelectYesAppTime() {
					Actions a = new Actions(ldriver);
					a.moveToElement(AppTimeDD).click().build().perform();
					WebDriverWait wait = new WebDriverWait(ldriver, 10);
					wait.until(ExpectedConditions.elementToBeClickable(YesAppTime));
					a.moveToElement(YesAppTime).click().build().perform();
				}
				//Input Text to the Message box from Invite User window for Tc016-Negative scenario
				public void SetTextToMsgBox () {
					MsgBox.sendKeys("WelCome To Jombone! Please join using the link provided with this email.");
				}
				//Handling dynamic web table
				public void clkEditIcon(String username) throws InterruptedException {
					Thread.sleep(1000);
					//ldriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					List<WebElement> tableRows = ldriver.findElements(By.xpath("//div[@class='whiteBgSection']/table/tbody/tr"));
					int RowNo = tableRows.size();
					//System.out.println("Row number: "+RowNo);
					String before_xpath = "//div[@class='whiteBgSection']/table/tbody/tr[";
					String after_xpath = "]/td[1]";
					for(int i=2;i<=RowNo;i++)
					{
						String name = ldriver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
						//System.out.println(name);
						if(name.contains(username)) 
						{
							ldriver.findElement(By.xpath("//div[@class='whiteBgSection']/table/tbody/tr["+i+"]/td[5]/span/a[1]/span")).click();
							break;
						}
					}
				}
				//Click Delete User icon
				public void clkBtndeleteUser(String username) throws InterruptedException  {
					Thread.sleep(1000);
					//ldriver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
					List<WebElement> tableRows = ldriver.findElements(By.xpath("//div[@class='whiteBgSection']/table/tbody/tr"));
					int RowNo = tableRows.size();
					//System.out.println("Row number: "+RowNo);
					String before_xpath = "//div[@class='whiteBgSection']/table/tbody/tr[";
					String after_xpath = "]/td[1]";
					for(int i=2;i<=RowNo;i++)
					{
						String name = ldriver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
						//System.out.println(name);
						if(name.contains(username)) 
						{
							ldriver.findElement(By.xpath("//div[@class='whiteBgSection']/table/tbody/tr["+i+"]/td[5]/span/a[2]/span")).click();
							break;
						}
					}
				}

				//Click on Invite User button
				public void clkBtnInviteUser() {
					//		WebDriverWait wait = new WebDriverWait(ldriver, 60);
					//		wait.until(ExpectedConditions.visibilityOf(btnInviteUser));
					Actions action= new Actions(ldriver);
					action.moveToElement(btnInviteUser).build().perform();
					btnInviteUser.click();			
				}
				//Click on Role drop-down button
				public void clkBtnRole() {
					WebDriverWait wait = new WebDriverWait(ldriver, 60);
					wait.until(ExpectedConditions.visibilityOf(roleBtn));
					Actions action= new Actions(ldriver);
					action.moveToElement(roleBtn).build().perform();			
					roleBtn.click();			
				}
				//Verify the drop-down elements
				public boolean getRoleDropDown() {
					boolean bool = false;
					List<WebElement> dropDwnRoles = ldriver.findElements(By.xpath("//div[@id='userRoleId']//div[@class='bfh-selectbox-options']//a[@tabindex='-1']"));
					int length = dropDwnRoles.size();
					System.out.println("Number of roles: "+length);
					System.out.println("The roles are displayed below: ");
					for(WebElement role : dropDwnRoles)
					{
						System.out.println(role.getText());
					}
					if(length == 2)
					{
						bool = true;
					}
					return bool;
				}

				//Clicking both the values
				public void selectRoles(String roles) {
					List<WebElement> dropDwnRoles = ldriver.findElements(By.xpath("//div[@id='userRoleId']//div[@class='bfh-selectbox-options']//a[@tabindex='-1']"));
					for(WebElement role : dropDwnRoles)
					{
						if(role.getText().equals(roles))
							role.click();
					}
				}

				//Click on Approve Time drop-down button
				public void clkBtnApprTime() {
					WebDriverWait wait = new WebDriverWait(ldriver, 60);
					wait.until(ExpectedConditions.visibilityOf(btnApproveTime));
					Actions action= new Actions(ldriver);
					action.moveToElement(btnApproveTime).build().perform();			
					btnApproveTime.click();			
				}


				// Input Value in the "Email ID" Field from Invite User window
				public void SetInviteUserEmail(String Email) {
					InviteUserEmail.sendKeys(Email);
				}

				// Clicking on "Invite User" Submit Button from Invite User window
				public void clkInviteUserSubmitBtn() {
					InviteUserSubmitBtn.click();
				}

             //Input Text to the Message box from Invite User window for Tc016-Negative scenario
				public void SetTextToMsgBoxNegative () {
					String Text = "";
					for (int i=0;i<105;i++) {
						Text = Text + "a";
					}
					MsgBox.sendKeys(Text);
				}

				//Clicking on Invite User Button
				public void clkInviteUserBtn () {
					InviteUserBtn.click();
				}
			
				//Select Role from Invite User PopUp
				public boolean lstRoleItem()
				{
					boolean status=false;
					WebElement slcRole=null;
					WebDriverWait wait = new WebDriverWait(ldriver,25);
					wait.until(ExpectedConditions.visibilityOfAllElements(eleRole));
					int i=0;
					for(WebElement itmRole: eleRole)
					{	i++;
						System.out.println("Option "+i+": "+itmRole.getText());
						if(itmRole.getText().contains("Hiring Manager"))
							slcRole=itmRole;
					}
					try 
					{
						wait.until(ExpectedConditions.visibilityOf(slcRole));
						wait.until(ExpectedConditions.elementToBeClickable(slcRole));
						System.out.println("Selected Option: " + slcRole.getText());
						slcRole.click();
						status=true;
					}
					catch (Exception e)
					{
						status =false;
					}
					return status;
				}

		//Verify the availability of Status field
		public boolean vrfyStatus()
		{
			boolean status=false;
			if(fldStatus.isDisplayed()&&fldStatus.isEnabled())
			status = true;
			//System.out.println(status);
			return status;
		}
		//Click Invite User Popup Link	
				public void clkInvUsr() throws InterruptedException
				{	
					WebDriverWait wait = new WebDriverWait(ldriver,25);
					wait.until(ExpectedConditions.visibilityOf(lnkAddUsr));
					wait.until(ExpectedConditions.elementToBeClickable(lnkAddUsr));
					JavascriptExecutor executor = (JavascriptExecutor)ldriver;
					executor.executeScript("arguments[0].click();", lnkAddUsr);
				}
				//Set Email address Value
				public boolean inptEmail(String nwemail)
				{
					boolean status=false;
					try 
					{
						WebDriverWait wait = new WebDriverWait(ldriver,25);
						wait.until(ExpectedConditions.visibilityOf(inptEmail));
						wait.until(ExpectedConditions.elementToBeClickable(inptEmail));
						inptEmail.sendKeys(nwemail);
						inptEmail.sendKeys(Keys.TAB);
						status=true;
						System.out.println("Entered following email in Email Field:");
						System.out.println(nwemail);
					}
					catch (Exception e)
					{
						status =false;
					}
					return status;
				}
				
				//Click Approve Time Field from Invite User PopUp
				public void drpdwnAprvTime ()
				{
					WebDriverWait wait = new WebDriverWait(ldriver,25);
					wait.until(ExpectedConditions.visibilityOf(drpdwnAprvTime));
					wait.until(ExpectedConditions.elementToBeClickable(drpdwnAprvTime));
					drpdwnAprvTime.click();
				}
				
				//Select Approve Time from Invite User PopUp
				public boolean lstAprvTmItem()
				{
					boolean status=false;
					WebElement slcAprv=null;
					WebDriverWait wait = new WebDriverWait(ldriver,25);
					wait.until(ExpectedConditions.visibilityOfAllElements(eleAprvTime));
					int i=0;
					for(WebElement itmAprv: eleAprvTime)
					{	i++;
						System.out.println("Option "+i+": "+itmAprv.getText());
						if(itmAprv.getText().contains("No"))
							slcAprv=itmAprv;
					}
					try 
					{
						wait.until(ExpectedConditions.visibilityOf(slcAprv));
						wait.until(ExpectedConditions.elementToBeClickable(slcAprv));
						System.out.println("Selected Option: " + slcAprv.getText());
						slcAprv.click();
						status=true;
					}
					catch (Exception e)
					{
						status =false;
					}
					return status;
				}
		

				//Set Invalid Email Address value
				public String inptInvEml(String invemail)
				{
					String msg=null;
					WebDriverWait wait = new WebDriverWait(ldriver,25);
					wait.until(ExpectedConditions.visibilityOf(inptEmail));
					wait.until(ExpectedConditions.elementToBeClickable(inptEmail));
					inptEmail.sendKeys(invemail);
					inptEmail.sendKeys(Keys.TAB);
					System.out.println("Entered following email in Email Field:");
					System.out.println(invemail);
					wait.until(ExpectedConditions.visibilityOf(errMsg));
					msg=errMsg.getText();
					return msg;
				}
				//Set 100 Char Message in Message Box Field 
				public boolean inptTxtMsg (String rndmmsg)
				{
					boolean status=false;
					try 
					{
						WebDriverWait wait = new WebDriverWait(ldriver,25);
						wait.until(ExpectedConditions.visibilityOf(txtMsg));
						wait.until(ExpectedConditions.elementToBeClickable(txtMsg));
						txtMsg.click();
						txtMsg.sendKeys(rndmmsg);
						txtMsg.sendKeys(Keys.TAB);
						status=true;
						System.out.println("Entered following message in Message Box Field:");
						System.out.println(rndmmsg);
					}
					catch (Exception e)
					{
						status =false;
					}
					return status;
				}


				//Verify Invite User PopUp is Displayed
				public boolean vrfyInvpop()
				{
					boolean status=false;
					WebDriverWait wait = new WebDriverWait(ldriver,25);
					wait.until(ExpectedConditions.textToBePresentInElement(popupInv, "Invite User"));
					if(popupInv.isDisplayed())
					status = true;
					//System.out.println(status);
					return status;	
				}
				
				//Set Email address Value
			 



		//Retrieve Status Field DropDown List Options 
		public String drpdwnStat()
		{
			String optn="";
			WebDriverWait wait = new WebDriverWait(ldriver,25);
			wait.until(ExpectedConditions.visibilityOfAllElements(drpdwnstat));
			for(WebElement op :drpdwnstat)
			{
				optn= optn+" "+op.getText();
			}
			System.out.println("Status field DropDwon list options:"+optn);
			return optn;
		}
	
		//Click Verify if Status Field is Clickable
		public boolean clkStatus()
		{
			boolean status=false;
			try
			{
				WebDriverWait wait = new WebDriverWait(ldriver,25);
				wait.until(ExpectedConditions.visibilityOf(fldStatus));
				wait.until(ExpectedConditions.elementToBeClickable(fldStatus));
				fldStatus.click();
				status = true;
			}
			catch (Exception e)
			{
				status=false;
			}
			//System.out.println(status);
			return status;
		}
		//Verify the availability of Invite user Popup link
				public boolean vrfyInvUsr()
				{
					boolean status=false;
					if(lnkAddUsr.isDisplayed()&&lnkAddUsr.isEnabled())
					status = true;
					//System.out.println(status);
					return status;
				}

		//Verify the availability of Role field
		public boolean vrfyRole()
		{
			boolean status=false;
			if(fldRole.isDisplayed()&&fldRole.isEnabled())
			status = true;
			//System.out.println(status);
			return status;
		}

		//Verify the availability of Approve time field
		public boolean vrfyAppTime()
		{
			boolean status=false;
			if(fldAppTime.isDisplayed()&&fldAppTime.isEnabled())
			status = true;
			//System.out.println(status);
			return status;
		}
		
		//Verify the availability of Search button
		public boolean vrfySearch()
		{
			boolean status=false;
			if(btnSrch.isDisplayed()&&btnSrch.isEnabled())
			status = true;
			//System.out.println(status);
			return status;
		}
		
		 
		
				
		
}
