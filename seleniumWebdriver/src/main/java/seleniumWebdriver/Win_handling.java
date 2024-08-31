package seleniumWebdriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Win_handling {

	public static void main(String[] args) {
		ChromeDriver o = new ChromeDriver();
		
		o.manage().window().maximize();
		
		o.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		o.get("https://login.salesforce.com/?locale=in");
		o.findElement(By.linkText("Privacy")).click();
		//o.findElement(By.linkText("Forgot Your Password?")).click();
		//o.findElement(By.xpath("//hgf-button[@contains(text)='Try for free']")).click();

		Set<String> windows=o.getWindowHandles();
		System.out.println(windows.size());

		Iterator<String> it = windows.iterator();  //interview question
		String firstWin= it.next(); 
		String secWin=it.next();

		o.switchTo().window(secWin);

		o.findElement(By.xpath("//span[normalize-space()='Learn more']")).click();
}


	}


