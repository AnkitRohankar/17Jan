package com.SauceDemoTestPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.SauceDemoPOMPackage.POMClass_Login;
import com.SauceDemoUtilityPackage.UtilityClass;

public class TestBaseClass {
	
	// Test Base class ---> used for repeatation of code in test class written in test base class.
	

	
	WebDriver driver;   // globaliy decleared ---> one time no declare any class or POM Class
//	
//	
//	
////	@BeforeClass ----> Launch Browser 
////	@BeforeMethod----> Login Activity
////	@Test  ----------> Validation Apply 
////	@AfterMethod -----> Logout Activity
////	@AfterClass -----> Browser close
//	
//	
//// This are Annotation are used in programing	
//	
//	
//	
//// launch Browser
//	
//	
//	    @Parameters("browserName")       // used for multiple cross browsing testing
//	    
//	    @BeforeClass
//	    public void LanuchBrowser(String browserName) throws IOException   
//	    {
//	    	
//	    	if(browserName.equals("chrome"))
//	    	{
//		
//		         System.setProperty("webdriver.chromr.driver",          // key
//				                  "C:\\Users\\91876\\Downloads\\Selelium Automation\\chromedriver_win32\\chromedriver.exe");     // value
//		         
//		         driver = new ChromeDriver();
//		 		
//		 		
//	    	}
//	    	else 
//	    	{
//	    		System.setProperty("webdriver.gecko.driver",
//	    				"C:\\Users\\91876\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
//	    		
//	    		driver = new FirefoxDriver();
//	    				
//	    	}
//	    		
//	    	
//	    	
//	    System.out.println("Opened the browser");			
//		
//		driver.manage().window().maximize();
//		System.out.println("maximize browser");
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://www.sauceDemo.com");
//	    System.out.println("Open url");
//	    
//	    // Screensht
//	    
//	    UtilityClass.screenShotMethod(driver, "LoginPage");
//	    
//	         //    System.out.println("Screenshot is Generated");
//	 
//	   }
//	    
//	           // Apply login Functionality  // login Activity
//
//	               // created pom class object    
//	
//
//	    
//// login Activity
//	    
//	    
//	    @BeforeMethod
//	    public void LoginActivity() throws IOException
//	    {
//	    POMClass_Login loginpage = new POMClass_Login(driver);	
//	    
//	    loginpage.sendUsername();
//	    System.out.println("Username is Enter");
//	    
//	    loginpage.sendPassword();
//	    System.out.println("Password is Enter");
//	    
//	    loginpage.clickLoginbtn();
//	    System.out.println("Click on login button");
//	    
//	            // ScreenShot
//	    UtilityClass.screenShotMethod(driver, "HomePage");
//	           //   System.out.println("ScreenShot is Done");
//	    
//
//	     // homepage   
//	    System.out.println("Went on Homepage");
//	    
//	} 
//	    
//	    
//
//	    
//	    
//	    
//// logout Activity
//	   
//	    @AfterMethod
//	    public void LogoutActivity() throws IOException
//	    {
//	    	POMClass_HomePage hp = new POMClass_HomePage(driver);
//			
//			hp.clickSettingBtn();
//			System.out.println("Click on Three lines");
//			
//			hp.clickLogout();
//			System.out.println("Click on Logout button");
//			
//	       //  Screenshot LogoutPage
//			UtilityClass.screenShotMethod(driver, "LogOutPage");
//			//System.out.println("Screenshot is done by logout page");
//			
//			
//	    }
//	    
//
//// Browser close Activity	    
//                  
//		@AfterClass
//		public void tearDown()
//		{
//			driver.quit();
//			System.out.println("browser is closed");
//					
//			System.out.println("End of Program");
//		}
//
//	
//
//}   







// @beforeMethod --> Open browser, Max browser, open Url, login Activity.

// @Test ----> Not used in under class ---// beacuse it is a validation part ---> NO present

// @AfterMethod ----> Browesr closed And End of program used.






//WebDriver driver;   // globaliy decleared ---> one time no declare any class or POM Class



@BeforeMethod

public void SetUp() throws IOException   
{
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\91876\\Downloads\\Selelium Automation\\chromedriver_win32\\chromedriver.exe");

				
	driver = new ChromeDriver();
	System.out.println("Opened the browser");
	
	driver.manage().window().maximize();
	System.out.println("maximize browser");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.sauceDemo.com");
    System.out.println("Open url");
    
  // Screensht
    
    UtilityClass.screenShotMethod(driver, "LoginPage");
    
   // System.out.println("Screenshot is Generated");
 

    
  // Apply login Functionality  // login Activity

  // created pom class object    
    
    
    POMClass_Login loginpage = new POMClass_Login(driver);	
    
    loginpage.sendUsername();
    System.out.println("Username is Enter");
    
    loginpage.sendPassword();
    System.out.println("Password is Enter");
    
    loginpage.clickLoginbtn();
    System.out.println("Click on login button");
    
  // ScreenShot
    UtilityClass.screenShotMethod(driver, "HomePage");
 //   System.out.println("ScreenShot is Done");
    

// homepage   
    System.out.println("Went on Homepage");
    
} 
    
//Tear down method  ---> used Annotation
    
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("browser is closed");
				
		System.out.println("End of Program");
	}


}
//    
//		
//		
//		
		
	
	


