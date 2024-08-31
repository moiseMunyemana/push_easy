package writting_testcase_sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable2 {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(555));
		d.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table = d.findElement(By.xpath("//table[@id='customers']"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
       
        int num_row = rows.size();
        System.out.println("The total number of rows -->"+ num_row);
        
        String header1 = d.findElement(By.xpath("//table[@id='customers']/tbody/tr[1]/th[1]")).getText();
        String header2 = d.findElement(By.xpath("//table[@id='customers']/tbody/tr[1]/th[2]")).getText();
        String header3 = d.findElement(By.xpath("//table[@id='customers']/tbody/tr[1]/th[3]")).getText();
        System.out.println(header1 + "     |         " + header2 +"        |              " +header3);
        
        
        for (int i =2; i<=num_row; i++) {
        	
        	String  c1 = d.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td[1]")).getText();
        	
        	String  c2 = d.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td[2]")).getText();   
        	
        	String  c3 = d.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td[3]")).getText();
        	  System.out.println(c1 +" |          "+ c2 +" |        " + c3+"|        ")	;
        }
      
        
	d.close();
	}

	}
