package sauceAutom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_login {
	
	public void verify_login() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		try {
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		TimeUnit.SECONDS.sleep(4);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce1");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='title']"));
		System.out.println("Login Test Passed");
		}

		catch(Exception e) {
			String error=driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]")).getText();
			System.out.println(error);
			System.out.println("Login Test Failed");
			//*[@id="login_button_container"]/div/form/div[3]/h3
		}
		TimeUnit.SECONDS.sleep(4);
		driver.quit();

	}

	public static void main(String[] args) throws InterruptedException {
		
		Verify_login k = new Verify_login();
		k.verify_login();
	

	}

}
