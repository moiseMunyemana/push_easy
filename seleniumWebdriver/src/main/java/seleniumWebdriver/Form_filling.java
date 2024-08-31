package seleniumWebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_filling {
	
	


	public static void main(String[] args) throws InterruptedException {

		
		int random_n = (int) (Math.random()*1000);
String    user_name = "john" + random_n;
		ChromeDriver h = new ChromeDriver ();
		
		h.manage().window().maximize();
		
		h.manage().timeouts().implicitlyWait(Duration.ofSeconds(66));
		
		h.get("https://parabank.parasoft.com/parabank/register.htm");
		
		h.findElement(By.id("customer.firstName")).sendKeys("john");
		h.findElement(By.id("customer.lastName")).sendKeys("mos");
		h.findElement(By.xpath ("//input[@id='customer.address.street']")).sendKeys("rundle 123");
		h.findElement(By.xpath ("//input[@id='customer.address.city']")).sendKeys("kansas");
		h.findElement(By.name ("customer.address.state")).sendKeys("Georgia");
		h.findElement(By.xpath ("//input[@id='customer.address.zipCode']")).sendKeys("T2K 1B4");
		h.findElement(By.id("customer.phoneNumber")).sendKeys("4567890 ");
		h.findElement(By.id("customer.ssn")).sendKeys("77");
		h.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(user_name);
		h.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("TYUIJHB8");
		h.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("TYUIJHB8");
		h.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
		System.out.println("username is "+ user_name);
		Thread.sleep(1000);
		h.close();
		
		
		
		
		
		
		
		

	}

}
