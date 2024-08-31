package advencedTSTNG;
import java.lang.classfile.WritableElement;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
public class Mock_sele {

	public static void main(String[] args) throws InterruptedException  {
	
		
    WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	driver.get("http://www.google.com");
	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(" Selenium" , Keys.ENTER);
	
	Thread.sleep(1000);
	System.out.println( driver.getTitle());
	driver.navigate().back();
	
	
	driver.get("https://opensource-demo.orangehrmlive.com");
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	System.out.println(driver.getTitle());
	Thread.sleep(1000);

	driver.navigate().to("https://omayo.blogspot.com/");
	WebElement Dropdown = driver.findElement(By.xpath("//select[@id='drop1']"));
	Select sel = new Select(Dropdown);
    sel.selectByIndex(1) ;
    String e = Dropdown.getTagName();
    Dimension d = Dropdown.getSize();
	Thread.sleep(1000);
	String h=Dropdown.getText();
	
	int size = h.length();
	sel.selectByIndex(3);
System.out.println("The tagname is " + e +" and "+ e +" Dimension is "+d +" and texts are "+h+" the number of option is "+size);

List<String >myList= new ArrayList<>();

driver.navigate().to("https://omayo.blogspot.com/");
List<WebElement> links=	driver.findElements(By.tagName("a"));
int len1 = links.size();
for(int c=0;c<links.size();c++) {
	
	String n = links.get(c).getText();
	if (n.length()>0 );{

		if (links.get(c).getText().length()>0) {
			myList.add(links.get(c).getText());	
		}
	}
}
System.out.println("The link size is now "+ len1 +" here below is the list of links with textlink. ");
System.out.println(myList);

 driver.get("http://www.amazon.com");
 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Laptop", Keys.ENTER);
 System.out.println(driver.getTitle());

 driver.navigate().to("https://omayo.blogspot.com/");
	driver.findElement(By.xpath("//input[@id='alert1']")).click();
	Alert al=driver.switchTo().alert();
	Thread.sleep(1000);
	String alert= al.getText();
	al.accept();
	System.out.println(alert);
	Thread.sleep(2000);
	
	driver.get("https://www.infoedge.in/");
	WebElement business= driver.findElement(By.xpath("//a[@id='btn2']"));
	Actions act = new Actions(driver);
	act.moveToElement(business).build().perform();
	Thread.sleep(2000);
 driver.findElement(By.xpath("//div[@id='m2']//a[normalize-space()='Overview']")).click();
	System.out.println(driver.getTitle());
	
driver.close();

		
		
 WebDriver edge = new EdgeDriver();
edge.manage().window().maximize();
edge.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

 String  Parent =edge.getWindowHandle();
edge.get("https://demo.automationtesting.in/Windows.html");
System.out.println(Parent.toUpperCase());
System.out.println(edge.getTitle());
edge.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
Set<String> childs = edge.getWindowHandles();

System.out.println(" total number of windows is " + childs.size());
for (String child : childs) {
	System.out.println(child); 
	if (!child.equals(Parent)){
		edge.switchTo().window(child);
		edge.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
		String title=edge.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
	}
}


edge.quit();

WebDriver drive = new ChromeDriver();
drive.manage().window().maximize();
drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));


drive.get("https://practice.automationtesting.in/my-account/");
 drive.findElement(By.xpath("//a[normalize-space()='Lost your password?']")).click();
 String psd = drive.findElement(By.xpath("//*[@id=\'page-36\']/div/div[1]/form/p[1]")).getText();
 
System.out.println(psd);

Thread.sleep(1000);
	 drive.quit();
	 
	 
WebDriver fox = new ChromeDriver();
fox.manage().window().maximize();
fox.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

fox.get("https://practice.expandtesting.com/dropdown");
WebElement drop= fox.findElement(By.xpath("//*[@id=\"country\"]"));
Select ctry  = new Select(drop);

List<WebElement> options = ctry.getOptions();
ArrayList<Object>  list= new ArrayList<>();

for (int c =1 ; c<options.size();c++ ) {
ctry.selectByIndex(c);
	list.add(options.get(c).getText());
}


System.out.println(list);

Thread.sleep(1000);
fox.quit();

WebDriver driv = new ChromeDriver();
driv.get("https://practice.expandtesting.com/dynamic-table");
driv.manage().window().maximize();
driv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebElement table = driv.findElement(By.xpath("/html/body/main/div[2]/div/div[2]/div/div[2]"));

List<WebElement> rows =table.findElements(By.tagName("tr"));
int rows_count = rows.size();
String crome;
for (int c =0 ; c< rows_count; c++) {
	
	List<WebElement> cells = rows.get(c).findElements(By.tagName("td"));
	int cell_count = cells.size();
	System.out.println("cells count =  "+cell_count);
	
	for (int i =1 ; i<cell_count; i++) {
		String cell_Text = cells.get(i).getText();
		System.out.println(cell_Text + "\t");
		if(cell_Text.equals("Chrome")|| cell_Text.endsWith("%")){
			 crome = cells.get(i).getText();
			System.out.println("The cpu value is "+ crome);
			
			String cpu_chr= driv.findElement(By.xpath("//*[@id=\"chrome-cpu\"]")).getText();
			System.out.println( cpu_chr.lastIndexOf(cpu_chr));
			System.out.println(cpu_chr);
			if ( crome.equalsIgnoreCase(cpu_chr)) {
				System.out.println("CPU values match");
				
			}
			else {
				System.out.println("CPU values dont  match");
			}
		}
}
		
}

Thread.sleep(1000);
driv.quit();
}

	}

