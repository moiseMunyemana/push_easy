package writting_testcase_sele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_button {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));


		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[normalize-space()='Impressive']")).click();



	}

}
