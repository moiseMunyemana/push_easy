package advencedTSTNG;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Error {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        
		driver .get("http://www.google.com");
		System.out.println( driver.getTitle());
		driver.navigate().to("https://tutorialsninja.com/demo/");
		System.out.println(driver.getTitle());
		WebElement myaccount = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
		myaccount.click();
		// act = new Actions(driver);
		//act.moveToElement(myaccount).build().perform();//mouse hover the webelement
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
		login.click();
		//driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		
		WebElement submt= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		submt.click();
		
		Alert al =driver.switchTo().alert();
		String error_msg=al.getText();
		al.dismiss();
		System.out.println(error_msg);
		
		Thread.sleep(1000);
		
		driver.close();
		
	}

}
