package com.ActiTime.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ActiTime.Driver.DriverManager;
import com.ActiTime.Enums.CategoryType;
import com.ActiTime.Enums.FrameWorkEnums;
import com.ActiTime.Utils.ConfigFileReader;
import com.ActiTime.annotation.FrameWorkAnnotation;
import com.ActiTime.pom.HomePage;
import com.ActiTime.pom.ReportersTab;
import com.ActiTime.pom.login;

public class CreateChart extends BaseTestPage{
	
	@FrameWorkAnnotation(author = { "sandesh" }, category = { CategoryType.REGRESSION, CategoryType.SMOKE })
	@Test
	public void CreateNewChart()
	{
		login lg = new login();
		lg.username(ConfigFileReader.getdata(FrameWorkEnums.username)).password(ConfigFileReader.getdata(FrameWorkEnums.password))
		.loginClick().pause(3000);
		
		ReportersTab rp = new ReportersTab();
		
		rp.clickonreportTab().clickoncreateChart().clickonaddtodashboard().enterChartname("qspider report").clickonsaveButton()
		.clickoncloseButton();
		
		HomePage hp = new HomePage();
		hp.logoutBtn();
		
		String loginPageTitleAfterLogout = "actiTIME - Login"; 
		Assert.assertEquals(hp.getPageTitle(), loginPageTitleAfterLogout, "Both are equal as expected");
		
		 
	}

}
