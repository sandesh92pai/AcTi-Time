package com.ActiTime.pom;

import org.openqa.selenium.By;

import com.ActiTime.Enums.FrameWorkEnums;

public class HomePage extends BasePom{


	private final static By helplnk = By.xpath("//div[@onclick = 'openHelpAndSupportMenu(event)']");
	private final static By abtActiTimeBtn = By.xpath("//a[.='About your actiTIME']");
	private final static By actiTimeVersion = By.xpath("(//tr[@class='productVersionInfo']//td)[2]/span");
	private final static By buildversion = By.xpath("((//tr[@class='productVersionInfo']//td)[2]/span)[2]");
	private final static By systemInfoBtn = By.xpath("//span[.='SYSTEM INFO']");
	private final static By javaversion = By.xpath("//td[@class ='infoTitle' and contains(.,'Java:')]/following-sibling::td");
    private final static By closebtn = By.xpath("//div[@id='aboutPopupCloseButtonId']");
    private final static By logout = By.xpath("//a[.='Logout']");

	public HomePage helpbtn()
	{
		click(helplnk, FrameWorkEnums.elementisclickable, "helpButton");
		return this;
	}

	public HomePage abtActiTime()
	{
		click(abtActiTimeBtn, FrameWorkEnums.elementisclickable, "helpButton");
		return this;
	}

	public String extractactiVersion()
	{
		return getText(actiTimeVersion, FrameWorkEnums.presenceofElement, "actiVersion captured");
		
	}
	
	public String extractbuildversion()
	{
		return getText(buildversion, FrameWorkEnums.presenceofElement, "buildversion captured");
		
	}
	
	public HomePage systeminfo()
	{
		click(systemInfoBtn, FrameWorkEnums.elementisclickable, "system info");
		return this;
	}
	
	public String extractjavaversion()
	{
		return getText(javaversion, FrameWorkEnums.elementisclickable, "javaversion captured");
	}
	
	public HomePage closeBox()
	{
		click(closebtn, FrameWorkEnums.elementisclickable, "close button");
		return this;
	} 
	
	public void logoutBtn()
	{
		click(logout, FrameWorkEnums.elementisclickable, "logout button");
		
	} 
	
}
