package seleniumWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sauce {

	
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       
       driver.get("http://www.google.com");
       TimeUnit.SECONDS.sleep(3);
       
       System.out.println("I have finally automate this web named: "+ driver.getTitle());
       System.out.println("I have finally automate this web named: "+ driver.getCurrentUrl());
       driver.navigate().to("https://www.saucedemo.com ");
       TimeUnit.SECONDS.sleep(3);
       
       driver.findElement(By.xpath("  //*[@id=\'user-name\'] ")).sendKeys("standard_user");
       driver.findElement(By.xpath("//*[@id=\'password\']" )).sendKeys("secret_sauce");
       driver.findElement(By.xpath(" //*[@id=\"login-button\"]")).click();
       TimeUnit.SECONDS.sleep(3);
       
       System.out.println("I have finally automate this web named: "+ driver.getTitle());
       System.out.println("I have finally automate this web named: "+ driver.getCurrentUrl());
       driver.navigate().back();
       
       TimeUnit.SECONDS.sleep(5);
       driver.close();
      
  
       
       
   	ChromeDriver d = new ChromeDriver();
    d.manage().window().maximize();
    
    d.get("https://www.saucedemo.com");
    //TimeUnit.SECONDS.sleep(3);
    d.findElement(By.name("user-name")).sendKeys("standard_user");
    d.findElement(By.name("password")).sendKeys("secret_sauce");
    d.findElement(By.name("login-button")).click();
    TimeUnit.SECONDS.sleep(5);
       
    
    d.close();
       
       
    
    TimeUnit.SECONDS.sleep(5);
    
   	ChromeDriver k = new ChromeDriver();
    k.manage().window().maximize();
    
    k.get("https://www.saucedemo.com");
    //TimeUnit.SECONDS.sleep(3);
    k.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
    k.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
    k.findElement(By.cssSelector("#login-button")).click();
    
    k.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']")).click();
    TimeUnit.SECONDS.sleep(3);
    k.findElement(By.xpath("//*[@id='shopping_cart_container']/a")).click();
    TimeUnit.SECONDS.sleep(3);
    k.findElement(By.xpath("//*[@id='remove-sauce-labs-backpack']")).click();
    TimeUnit.SECONDS.sleep(5);
       
    
    k.close();
       
    
    System.out.println("test passed");
	}

}
