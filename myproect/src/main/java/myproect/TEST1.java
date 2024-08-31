package myproect;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TEST1 {
	
	WebDriver driver ;
	
	@Test(priority=1)
	void openApp() {
		System.out.println("openning application");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("http://www.google.com");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
		@Test(priority=2)
		void logo() throws InterruptedException {
			Thread.sleep(2000);
			boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
			System.out.println("logged in susccesfully " + status);
			Thread.sleep(40);
		
		}		
	
		
	@Test(priority=3)
	void login() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.getTitle());
		System.out.println("login in application");
		Thread.sleep(50);
		driver.quit();
	}

@Test(priority=4)
	void RUN() {
		System.out.println("system runs");
	}

}
