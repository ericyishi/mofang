package com.yi.util;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


import com.yi.testcase.LoginTest;

public class ScreenCapture extends TestListenerAdapter{
	 @Override
	  public void onTestFailure(ITestResult tr) {
	  super.onTestFailure(tr);
	  LoginTest b=(LoginTest) tr.getInstance();
	  b.driver.takeScreenShot();
	  }
	
	 @Override
	    public void onTestSuccess(ITestResult tr) {
	        super.onTestSuccess(tr);
	    }
	 
	
	 
	 @Override
	    public void onTestSkipped(ITestResult tr) {
	        super.onTestSkipped(tr);
	    }

	    @Override
	    public void onTestStart(ITestResult result) {
	        super.onTestStart(result);
	    }

	    @Override
	    public void onStart(ITestContext testContext) {
	        super.onStart(testContext);
	    }

}
