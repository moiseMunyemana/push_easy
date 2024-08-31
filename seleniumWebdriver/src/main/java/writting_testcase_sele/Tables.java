package writting_testcase_sele;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Tables {
		public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://google.com");

driver.navigate().to("https://omayo.blogspot.com");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
driver.getTitle();
WebElement table = driver.findElement(By.xpath("//*[@id=\"table1\"]"));
int rows = table.findElements(By.xpath("//*[@id=\'table1\']/tbody/tr")).size(); 
int cells = table.findElements(By.xpath("//*[@id=\'table1\']/thead/tr/th")).size();
System.out.println("the number of rows is "+ rows);
System.out.println("the number of cells is "+ cells);


for (int c=1 ; c <=cells; c++) {
	String  test =driver.findElement(By.xpath("//*[@id=\'table1\']/tbody/tr[2]/td["+c+"]")).getText();
	System.out.print(test +"  |");
}
driver.close();
		}
		}