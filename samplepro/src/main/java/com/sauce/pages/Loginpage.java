package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sample.testbase.testbase;

public class Loginpage extends testbase {

	
	@FindBy(xpath="//input[@id='user-name']")
	public WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	public WebElement login;
	

	
	public Loginpage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void login(String uname,String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		login.click();
	
}
}