package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(args);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(args);

	}
	public static String readData1(int sheet_index,int row_num, int cell_num) throws IOException
	{
		String path = "C:\\Users\\Admin\\Desktop\\Software course notes\\ExcelHandlingData.xlsx";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		String username = wb.getSheetAt(sheet_index).getRow(row_num).getCell(cell_num).getStringCellValue();
		return username;
	}
	

}
