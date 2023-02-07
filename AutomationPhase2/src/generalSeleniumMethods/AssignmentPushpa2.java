package generalSeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPushpa2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Pushpa" + Keys.ENTER);
		driver.findElement(By.xpath("//h3[contains(text(),'Pushpa: The Rise - Part 1 (2021) - IMDb')]")).click();
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,3400)");
		
		String date =driver.findElement(By.linkText("December 17, 2021 (United States)")).getText();
		System.out.println(date);
		
		String country =driver.findElement(By.linkText("India")).getText();
		System.out.println(country);

		

		
		

	}

}
