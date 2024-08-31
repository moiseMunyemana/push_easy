package seleniumWebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_links {

	public static void main(String[] args) throws InterruptedException {
		
		
         ChromeDriver h = new ChromeDriver ();
		
		h.manage().window().maximize();
		
		h.manage().timeouts().implicitlyWait(Duration.ofSeconds(66));
	    h.get("htpp://www.google.com");
	    Thread.sleep(5000);
		h.navigate().to("http://www.deadlinkcity.com/");
		Thread.sleep(5000);
		List<WebElement> links=	h.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (int i =0; i <links.size(); i++) {
			System.out.println(links.get(i).getText());
		}
		
		
		
		h.close();

	}

}
