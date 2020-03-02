package com.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CA_PastJomboneEmpPage {

public WebDriver ldriver;
	
	//Constructor
	
		public CA_PastJomboneEmpPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		
		
		
		}
	
		public boolean getcandidascending()
		{
			boolean x=true;
			int a[]=new int[10];
			int i=0;
			List<WebElement> list=ldriver.findElements(By.xpath("/html/body/section/div/section/div[1]/div[1]/div[2]/label[1]/span"));
			int count=list.size();
			System.out.println("count is "+ count);
			for(WebElement el : list)
			{
				String t=el.getText();
				//int index=t.indexOf("/");

				System.out.println(t);

			}
			for(int j=0;j<count-1;j++)
			{
				if(!(a[j]<=a[j+1]))
				{
					x=false;
					break;


				}
				


			}
			System.out.println("x is " + x);
			return x;

		}

		//find the start date for past jombone employment record

		@FindBy(xpath="/html/body/section/div/div/div[1]/table/tbody/tr/td[4]/label")

		WebElement stdate;


		//action method for start date

		public Boolean startdate()
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 5);
			wait.until(ExpectedConditions.visibilityOf(stdate));	
			if(stdate.isDisplayed())
			{

				return true;
			}
			else
			{
				return false;
			}

		}
		//find the end date for past jombone employment record
		@FindBy(xpath="/html/body/section/div/div/div[1]/table/tbody/tr/td[5]/label")
		WebElement edate;
		 
		//action method for start date

		public Boolean enddate()
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 5);
			wait.until(ExpectedConditions.visibilityOf(edate));	

			if(edate.isDisplayed())
			{
				return true;

			}
			else
			{
				return false;
			}

		}
		//find the reason for past jombone employment record
		@FindBy(xpath="//*[@id=\"candidatePastEmployments\"]/div/div/table/tbody/tr/td[4]/span")
		WebElement reason;
		//action method
		public Boolean reason()
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 5);
			wait.until(ExpectedConditions.visibilityOf(reason));	

			if(reason.isDisplayed())
			{
				return true;

			}
			else
			{
				return false;
			}
		}
			//fetch the first record from past jombone employments list
			@FindBy(xpath="//*[@id=\"candidatePastEmployments\"]/div/div/div/a")
			WebElement emp;
			//action method for past jombone employments list
			public void pastemp()
			{
				WebDriverWait wait = new WebDriverWait(ldriver, 25);
				wait.until(ExpectedConditions.visibilityOf(emp));
				wait.until(ExpectedConditions.elementToBeClickable(emp));
				emp.click();
			}

		}
	
		
		
 
