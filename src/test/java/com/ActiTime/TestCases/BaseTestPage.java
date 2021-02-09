package com.ActiTime.TestCases;

import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.ActiTime.Driver.Driver;
import com.ActiTime.ExtentReporter.ExtentManager;

public class BaseTestPage {
	
	
	
	
	@BeforeMethod
	public void SetUp()
	{
		Driver.initDriver();
	}

	
	@AfterMethod
	public void teardown()
	{
		Driver.quitDriver();
	}
	
	
	
	
}
