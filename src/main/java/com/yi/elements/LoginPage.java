package com.yi.elements;

import org.openqa.selenium.WebElement;

import com.yi.driver.DriverBase;
import com.yi.util.getByLocator;

public class LoginPage extends BasePage{

	public LoginPage(DriverBase driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 获取'用户名'输入框元素
	 * */
	public WebElement getUserElement(){
		return element(getByLocator.getLocator("username"));
	}
	
	/**
	 * 获取'密码'输入框元素
	 * */
	public WebElement getPasswordElement(){
		return element(getByLocator.getLocator("password"));
	}
	
	
	/**
	 * 获取'立即登录'按钮元素
	 * */
	public WebElement getLoginNowElement(){
		return element(getByLocator.getLocator("loginNowBtn"));
	}
	
	
	

}
