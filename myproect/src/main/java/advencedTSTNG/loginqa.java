package advencedTSTNG;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class loginqa {
	

		public static void main(String[] args) throws InterruptedException {
			
			WebDriver k = new ChromeDriver();
			k.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			k.manage().window().maximize();
			k.get("http://www.google.com");
			System.out.println(k.getTitle() + "  "+ k.getCurrentUrl());
			TimeUnit.SECONDS.sleep(4);
			k.navigate().to("https://www.janbasktraining.com/login");
			k.findElement(By.xpath("//input[@id='login_name']")).sendKeys("munyemanam@gmail.com");
			k.findElement(By.xpath("//input[@id='login_pass']")).sendKeys("@Cruz88se");
			k.findElement(By.xpath("//input[@value='Log In']")).click();
			TimeUnit.SECONDS.sleep(4);
			
			//k.findElement(By.xpath("//*[@id=\"dd-user-menu\"]/img")).click();
			//k.findElement(By.xpath("/html/body/header/div/div/div/div[1]/div[2]/div/a[3]")).click();
			
			//k.close();
			

		}

	}


