package com.cjc.dsw.webapp.pageClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PaymentInformation {
	
	WebDriver driver;
	
	public PaymentInformation(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath = "//li[5]/div[2]/div/input")
	@CacheLookup
	WebElement ClkPayInfoBut;
	
	public void PaymentInfo()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ClkPayInfoBut.click();
	}
	

}
