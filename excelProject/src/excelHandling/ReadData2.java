package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData2 {

	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\Admin\\Desktop\\Software course notes\\ExcelHandlingData.xlsx";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		String username =wb.getSheetAt(0).getRow(3).getCell(2).getStringCellValue();
		System.out.println(username);
		
		String password = wb.getSheetAt(0).getRow(3).getCell(2).getStringCellValue();
		System.out.println(password);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		
		

	}

}
