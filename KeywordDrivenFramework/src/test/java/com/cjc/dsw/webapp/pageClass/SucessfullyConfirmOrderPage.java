package com.cjc.dsw.webapp.pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SucessfullyConfirmOrderPage {
	
	WebDriver driver;
	
	public SucessfullyConfirmOrderPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[1")
	@CacheLookup
	WebElement SucOrd;
	
	public void SucessfullyConfirmOrder() 
	{
		String OrderNo = SucOrd.getText();
		System.out.println(OrderNo);
    }
}
