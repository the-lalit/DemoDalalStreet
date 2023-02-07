package basicsSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//get method
		driver.get("https://www.facebook.com/");
		
		//get title method
		String abc = driver.getTitle();
		System.out.println(abc);
		
		//get url 
		String curl = driver.getCurrentUrl();
		System.out.println(curl);
				
		//get pagesource
		String asdf =driver.getPageSource();
		System.out.println(asdf);

	}

}
