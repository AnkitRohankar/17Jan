package com.SauceDemoPOMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass_Login {
	
//1. webElement declearsd
	
	 private WebDriver driver;

	  
//2. find username, password and loginbtn 	  
	   
  // but no using findElement method using ----> annotation----> @FindBy(xpath="");    ---->  its like a method
	  
	  
	  @FindBy(id="user-name")
	  private WebElement username;
	  
	  @FindBy(id="password")
	  private WebElement password;
	  
	  @FindBy(id="login-button")
	  private WebElement loginBtn;
	  
	  
//3. Element Action performed  or   // maintain them in method
	  
  // username, password and loginbtn performed Action
	  
 
	 public void sendUsername()
	 {
		 username.sendKeys("standard_user");
	 }
	 
	 
	 public void sendPassword()
	 {
		 password.sendKeys("secret_sauce");
	 }
	  
	  
	 public void clickLoginbtn()
	 {
		 loginBtn.click();
	 }
	  
	  
//4. constructer declared
	 
	 public POMClass_Login(WebDriver driver)
	 {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	 }
	 
	  
// these are four step follow by pomclass-loginpage
	 
	
	 // 1. WebDriver driver ----> WebDriver decleared
	
	 // 2. find Weblement  --> using Annotation @FindBy(locater) WebElement refVariable;
	
	 // 3. Element Action  --> crated non static method
	
	 // 4. construter created --> parameter passed ( WebDriver driver ) --> this keyword is used because global and local variable same
	                                                                     // i.e  this.driver=driver;
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
