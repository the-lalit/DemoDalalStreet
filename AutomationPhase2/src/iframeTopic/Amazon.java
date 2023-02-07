package iframeTopic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@id,'twotab')]")).sendKeys("iPhone" + Keys.ENTER);
		
		List<WebElement> list_wb =driver.findElements(By.xpath("//h2[contains(@class,'a-size-mini a-spacing-none a-color-base s-line-clamp-2')]"));
		
		int count = list_wb.size();
		for(int i=0; i<=count-1;i++)
		{
			String abc =list_wb.get(i).getText();
			System.out.println(abc);
		}
	}

}
