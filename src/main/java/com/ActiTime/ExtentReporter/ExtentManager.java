package com.ActiTime.ExtentReporter;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	
	
	private static ExtentReports extent;
	public static void initExtent()
	{
		if (Objects.isNull(extent)) {
			extent = new  ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
			extent.attachReporter(spark);
			spark.config().setDocumentTitle("AcTiTime Report");
			spark.config().setTheme(Theme.STANDARD);
		}
		
	}
	
	public static void CreateNode(String TestName)
	{
		ExtentTest test = extent.createTest(TestName);
		ExtentNodeCreater.SetNoder(test);
		ExtentNodeCreater.getNoder();
	}
	
	
	
	public static void flushExtentReport()
	{
		if (Objects.nonNull(extent)) {
			extent.flush();
		}
		
		try {
			Desktop.getDesktop().browse(new File("index.html").toURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	
	
	
	
}
