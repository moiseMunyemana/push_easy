package writting_testcase_sele;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import seleniumWebdriver.Alerts;

public class Mouse_hover {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		
		driver.get("https://www.globalsqa.com/demo-site");
		Thread.sleep(2000);
		 WebElement menu = driver.findElement(By.xpath("//a[@class='no_border'][normalize-space()='Free Ebooks']"));
		Actions act = new Actions(driver);
		act.moveToElement(menu).build().perform();//mouse hover the webelement
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Free Deep Learning eBooks']")).click();
		
		Alert al = driver.switchTo().alert();
		al.dismiss();
		
		
		Thread.sleep(6000);
		driver.close();
		
		
		

	}

}
