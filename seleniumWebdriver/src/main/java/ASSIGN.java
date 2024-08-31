import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ASSIGN {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 
		 driver.get("http://www.google.com");
		 System.out.println(driver.getTitle());
		 Thread.sleep(3);
		 
		 driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium tutorials" , Keys.ENTER);
		 Thread.sleep(8);
		 driver.quit();
	}

}