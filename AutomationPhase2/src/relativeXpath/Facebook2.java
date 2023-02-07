package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Facebook2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		
		WebElement fn =driver.findElement(By.xpath("//input[@name='firstname']"));
		fn.sendKeys("David");
		
		//Relative locators ----------
		
		WebElement ln =driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(fn));
		ln.sendKeys("Miller");
		
		WebElement email1=driver.findElement(RelativeLocator.with(By.tagName("input")).below(fn));
		email1.sendKeys("david@gmail.com");
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(email1)).sendKeys("david@gmail.com");

	}

}
