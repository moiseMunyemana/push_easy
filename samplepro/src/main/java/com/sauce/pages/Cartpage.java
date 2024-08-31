package com.sauce.pages;

import org.openqa.selenium.support.PageFactory;

import com.sample.testbase.testbase;

public class Cartpage extends testbase {

	
	public Cartpage()  {

		PageFactory.initElements(driver, this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
