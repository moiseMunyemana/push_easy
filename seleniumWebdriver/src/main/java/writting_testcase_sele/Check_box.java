package writting_testcase_sele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_box {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("http://www.google.com");
		Thread.sleep(10);
		driver.navigate().to("https://demoqa.com/checkbox");
	    //driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]/svg/path")).click();
		driver.findElement(By.xpath("//span[@class='rct-checkbox']//*[name()='svg']")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	    Thread.sleep(1000);
	    driver.close();

	}

}
