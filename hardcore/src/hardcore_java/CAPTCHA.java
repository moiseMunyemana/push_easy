package hardcore_java;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class CAPTCHA {
		

public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver d = new ChromeDriver();
	d.manage().window().maximize();
	//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
				
	d.get("https://www.irctc.co.in");

	System.out.println(d.getCurrentUrl());
				
			
	d.findElement(By.xpath("//button[@type='submit']")).click();
	//Thread.sleep(2);
	Alert al =d.switchTo().alert();
    System.out.println(al.getText());
	al.dismiss();
			    
	/*d.findElement(By.xpath("//input[@id='8986526']")).sendKeys("Janbask_qa");
	d.findElement(By.xpath("//input[@id='6548783']")).sendKeys("Mind@123$");
	Thread.sleep(2000);*/
	d.quit();
	}

}
