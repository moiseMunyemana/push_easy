package writting_testcase_sele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.trustpilot.com/review/janbasktraining.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,7000)");//top to bottom
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		  js.executeScript("window.scrollBy(0,100)"); Thread.sleep(3000);
		 js.executeScript("window.scrollBy(100,1000)"); Thread.sleep(3000);
		 js.executeScript("window.scrollBy(1000,2000)"); Thread.sleep(3000);


		js.executeScript("window.scrollTo(2000,500)");//bottom to top


		Thread.sleep(3000);
		
		driver.close();
		
	}

}
