package org.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
public static void main(String[] args) throws IOException {
	//To locate the file where we can write.
	File f=new File("C:\\Excel\\Excelwrite.xlsx");
	//To create new workbook
	Workbook w=new XSSFWorkbook();
	//To create new sheet
	Sheet s=w.createSheet();
	//To create new Row
	Row r=s.createRow(0);
	Cell c=r.createCell(0);
	//To update the value in excel
	c.setCellValue("Java");
	FileOutputStream out=new FileOutputStream(f);
	w.write(out);
}
}
