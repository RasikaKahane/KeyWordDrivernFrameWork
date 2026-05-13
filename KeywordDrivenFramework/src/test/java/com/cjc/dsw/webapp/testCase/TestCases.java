package com.cjc.dsw.webapp.testCase;

import org.testng.annotations.BeforeSuite;

public class TestCases {
	
	@BeforeSuite
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rasika\\eclipse-workspace1\\KeywordDrivenFramework\\src\\test\\resources\\Browser\\chromedriver.exe");
		
	}
	
	public void enterURL()
	{
		
	}

}
