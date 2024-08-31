package myproect;

import org.openqa.selenium.chrome.ChromeDriver;

public class Seles {

	public static void main(String[] args) {
		ChromeDriver f = new ChromeDriver ();
		f.manage().window().maximize();
		
		f.get("http://www.yahoo.fr");
		System.out.println(f.getTitle());
		

	}

}
