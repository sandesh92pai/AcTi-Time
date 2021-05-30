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


public class loginTest extends BaseTestPage{



	@FrameWorkAnnotation(author = { "sandesh" }, category = { CategoryType.REGRESSION, CategoryType.SMOKE })
	@Test()
	void login(Map<String, String>map)
	{
		login lg = new login();
		lg.username(map.get("username")).password(map.get("loginpassword"))
		.loginClick().pause(3000);
          lg.Verify();
	}
	
	

	@FrameWorkAnnotation(author = { "sandesh" }, category = { CategoryType.SMOKE })
	@Test()
	void VerifyActitimeVersion(Map<String,String>map)
	{
		login lg = new login();
		lg.username(map.get("username")).password(map.get("loginpassword"))
		.loginClick().pause(3000);
		HomePage hp = new HomePage();
		String actitimeVersion = hp.helpbtn().abtActiTime().extractactiVersion();
		Reporter.log("actiTime version is " + actitimeVersion);
		String bulidVersion = hp.extractbuildversion();
		Reporter.log("build version is " + bulidVersion);

		SoftAssert assert1 = new SoftAssert();
		assert1.assertEquals(actitimeVersion, ConfigFileReader.getdata(FrameWorkEnums.actiTimeVersion), "actitime-version");
		assert1.assertEquals(bulidVersion, ConfigFileReader.getdata(FrameWorkEnums.bulidVersion), "Bulid-version");

		String javaVersion = hp.systeminfo().extractjavaversion();
		Reporter.log("java version is " + javaVersion);
		assert1.assertEquals(javaVersion, ConfigFileReader.getdata(FrameWorkEnums.javaVersion), "java-version");
	}

	@FrameWorkAnnotation(author = { "sandesh" }, category = { CategoryType.REGRESSION, CategoryType.SMOKE })
	@Test(enabled = false)
	void  CreateUser(Map<String, String>map)
	{
		login lg = new login();
		lg.username(ConfigFileReader.getdata(FrameWorkEnums.username)).password(ConfigFileReader.getdata(FrameWorkEnums.password))
		.loginClick().pause(3000);

		UserListPage ulp = new UserListPage();
		ulp.userList().adduser().pause(3000);
		ulp.enterFirstname(map.get("firstname")).entermiddlename(map.get("middlename")).enterlastname(map.get("lastname"))
		.enteremail(map.get("email")).username(map.get("createusername"))
		.password(map.get("password")).retrypassword(map.get("retrypassword")).clickTimeZone().pause(3000);
		ulp.selectOfficeZone().clickCreateUSer();
		
	
	 
		
			}
			
			
			
			
		}
		
		
		
		
		
	
		
		
		
		
		
	
		
		
	
	
		
	
	










