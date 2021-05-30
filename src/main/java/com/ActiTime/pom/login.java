package com.ActiTime.pom;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import com.ActiTime.Enums.FrameWorkEnums;
import com.ActiTime.ExtentReporter.ExtentManager;
import com.ActiTime.ExtentReporter.ExtentNodeCreater;
import com.ActiTime.ExtentReporter.Extentlogger;

public final class login extends BasePom{
	
	
	
	
private static By usernameTxtBox = By.id("username");
private static By passwordTxtBox = By.xpath("//input[@name='pwd' and @placeholder = 'Password']");
private static By loginBtn = By.xpath("//div[.='Login ']");
private static By settingbtn = By.xpath("//div[contains(@title,'Warning!')]/../following-sibling::div");
private static By licenseBtn = By.xpath("//a[.='Licenses']");

public login username(String value)
{
	enterInput(usernameTxtBox, FrameWorkEnums.presenceofElement, value, "usernameTextbox");
	return this;
}

public login password(String value)
{
	enterInput(passwordTxtBox, FrameWorkEnums.presenceofElement, value, "passwordTextBox");
	return this;
}


public HomePage loginClick()
{
	click(loginBtn, FrameWorkEnums.elementisclickable, "loginButton");
	return new HomePage();
}

public login settingBtnclick()
{
	click(settingbtn, FrameWorkEnums.elementisclickable, "setting button");
	return this;
}

public LicensePomPage licenseBtnBtnclick()
{
	click(licenseBtn, FrameWorkEnums.elementisclickable, "license button");
	return new LicensePomPage();
}
	
public void Verify()
{
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(getPageTitle(), getPageTitle(),"page is verified");
	ExtentNodeCreater.getNoder().info("PageTitle verified");
	sa.assertAll();
}

}
