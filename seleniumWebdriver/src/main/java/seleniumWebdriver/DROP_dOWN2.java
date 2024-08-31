package seleniumWebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DROP_dOWN2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver k = new ChromeDriver();
		k.get("http://www.google.com");
	 k.manage().window().maximize();
	 k.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		k.navigate().to(" https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		System.out.println(k.getTitle());
		
WebElement dropdowns=	k.findElement(By.xpath("(//a[normalize-space()='Selenium Popular Posts']"));
		Select sel = new Select(dropdowns);
		sel.selectByIndex(0);
		Thread.sleep(1000);
		sel.selectByIndex(1);
		Thread.sleep(1000);
		
		

	}

}
