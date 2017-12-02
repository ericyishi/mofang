package com.yi.testcase;

import com.yi.driver.DriverBase;

public class CaseBase {
   
	public DriverBase InitDriver(String browser) {
		return new DriverBase(browser);
	}
}
