package generalSeleniumMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//close popup
		driver.findElement(By.xpath("//button[@class ='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iPhone13"+Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Midnight, 128 GB)']")).click();
		Thread.sleep(3000);
		
		String p_id = driver.getWindowHandle();  //-----to get parent window id in console box
		Set<String>ids = driver.getWindowHandles();  //-------to get child window id in console box
		System.out.println(p_id);
		System.out.println(ids);
		
		for (String xyz:ids)
		{
			System.out.println(xyz);
			
			if(!p_id.equals(xyz))   //xyz=pid
			{
				driver.switchTo().window(xyz);   //switch to window
				driver.findElement(By.xpath("//button[text()='Add to cart']")).click();    //ad to cart path
				driver.close();
			}
		}
	}

}
