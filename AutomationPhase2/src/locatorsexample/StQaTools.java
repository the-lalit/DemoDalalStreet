package locatorsexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StQaTools {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/");
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.xpath("/html/body/div/div/div/form/table/tbody/tr[2]/td/input"));
		name.sendKeys("lalit");
		
		WebElement fathername = driver.findElement(By.xpath("/html/body/div/div/div/form/table/tbody/tr[3]/td[2]/input"));
		fathername.sendKeys("sunil");
		
		WebElement gender = driver.findElement(By.xpath("/html/body/div/div/div/form/table/tbody/tr[6]/td/input[2]"));
		gender.click();
		
		WebElement course = driver.findElement(By.xpath("/html/body/div/div/div/form/table/tbody/tr[8]/td[2]/select"));
		course.sendKeys("MBA");
		
		WebElement city = driver.findElement(By.xpath("/html/body/div/div/div/form/table/tbody/tr[7]/td[2]/select"));
		city.sendKeys("Goa");
		
		WebElement district = driver.findElement(By.xpath("/html/body/div/div/div/form/table/tbody/tr[9]/td[2]/select"));
		district.sendKeys("UP");
		
		WebElement state = driver.findElement(By.xpath("/html/body/div/div/div/form/table/tbody/tr[10]/td[2]/select"));
		state.sendKeys("Mumbai");
		
		
	}

}
