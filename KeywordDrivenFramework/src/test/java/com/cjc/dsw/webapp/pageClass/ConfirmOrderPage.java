package com.cjc.dsw.webapp.pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ConfirmOrderPage {
	
	WebDriver driver;
	
	public ConfirmOrderPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath = "//div[@id='confirm-order-buttons-container']/input")
	@CacheLookup
	WebElement ConfirmOrd;
	
	public void ConfirmOrder()
	{
		ConfirmOrd.click();
	}
}
