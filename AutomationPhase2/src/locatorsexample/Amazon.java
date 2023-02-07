package locatorsexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		// --------search box-----
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("iphone11");
		
		// --------search button-----
		WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
		searchbutton.click();
		
		//--------get selected product----//a-size-medium a-color-base a-text-normal
		WebElement iphone = driver.findElement(By.linkText("Apple iPhone 11 (64GB) - Black"));
		iphone.click();
		
		//add-to-cart-button
		WebElement cart = driver.findElement(By.id("add-to-cart-button"));
		cart.click();


		
	}

}
