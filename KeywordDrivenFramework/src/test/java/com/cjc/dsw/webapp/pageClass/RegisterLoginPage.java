package com.cjc.dsw.webapp.pageClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class RegisterLoginPage {
	
	WebDriver driver;
	
	public RegisterLoginPage(WebDriver driver)
	{
		super();
		this.driver=driver;
	}
	
	@FindBy(linkText = "Register")
	@CacheLookup
	WebElement clkReg;
	
	
	@FindBy(id="gender-female")
	@CacheLookup
	WebElement clkGender;
	
	
	@FindBy(name="FirstName")
	@CacheLookup
	WebElement FName;
	
	@FindBy(name="LastName")
	@CacheLookup
	WebElement LName;
	
	
	@FindBy(name="Email")
	@CacheLookup
	WebElement Email;
	
	@FindBy(name="Password")
	@CacheLookup
	WebElement PW;
	
	@FindBy(name="ConfirmPassword")
	@CacheLookup
	WebElement CPW;
	
	@FindBy(name="register-button")
	@CacheLookup
	WebElement ClkbtnReg;
	
	@FindBy(xpath ="//div/div[2]/div[2]/input")
	@CacheLookup
	WebElement BtnContinue;
	
	
	 
	public void Register(String Fname,String Lname,String email,String PassW,String ConfPW)
	{
		clkReg.click();
		clkGender.click();
		FName.sendKeys(Fname);
		LName.sendKeys(Lname);
		Email.sendKeys(email);
		PW.sendKeys(PassW);
		CPW.sendKeys(ConfPW);
		ClkbtnReg.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		BtnContinue.click();
	}
	
	
	

}
