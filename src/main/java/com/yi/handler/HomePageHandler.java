package com.yi.handler;

import com.yi.driver.DriverBase;
import com.yi.elements.HomePage;



public class HomePageHandler {
//	public DriverBase driver;
	public HomePage hpage;
	public HomePageHandler(DriverBase driver){
//		this.driver = driver;
		hpage = new HomePage(driver);
	}
	
	/**
	 * 点击登陆按钮
	 * */
	public void clickLogin(){
		hpage.click(hpage.getLoginElement());
	}
	
	/**
	 * 获取'登陆后的用户名'元素的文本信息
	 * */
	public String getComfirmedName(){
		String username = hpage.getText(hpage.getComfirmedNameElement());
		return username;
	}
	
}
