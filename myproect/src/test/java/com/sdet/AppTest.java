package com.sdet;

import org.testng.Assert;
import org.testng.annotations.Test;

import myproect.App;


public class AppTest {
	
	
	@Test
	public void TestLogin1() {
		App k = new App();
		Assert.assertEquals(0,k.UserLogin("abc","123bcd") );	
	}
	
	
	@Test
	public void TestLogin2() {
		App k = new App();
		Assert.assertEquals(1,k.UserLogin("abc","123cd") );	
	}

}
