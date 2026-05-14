package com.cjc.dsw.webapp.testCase;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cjc.dsw.webapp.pageClass.AddBillingaddress;
import com.cjc.dsw.webapp.pageClass.AddBook;
import com.cjc.dsw.webapp.pageClass.AddPaymentmethod;
import com.cjc.dsw.webapp.pageClass.AddShippingAddress;
import com.cjc.dsw.webapp.pageClass.ConfirmOrderPage;
import com.cjc.dsw.webapp.pageClass.PaymentInformation;
import com.cjc.dsw.webapp.pageClass.RegisterLoginPage;
import com.cjc.dsw.webapp.pageClass.ShoppingCart;
import com.cjc.dsw.webapp.pageClass.SucessfullyConfirmOrderPage;
import com.cjc.dsw.webapp.utility.comman;


public class TestCases {
	Logger log=Logger.getLogger(TestCases.class.getName());
	WebDriver driver;
	@BeforeSuite
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","src/test/resources/Browser/chromedriver.exe");
		 driver=new ChromeDriver();
		 log.info("Open Browser");
	}
	@BeforeTest
	public void enterURL()
	{
		driver.get("https://demowebshop.tricentis.com/register");
		log.info("Enter URL");
	}
	@BeforeClass
	public void maximize()
	{
		log.info("Maximize Window");
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void DBConnection()
	{
		log.info("Connect Database");
	}
    @Test (priority=1)
    public void Registration() throws IOException
	{
    	
    	
    	log.info("Registration Start");
    	RegisterLoginPage RegLogPg= PageFactory.initElements(driver, RegisterLoginPage.class);
    	comman.getExcel();
    	
    	RegLogPg.Register(comman.fn,comman.ln, comman.email, comman.pw, comman.cpw);
    	log.warn("successfully done");
	}
    @Test(priority=2)
	public void Book()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		log.info("Add Books Product");
		AddBook book = PageFactory.initElements(driver, AddBook.class);
		book.addBook();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
	}
	@Test(priority=3)
	public void ShoppingCartP() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		log.info("ShoppingCart");

		ShoppingCart shopCart = PageFactory.initElements(driver, ShoppingCart.class);
		shopCart.AddShoppingCart();
	}
	@Test(priority=4)
	public void Billingaddress() throws IOException
	{
		AddBillingaddress billAdd = PageFactory.initElements(driver, AddBillingaddress.class);
		
		String Country =comman.getBrowser().getProperty("country");
		String City = comman.getBrowser().getProperty("city");
		String Address = comman.getBrowser().getProperty("address");
		String PinCode = comman.getBrowser().getProperty("pincode");
		String PhNo = comman.getBrowser().getProperty("phNo");
		billAdd.BillingAddress(Country,City,Address,PinCode,PhNo);
		log.info("Billingaddress");
		
	}
	
	@Test(priority=5)
	public void Shippingaddress()
	{
		AddShippingAddress shipAdd = PageFactory.initElements(driver, AddShippingAddress.class);
		shipAdd.ShippingAddress();
		log.info("Shippingaddress");
		
	}
	@Test(priority=6)
	public void Paymentmethod()
	{
		
		AddPaymentmethod PayMod = PageFactory.initElements(driver, AddPaymentmethod.class);
	    PayMod.paymentMethod();
	    log.info("Paymentmethod");
		
	}
	@Test(priority=7)
	public void Paymentinformation()
	{
	
		
		/*SoftAssert sa=new SoftAssert();
		
		String Ptext = driver.findElement(By.xpath("//table/tbody/tr/td/p")).getText();
		sa.assertAll();
		Assert.assertEquals("You will pay by COD", Ptext);
		System.out.println(Ptext);*/
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		PaymentInformation PayInfo = PageFactory.initElements(driver, PaymentInformation.class);
		PayInfo.PaymentInfo();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		log.info("Paymentinformation");
	}
	@Test(priority=8)
	public void Confirmorder()
	{
		ConfirmOrderPage ConOrd = PageFactory.initElements(driver, ConfirmOrderPage.class);
		ConOrd.ConfirmOrder();
		log.info("Confirm Order");
	}
	@Test(priority=9)
	public void SucessfullyConfirmOrder()
	{
	
		
	 log.info("Order Confirmation");
	 SucessfullyConfirmOrderPage sucOrder=PageFactory.initElements(driver, SucessfullyConfirmOrderPage.class);
	 
	 log.info(sucOrder);
	}

}
