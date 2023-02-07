package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNInjaEcom {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='iPhone']")).click();	
		driver.findElement(By.xpath("//input[@name= 'quantity']")).click();
		driver.findElement(By.xpath("//button[@id = 'button-cart']")).click();
		driver.findElement(By.xpath("//span[@id='cart-total']")).click();
		driver.findElement(By.xpath("//a[text()='Checkout']")).click();	
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();

	}

}
