package com.sauce.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sample.testbase.testbase;
import com.sauce.pages.Homepage;
import com.sauce.pages.Loginpage;
import com.sauce.util.TestUtil;

public class HomeTest extends testbase {

	
	@BeforeMethod
	public void init() throws IOException, InterruptedException {
		initialization();
	}

	@Test
	public void addtocart() throws IOException {
		Loginpage log= new Loginpage();
		log.login("standard_user", "secret_sauce");

		Homepage home=new Homepage();
		home.addItemsToCart();
		TestUtil.Screenshot();
	}

	@Test
	public void removeFromCart() throws InterruptedException, IOException {
		Loginpage log= new Loginpage();
		log.login("standard_user", "secret_sauce");

		Homepage home=new Homepage();
		home.removeItemsFromCart();
		TestUtil.Screenshot();



	}

	@Test
	public void filter() throws IOException {
		Loginpage log= new Loginpage();
		log.login("standard_user", "secret_sauce");
		Homepage home=new Homepage();
		home.filterSelection(1);

		TestUtil.Screenshot();


	}



	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
}
}