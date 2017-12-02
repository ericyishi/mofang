package com.yi.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.yi.driver.DriverBase;

public class BasePage {
	public DriverBase driver;
	public BasePage(DriverBase driver){
		this.driver = driver;
	}
	
	/**
	 * 定位Element
	 * @param By by
	 * */
	public WebElement element(By by){
		WebElement element = driver.findElement(by);
		return element;
	}
	
	
	/**
	 * 封装点击
	 * */
	public void click(WebElement element){
		if(element !=null){
			element.click();
		}else{
			System.out.println("元素没有定位到，点击失败。");
		}
	}
	
	/**
	 * 判断元素是否显示
	 * */
	public boolean assertElementIs(WebElement element){
		return element.isDisplayed();
	}
	
	/**
	 * 获取文本信息
	 * */
	public String getText(WebElement element){
		return element.getText();
	}
		
	/**
	 * 封装输入
	 * */
	public void sendkeys(WebElement element,String value){
		if(element !=null){
			element.sendKeys(value);
		}else{
			System.out.println(element+"元素没有定位到，输入失败"+value);
		}
	}
	
	
	/**
     * 模拟鼠标移动事件
     * */
    public void moveAction(WebElement element){
    	driver.moveAction(element);
    }
}
