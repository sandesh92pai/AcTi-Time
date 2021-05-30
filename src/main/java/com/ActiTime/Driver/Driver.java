package com.ActiTime.Driver;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
			//new WebDriverWait(DriverManager.getDriver(), 30)
			//.until(ExpectedConditions.urlContains("https://roche.authapp.appdevus.platform.navify.com/login?authreq=gyyvp93lzg708jks&authctx=eyJyZXR1cm5UbyI6Imh0dHBzOi8vcmRwc2l0dDUudXMuc2l0LnVwYXRoLm5hdmlmeS5jb20vbG9naW4ifQ%253D%253D"));
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
