package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonContainsEx {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@id,'twotab')]")).sendKeys("iPhone" + Keys.ENTER);
		
		//driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 12 (128GB) - White')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 11, 256GB, Black')]")).click();

	}

}
