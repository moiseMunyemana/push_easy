package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) throws InterruptedException {
        ChromeDriver d = new ChromeDriver ();
        
        d.get("https://demoqa.com/buttons");
		Thread.sleep(6666);
		d.manage().window().maximize();
		//d.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]")).click();
		WebElement doubleClick= d.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		Actions  act = new Actions(d);
		
		Thread.sleep(2000);
		act.doubleClick(doubleClick).build().perform();
		Thread.sleep(2000);
		
		d.close();

	}

}
