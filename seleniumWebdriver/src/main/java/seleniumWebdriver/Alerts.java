package seleniumWebdriver;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
       ChromeDriver d = new ChromeDriver ();
       
       d.manage().window().maximize();
       
       d.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
       Thread.sleep(6);
       d.get("http://www.google.com");
       System.out.println("opening google firstly " + d.getCurrentUrl());
       Thread.sleep(3);
       d.navigate().to("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
       Thread.sleep(7);
       System.out.println(d.getTitle());
       Thread.sleep(88);
       d.quit();
       
       
       
		
		
	}

}
