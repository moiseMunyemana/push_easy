package sauceAutom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Numerous_users {
	
	public void more_users() throws InterruptedException{
		
		String[] name = {"standard_user","locked_out_user","problem_user","performance_glitch_user" , "error_user","visual_user"};
		
		for(int i=0; i<name.length; i++){
			
			String user = name[i].toString();
			
			
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com");
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(user);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			System.out.println(user + "  has logged in ");
			TimeUnit.SECONDS.sleep(4);
			driver.quit();
		}
	


	
	}
	public static void main(String[] args) throws InterruptedException {
		

		
		Numerous_users l = new  Numerous_users();
		l.more_users();
	}

}
