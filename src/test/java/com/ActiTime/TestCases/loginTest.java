package com.ActiTime.TestCases;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ActiTime.Enums.FrameWorkEnums;
import com.ActiTime.ExtentReporter.ExtentManager;
import com.ActiTime.Utils.ConfigFileReader;
import com.ActiTime.pom.login;
import com.ActiTime.pom.HomePage;


public class loginTest extends BaseTestPage{

	
	
	
	@Test
	void login()
	{
		login lg = new login();
		lg.username(ConfigFileReader.getdata(FrameWorkEnums.username)).password(ConfigFileReader.getdata(FrameWorkEnums.password))
		.loginClick().pause(3000);
		  String Title = lg.getPageTitle();
		   
		   Assert.assertEquals(Title, "actiTIME - Enter Time-Track");
	}
	
	
	@Test
	void VerifyActitimeVersion()
	{
		login lg = new login();
		  lg.username(ConfigFileReader.getdata(FrameWorkEnums.username)).password(ConfigFileReader.getdata(FrameWorkEnums.password))
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
}
