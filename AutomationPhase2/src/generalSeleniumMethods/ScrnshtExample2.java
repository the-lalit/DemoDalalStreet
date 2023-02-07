package generalSeleniumMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ScrnshtExample2 {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		takeSS(driver,"amazon1");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iPhone13"+Keys.ENTER);
		takeSS(driver,"amazon2");
		System.out.println("Screenshot saved");
	}
	
	public static void takeSS(WebDriver driver,String filename) throws IOException
	{
	//screenshot
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File des = new File("C:\\Users\\Admin\\eclipse-workspace\\AutomationPhase2\\src\\generalSeleniumMethods\\EclipsScreenShot\\"+filename+System.currentTimeMillis()+".png");
	FileHandler.copy(src, des);
	}

}
