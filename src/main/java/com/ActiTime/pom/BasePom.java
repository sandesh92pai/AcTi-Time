package com.ActiTime.pom;

import java.awt.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ActiTime.Driver.DriverManager;
import com.ActiTime.Enums.FrameWorkEnums;
import com.ActiTime.Explicit.ExplicitWaits;
import com.ActiTime.ExtentReporter.ExtentNodeCreater;
import com.ActiTime.ExtentReporter.Extentlogger;

public  class BasePom {
	
	
	protected static void enterInput(By by,FrameWorkEnums waitstrategy, String value, String elementname)
	{
		ExplicitWaits.waitTillElementPresent(by, waitstrategy).sendKeys(value);
		Extentlogger.pass(value + " is entered in " + elementname);
	}
	
	protected static void click(By by, FrameWorkEnums waitstrategy, String elementname)
	{
		ExplicitWaits.waitTillElementPresent(by, waitstrategy).click();
		Extentlogger.pass(elementname + " is clicked");
	}
	
	
	public static String getPageTitle()
	{
		return DriverManager.getDriver().getTitle();
	}
	
	public static void pause(int i)
	{
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getText(By by, FrameWorkEnums waitstrategy, String elementname)
	{
		String text = ExplicitWaits.waitTillElementPresent(by, waitstrategy).getText();
		Extentlogger.pass(elementname, true);
		return text;
		
	}
	
	public static void close(By by, FrameWorkEnums waitstrategy, String elementname)
	{
		ExplicitWaits.waitTillElementPresent(by, waitstrategy).click();
		Extentlogger.pass(elementname + " is clicked and closed");
	}
	

}
