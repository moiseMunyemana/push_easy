package writting_testcase_sele;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtabl23 {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(555));
		d.get("https://omayo.blogspot.com/");
		
		WebElement table = d.findElement(By.xpath("//table[@id='table1']"));
		int num_rows = table.findElements(By.tagName("tr")).size();
		System.out.println("number of rows" + num_rows);
        
		
		String c1 = d.findElement(By.xpath("//table[@id='table1']/thead/tr/th[1]")).getText();
		String c2 = d.findElement(By.xpath("//table[@id='table1']/thead/tr/th[2]")).getText();
		String c3 = d.findElement(By.xpath("//table[@id='table1']/thead/tr/th[3]")).getText();
		
		System.out.println(c1 +"|   "+c2+"|       "+c3);
		
		for (int x =2; x<=num_rows; x++) {
			

			String r1 = d.findElement(By.xpath("//table[@id='table1']/tbody/tr["+x+"]/td[1]")).getText();
			String r2 = d.findElement(By.xpath("//table[@id='table1']/tbody/tr["+x+"]/td[2]")).getText();
			String r3 = d.findElement(By.xpath("//table[@id='table1']/tbody/tr["+x+"]/td[3]")).getText();
		
			System.out.println(r1 +"|   "+r2+"|       "+r3);
		
		}
	  
	d.quit();
	}

}
