package iframeTopic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("moneyiframe");
		
		String bse = driver.findElement(By.xpath("//span[@id='bseindex']")).getText();
		System.out.println(bse);
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//a[text()='SPORTS']")).click();
	}

}
