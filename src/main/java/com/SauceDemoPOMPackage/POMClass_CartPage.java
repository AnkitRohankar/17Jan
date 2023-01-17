package com.SauceDemoPOMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass_CartPage {
	

//1. WebDriver Decleard
	
	private WebDriver driver ;

	
//2. Find WebElement
	
	@FindBy(xpath="//button[text()='Checkout']")
	private WebElement checkoutBtn;
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement continueShopkingBtn;
	
	@FindBy(xpath="//button[text()='Remove']")
	private WebElement removeBtn;
	
	
	
//3. Action perform
	
	public void CheckOutBtn()
	{
		checkoutBtn.click();
	}
	
	
	public void ContinueShoppingBtn()
	{
		continueShopkingBtn.click();
	}
	
	
	public void RemoveBtn()
	{
		removeBtn.click();
	}
	
	
	
//4. constructer created
	
	
	
	public POMClass_CartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
}
