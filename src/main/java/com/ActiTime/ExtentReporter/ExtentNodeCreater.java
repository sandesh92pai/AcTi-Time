package com.ActiTime.ExtentReporter;

import com.aventstack.extentreports.ExtentTest;

public class ExtentNodeCreater {
	
	
	
	private static ThreadLocal<ExtentTest> extenttest = new ThreadLocal<ExtentTest>();

	public static ExtentTest getNoder()  {
		return extenttest.get();
	}

	public static void SetNoder(ExtentTest test) {
		extenttest.set(test);
	}
	
	public static void unload() 
	{
		extenttest.remove();
	}

}
