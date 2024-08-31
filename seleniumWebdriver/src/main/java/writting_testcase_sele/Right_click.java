package writting_testcase_sele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();




		driver.get("https://demoqa.com/buttons");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		driver.manage().window().maximize();

		WebElement rightButton=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		Actions act= new Actions(driver);
		act.contextClick(rightButton).build().perform();

	}

}
