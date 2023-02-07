package actionExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize(); driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//-------- handling of iframe ----------------------------
		WebElement xyz =driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(xyz);
		//---------------------------------------------------------
		
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement elementdes = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act = new Actions(driver);
		//act.clickAndHold(src).moveToElement(elementdes).release().build().perform();
		act.dragAndDrop(src, elementdes).build().perform();
		
	}

}
