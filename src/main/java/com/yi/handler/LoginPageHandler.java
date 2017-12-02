package com.yi.handler;

import org.openqa.selenium.WebElement;

import com.yi.driver.DriverBase;
import com.yi.elements.LoginPage;

public class LoginPageHandler {

	public DriverBase driver;
	public LoginPage lpage;

	public LoginPageHandler(DriverBase driver) {
		this.driver = driver;
		lpage = new LoginPage(driver);
	}

	/**
	 * 用户名输入信息
	 * */
	public void sendKeysToUsername(String username) {
		lpage.sendkeys(lpage.getUserElement(), username);
	}

	/**
	 * 密码输入信息
	 * */
	public void sendKeysToPassword(String password) {
		lpage.sendkeys(lpage.getPasswordElement(), password);
	}

	/**
	 * 点击登录按钮
	 * */
     public void clickLoginNowBtn(){
    	 lpage.getLoginNowElement().click();
     }
     
     
     /**
 	 * 判断是否是登陆页面
 	 * */
 	public boolean assertLoginPage(){
 		return lpage.assertElementIs(lpage.getUserElement());
 	}
}
