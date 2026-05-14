package com.cjc.dsw.webapp.pageClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddBook {

WebDriver driver;
	
	public AddBook(WebDriver driver)
	{
		super();
		this.driver=driver;
	}
	
	@FindBy(partialLinkText = "Books")
	@CacheLookup
	WebElement ClkOnBooks;
	
	@FindBy(xpath = "//div[1]/div/div[2]/div[3]/div[2]/input")
	@CacheLookup
	WebElement ClkAddBook;
	


  public void addBook()
  {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	ClkOnBooks.click();
	ClkAddBook.click();
  }
}
