package com.cjc.dsw.webapp.pageClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCart {
	WebDriver driver;
	public ShoppingCart(WebDriver driver)
	{
		super();
		this.driver=driver;
	}
	
	@FindBy(linkText = "Shopping cart")
	//@FindBy(xpath = "//span[contains(text(),'Shopping')]")
	//@FindBy(css = "span.cart-label")
	WebElement ClkCartlink;
	
	@FindBy(xpath = "//input[@id='termsofservice']")
	@CacheLookup
	WebElement Clktermsofservice;
	
	@FindBy(xpath = "//button[@id='checkout']")
	@CacheLookup
	WebElement ClkCheckout;
	

	
	public void AddShoppingCart() throws InterruptedException
	{
		//Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(40));

	    wait.until(ExpectedConditions.elementToBeClickable(ClkCartlink));
		
	    ClkCartlink.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Clktermsofservice.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		ClkCheckout.click();
	}

	
}
