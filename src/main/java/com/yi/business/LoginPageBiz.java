package com.yi.business;

import com.yi.driver.DriverBase;
import com.yi.handler.LoginPageHandler;


public class LoginPageBiz {
		public LoginPageHandler lpdlr;
		public LoginPageBiz(DriverBase driver){
			lpdlr =new LoginPageHandler(driver);
		}	
		
		public void login(String username,String password){
			if(lpdlr.assertLoginPage()){
				lpdlr.sendKeysToUsername(username);
				lpdlr.sendKeysToPassword(password);
				lpdlr.clickLoginNowBtn();
			}else{
				System.out.println("请检查是否进入登录页面");
			}
			
		}
}
