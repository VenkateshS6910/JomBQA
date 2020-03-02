package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class CA_CurrentEmpPage {
	
public WebDriver ldriver;
	
	//Constructor
	
		public CA_CurrentEmpPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}

/////////Capturing all EmployeeDetails//////////////
		@FindBy(xpath="//*[@id=\"pemployment\"]/div/a")
		public WebElement ClickEmpdetails;
		
		
		@FindBy(xpath="//input[@id='currentEmployer']")
		public WebElement EmpName;
		
		
		@FindBy(xpath="//*[@id=\"autocomplete\"]")
		public WebElement EmpAddrss;
		
		
		@FindBy(xpath="//*[@id=\"emp_unit\"]")
		public WebElement EmpUnitno;
		
		
		@FindBy(xpath="//*[@id=\"designation\"]")
		public WebElement Positionheld;

		
		@FindBy(xpath="//*[@id=\"fromDate\"]/div[1]/input")
		public WebElement startdate;
		
		
		@FindBy(xpath="//*[@id=\"toDate\"]")
		public WebElement enddate;
		
		@FindBy(xpath="//*[@id=\"expiry\"]")
		public WebElement Iscurrent;
		
		@FindBy(xpath="//*[@id=\"referenceName\"]")
		public WebElement refrencename;
		
		
		@FindBy(xpath="//*[@id=\"referenceEmail\"]")
		public WebElement refrenceemail;
		
		@FindBy(xpath="//*[@id=\"phone\"]")
		public WebElement phoneno;
		
		
		@FindBy(xpath="//input[@id='save_id_button']")
		public WebElement empsavechanges;
		
		
		@FindBy(xpath="/html/body/section/div/section/div[9]/div/table/tbody/tr/td/table[1]/tbody/tr/td[6]/a[1]/span")
		public WebElement EditEmployee;
		
		
		///////////////////Function of Employee Details//////////////////////////////////////////////
		
		   public void ClickEmployeeDetails() {
			WebDriverWait wait = new WebDriverWait(ldriver, 25);
			wait.until(ExpectedConditions.visibilityOf(ClickEmpdetails));
			ClickEmpdetails.click();
		
		}
		
		
		   public void EmployeeName() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(EmpName));
				EmpName.sendKeys("Krunal");
			
			}
		
		
		
		   public void EmployeeAddress() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(EmpAddrss));
				EmpAddrss.sendKeys("Brampton,ON,Canada");
			
			}
		
		
		   public void EmployeeUnutNo() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(EmpUnitno));
				EmpUnitno.sendKeys("123");
			
			}
		
		   public void EmployeePosition() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(Positionheld));
				Positionheld.sendKeys("Software Tester");
			
			}
		
		   public void EmployeeStartDate() {
			   WebElement calender = ldriver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/form/table/tbody/tr[5]/td/div/div/div[1]/input"));
			   Actions a = new Actions(ldriver);
			   a.moveToElement(calender).doubleClick().build().perform();
			 WebElement year = ldriver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/form/table/tbody/tr[5]/td/div/div/div[2]/table/thead/tr[1]/th[1]/a[1]"));
			  a.moveToElement(year).click().build().perform();
			  WebElement month = ldriver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/form/table/tbody/tr[5]/td/div/div/div[2]/table/thead/tr[1]/th[2]/a[1]"));
			    a.moveToElement(month).click().build().perform();
			  WebElement date = ldriver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/form/table/tbody/tr[5]/td/div/div/div[2]/table/tbody/tr[3]/td[5]"));
			    a.moveToElement(date).click().build().perform();
		   }
		   
		
		   
		   public void EmployeeEndDate() {
			   WebElement calender = ldriver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/form/table/tbody/tr[7]/td/div/div/div[1]/input"));
			   Actions a = new Actions(ldriver);
			   a.moveToElement(calender).doubleClick().build().perform();
			 WebElement year = ldriver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/form/table/tbody/tr[7]/td/div/div/div[2]/table/thead/tr[1]/th[2]/a[1]"));
			  a.moveToElement(year).click().build().perform();
			  WebElement month = ldriver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/form/table/tbody/tr[7]/td/div/div/div[2]/table/thead/tr[1]/th[1]/a[2]"));
			    a.moveToElement(month).click().build().perform();
			  WebElement date = ldriver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/form/table/tbody/tr[7]/td/div/div/div[2]/table/tbody/tr[2]/td[6]"));
			    a.moveToElement(date).click().build().perform();
			
			}
		
		   
		   public void IsCurrent() {
			   Actions a =  new Actions(ldriver);
			   a.moveToElement(Iscurrent).build().perform();
				Iscurrent.click();
			
			}
		   
		   
		   public void EmployeeRefrencename() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(refrencename));
				refrencename.sendKeys("Gaurav Mistry");
			
			}
		   
		   
		   
		   public void EmployeeRefrenceemail() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(refrenceemail));
				refrenceemail.sendKeys("krunal.busyqa@gmail.com");
			
			}
		   
		   public void EmployeePhoneNumberl() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(phoneno));
				phoneno.sendKeys("6478032891");
			
			}
		   
		   
		   public void EmployeeSaveChanhges() {
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(empsavechanges));
				empsavechanges.click();
			
			}
		   public void EmployeeEditBtn() {
				WebDriverWait wait = new WebDriverWait(ldriver, 40);
				wait.until(ExpectedConditions.visibilityOf(EditEmployee));
				EditEmployee.click();
			
			}
		   
}

 
