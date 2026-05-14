package com.cjc.dsw.webapp.pageClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddShippingAddress {
	
	WebDriver driver;
	
	public AddShippingAddress(WebDriver driver)
	{
		super();
		this.driver=driver;
	}
	
	@FindBy(xpath = "//input[@id='PickUpInStore']")
	@CacheLookup
	WebElement ClkPickUpInStore;
	
	@FindBy(xpath = "//div[@id='shipping-buttons-container']/input")
	@CacheLookup
	WebElement Clkshippingbtn;


public void ShippingAddress()
{
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	ClkPickUpInStore.click();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Clkshippingbtn.click();
	
}
}