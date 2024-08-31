package writting_testcase_sele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		
		
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(555));
		
		d.get("https://www.w3schools.com/html/html_tables.asp");
		String header1=d.findElement(By.xpath("//table[@id='customers']/tbody/tr/th[1]")).getText();
		String header2=d.findElement(By.xpath("//table[@id='customers']/tbody/tr/th[2]")).getText();
		String header3=d.findElement(By.xpath("//table[@id='customers']/tbody/tr/th[3]")).getText();
		System.out.println(header1+" |"+header2+"| "+header3);

		for(int i=2;i<=7;i++) {
			String first="//table[@id='customers']/tbody/tr[";
			String second="]/td[1]";

		String c1=d.findElement(By.xpath(first+i+second)).getText();

		System.out.println(c1);
		
		d.close();
		}	

	}

	////*[@id="customers"]
}
