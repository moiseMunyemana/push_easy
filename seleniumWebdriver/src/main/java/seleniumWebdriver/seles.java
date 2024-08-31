package seleniumWebdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.*;
import java.util.concurrent.TimeUnit;
public class seles {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("sdfghj");
		ChromeDriver d = new ChromeDriver();
		
		TimeUnit.SECONDS.sleep(7);
		
		d.manage().window().maximize();
		d.get("https://www.saucedemo.com");
		
		TimeUnit.SECONDS.sleep(9);
		
		d.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		d.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		TimeUnit.SECONDS.sleep(9);
		d.findElement(By.cssSelector("#login-button")).click();
		TimeUnit.SECONDS.sleep(9);
		
	
		//driver.close();
		d.quit();
		//d.quit();
		 
		/*
		 * WebDriver f = new FirefoxDriver(); TimeUnit.SECONDS.sleep(7); f.quit();
		 
		WebDriver driver= new ChromeDriver();

		WebDriver driver1=new FirefoxDriver();

		WebDriver driver2= new EdgeDriver();

		WebDriver driver3 = new SafariDriver();
		 */
		
		WebDriver c = new ChromeDriver();
		c.get("https://demo.opencart.com/");
		
		
		String g = c.getTitle();
		
  if ( g.equals("Your Store")) {
	  System.out.println("passed");
  }
  else {
	  System.out.println("failed");
  }
  TimeUnit.SECONDS.sleep(9);
  
  //c.close();
  
  c.quit();
  
	}

}
