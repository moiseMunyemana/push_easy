package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sample.testbase.testbase;

public class Homepage extends testbase {

	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	public WebElement addtocart;

	@FindBy(xpath="//a[@class='shopping_cart_link']")
	public WebElement cart;


	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
	public WebElement remove;

	@FindBy(xpath="//select[@class='product_sort_container']")
	public WebElement filter;


	public  Homepage() {

		PageFactory.initElements(driver, this);
	}


	public void addItemsToCart() {

		addtocart.click();
		cart.click();
	}

	public void removeItemsFromCart() throws InterruptedException {
		addtocart.click();
		Thread.sleep(2000);
		remove.click();

	}

	public void filterSelection(int index) {
		Select select=new Select(filter);
		select.selectByIndex(index);


}
}
