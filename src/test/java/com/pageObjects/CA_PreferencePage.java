 package com.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CA_PreferencePage {

public WebDriver ldriver;
	
	//Constructor
	
		public CA_PreferencePage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
	
		//Capture Job Location Remove Button
		@FindBy(xpath="//div[@class='loc_div']//div[2]/button/span")
		//@FindBy(xpath="//label[contains(text(),'Brampton, Ontario, Canada')]/parent::div//following-sibling::button")
		//List <WebElement> elelocclose;
		WebElement btnclose;
		
		//Capture Auto Suggest Option
		@FindBy(xpath="//div[@class='pac-container pac-logo']//div[1]")
		WebElement autosugg;
		
		//Capture Add Location Input Box
		@FindBy(xpath="//input[@placeholder='Add Location']")
		WebElement txtaddloc;
		
		
		//Capture Preferred Location
		@FindBy(xpath="//div[@class='loc_div']//label")
		List <WebElement> eleprefloc;
		
		//Capture the Me Dropdown menu
		@FindBy(xpath = "//*[@id='navbardrop']")
		WebElement drpdwnMe;
				
		//Capture My Profile link
		@FindBy(xpath ="//a[@class='dropdown-item'][contains(text(),'My Profile')]")
		WebElement lnkMyprofile;
		
		//Capture Preference Page link
		@FindBy(xpath="//a[@class='dropdown-item'][contains(text(),'Preferences')]")
		WebElement lnkPrefpg;
		
		//Capture Auto Suggestion
		@FindBy(xpath="//div[@class='pac-container pac-logo']//div[1]//span[2]")
		WebElement suggstn;
		
		//Capture All Auto Suggestion
		@FindBy(xpath="//div[@class='pac-container pac-logo']//div")
		List <WebElement> elesgstn;
		
		//Retrieve Location Error Message
		@FindBy(xpath="//div[@class='error_location']")
		WebElement err;
		
		//Capture Preferred Shit Timing
		@FindBy(xpath="//div[4]//ul//li//div//label")
		List <WebElement> eleshfttime;
		
		//Capture Tick Mark
		@FindBy(xpath="//input[@name='shift'][@class='custom-control-input saveShiftTime']")
		List <WebElement> eletick;
		
		//Capture preferred job type
		@FindBy(xpath="//div[6]//ul//li//div//label")
		List <WebElement> elejbtyp;
		
		//Capture Tick Mark
		@FindBy(xpath="//input[@name='jobType'][@class='custom-control-input saveJobType']")
		List <WebElement> elejtick;
		//********************Action Method********************//
		
		//Set Job Location Value
		public boolean setjobloc (String jobloc)
		{	
			boolean status=false;
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(txtaddloc));
			try 
			{
				txtaddloc.sendKeys(jobloc);
				wait.until(ExpectedConditions.visibilityOf(autosugg));
				autosugg.click(); //Selecting Auto Complete Option
				status =true;
			}
			catch (Exception e)
			{
				status=false;
			}
			
		    drpdwnmenuMe();
			clklnkMyprofile();
			drpdwnmenuMe();
			clklnkPrefpage();
			return status;
		}
		
		//Capture Preferred Location close Button and Remove location
		public void clkmulrmvloc () 
		{   
			//WebDriverWait wait = new WebDriverWait(ldriver, 25);
			//wait.until(ExpectedConditions.visibilityOfAllElements(elelocclose));
			//for(WebElement btnclose: elelocclose)
			//{
				//System.out.println(btnclose);
			for(int i=0; i<9; i++)
			{
				ldriver.navigate().refresh();
				btnclose.click(); 
				ldriver.navigate().refresh();
			}
		}
		
		//Capture Preferred Location close Button and Remove location
		public void clkrmvloc () 
		{   
				//ldriver.navigate().refresh();
				btnclose.click(); 
				//ldriver.navigate().refresh();
		}

		
		//Capture and Verify Preferred Location
		public String prefloc(String jobloc) throws InterruptedException
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOfAllElements(eleprefloc));
			String loc = null;
			for (WebElement Prefloc: eleprefloc)
			{
				//System.out.println(Prefloc.getText());
				if(Prefloc.getText().contains(jobloc))
					loc= Prefloc.getText();	
		    }
			return loc;
		}
		
		//Move mouse to Me dropdwon menu
		public void drpdwnmenuMe() 
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 30);
			wait.until(ExpectedConditions.visibilityOf(drpdwnMe));
			Actions action = new Actions(ldriver);
			action.moveToElement(drpdwnMe).build().perform();
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
		
		//Click Preference Page  link
		public void clklnkPrefpage ()
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 30);
			wait.until(ExpectedConditions.visibilityOf(lnkPrefpg));
			wait.until(ExpectedConditions.elementToBeClickable(lnkPrefpg));
			Actions action = new Actions(ldriver);
			action.moveToElement(lnkPrefpg).click().build().perform();	
		}
		
		//Retrieve Suggestion and Print Suggestions  
		public Object [] sugg(String jobloc)
		{	
			WebDriverWait wait = new WebDriverWait(ldriver, 30);
			wait.until(ExpectedConditions.visibilityOf(txtaddloc));
			txtaddloc.sendKeys(jobloc);
			wait.until(ExpectedConditions.visibilityOf(suggstn));
			//System.out.println(suggstn.getText());
			int i=0;
			for(WebElement lsug : elesgstn)
			{
				if(lsug.getText()!=null)i++;
				System.out.println("Auto Suggested Option "+i+":");
				System.out.println(lsug.getText());	
			}
			return new Object [] {suggstn.getText(), i};
		}
		
		//Set Mutliple Job Location Value
		public boolean setmuljobloc (String jobloc) throws InterruptedException
		{	
			boolean status=false;
			WebDriverWait wait = new WebDriverWait(ldriver, 30);
			wait.until(ExpectedConditions.visibilityOf(txtaddloc));
			try 
			{
				txtaddloc.sendKeys(jobloc);
				wait.until(ExpectedConditions.visibilityOf(autosugg));
				autosugg.click(); //Selecting Auto Complete Option
				status =true;
			}
			catch (Exception e)
			{
				status=false;
			}
			Thread.sleep(2000);
			return status;
		}
		
		//Retrieve already existing location from Preferred Location
		public String exisloc ()
		{ 
			String exsloc=null;
			for (WebElement exloc: eleprefloc)
			exsloc= exloc.getText();
			return exsloc;
		}
		
		//Add 11th location and Retrieve Error message
		public String elvloc(String jobloc)
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(txtaddloc));
			txtaddloc.sendKeys(jobloc);
			wait.until(ExpectedConditions.visibilityOf(autosugg));
			autosugg.click(); //Selecting Auto Complete Option
			wait.until(ExpectedConditions.visibilityOf(err));
			String msg=err.getText();
			return msg;
		}
		
		//Set Preferred Shift timing
		public boolean setshfttim () throws InterruptedException
		{	
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOfAllElements(eleshfttime));
			boolean status= false;
			for(WebElement shfttime : eleshfttime) 
			{   
				try 
				{
				wait.until(ExpectedConditions.elementToBeClickable(shfttime));
				shfttime.click();
				System.out.println("Selected Shift: "+shfttime.getText());
				status=true;
				Thread.sleep(1000);
				}
				catch (Exception e)
				{
					status=false;
					break;
				}	
			}
			return status;
		}
		
		//Verify Shift timing
		public boolean vrfyshfttim () throws InterruptedException
		{	
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOfAllElements(eleshfttime));
			boolean status= false;
			for(WebElement shfttime : eletick) 
			{   
				//System.out.println(shfttime.isSelected());
				if(shfttime.isSelected())
				status=true;
				else
				{
					status=false;
					break;
				}
			}
			return status;
		}
		
		//Unset Preferred Shift timing
		public boolean unsetshfttim () throws InterruptedException
		{	
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOfAllElements(eleshfttime));
			boolean status= false;
			for(WebElement shfttime : eleshfttime) 
			{   
				try 
				{
				wait.until(ExpectedConditions.elementToBeClickable(shfttime));
				shfttime.click();
				System.out.println("Unselected Shift: "+shfttime.getText());
				status=true;
				Thread.sleep(1000);
				}
				catch (Exception e)
				{
					status=false;
					break;
				}	
			}
			return status;
		}
		
		//Set Preferred Job Type
		public boolean setjbtyp () throws InterruptedException
		{	
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOfAllElements(elejbtyp));
			boolean status= false;
			for(WebElement jbtyp : elejbtyp)
			{
					try 
					{
					wait.until(ExpectedConditions.elementToBeClickable(jbtyp));
					jbtyp.click();
					System.out.println("Selected Job Type: "+jbtyp.getText());
					status=true;
					Thread.sleep(1000);
					}
					catch (Exception e)
					{
						status=false;
						break;
					}
			}
			return status;
		}
		
		//Verify Job type
		public boolean vrfyjbtyp () throws InterruptedException
		{	
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOfAllElements(elejbtyp));
			boolean status= false;
			for(WebElement jobtyp : elejtick) 
			{   
				//System.out.println(shfttime.isSelected());
				if(jobtyp.isSelected())
				status=true;
				else
				{
					status=false;
					break;
				}
			}
			return status;
		}
		
		//Unset Preferred Job Type
		public boolean unsetjbtyp () throws InterruptedException
		{	
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOfAllElements(elejbtyp));
			boolean status= false;
			for(WebElement jbtyp : elejbtyp) 
			{   
					try 
					{
					wait.until(ExpectedConditions.elementToBeClickable(jbtyp));
					jbtyp.click();
					//System.out.println("Unselected Job Type: "+jbtyp.getText());
					status=true;
					Thread.sleep(1000);
					}
					catch (Exception e)
					{
						status=false;
						break;
					}
			}
			return status;
		}
		
		
}
