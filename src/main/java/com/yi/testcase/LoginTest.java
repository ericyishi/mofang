package com.yi.testcase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.yi.business.HomePageBiz;
import com.yi.business.LoginPageBiz;
import com.yi.driver.DriverBase;
import com.yi.util.ScreenCapture;

@Listeners({ScreenCapture.class})
public class LoginTest extends CaseBase {
	public DriverBase driver;
	public HomePageBiz homePageBiz;
	public LoginPageBiz loginPageBiz;

	@BeforeClass
	public void beforeClass() {
		this.driver = InitDriver("firefox");
		driver.getUrl("http://www.doyouhike.net/");
		driver.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		homePageBiz = new HomePageBiz(driver);
		loginPageBiz = new LoginPageBiz(driver);
	}

	@Test
	@Parameters({"username","password"})
	public void test(String username,String password) {
		homePageBiz.clickLoginButton();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		loginPageBiz.login(username, password);
		
		if(homePageBiz.isLoginSuccess(username)){
			System.out.println("登录成功");
		}else{
			System.out.println("登录失败");
			driver.takeScreenShot();
		}
	}
	
	@AfterClass
	public void afterClass() {
		driver.stop();
	}

}
