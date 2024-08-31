package writting_testcase_sele;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Footer_contents {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		
		driver.get("https://www.telerik.com/support/demos");
		WebElement footer = driver.findElement(By.xpath("//*[@id=\"telerik\"]/footer"));
		//System.out.println(footer.getSize()); footer size
		
		List<WebElement> links = footer.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		for (int i=0; i <links.size(); i++) {
			System.out.println(links.get(i).getText());
		}
		
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
