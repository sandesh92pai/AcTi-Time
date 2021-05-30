package com.ActiTime.pom;

import java.awt.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ActiTime.Driver.DriverManager;
import com.ActiTime.Enums.FrameWorkEnums;
import com.ActiTime.Explicit.ExplicitWaits;
import com.ActiTime.ExtentReporter.ExtentManager;
import com.ActiTime.ExtentReporter.ExtentNodeCreater;
import com.ActiTime.ExtentReporter.Extentlogger;
import com.ActiTime.Utils.excelUtils;
import com.aventstack.extentreports.MediaEntityBuilder;

public  class BasePom {
	
	
	protected static void enterInput(By by,FrameWorkEnums waitstrategy, String value, String elementname)
	{
		ExplicitWaits.waitTillElementPresent(by, waitstrategy).sendKeys(value);
		Extentlogger.pass(value + " is entered in " + elementname);
	}
	
	protected static void enterInput(By by,FrameWorkEnums waitstrategy, String value, String elementname, Boolean ISScreenShotneeded)
	{
		ExplicitWaits.waitTillElementPresent(by, waitstrategy).sendKeys(value);
		Extentlogger.pass(value + " is entered in " + elementname , ISScreenShotneeded);
	}
	
	
	protected static void click(By by, FrameWorkEnums waitstrategy, String elementname)
	{
		try {
			ExplicitWaits.waitTillElementPresent(by, waitstrategy).click();
			Extentlogger.pass(elementname + " is clicked");
			
		} catch (Exception e) {
			
				 JavascriptExecutor jsp = (JavascriptExecutor) DriverManager.getDriver();
					jsp.executeScript("arguments[0].click()", ExplicitWaits.waitTillElementPresent(by, waitstrategy));
					Extentlogger.pass(elementname + " is clicked through javascriptexeutor");
		}
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
	
	protected static void getText(By by, FrameWorkEnums waitstrategy, String elementname)
	{
		String text = ExplicitWaits.waitTillElementPresent(by, waitstrategy).getText();
		Extentlogger.pass(elementname + " is captured" +  true);
		ExtentNodeCreater.getNoder().info(elementname + text);
	}
	
	
	protected static String getTextfromElement(By by, FrameWorkEnums waitstrategy, String elementname)
	{
		String text = ExplicitWaits.waitTillElementPresent(by, waitstrategy).getText();
		Extentlogger.pass(elementname + " is captured" +  true);
		ExtentNodeCreater.getNoder().info(elementname + text);
		return text;
		
	}
	
	protected static void close(By by, FrameWorkEnums waitstrategy, String elementname)
	{
		ExplicitWaits.waitTillElementPresent(by, waitstrategy).click();
		Extentlogger.pass(elementname + " is clicked and closed");
	}
	
	protected static void scrollTo(By by,FrameWorkEnums waitstrategy, String eleemntname)
	{
		JavascriptExecutor jsp = (JavascriptExecutor) DriverManager.getDriver();
		jsp.executeScript("arguments[0].scrollIntoView(true)", ExplicitWaits.waitTillElementPresent(by, waitstrategy));
	}
	
	
	public  static void JavascriptClick(By by, FrameWorkEnums waitstrategy, String elementname)
	{
		JavascriptExecutor jsp = (JavascriptExecutor) DriverManager.getDriver();
		jsp.executeScript("arguments[0].click()", ExplicitWaits.waitTillElementPresent(by, waitstrategy));
	}

}
