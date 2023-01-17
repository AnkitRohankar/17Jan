package com.SauceDemoPOMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass_BuyPage {
	

// 1. Webdriver declared
	
	private WebDriver driver;
	
	
// 2. find Element
	
	
	@FindBy(xpath="//button[@name='cancel']")
	WebElement cancleBillingBtn;
	
	@FindBy(xpath="//button[text()='Finish']")
	WebElement finishBtn;
	
	
// 3. Actions Performed
	
	
	public void CancleBtnClick()
	{
		cancleBillingBtn.click();
	}
	
	
	public void FinishBtnClick()
	{
		finishBtn.click();
	}
	
	
// constructer is created
	
	
	public POMClass_BuyPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
	
	
	
	
	

}
