package myproect;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sele {

	public static void main(String[] args) {
		ChromeDriver k = new ChromeDriver();
		k.manage().window().maximize();
		
		k.get("http://www.google.com");
		
		System.out.println(k.getTitle());
		
		k.close();
	}

}
