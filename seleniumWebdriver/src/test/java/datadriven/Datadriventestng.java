package datadriven;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Datadriventestng {
	
	WebDriver driver ;
	
	@BeforeClass
	public void setup() {
		
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	driver.manage().window().maximize();

		
	}
	
	@Test (dataProvider="LoginData")
	public void loginTest(String username , String password, String expected )  {
		//System.out.println(username + "  "+ password +"  "+ expected );
		driver.get("https://www.saucedemo.com/");
		
		
		WebElement user = driver.findElement(By.xpath("//input[@id='user-name']"));
		user.clear();
		
		user.sendKeys(username);
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		pwd.clear();
		
		pwd.sendKeys(password);
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
		
		
		String act_title = driver.getTitle();
		String expt_title = "Swag Labs";
		if (expected =="valid") {
			if (act_title .equals(expt_title)) {
				Assert.assertTrue(true);
				WebElement dropdown = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
				dropdown.click();
				WebElement logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
				logout.click();
			}
		}
	}
	
	
	@DataProvider (name = "LoginData")
	public String [][] getData(){
		
	String [][]logindata= { 
			{"standard_user","secret_sauce","valid"},
			{"locked_out_user","secret_sauce","invalid"},
			{"problem_user","secret_sauce","invalid"},
			{"performance_glitch_user","secret_sauce","invalid"},
			{"error_user","secret_sauce","invalid"},
			{"visual_user	","secret_sauce","invalid"}
	
		
	};
	return logindata;

}
	@AfterTest
	void teardown() {
		System.out.println(System.getProperty("user.dir"));
		driver.quit();
		
	}
}