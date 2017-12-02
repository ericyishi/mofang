package com.yi.business;

import com.yi.driver.DriverBase;
import com.yi.handler.HomePageHandler;



public class HomePageBiz {
	public HomePageHandler hpdlr;
	public HomePageBiz(DriverBase driver){
		hpdlr =new HomePageHandler(driver);
	}
	/**
	 * 点击登陆按钮
	 * */
	public void clickLoginButton(){
		hpdlr.clickLogin();
	}
	
	
	/**
	 *判断是否登陆成功
	 * */
	public Boolean isLoginSuccess(String username){
		return hpdlr.getComfirmedName().equals(username);
	}
	
}
