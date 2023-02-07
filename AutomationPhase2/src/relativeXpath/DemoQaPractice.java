package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQaPractice {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Virat");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Virat");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kohli");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("viratkohli123@gmail.com");
		driver.findElement(By.xpath("//label[@class=\"custom-control-label\"]")).click();
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys("English");
	}

}
