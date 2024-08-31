package myproect;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SAUCELAB {
	@Test
	public void login() throws InterruptedException {
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.saucedemo.com/v1/index.html");
	driver.manage().window().maximize();
	
	boolean status = driver.findElement(By.xpath("/html/body/div[1]")).isDisplayed();
	System.out.println("yes "+ status);
	
	if (status == true){
		
	
		System.out.println("Logo displayed, go on and log in");
	
	driver.findElement(By.xpath("//*[@id=\'user-name\']")).sendKeys("standard_user");
	driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//*[@id=\'login-button\']")).click();
	//driver.findElement(By.xpath("//button[normalize-space()='Open Menu']")).click();
	
	//driver.findElement(By.xpath("//a[@id='about_sidebar_link']")).click();
	//driver.findElement(By.xpath("//button[normalize-space()='Close Menu']")).click();
	
	
	
	driver.findElement(By.xpath("//*[name()='path' and contains(@fill,'currentCol')]")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Continue Shopping']")).click();
	driver.findElement(By.xpath("//*[@id='inventory_container']/div/div[3]/div[3]/button")).click();
	driver.findElement(By.xpath("//*[name()='path' and contains(@fill,'currentCol')]")).click();
	String qty= driver.findElement(By.xpath("//*[@id='cart_contents_container']/div/div[1]/div[3]/div[1]")).getText();
	//driver.quit();
	
	System.out.println("found this == " +qty);
	
	int num = Integer.parseInt(qty);
	
	if (num > 0) {
		System.out.println(num);
		driver.findElement(By.xpath("//a[normalize-space()='CHECKOUT']")).click();
	}
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Steve");
	driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Harris");
	driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("2145");
	List <WebElement> links = driver.findElements(By.tagName("li"));
	System.out.println("links are of number "+links.size());
	
	for (int c =0; c<links.size();c++) {
		System.out.println(links.get(c).getText());
	}
	String footer = driver.findElement(By.xpath("//div[@class='footer_copy']")).getText();
	System.out.println(footer);
	
	driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();
	String total = driver.findElement(By.xpath("//div[@class='summary_total_label']")).getText();
	driver.findElement(By.xpath("//a[normalize-space()='FINISH']")).click();
	
	Thread.sleep(2000);
	String  msg = driver.findElement(By.xpath("//h2[normalize-space()='THANK YOU FOR YOUR ORDER']")).getText();
	String  msg1 = driver.findElement(By.xpath("//div[@class='complete-text']")).getText();
System.out.println("you have totaled this bill " +total);	
System.out.println(msg );
System.out.println (msg1);
Thread.sleep(4000);
	//driver.quit();
	}
	
	driver.navigate().to("https://login.salesforce.com/?locale=in");
	driver.findElement(By.linkText("Privacy")).click();
	//o.findElement(By.linkText("Forgot Your Password?")).click();
	//o.findElement(By.xpath("//hgf-button[@contains(text)='Try for free']")).click();

	Set<String> windows=driver.getWindowHandles();
	System.out.println(windows.size());

	Iterator<String> it = windows.iterator();  //interview question
	String firstWin= it.next(); 
	String secWin=it.next();

	driver.switchTo().window(secWin);

	driver.findElement(By.xpath("//span[normalize-space()='Learn more']")).click();
	Thread.sleep(3000);
	driver.quit();
}




	}

	
	
	
