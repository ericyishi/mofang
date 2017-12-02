package com.yi.elements;

import org.openqa.selenium.WebElement;



import com.yi.driver.DriverBase;
import com.yi.util.getByLocator;
public class HomePage extends BasePage{
	public HomePage(DriverBase driver){
		super(driver);
	}
	
	
	/**
	 * 获取'登陆'元素
	 * */
	public WebElement getLoginElement(){
		return element(getByLocator.getLocator("loginBtn"));
	}
	
	/**
	 * 获取'登陆后的用户名'元素
	 * */
	public WebElement getComfirmedNameElement(){
		moveAction(element(getByLocator.getLocator("comfirmedName")));
		return element(getByLocator.getLocator("comfirmedName"));
	}
}
