package com.yi.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class DriverBase {
	public WebDriver driver;
	public DriverBase(String browser){
		SelectDriver selectDriver =new SelectDriver();
		this.driver = selectDriver.setdriverName(browser);
	}
	/**
	 * 获取driver
	 * */
	public WebDriver getDriver() {
        return driver;
    }

	/**
	 * 封装Element方法
	 * */
	public WebElement findElement(By by){
		WebElement element = driver.findElement(by);
		return element;
	}
	
	
	/**
	 * 关闭浏览器
	 * */
	public void stop(){
		System.out.println("关闭浏览器");
		driver.close();
	}
	
	/**
	 * 跳转到url相应的页面
	 * */
	public void getUrl(String urlAddr){
		driver.get(urlAddr);
	}
	
	/**
	 * 模拟鼠标移动动作
	 * */
	public void moveAction(WebElement element){
		Actions action =new Actions(driver);
    	action.moveToElement(element).perform();
	}
}
