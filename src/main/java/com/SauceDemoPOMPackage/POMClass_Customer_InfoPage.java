package com.SauceDemoPOMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass_Customer_InfoPage {
	

// 1. WebDriver declread 

	private WebDriver driver;
	

// 2. find element
	
	
	@FindBy(xpath="(//input[@class= 'input_error form_input'])[1]")
	private WebElement Firstname;
	
	@FindBy(xpath="(//input[@class= 'input_error form_input'])[2]")
	private WebElement Lastname;
	
	@FindBy(xpath="(//input[@class= 'input_error form_input'])[3]")
	private WebElement ZipCode;
	
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement cancleInfoPageBtn;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement ContinueBtn; 
	
	
// 3. Action Perform
	
	
	public void FirstnameSendKEys()
	{
		Firstname.sendKeys("Rohit");
	}
	
	
	public void LastnameSendKeys()
	{
		Lastname.sendKeys("AB");
	}
	
	
	public void ZipCodeSendKeys()
	{
		ZipCode.sendKeys("300450");
	}
	
	
	public void cancleInfoPageBtnClick()
	{
		cancleInfoPageBtn.click();
	}
	
	
	public void ContinueBtnClick()
	{
		ContinueBtn.click();
	}
	
	
// 4. constucter is created
	
	
	public POMClass_Customer_InfoPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
	
	
	
}
