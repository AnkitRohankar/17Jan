package com.SauceDemoTestPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TestClass_Verify_Login_Fuctionality extends TestBaseClass
{
	
	
	@Test
	public void VerifyLoginFunctionality()
	{

// validation
    System.out.println("Apply the validation");
    
    
    String expectedTitle = "Swag Labs";  // title get in dev/po/ba/
    String actualTitle = driver.getTitle();
    
     
// Hard Asseration    
    Assert.assertEquals(actualTitle, expectedTitle,"Mismatch of Title");
 } 
	
}
	        
  
   // Remove if else then used Assertion -----> Hard Asseration 
    
// // if else condition
//    
//    if(givenTitle.equals(actualTitle))
//    {
//    	System.out.println("Test case is pass");
//    }
//    else
//    {
//    	System.out.println("Test case is failed");
//    }
    
 
    
    
//    @Test
//	public void VerifyLoginFunctionality() throws IOException
//	{
//		
//		
//	System.setProperty("webdriver.chromr.driver",
//			"C:\\Users\\91876\\Downloads\\Selelium Automation\\chromedriver_win32\\chromedriver.exe");
//
//				
//	WebDriver driver = new ChromeDriver();
//	System.out.println("Opened the browser");
//	
//	driver.manage().window().maximize();
//	System.out.println("maximize browser");
//	
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	driver.get("https://www.sauceDemo.com");
//    System.out.println("Open url");
//    
//  // Screensht
//    
//    UtilityClass.screenShotMethod(driver, "LoginPage");
//    
//    System.out.println("Screenshot is Generated");
// 
//
//    
//  // Apply login Functionality  // login Activity
//
//  // created pom class object    
//    
//    
//    POMClass_Login loginpage = new POMClass_Login(driver);	
//    
//    loginpage.sendUsername();
//    System.out.println("Username is Enter");
//    
//    loginpage.sendPassword();
//    System.out.println("Password is Enter");
//    
//    loginpage.clickLoginbtn();
//    System.out.println("Click on login button");
//    
//  // ScreenShot
//    UtilityClass.screenShotMethod(driver, "HomePage");
//    System.out.println("ScreenShot is Done");
//    
//
//// homepage   
//    System.out.println("Went on Homepage");
//    
//    
//    
//    
//    
//    
//    driver.quit();
//    System.out.println("browser is closed");
//    
//    System.out.println("End of program");
//    
//    
//    
//    
    
    
    
    
    
    
    
    
    
    
    
    
    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	


