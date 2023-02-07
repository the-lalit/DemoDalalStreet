package locatorsexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/reg/");
			driver.manage().window().maximize();
			
			//-------first name------
			WebElement fn = driver.findElement(By.name("firstname"));
			fn.sendKeys(("david"));
			
			//-------last name------
			WebElement ln = driver.findElement(By.name("lastname"));
			ln.sendKeys("Warner");
			
			//-------MObile number------
			WebElement email = driver.findElement(By.name("reg_email__"));
			email.sendKeys("warner11@gmail.com");   //reg_email_confirmation__
			
			WebElement reemail = driver.findElement(By.name("reg_email_confirmation__"));
			email.sendKeys("warner11@gmail.com");   //


	}

}
