package seleniumWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bask_notes {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver  j = new ChromeDriver();
		j.manage().window().maximize();
		
		j.get("http:www.google.com");
		TimeUnit.SECONDS.sleep(3);
       System.out.println( j.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed());
	    System.out.println(j.getTitle()+"   " + j.getCurrentUrl());
	    j.findElement(By.xpath("//*[@id=\'APjFqb\']")).sendKeys("mose : the law giver");
	    j.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).sendKeys(Keys.ENTER);
	    TimeUnit.SECONDS.sleep(6);
	    j.navigate().to("http:wikipedia.org");
	    TimeUnit.SECONDS.sleep(6);
	    j.close();
	}

}
