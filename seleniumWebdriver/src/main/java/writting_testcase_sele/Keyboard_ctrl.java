package writting_testcase_sele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_ctrl {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(2000);
		driver.findElement(By.id("userName")).sendKeys("mniuyt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("munyema@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("3456 str ne");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys(Keys.chord(Keys.CONTROL,"c"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		Thread.sleep(2000);
		
		driver.close();

	}

}
