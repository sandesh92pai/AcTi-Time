package com.ActiTime.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ActiTime.Driver.Driver;

public class BaseTestPage {
	
	
	
	
	@BeforeMethod
	public void SetUp()
	{
		Driver.initDriver();
	}

	
	@AfterMethod
	public void teardown()
	{
//new change
		Driver.quitDriver();
	}
	
	
	
	
}
