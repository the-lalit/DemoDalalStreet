package actionExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEx1 {
	
	public static void main (String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize(); driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement devlope =driver.findElement(By.xpath("//button[@class = 'developers-dropdown-toggle dropdown-toggle']"));
		Actions act = new Actions(driver);
		
		act.moveToElement(devlope).build().perform();
		driver.findElement(By.xpath("//a[text()='Release Notes']")).click();
	}
			

}
