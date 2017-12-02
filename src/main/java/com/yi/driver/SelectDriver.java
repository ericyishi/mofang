package com.yi.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectDriver {
	
	
	public WebDriver setdriverName(String browser){
		if(browser.equalsIgnoreCase("fireFox")){
			System.setProperty("webdriver.firefox.bin","D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			return new FirefoxDriver();
		}else{
			System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
			return new ChromeDriver();
		}
	}

	
}
