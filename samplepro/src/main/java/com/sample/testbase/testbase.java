package com.sample.testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class testbase {
	
	FileInputStream fis;
	Properties prop;
	public static WebDriver driver;
	
	public void initialization() throws IOException, InterruptedException {
		
        fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\com\\sample\\config\\config.properties");
	    prop = new Properties();
		prop.load(fis);
		String browser= prop.getProperty("Browser");
		System.out.println(browser);
		String url=prop.getProperty("Url");
		//String timeout = prop.getProperty("Timeout");
		//System.out.println(System.getProperty("user.dir"));
		 
	 
	switch (browser ) {
	case "Chrome":
		 driver  = new ChromeDriver();
	break;
	
	case "Firefox":
		 driver  = new FirefoxDriver();
	break;
	
	case"Edge":
	 driver  = new EdgeDriver();
	break;

	
	default :
		System.out.println("Invalid browser");
	
	
}
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(timeout)));
	driver.get(url);
	System.out.println(driver.getTitle());
	//Thread.sleep(Integer.parseInt(timeout));
	
	
	driver.close();
	}
	}
