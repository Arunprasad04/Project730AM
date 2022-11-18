package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {
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
				String stringCellValue = cell.getStringCellValue();

				if(stringCellValue.equalsIgnoreCase("Test1@gmail.com")) {
					cell.setCellValue("Star32@gmail.com");
					FileOutputStream out=new FileOutputStream(file);
					book.write(out);
				}
				System.out.print("\t"+stringCellValue+"\t");
			}
			System.out.println("");
		}

}
}