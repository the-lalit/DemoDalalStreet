package actionExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EbayEx1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize(); driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement elctronic =driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(elctronic).build().perform();
		
		driver.findElement(By.xpath("//a[text()='Smart home']")).click();
	}

}
