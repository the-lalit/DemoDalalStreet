package generalSeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPushpa {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Pushpa" + Keys.ENTER);
		driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).click();
		
		String date =driver.findElement(By.xpath("(//div[@class='plainlist'])[4]")).getText();
		System.out.println(date);
		
		String country =driver.findElement(By.xpath("(//td[@class='infobox-data'])[12]")).getText();
		System.out.println(country);
		
		Thread.sleep(2000);
		driver.navigate().back(); //----------Here we back on search page-----
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Pushpa" + Keys.ENTER);
		driver.findElement(By.xpath("//h3[contains(text(),'Pushpa: The Rise - Part 1 (2021) - IMDb')]")).click();
		
		
		String date2 =driver.findElement(By.linkText("December 17, 2021 (United States)")).getText();
		System.out.println(date2);
		
		String country2 =driver.findElement(By.linkText("India")).getText();
		System.out.println(country2);
		
	 
//		boolean d = date.equals(date2);
//		System.out.println(d);
//		
//		boolean c = country.equals(country2);
//		System.out.println(c);
		
		if (country.equalsIgnoreCase(country2))
		{
			System.out.println("Country ="+ true);
		}
		else
		{
			System.out.println("Country ="+ false);
		}
		if (date.equalsIgnoreCase(date2))
		{
			System.out.println("date ="+ true);
		}
		else
		{
			System.out.println("date ="+ false);
		}
		

	}

}
