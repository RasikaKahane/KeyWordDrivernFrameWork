package com.cjc.dsw.webapp.pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddPaymentmethod {
	
	WebDriver driver;
	public AddPaymentmethod(WebDriver driver)
	{
		super();
		this.driver=driver;
	}
	
	@FindBy(xpath = "//*[@id='payment-method-buttons-container']/input")
	@CacheLookup
	WebElement ClkPaymentBtn;
	
	
	public void paymentMethod()
	{
		ClkPaymentBtn.click();
	}
	

}
