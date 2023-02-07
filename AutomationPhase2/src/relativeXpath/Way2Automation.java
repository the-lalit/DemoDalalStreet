package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way2Automation {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Lalit");
		
		//WebElement lastname = driver.findElement(By.xpath("/html[1]//body/section/div/div/div/form/fieldset/p[2]/input"));
		//lastname.sendKeys("chaudhari");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("chaudhari");
		
		driver.findElement(By.xpath("//input[@name='m_status']")).click();
		
		driver.findElement(By.xpath("//input[@name='hobby']")).click();
		
		WebElement phone =driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("1234567890");
		
		WebElement email =driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("lschaudhari11@gmail.com");
		
		WebElement pass =driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("lalit#123");
		
		WebElement confpass =driver.findElement(By.xpath("//input[@name='c_password']"));
		confpass.sendKeys("lalit#123");


		
		
	}

}
