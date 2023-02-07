package generalSeleniumMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/index.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("(//a[@id='navbarDropdownPortfolio'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		
		WebElement xyz = driver.findElement(By.xpath("//button[text()='Click Me / Double Click Me!']"));
		xyz.click();
		
		//----------------------Action class--------------------
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(xyz).build().perform();
		// Thread.sleep(4000);
		// act.click().click().click().build().perform();

	}

}
