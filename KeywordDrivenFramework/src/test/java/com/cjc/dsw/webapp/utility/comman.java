package com.cjc.dsw.webapp.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class comman {
	
	
	Properties pro;
	public static Properties getBrowser() throws IOException
	{
		Properties pro=new Properties();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Rasika\\git\\KeyWordDrivernFrameWork\\KeywordDrivenFramework\\src\\test\\resources\\configuration.properties");
		pro.load(fis);
		return pro;
	}
	
	public void getExcelVal() throws IOException
	{
		File fi=new File("C:\\Users\\Rasika\\git\\KeyWordDrivernFrameWork\\KeywordDrivenFramework\\src\\test\\resources\\ExcelFile\\BillingAdd.xlsx");
		FileInputStream fis=new FileInputStream(fi);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		XSSFRow row=sh.getRow(1);
		XSSFCell us=row.getCell(0);
		XSSFCell pw=row.getCell(1);
	}

}
