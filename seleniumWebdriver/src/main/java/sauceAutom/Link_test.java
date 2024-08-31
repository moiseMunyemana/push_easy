package sauceAutom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_test {

	public static void main(String[] args) {
  
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("http://www.google.com");
		
     boolean existance = d.findElement(By.linkText("Gmail")).isDisplayed();
     if (existance == true ) {
    	 
    	 System.out.println("************link found*******");	 
     }
     else {
    	 System.out.println("************link not  found*******");
     }
     
     try {
    	 boolean existance2 = d.findElement(By.linkText("GmailAbd")).isDisplayed();
    	 
    if 	(existance2 = true) {
    	System.out.println("************link found*******");
    }	 
     }
    catch(Exception e) {
    	
    	System.out.println("************link doesn't exist*******");
    	System.out.println(e);
    	
    }
     d.quit();
	}

}
