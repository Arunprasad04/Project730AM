package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelRead {

	public static void main(String[] args) throws IOException  {
		//To locate the file.
		File file=new File("C:\\Excel\\UserNamePwd.xlsx");
		//To locate file in to the field.
		FileInputStream f=new FileInputStream(file);
		//To define Format of Excel
		Workbook book=new XSSFWorkbook(f);
		//To get the sheet.
		Sheet sheet=book.getSheet("Family");
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
			Row row = sheet.getRow(i);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell = row.getCell(j);
				String stringCellValues=cell.getStringCellValue();
				if(stringCellValues.equalsIgnoreCase("Star32@gmail.com")) {
					cell.setCellValue("Test1@gmail.com");
					FileOutputStream out=new FileOutputStream(file);
					book.write(out);
				}
				
				
	}}
}
}