package com.sauce.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sample.testbase.testbase;
import com.sauce.pages.Loginpage;
import com.sauce.util.TestUtil;

public class LoginTest  extends testbase{

	
	@BeforeMethod
	public void init() throws IOException, InterruptedException {
		initialization();
	}
	
	
	@Test
	public void validLogin() throws IOException {
		
		
		Loginpage log= new Loginpage();
		log.login("standard_user", "secret_sauce");
		TestUtil.Screenshot();
		
	
	}
	
	@Test
	public void invalidLogin() throws IOException {
		
		
		Loginpage log= new Loginpage();
		log.login("username1", "secret_sauce");
		TestUtil.Screenshot();
		
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
}
}