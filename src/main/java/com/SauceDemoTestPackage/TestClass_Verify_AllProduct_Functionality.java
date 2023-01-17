package com.SauceDemoTestPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemoPOMPackage.POMClass_HomePage;
import com.SauceDemoUtilityPackage.UtilityClass;



public class TestClass_Verify_AllProduct_Functionality extends TestBaseClass
{
	@Test
	public void VerifyAllProductFunctionality() throws IOException
	{
	
		POMClass_HomePage hp = new POMClass_HomePage(driver);
		
//allPrdtClick
		hp.clickAllProduct();
		System.out.println("Clicked on all Product");
		
// ScreenShot
		UtilityClass.screenShotMethod(driver, "All Product Selection");
		//System.out.println("All product Selection Screenshot");
		
		System.out.println("Apply the validation");
		 
		String expectedProductSelection = "6";
		String actualProductSelected = hp.getTextFromAddToCartBtn();  //1
		
		Assert.assertEquals(actualProductSelected, expectedProductSelection,"Not Selected all product");
		
	 }
	}	
//		if(expectedProductSelection.equals(actualProductSelected))
//		{
//			System.out.println("All Product Test case is passed");
//		}
//		else
//		{
//			System.out.println("All Product Test case is failed");
//		}
//		
 
		
//		// 1. Remove main Method And Write Annotation @Test ----> First Lecture or first Step by Crating test Class

//		@Test
//		public void  verifyAllProductsAddToCartFunctionality() throws IOException 
//		{
//			System.setProperty("webdriver.chrome.driver", 
//					"C:\\Users\\91876\\Downloads\\Selelium Automation\\chromedriver_win32\\chromedriver.exe");
//			
//			WebDriver driver = new ChromeDriver();
//			System.out.println("browser is opened");
//					
//			driver.manage().window().maximize();	
//			System.out.println("browser is maximized");
//					
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//			
//			driver.get("https://www.saucedemo.com/");
//			System.out.println("url is opened");
//			
//	//loginActivity
//			POMClass_Login lp = new POMClass_Login(driver);
//			lp.sendUsername();
//			System.out.println("username is entered");
//			
//			lp.sendPassword();
//			System.out.println("password eneterd");
//			
//			lp.clickLoginbtn();
//			System.out.println("clicked on login button");
//			
//	//homePage
//			System.out.println("went on homePage");	
//		
//		
////		driver.quit();
////		System.out.println("browser is closed");
////						
////		System.out.println("End of Program");
//		
//	
//




