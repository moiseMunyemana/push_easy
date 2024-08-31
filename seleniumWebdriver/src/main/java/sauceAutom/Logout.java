package sauceAutom;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {
	
	
		public void logout() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));//maximum timeout 
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com");
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();

			driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
			TimeUnit.SECONDS.sleep(4);
			driver.quit();
		}

	public static void main(String[] args) {
	

	}

}
