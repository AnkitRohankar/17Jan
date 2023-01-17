package com.SauceDemoPOMPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass_HomePage {
	
//1. WebDriver declraed
	
	private WebDriver driver;
	
	
//2. find WebElements
	
	
// bikeLIght	
	@FindBy(xpath="(//button[text()='Add to cart'])[2]")
	private WebElement BikeLightProduct;

//ShirtProduct
	@FindBy(xpath="(//button[text()='Add to cart'])[3]")
    private WebElement ShirtProduct;

//Jacket
	@FindBy(xpath="(//button[text()='Add to cart'])[4]")
	private WebElement JacketProduct;

//OnesieProduct
	@FindBy(xpath="(//button[text()='Add to cart'])[5]")
	private WebElement OnesieProduct;

// RedT-shirt
	@FindBy(xpath="(//button[text()='Add to cart'])[6]")
	private WebElement RedShirtProduct;
	
//filter	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement Filter;

// Settingbtn	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement SettingBtn;

//Logout
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logout;
	
//Aboutus	
	@FindBy(xpath="//a[@id='about_sidebar_link']")
	private WebElement AboutUs;
	
	
	
// Bag product ==== find Element
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement BagProduct;
		

// Actipon perfoemed
			
    public void clickBagProduct()
	    {
	    	BagProduct.click();
	    }
    
 
 //AddToCart===find Element
    
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	WebElement addToCart;
	

// Action performrd===AddtoCart
	
	public String getTextFromAddToCartBtn()
	{
		String totalProductSelected =addToCart.getText();
	    return totalProductSelected; //1
	}
	

// All product
	
	@FindBy(xpath="//button[text()='Add to cart']")
	List< WebElement> AllProduct;
	
	
	
	public void clickAllProduct()
	{
		//assignment -> for each loop
		//or click on single-single ele
		
		for(WebElement product: AllProduct)     // for each loop
		{
			product.click();
		}
	}
	
	
		
		
		
//		
//		for(int i=0; i<AllProduct.size(); i++)   for loop 
//		{
//			AllProduct.get(i).click();
//		}
//	}
//	

	
	
	

	
	
    public void clickBikeLightProduct()
	{
		BikeLightProduct.click();
	}
	
	
    public void clickShirtProduct()
    {
    	ShirtProduct.click();
    }
	
	
	public void clickJacketProduct()
	{
		JacketProduct.click();
	}
	
	
	public void clickOnesieProduct()
	{
		OnesieProduct.click();
	}
	
	
	public void clickRedShirt()
	{
		RedShirtProduct.click();
	}
	
	
	public void clickSettingBtn()
	{
		SettingBtn.click();
	}
	
	
	public void clickLogout()
	{
		logout.click();
	}
	
	
	public void clickAboutUS()
	{
		AboutUs.click();
	}
	
	
	
	
// 4. constructer created	
	
	
	public POMClass_HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
}
