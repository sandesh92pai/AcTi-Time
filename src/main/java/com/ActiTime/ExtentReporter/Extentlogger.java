package com.ActiTime.ExtentReporter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.ActiTime.Driver.DriverManager;
import com.ActiTime.Enums.FrameWorkEnums;
import com.ActiTime.Utils.ConfigFileReader;
import com.aventstack.extentreports.MediaEntityBuilder;

public class Extentlogger {

	  public static void pass(String Message)
	     {
	    	    	 ExtentNodeCreater.getNoder().pass(Message);
	     }
	  public static void fail(String Message)
	     {
	    	    	 ExtentNodeCreater.getNoder().fail(Message);
	     }
	  public static void skip(String Message)
	     {
	    	    	 ExtentNodeCreater.getNoder().skip(Message);
	     }
	
	
	  public static void pass(String Message, Boolean IsScreenshotneeded)
	     {
	    	 if (ConfigFileReader.getdata(FrameWorkEnums.passedtestcasescreenshot).equalsIgnoreCase("yes") && IsScreenshotneeded){
	    		 ExtentNodeCreater.getNoder().pass(Message, MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenShot()).build());
			}
	     }
	
     
	  public static void fail(String Message, Boolean IsScreenshotneeded)
	     {
	    	 if (ConfigFileReader.getdata(FrameWorkEnums.failedtestcasescreenshot).equalsIgnoreCase("yes") && IsScreenshotneeded){
	    		 ExtentNodeCreater.getNoder().fail(Message, MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenShot()).build());
			}
	     }
	
     
	  public static void skip(String Message, Boolean IsScreenshotneeded)
	     {
	    	 if (ConfigFileReader.getdata(FrameWorkEnums.skippedtestcasescreenshot).equalsIgnoreCase("yes") && IsScreenshotneeded){
	    		 ExtentNodeCreater.getNoder().skip(Message, MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenShot()).build());
			}
	     }
     
     public static String getScreenShot()
     {
    	 return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
     }
	 
     
     

}
