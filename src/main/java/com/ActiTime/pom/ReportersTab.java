package com.ActiTime.pom;

import org.openqa.selenium.By;

import com.ActiTime.Enums.FrameWorkEnums;
import com.ActiTime.Explicit.ExplicitWaits;

public class ReportersTab extends BasePom{
 
	
	
	
	private static By reportMajorTab = By.xpath("//div[.='REPORTS']");
	private static By createChart = By.xpath("//span[.='Create Chart']");
	private static By addtodashboard = By.xpath("//div[.='Add to Dashboard']");
	private static By entername = By.xpath("(//input[@type='text' and @placeholder = 'Enter Chart Name'])[1]");
	private static By saveButton = By.xpath("//span[.='Save']");
	private static By close = By.id("closeCreateChartLightboxButton");
	
	
	public ReportersTab clickonreportTab()
	{
		click(reportMajorTab, FrameWorkEnums.elementisclickable, "report tab clicked");
		return this;
	}    


	public ReportersTab clickoncreateChart()
	{
		click(createChart, FrameWorkEnums.elementisclickable, "createChart is clicked");
		ExplicitWaits.waitTillElementPresent(addtodashboard, FrameWorkEnums.visiblityofelement);
		return this;
	}    

	public ReportersTab clickonaddtodashboard()
	{
		click(addtodashboard, FrameWorkEnums.elementisclickable, "addtodashboard is clicked");
		return this;
	}   
	
	public ReportersTab  enterChartname(String value)
	{
		enterInput(entername, FrameWorkEnums.presenceofElement, value, "chart name field", true);
		return this;
	}

	
	public ReportersTab clickonsaveButton()
	{
		click(saveButton, FrameWorkEnums.elementisclickable, "saveButton is clicked");
		return this;
	}  
	
	public ReportersTab clickoncloseButton()
	{
		click(close, FrameWorkEnums.elementisclickable, "close button is clicked");
		return this;
	}  
	
	
	
	
	
}
