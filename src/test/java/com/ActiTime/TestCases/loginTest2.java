package com.ActiTime.TestCases;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ActiTime.Driver.DriverManager;
import com.ActiTime.Enums.CategoryType;
import com.ActiTime.Enums.FrameWorkEnums;
import com.ActiTime.Explicit.ExplicitWaits;
import com.ActiTime.Utils.CalenderUtils;
import com.ActiTime.Utils.ConfigFileReader;
import com.ActiTime.Utils.excelUtils;
import com.ActiTime.annotation.FrameWorkAnnotation;
import com.ActiTime.dataprovider.ActitimeDataProvider;
import com.ActiTime.pom.BasePom;
import com.ActiTime.pom.HomePage;
import com.ActiTime.pom.UserListPage;
import com.ActiTime.pom.login;


public class loginTest2 extends BaseTestPage{



	@Test()
	void login()
	{
		login lg = new login();
		lg.username("admin").password("manager")
		.loginClick().pause(3000);
          lg.Verify();
	}
	
	
	@Test()
	void loginCase2()
	{
		login lg = new login();
		lg.username("admin").password("manager")
		.loginClick().pause(3000);
          lg.Verify();
	}
	
	
}