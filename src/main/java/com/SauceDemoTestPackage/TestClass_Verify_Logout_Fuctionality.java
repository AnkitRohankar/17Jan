package com.SauceDemoTestPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass_Verify_Logout_Fuctionality extends TestBaseClass
{
	
	
// logout Activity
		
 // Created homepage object
		
		
	@Test
	public void VerifyLogoutFunctionality() throws IOException
	{
		
// Validation
		
		System.out.println("Apply the validation");
		
		String expectedTitle = "Swag Labs";   //PO/BA/dev		
		String actualTitle = driver.getTitle();
		
// Hard Asseration
		Assert.assertEquals(actualTitle,expectedTitle,"Mismatch of the logout Activity");

		
	}		
		
}			
		

// remove if else condition ----> used Hard Asseration
		
// if else condition
//		
//		if(givenTitle.equals(actualTitle))
//		{
//			System.out.println("Logout test case is passed");
//		}
//		else
//		{
//			System.out.println("Logout test case is failed");
//		}


  
//@AfterMethod
//POMClass_HomePage hp = new POMClass_HomePage(driver);
//
//hp.clickSettingBtn();
//System.out.println("Click on Three lines");
//
//hp.clickLogout();
//System.out.println("Click on Logout button");
//
////Screenshot LogoutPage
//UtilityClass.screenShotMethod(driver, "LogOutPage");
////System.out.println("Screenshot is done by logout page");
//
//
////loginPage
//
//System.out.println("Went on LoginPage");






		
//		@Test
//		public void VerifyLOgoutFunctionality() throws IOException   // used for @Test Annotation
//		{
//			
//			System.out.println("Verify Logout Fuctionality");
//			
//			
//			System.setProperty("webdriver.chorme.driver",
//					"C:\\Users\\91876\\Downloads\\Selelium Automation\\chromedriver_win32\\chromedriver.exe");
//	       
//			
//			WebDriver driver = new ChromeDriver();
//			System.out.println("Opened Browser");
//			
//			driver.manage().window().maximize();
//			System.out.println("Browser is Maximize");
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//			
//			driver.get("https://www.saucedemo.com");
//			System.out.println("Opened url");
//			
//	// Login Activity		
//			
//			// object created in pom-class-login
//			
//			POMClass_Login lp = new POMClass_Login(driver);
//			
//			lp.sendUsername();
//			System.out.println("Username is Enter");
//			
//			lp.sendPassword();
//			System.out.println("Password is Enter");
//			
//			lp.clickLoginbtn();
//			System.out.println("Click on login button");
//			
//			
//	// HomePage
//			
//			System.out.println("Went on HomePage");
//			
//
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		
//	driver.quit();
//	System.out.println("Browser is closed");
//	
//	System.out.println("End of Program");
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	


