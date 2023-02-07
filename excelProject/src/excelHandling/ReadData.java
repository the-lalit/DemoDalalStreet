package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\Admin\\Desktop\\Software course notes\\ExcelHandlingData.xlsx";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//----------------------------------------------------
		
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row = sheet.getRow(7);
		XSSFCell cell = row.getCell(2);
		
//		String data = cell.getStringCellValue();
//		System.out.println(data);
		
		String data11 = wb.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
		System.out.println(data11);
		
		double data10 = wb.getSheetAt(0).getRow(1).getCell(0).getNumericCellValue();
		System.out.println(data10);

	}

}
