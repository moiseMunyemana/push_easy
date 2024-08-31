package writting_testcase_sele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try_table {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(555));
		
		d.get("http://www.google.com");
		Thread.sleep(1000);
		d.navigate().to("https://omayo.blogspot.com");
	int num =	d.findElements(By.xpath("//*[@id=\"table1\"]")).size();
System.out.println(num);
	}
	

		//https://www.iplt20.com/points-table/men/2023

}
