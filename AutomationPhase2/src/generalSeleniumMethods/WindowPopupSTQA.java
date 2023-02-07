package generalSeleniumMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopupSTQA {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/Windows.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		String P_id=driver.getWindowHandle();
		Set <String>ids	= driver.getWindowHandles();
		
		for (String id : ids)
		{
			if(!(P_id.equals(id)))
			{
				driver.switchTo().window(id);
				String txt = driver.findElement(By.xpath("//li[contains(text(),'Selenium is a browser')]")).getText();
				System.out.println(txt);
				driver.close();
			}
		}
	}

}
