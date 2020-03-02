package com.pageObjects;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.*;
import org.sikuli.api.Screen;
 
public class CA_ProfilePage {

	public WebDriver ldriver;

	//Constructor

	public CA_ProfilePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//Capture Add/Edit ID Details link
			@FindBy(xpath="//div[@id='pidDetails']//a[@class='editBtn ajax-popup-mag']")
			WebElement lnkEditIDdetails;
			
			//Capture Govt. Issued Photo ID Dropdown 
			@FindBy(xpath="//span[contains(text(),'Select Govt. Issued Photo ID')]")
			WebElement drpdwnPhotoID;
			
			//Capture Govt. Issued ID DropDown
			@FindBy(xpath="//span[contains(text(),'Select Govt. Issued ID')]")
			WebElement drpdwnGovID;
			
			//Capture Photo ID DropDown Items
			@FindBy(xpath="//div[@id='govtPhotoDocId']//div[@class='bfh-selectbox-options']//li")
			List <WebElement> elePhotoIDtypes;
			
			//Capture Govt. ID DropDown Items 
			@FindBy(xpath="//div[@id='govtDocId']//div[@class='bfh-selectbox-options']//li")
			//@FindBy(xpath="//div[@id=\"govtDocId\"]/div/div/ul/li/a")
			List <WebElement> eleGovIDtypes;
			
			//Capture Govt. Issued Photo ID Upload Button
			@FindBy(xpath="//label[@id='fileName']")
			WebElement btnUpload;
			
			//Capture Govt. Issued ID Upload Button
			@FindBy(xpath="//label[@id='fileName1']")
			WebElement btnUpload1;
			
			//Capture Invalid Photo ID File type error message
			@FindBy(xpath="//tr[@class='trClassPic']//span[@class='help-block errorMsg']")
			WebElement msgError;
			
			//Capture Invalid ID File type error message
			@FindBy(xpath="//tr[@class='trClass']//span[@class='help-block errorMsg']")
			WebElement msgError1;
			
			//Capture Photo ID Number Input Box
			@FindBy(xpath="//input[@id='id_number_photo']")
			WebElement inputIDnum;
			
			//Capture ID Number Input Box
			@FindBy(xpath="//input[@id='id_number']")
			WebElement inputIDnum1;
			
			//Capture Save Change Button
			@FindBy(xpath="//input[@class='btn btn-primary']")
			//@FindBy(xpath="//input[@id='save_id_button']")
			WebElement btnSave;
			
			//Capture ID Details PopUp close link
			@FindBy(xpath="//button[@class='mfp-close']")
			WebElement btnClose;
			
			
			//Capture Work Status Add/Edit Link
			@FindBy(xpath="//div[@id='pworkStatus']//a[@class='editBtn ajax-popup-mag']")
			WebElement lnkEditWrkstat;
			
			//Capture Are you legally entitled to work in Canada? Dropdown
			//@FindBy(xpath="div[@id='workPermitTypeId']//span[@class='caret selectbox-caret']")
			@FindBy(xpath="//div[@id='workPermitTypeId']//a[@class='bfh-selectbox-toggle form-control']")
			WebElement drpdwnEntWrkCan;
			
			//Capture Do you have Work Permit or Study Permit?  DropDown
			//@FindBy(xpath="//div[@id='permitTypeId']//a[@class='bfh-selectbox-toggle form-control']")
			@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/a[1]/span[2]")
			WebElement drpdwnWrkStdyPrmt;
			
			//Capture Do you have Work Permit or Study Permit?  DropDown Menu Options
		//	@FindBy(xpath="//tr[@id='permitTrId']//li")
			
			@FindBy(xpath="//div[@id='permitTypeId']")
			List <WebElement> eleWrkStdyPrmt;
			
			//Capture Are you legally entitled to work in Canada? Dropdown Menu Options
			//@FindBy(xpath="//div[@id='workPermitTypeId']//li")
			//@FindBy(xpath="//span[contains(text(),'Please Select')]")
			//@FindBy(xpath="//div[@id='workPermitTypeId']//span[@class='caret selectbox-caret']")
			//@FindBy(xpath="//div[@id='permitTypeId']")
			//List <WebElement> eleEntWrkCan;
			//Capture Are you legally entitled to work in Canada? Dropdown Menu Options
			@FindBy(xpath="//div[@id='workPermitTypeId']//li")
			List <WebElement> eleEntWrkCan;

		//Capture Are you legally entitled to work in Canada? Dropdown Menu Previously selected Options
			@FindBy(xpath="//div[@id='workPermitTypeId']//span[@class='bfh-selectbox-option']")
			WebElement selecteditem;
			
			//Capture Work Status Save Change Button
			@FindBy(xpath="//input[@class='btn btn-primary']")
			WebElement btnWrksave;
			
			//Capture Yes option from Are you legally entitled to work in Canada? Dropdown Menu Options
			@FindBy(xpath="//div[@class='bfh-selectbox-options']//div//a[contains(text(),'Yes')]")
			WebElement btnYes;
			
			//Capture Work Status from My Profile Page
			//@FindBy(xpath="//div[@class='bfh-selectbox-options']//div//a[contains(text(),'Yes')]")
		@FindBy(xpath="//td[contains(text(),'Are you legally entitled to work in Canada?')]//span")
			WebElement wrkstat;
			@FindBy(xpath = "//div[@class='candidate_nameId']/h3")
			WebElement candidateName;

			//Capture Jombone ID
			@FindBy(xpath = "//label[contains(text(),'Jombone ID')]")
			WebElement jomboneID;

			//Capture Mail ID
			@FindBy(xpath = "//label[@class='email']")
			WebElement emailID;

			//Capture Video Icon
			@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[1]/button[1]/span[1]")
			//@FindBy(xpath = "//a[@data-candidate-video-url]")
			WebElement videoIcon;

			//Capture Phone Number
			@FindBy(xpath = "//label[@class='phoneNumber']")
			WebElement phNumber;

			//Capture Mobile displayed number(10 digits)
			@FindBy(xpath ="//label[@class='phoneNumber']//span[@class='mobile_number_display']")
			WebElement phDisplayedNum;

			//Capture Profile Completeness
			@FindBy(xpath = "//div[@class='profileCompleteness']")
			WebElement profileCompleteness;

			//Capture Profile Completeness Bar
			@FindBy(xpath = "//div[@id='profileCompletenessDiv']")
			WebElement progressBar;

			//Capture JScore
			@FindBy(xpath = "//div[@class='jScore']")
			WebElement jScore;

			//Capture Profile Completeness Bar
			@FindBy(xpath = "//div[@id='jomboneScoreDiv']")
			WebElement jScoreProgressBar;

			//Capture Highest Education
			@FindBy(xpath = "//table[@class='profile_table']//span[text()='Highest Education']")
			WebElement highestEducation;

			//Capture Highest Education value
			@FindBy(xpath = "//table[@class='profile_table']/tbody/tr/td[3]//label")
			WebElement highestEducationValue;

			//Capture Highest Degree
			@FindBy(xpath = "//table[@class='profile_table']//td[3]/label")
			WebElement highestDegree;

			//Capture Availability
			@FindBy(xpath = "//table[@class='profile_table']//span[text()='Availability']")
			WebElement availability;

			//Capture Availability Status
			@FindBy(xpath = "//table[@class='profile_table']//td[1]/label")
			WebElement availabilityStatus;

			//Capture Total Exp title
			@FindBy(xpath = "//table[@class='profile_table']//span[text()='Total Exp.']")
			WebElement totalExpTxt;

			//Capture Total Exp
			@FindBy(xpath = "//table[@class='profile_table']//td[2]/label")
			WebElement totalExp;

			//Capture Edit Profile button
			@FindBy(xpath = "//a[@class = 'edit_profile ajax-popup-mag']/span[@class='icon-edit']")
			WebElement profileEditBtn;

			//Capture Edit profile fields

			//Capture Video Upload field
			@FindBy(xpath = "//span[@class='icon-video']")
			WebElement videoUpload;

			//Capture First Name
			@FindBy(xpath = "//*[@id='firstNameID']")
			WebElement firstName;

			//Capture Last Name
			@FindBy(xpath = "//*[@id='lastNameID']")
			WebElement lastName;

			//Capture Phone Number
			@FindBy(xpath = "//*[@id='phone']")
			WebElement phone;

			//Capture Experience
			@FindBy(xpath = "//*[@id='experience']")
			WebElement experience;

			//Capture Availability Notification ON / OFF
			@FindBy(xpath = "//span[@class = 'ios-switch-control-indicator']")
			WebElement availabilityNotification;
			//Capture Address Save button
			@FindBy(xpath="//*[@id='candidateSkillForm']//input[@class='btn btn-primary']")
			WebElement addressSaveBtn;

			//Capture Availability Status
			//@FindBy(xpath = "//*[@id='hiddenAvailability']")
			@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[3]/td[1]/input[1]")
			WebElement availableSts;
			//Capture Error Message WebElement in Emergency Contact field
			@FindBy(xpath = "//input[@name='emergencyContactName']/following-sibling::span")
			WebElement emergencyContactError;


			//Capture Highest Education Drop-down
			@FindBy(xpath = "//span[@class='caret selectbox-caret']")
			WebElement highestEdDrpdwn;

			//Capture Listbox elements
			@FindBy(xpath = "//*[@id='eduTrId']//div[@class='bfh-selectbox-options']//li")
			List<WebElement>listElements;
 

			//Capture Error Message under Phone field
			@FindBy(xpath = "//span[@class='help-block errorMsg']")
			WebElement phError;

			//Capture Close button
			@FindBy(xpath = "//button[@class='mfp-close']")
			WebElement btnClose1;

			//Capture Month
			@FindBy(xpath = "//th[@class='month']//span")
			WebElement month;

			//Capture Next Month Selector
			@FindBy(xpath = "//th[@class='month']//a[@class='next']")
			WebElement nextMonth;

			//Capture Year
			@FindBy(xpath = "//th[@class='year']//span")
			WebElement year;

			//Capture Next Year Selector
			@FindBy(xpath = "//th[@class='year']//a[@class='next']")
			WebElement nextYear;

			//Capture Previous Year Selector
			@FindBy(xpath = "//th[@class='year']//a[@class='previous']")
			WebElement previousYear;

			//Capture Dates
			//@FindBy(xpath = "//*[@id='candidatePersonalDetailsForm']//table[@class='calendar table table-bordered']//td[@data-day]")
			@FindBy(xpath = "//table[@class='calendar table table-bordered']//td[@data-day]")
			List<WebElement> dates;

			//Capture Available From Date Selector
			@FindBy(xpath = "//*[@id='candidatePersonalDetailsForm']//input[@name='availableFrom']")
			WebElement dateSelector;
			// Capture Work Status Edit button
			@FindBy(xpath = "//div[contains(text(),'Work Status')]/following-sibling::a[1]")
			WebElement WorkStatusEdit;

			// Capture Work permit drop down
			@FindBy(xpath = "//div[@id='workPermitTypeId']")
			WebElement WorkPermitType;

			// Capture 'Yes' field from the Work permit drop down
			@FindBy(xpath = "//div[@class='bfh-selectbox-options']//div//a[contains(text(),'Yes')]")
			WebElement YesField;
			// Capture Salary Deposit window by Header "Salary Deposit"
						@FindBy (xpath = "//h2[contains(text(),'Salary Deposit')]")
						public WebElement SalaryDepositWindow;

			// Selecting the Value "Yes" from the Work Permit Drop down
			public void EnterWorkPermitType() {
				Actions a = new Actions(ldriver);
				a.moveToElement(WorkPermitType).click().build().perform();
				WebDriverWait wait = new WebDriverWait(ldriver, 10);
				wait.until(ExpectedConditions.elementToBeClickable(WorkPermitType));
				a.moveToElement(YesField).click().build().perform();

			}

			// Capture permit Type drop down
			@FindBy(xpath = "//div[@id='permitTypeId']")
			WebElement PermitType;
			//Capture Contact Edit Icon button
			@FindBy(xpath = "//*[@id='pcontact']//span[@class='icon-edit']")
			WebElement contactEditIcon;

			// Capture "Work Permit" from the Work Permit Drop down
			@FindBy(xpath = "//a[contains(text(),'Work Permit')]")
			WebElement WorkPermitField;
			//Capture Home Phone
			@FindBy(xpath = "//*[@id='phone']")
			WebElement homePhone;
			// Selecting the Value "Work Permit" from the Work Permit Drop down
			public void EnterPermitType() {
				PermitType.click();
				WorkPermitField.click();

			}
			public void clk_plsslct() throws InterruptedException
			{
				 
				Thread.sleep(2000);
				Actions actions= new Actions(ldriver);
				actions.click(dropdown_pleaseselect);
			}
			
			//Click on Contact Edit Icon button
			public void clkContactEdit() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(contactEditIcon));
				wait.until(ExpectedConditions.elementToBeClickable(contactEditIcon));
				contactEditIcon.click();
			}
            // capture please select dropdown
			@FindBy(xpath="//*[@id=\"salaryTrId\"]/td/div/div/a/span[2]")
			WebElement dropdown_pleaseselect;
			// Capture Permit Expiry date from Calendar
			@FindBy(xpath = "//input[@name='permitExpiry']")
			WebElement PermitExpiry;

			@FindBy(xpath = "//span[contains(text(),'November')]")
			WebElement SetMonth;

			@FindBy(xpath = "//span[contains(text(),'2019')]")
			WebElement SetYear;

			@FindBy(xpath = "//th[@class='year']//i[@class='fa fa-chevron-right']")
			WebElement clkNextYear;

			@FindBy(xpath = "//td[@class='today']")
			WebElement Setday;

			// Setting the Permit Expiry date as 5th november 2020
			

			// Capture Upload Work permit Upload file field
			@FindBy(xpath = "//label[@id='fileName1']")
			WebElement WSUploadFile;

		
			// Capture "Save Changes" Submit Button on Work Status window
			@FindBy(xpath = "//input[@class='btn btn-primary']")
			WebElement WSSaveBtn;

			// Capture ErrorMessage for work status upload file
			@FindBy(xpath = "//span[@class='help-block errorMsg']")
			public WebElement WSErrorMsg;

			//Capture Address Error
			@FindBy(xpath = "//*[@id='addressError']")
			WebElement addressError;
			//Capture Address Tab
			@FindBy(xpath = "//*[@id='paddress']/div/table/tbody/tr/td")
			WebElement addressTab;
          // capture edit icon for work status
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[1]/section[1]/div[5]/div[1]/a[1]/span[1]")
			WebElement edibtn;

			//Capture Emergency Contact Phone
			@FindBy(xpath = "//*[@id='phone2']")
			WebElement emergencyContactPhNum;



			//Capture Emergency Contact
			@FindBy(xpath = "//*[@id='name']")
			WebElement emergencyContactName;

			//Capture Emergency Contact Name displayed
			@FindBy(xpath = "//*[@id='pcontact']//td[3]//span[2]")
			WebElement contactNumDisplayed;
			//Capture Emergency Contact Name displayed
			@FindBy(xpath = "//*[@id='pcontact']//td[2]/span")
			WebElement contactNameDisplayed;
			//Capture Contact Edit Save button
			@FindBy(xpath = "//*[@id='candidateContactDetails']//input[@type='submit']")
			WebElement contactSaveBtn;
			//Capture Phone number displayed
			@FindBy(xpath = "//*[@id='pcontact']//div[@class='contactPhoneNumbers']/span[2]")
			WebElement homePhDisplayed;
			//Capture Error Message in Emergency Contact Phone
			@FindBy(xpath="//input[@id='phone2']/following-sibling::span")
			WebElement emergencyPhoneError;
			 
			//Capture Error Message WebElement in Home Phone field
			@FindBy(xpath = "//input[@id='phone']/following-sibling::span")
			WebElement homeError;
			//Capture Edit Contact pop-up
			@FindBy(xpath = "//*[@id='editContact']//div[@class='modal-content']")
			WebElement editContactPopup;
	          /////////Salary Details////////////////
			
		@FindBy(xpath="//*[@id=\"salaryDetails\"]/div/a/span")
		public WebElement Salarydeposit;
		
		@FindBy(xpath="//*[@id=\"salaryTrId\"]/td/div/div/a/span[2]")
		public WebElement pleaseselectscrollbtn;
		
		@FindBy(xpath="//*[@id=\"salaryTrId\"]/td/div/div/div/div/ul/li[2]/a")
		public WebElement DirectTransfercrollbtn;
	
		@FindBy(xpath="//input[@id='branch-number']")
		public WebElement Branchnumber;
		
		
		@FindBy(xpath="//input[@id='insititution-number']")
		public WebElement Institutionnumber;
		
		
		@FindBy(xpath="//input[@id='account-number']")
		public WebElement accountnumber;
		
		
		@FindBy(xpath="//input[@id='inputGroupFile03']")
		public WebElement uploadfile;
		
		
		@FindBy(xpath="//input[@id='SIN-number']")
		public WebElement sinnumber;

		@FindBy(xpath="//input[@type='submit']")
		public WebElement savechanges;
		
		
		
		//////Education Details///////////////
		@FindBy(xpath="//*[@id=\"peducation\"]/div/a")
		public WebElement EditEducation;
		
		@FindBy(xpath="//span[@class='caret selectbox-caret']")
		public WebElement SelectEducation;
		
		//////////Select Which Qualifications///////////
		
		@FindBy(xpath="//*[@id=\"highestEduId\"]/div/div/ul/li[2]/a")
		public WebElement PrimarySchool;
		
		@FindBy(xpath="//*[@id=\"highestEduId\"]/div/div/ul/li[3]/a")
		public WebElement HighSchool;
		
		@FindBy(xpath="//*[@id=\"highestEduId\"]/div/div/ul/li[4]/a")
		public WebElement College;
		
		@FindBy(xpath="//*[@id=\"highestEduId\"]/div/div/ul/li[5]/a")
		public WebElement Diploma;
		
		@FindBy(xpath="//*[@id=\"highestEduId\"]/div/div/ul/li[6]/a")
		public WebElement Certifications;
		
		@FindBy(xpath="//*[@id=\"highestEduId\"]/div/div/ul/li[7]/a")
		public WebElement Unigrad;
		
		@FindBy(xpath="//*[@id=\"highestEduId\"]/div/div/ul/li[8]/a")
		public WebElement postgrad;
		
		@FindBy(xpath="//input[@id='institution-name']")
		public WebElement Institutionname;
		
		
		@FindBy(xpath="//*[@id=\"yearId\"]/a/span[1]")
		public WebElement YearCompleted;
		
		
		@FindBy(xpath="//*[@id=\"yearId\"]/div/div/ul/li[1]/a")
		public WebElement Year2025;
		
		
		@FindBy(xpath="//input[@id='inputGroupFile03']")
		public WebElement uploadEdufile;
		
		@FindBy(xpath="//input[@type='submit']")
		public WebElement saveEduchanges;
		
		                        //PDA WEB ELMENT//
		     
		        @FindBy(xpath="/html/body/section/div/section/div[10]/div/div[2]/a[2]")
		         public WebElement uploadanalysis;
		
				@FindBy(xpath="//input[@id='inputGroupFile04']")
				public WebElement uploadPdadoc;
	
				@FindBy(xpath="//input[@type='submit']")
				public WebElement Pdasavechngs;
				
				
		
	            ///////////Function of Salary Details/////////////////////////////
		public void ClickSalarydeposit() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(Salarydeposit));
			Salarydeposit.click();
		
		}
		
		public void ClickPleaseselectscrollbtn() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(pleaseselectscrollbtn));
			pleaseselectscrollbtn.click();
		
		}
		
		public void DirectTransferscrollbtn() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(DirectTransfercrollbtn));
			DirectTransfercrollbtn.click();
		
		}
		
		
		public void SelectBranchNumber() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(Branchnumber));
			Branchnumber.clear();
			Branchnumber.sendKeys("12345");
		
		}

		public void SelectInstitutionNumber() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(Institutionnumber));
			Institutionnumber.clear();
			Institutionnumber.sendKeys("675");
		
		}

		public void SelectAccountNumber() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(accountnumber));
			accountnumber.clear();
			accountnumber.sendKeys("123468912345");
		
		}
		
		
		public void UplaodFile() {
		//WebDriver driver = new ChromeDriver();
	//	driver.get("http://52.60.159.184/candidate/profile");
		uploadfile.sendKeys("C:\\Users\\useer\\Desktop\\204\\img 1.png");
		//driver.close();
		}
		
		
		public void SelectSINNumber() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(sinnumber));
			sinnumber.clear();
			sinnumber.sendKeys("569879874");
		
		}
		
		
		public void SaveChanges() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(savechanges));
			savechanges.click();
		
		}
		
		
		
		public void UplaodFile1() {
			//WebDriver driver = new ChromeDriver();
		//	driver.get("http://52.60.159.184/candidate/profile");
			uploadfile.sendKeys("C:\\Users\\useer\\Desktop\\211\\101.mp4");
			//driver.close();
			}
		
		////////////////Function of Education Details//////////////////////////
		
		
		public void EditEducationDetails() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(EditEducation));
			EditEducation.click();
		
		}
		
		
		public void SelectEducationID() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(SelectEducation));
			SelectEducation.click();
		
		}
		
		public void SelectID5() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(Diploma));
			Diploma.click();
		
		}
		
		

		public void Institutionname() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(Institutionname));
			Institutionname.sendKeys("University of India");;
		
		}
		
		public void YearSelected() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(YearCompleted));
			YearCompleted.click();;
		
		}
		public void YearID1() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(Year2025));
			Year2025.click();;
		
		}
		
		public void UplaodEduFile() {
			//WebDriver driver = new ChromeDriver();
		//	driver.get("http://52.60.159.184/candidate/profile");
			uploadEdufile.sendKeys("C:\\Users\\useer\\Desktop\\204\\img 1");
			//driver.close();
			} 
		
		
		public void UplaodEduFile1() {
			//WebDriver driver = new ChromeDriver();
		//	driver.get("http://52.60.159.184/candidate/profile");
			uploadEdufile.sendKeys("C:\\Users\\useer\\Desktop");
			//driver.close();
			}
		
		
		
		
		public void SaveEduChanges() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(saveEduchanges));
			saveEduchanges.click();
		
		}
		
		/////////////////////////Function of PDA////////////////////////////////////////////
		
		public void UploadPDA() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(uploadanalysis));
			uploadanalysis.click();
		
		}
		
		
		public void UplaodPADdoc() {
			//WebDriver driver = new ChromeDriver();
		//	driver.get("http://52.60.159.184/candidate/profile");
			//uploadPdadoc.click();
			uploadPdadoc.sendKeys("C:\\Users\\useer\\Desktop");
			//driver.close();
			}

		
		public void SavePDAChanges() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(Pdasavechngs));
			Pdasavechngs.click();
		}
		
}


	 
			
