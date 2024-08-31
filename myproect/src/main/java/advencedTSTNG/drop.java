package advencedTSTNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver h = new ChromeDriver();
		h.manage().window().maximize();
		h.manage().timeouts().implicitlyWait(Duration.ofSeconds(66));
	    h.get("htpp://www.google.com");
        h.navigate().to("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        
        WebElement dropDowns = h.findElement(By.xpath("//*[@id=\'course\']"));
        
        Select sel= new Select(dropDowns);
		sel.selectByIndex(1);
		Thread.sleep(1000);
		sel.selectByValue("python");
		Thread.sleep(1000);
		sel.selectByVisibleText("Dot Net");
		
		h.quit();
}
}