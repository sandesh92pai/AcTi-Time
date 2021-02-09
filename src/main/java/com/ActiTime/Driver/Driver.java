package com.ActiTime.Driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ActiTime.Enums.FrameWorkEnums;
import com.ActiTime.Utils.ConfigFileReader;

public class Driver {
	
	
	
	public static void initDriver()
	{
		if (Objects.isNull(DriverManager.getDriver())) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			DriverManager.setDriver(driver);
			DriverManager.getDriver().get(ConfigFileReader.getdata(FrameWorkEnums.url));
		}
	}
	
	
	public static void quitDriver()
	{
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}

}
