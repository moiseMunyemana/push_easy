package advencedTSTNG;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
public class All_links {

	
	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	List<WebElement> links=	driver.findElements(By.tagName("a"));
	System.out.println(links.size());

	for(int i=0;i<links.size();i++) {

		myList.add(links.get(i).getText().strip());
		//System.out.println(links.get(i).getText());
	}
System.out.println(myList);
	}


	
}
