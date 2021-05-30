package com.ActiTime.pom;

import org.openqa.selenium.By;

import com.ActiTime.Enums.FrameWorkEnums;

public class LicensePomPage extends BasePom {
	
	
	private static By productEdition = By.xpath("(//nobr[.='Product Edition:']/../following-sibling::td)[1]");
	
	private static By LicensedUsers = By.xpath("(//nobr[.='Licensed Users:']/../following-sibling::td)[1]");
	
	private static By IssueDate = By.xpath("(//nobr[.='Issue Date:']/../following-sibling::td)[1]");
	
	private static By logoutLink = By.id("logoutLink");
	
	public LicensePomPage productEdition()
	{
		getText(productEdition, FrameWorkEnums.presenceofElement, "productEdition is ");
		return this;
	}
	

	public LicensePomPage LicensedUsers()
	{
		getText(LicensedUsers, FrameWorkEnums.presenceofElement, "LicensedUsers is ");
		return this;
	}
	
	
	public LicensePomPage IssueDate()
	{
		getText(IssueDate, FrameWorkEnums.presenceofElement, "IssueDate  is ");
		return this;
	}
	
	public void logoutLink()
	{
		click(logoutLink, FrameWorkEnums.presenceofElement, "logoutLink");
		
	}
	
	public LicensePomPage LicensePage()
	{
		productEdition().LicensedUsers().IssueDate().logoutLink();
		return this;
		
	}
	
	
	
}
