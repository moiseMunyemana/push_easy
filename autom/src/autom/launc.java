package autom;

public class launc {
		
		
		public static void main(String[] args) {
//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Eclipse Adoptium\\jdk-21.0.2.13-hotspot\\chrome\\chromedriver.exe")
				WebDriver d= new ChromeDriver();
				//WebDriver d=new FirefoxDriver();
				d.manage().window().maximize(); //maximize the window
				//d.get("https://www.saucedemo.com");
				d.navigate().to("https://www.google.com");
				d.navigate().to("https:///www.seleniumhq.org");
				d.navigate().to("https://www.bing.com");

				d.navigate().back();
				d.navigate().forward();
				d.navigate().refresh();
	}

}
