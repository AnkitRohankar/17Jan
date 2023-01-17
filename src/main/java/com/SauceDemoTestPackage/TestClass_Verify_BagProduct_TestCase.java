package com.SauceDemoTestPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemoPOMPackage.POMClass_HomePage;
import com.SauceDemoUtilityPackage.UtilityClass;

public class TestClass_Verify_BagProduct_TestCase extends TestBaseClass
{
	
	

// HomePage Activitiy----> Created pom class homepage object
	
	     @Test
	     public void VerifyBagProduct() throws IOException
	     {
		
		POMClass_HomePage hp = new POMClass_HomePage(driver);
		
		hp.clickBagProduct();
		System.out.println("Click on Bag Product");
		
// ScreenShot
		UtilityClass.screenShotMethod(driver, "Bag Product Selection");
		
// validation
	
		System.out.println("Apply the validation");
		
		String expectedProductSelection = "1";
		String actualProductSelected = hp.getTextFromAddToCartBtn();  //1
		
// Hard Asseration
		Assert.assertEquals(actualProductSelected,expectedProductSelection,"No select the bag Producct");
		
 }
}
		
		
// Remove if else conditon-----> used Hard Asseration
		
//		if(expectedProductSelection.equals(actualProductSelected))
//		{
//			System.out.println("Bag Product Test case is passed");
//		}
//		else
//		{
//			System.out.println("Bag Product Test case is failed");
//		}
//	


//           @Test
//                 public void VerifyBagProduct() throws IOException
//                 {
//
//                 POMClass_HomePage hp = new POMClass_HomePage(driver);
//
//                 hp.clickBagProduct();
//                System.out.println("Click on Bag Product");
//
//                //ScreenShot
//                 UtilityClass.screenShotMethod(driver, "Bag Product Selection");
//                 }
//


		
		
		// Already coding/programing is created in----> Test Base Class === then Inheritance class with the help of extends keyword
		
		
//		@Test
//		public void VerifyBagProductTestCase() throws IOException
//		{
//			System.setProperty("webdriver.chorme.driver",
//					"C:\\Users\\91876\\Downloads\\Selelium Automation\\chromedriver_win32\\chromedriver.exe");
//			
//			WebDriver driver = new ChromeDriver();
//			System.out.println("Opened browser");
//			
//			driver.manage().window().maximize();
//			System.out.println("Browser is maximize");
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//			
//			driver.get("https://www.saucedemo.com");
//			System.out.println("Opened url");
//			
//	// login Activitiy   // crated pom class login object
//			
//			
//			POMClass_Login lp = new POMClass_Login(driver);
//			
//			lp.sendUsername();
//			System.out.println("Username is Enter");
//			
//			lp.sendPassword();
//			System.out.println("PAssword is Enter");
//			
//			lp.clickLoginbtn();
//			System.out.println("Click on Login Button");
//			
//	// HomePage
//			System.out.println("Went on Homepage");
//			
//		
//		
//		
//		
//		
//		
//		
//		driver.quit();
//		System.out.println("browser is closed");
//						
//		System.out.println("End of Program");
//
//		
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


