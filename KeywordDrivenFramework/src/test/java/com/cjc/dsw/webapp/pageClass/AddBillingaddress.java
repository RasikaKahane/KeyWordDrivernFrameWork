package com.cjc.dsw.webapp.pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddBillingaddress {
	WebDriver driver;
	
	public AddBillingaddress(WebDriver driver)
	{
		super();
		this.driver=driver;
		
	}
	
	@FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
	@CacheLookup
	WebElement country;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_City']")
	@CacheLookup
	WebElement city;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
	@CacheLookup
	WebElement address;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
	@CacheLookup
	WebElement pincode;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
	@CacheLookup
	WebElement phNumber;
	
	@FindBy(xpath = "//div[@id='billing-buttons-container']/input")
	@CacheLookup
	WebElement clkBillBtn;
	
	public void BillingAddress(String coun,String cit,String add,String pin,String ph)
	{
		country.sendKeys(coun);	
		city.sendKeys(cit);
		address.sendKeys(add);
		pincode.sendKeys(pin);
		phNumber.sendKeys(ph);
		clkBillBtn.click();
		
		
	}
}
