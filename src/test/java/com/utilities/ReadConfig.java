package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ReadConfig 
{
	// Properties Class
	Properties pro; 
	
	// Constructor
	public ReadConfig(WebDriver driver)
	{
		File src = new File("./Configuration/config.properties");// Creating File object
			
		try 
		{
			// Open FileInputStream and Read data 
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis); // Load config.properties file
		} 
		catch (Exception e) 
		{	
			// If config.properties file is not available it will throw an exception
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	// Methods to read data from config.properties 
	public String getApplicationURL()                            // ok - add new url in config.properties
	{
		String url=pro.getProperty("baseURL"); // Value from config.properties stored in url variable
		return url;
	}
	
	//Reading Candidate Address
		public String getcdaddress()
		{
		String cdaddress=pro.getProperty("cdaddress");
		return cdaddress;
		}
     //Reading shift start time
		public String getshiftstarttime()
		{
			String getshiftstrttime=pro.getProperty("shftstrttime");
			return getshiftstrttime;
		}
	//Reading Company Address
	public String getcaddress()
	{
	String caddress=pro.getProperty("caddress");
	return caddress;
	}
 
	
	public String getPassword() 
	{
	String password=pro.getProperty("password");
	return password;
	}
	//Reading Preferred Location
	public String getprfrdloc()
	{
	String prefloc=pro.getProperty("prefloc");
	return prefloc;
	}

	public String getUsername1() // new 
	{
		String username1=pro.getProperty("username1");
		return username1;
	}
	public String getCompanyUserName() 
	{
		String CoUserName=pro.getProperty("company_username");
		return CoUserName;
	}
	//Get the company password for Company Login
		public String getCompanyPassword() 
		{
			String CoPassword=pro.getProperty("company_password");
			return CoPassword;
		}
		public String getCompanyNewPassword() 
		{
			String CoNewPassword=pro.getProperty("company_newpassword");
			return CoNewPassword;
		}

		//Get the company password for Company Login
		public String getCompanyConfirmPassword() 
		{
			String CoConfirmPassword=pro.getProperty("company_confirmpassword");
			return CoConfirmPassword;
		}
		//Reading Candidate Name
		public String getcdname()
		{
		String cdname=pro.getProperty("cdname");
		return cdname;
		}

	public String getfName() 
	{
		String firstName=pro.getProperty("fName");
		return firstName;
	}
	//Get the last name value for Candidate Sign Up page
		public String getlName() 
		{
			String lastName=pro.getProperty("lName");
			return lastName;
		}
	
		//Reading New User email address
				public String getnwemail()
				{
				String nwemail=pro.getProperty("nwemail");
				return nwemail;
				}


				//Reading New User invalid email address
				public String getinvemail()
				{
				String invemail=pro.getProperty("invemail");
				return invemail;
				}


	//Get the candidate username for Candidate Login
		public String getSeniorHRUsername() 
		{
			String username2=pro.getProperty("sHRUsername");
			return username2;
		}

		//Get the candidate password for Candidate Login
		public String getSeniorHRPassword() 
		{
			String password2=pro.getProperty("sHRPassword");
			return password2;
		}



		//Get the inactive username for Login
		public String getInactiveUsername() 
		{
			String username3=pro.getProperty("inactive_username");
			return username3;
		}

		//Get the inactive password for Login
		public String getInactivePassword() 
		{
			String password3=pro.getProperty("inactive_password");
			return password3;
		}

	
	public String getChromePath() 
	{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}
	
		
}
