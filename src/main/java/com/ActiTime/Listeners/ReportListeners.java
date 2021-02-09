package com.ActiTime.Listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ActiTime.Driver.Driver;
import com.ActiTime.ExtentReporter.ExtentManager;
import com.ActiTime.ExtentReporter.ExtentNodeCreater;
import com.ActiTime.ExtentReporter.Extentlogger;

public class ReportListeners implements ISuiteListener, ITestListener{

	public void onTestStart(ITestResult result) {
		ExtentManager.CreateNode(result.getMethod().getMethodName());
	}
	
	

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		Extentlogger.pass(result.getMethod().getMethodName() + " is passed", true);
	}

	public void onTestFailure(ITestResult result) {
		Extentlogger.fail(result.getMethod().getMethodName() + " is failed", true);
	}

	public void onTestSkipped(ITestResult result) {
		Extentlogger.skip(result.getMethod().getMethodName() + " is skipped", true);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}

	public void onStart(ISuite suite) {
		ExtentManager.initExtent();
	}

	public void onFinish(ISuite suite) {
		ExtentManager.flushExtentReport();
	}

}
