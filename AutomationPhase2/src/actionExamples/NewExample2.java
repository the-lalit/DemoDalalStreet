package actionExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewExample2 {

	//--------File Upload---------------
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/fileupload.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[@id='fileToUpload']")).sendKeys("C:\\Users\\232338\\Downloads\\Action Class (1).pdf");
	}

}
