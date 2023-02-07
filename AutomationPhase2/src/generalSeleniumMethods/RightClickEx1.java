package generalSeleniumMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickEx1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/index.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//------------------------ Actions class -----------------------------
		Actions act = new Actions(driver);
		WebElement webe = driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(webe).build().perform();
		
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

	}

}
