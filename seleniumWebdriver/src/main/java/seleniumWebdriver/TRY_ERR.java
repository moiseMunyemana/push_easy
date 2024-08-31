package seleniumWebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TRY_ERR {
	
	
	public void catch_err() throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(555));
		try {
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.xpath("//*[@id=\'user-name\']")).sendKeys("locked_out_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(3);
		
		
		}
		
			catch(Exception e ) {
				String  error = driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]")).getText();
				System.out.println("error" + error );
				
			}
		
		Thread.sleep(3);
		driver.close();
		}
		
	

	public static void main(String[] args) throws InterruptedException {
	

		
		TRY_ERR u = new TRY_ERR();
		
		u.catch_err();
		
	}

}
