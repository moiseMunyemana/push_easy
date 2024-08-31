package advencedTSTNG;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		 WebElement menu = driver.findElement(By.xpath("//span[@id='blogsmenu']"));
		Actions act = new Actions(driver);
		act.moveToElement(menu).build().perform();//mouse hover the webelement
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Selenium143']")).click();

		
		
	
		
		
		driver.quit();
		
		
		

	}
}
