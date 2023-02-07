package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookEx {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//input[@id='u_0_b_k7']")).sendKeys("David");
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]")).sendKeys("David" + Keys.TAB +"Miller"+Keys.TAB +"david@gmail.com");

	}

}
