package generalSeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//-----Handle Dropdown------
		
		WebElement dd= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s = new Select (dd);
		//----select by index----
		//s.selectByIndex(8);
		
		//----select by value----
		s.selectByValue("search-alias=collectibles");
		
		//----select by visible text----
		s.selectByVisibleText("Books");
		
		//-------count of options-----
		List<WebElement>all_op = s.getOptions();
		int count = all_op.size();
		System.out.println(count);
		
		//------print all options from dropdown----
		for (int i=1;i<=count-1;i++)
		{
			String abc = all_op.get(i).getText();
			System.out.println (abc);
		}
		
		

		

	}

}
