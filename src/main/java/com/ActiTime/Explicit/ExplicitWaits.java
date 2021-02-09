package com.ActiTime.Explicit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ActiTime.Driver.DriverManager;
import com.ActiTime.Enums.FrameWorkEnums;

public final class ExplicitWaits {
	
	
	public static WebElement waitTillElementPresent(By by, FrameWorkEnums waitstrategy)
	{
		if (FrameWorkEnums.elementisclickable==waitstrategy) {
			return new WebDriverWait(DriverManager.getDriver(), 5).until(ExpectedConditions.elementToBeClickable(by));
		}
		else if (FrameWorkEnums.presenceofElement==waitstrategy) {
			return new WebDriverWait(DriverManager.getDriver(), 5).until(ExpectedConditions.presenceOfElementLocated(by));
		}
		else if (FrameWorkEnums.elementisclickable==waitstrategy) {
			return new WebDriverWait(DriverManager.getDriver(), 5).until(ExpectedConditions.elementToBeClickable(by));
		}
		return null;
		
	}

}
