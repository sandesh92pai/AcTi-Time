package com.ActiTime.pom;

import org.openqa.selenium.By;

import com.ActiTime.Enums.FrameWorkEnums;

public final class login extends BasePom{
	
	
	
	
private static By usernameTxtBox = By.id("username");
private static By passwordTxtBox = By.xpath("//input[@name='pwd' and @placeholder = 'Password']");
private static By loginBtn = By.xpath("//div[.='Login ']");

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


	


}
