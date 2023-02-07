package generalSeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownFacebook {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("david");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("warner");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("davidwarner@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("davidwarner@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("warner1995");
		
		//------handle dropdown-------
		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select (date);
		s.selectByVisibleText("30");
		
		Thread.sleep(2000);
		WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
		Select ss = new Select(month);
		ss.selectByVisibleText("Apr");
		
		Thread.sleep(1000);
		WebElement year =driver.findElement(By.xpath("//select[@id='year']"));
		Select sss = new Select(year);
		sss.selectByVisibleText("1995");
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_5')]")).click();
		driver.findElement(By.xpath("//button[contains(@id,'u_0_s')]")).click();
		

	}

}
